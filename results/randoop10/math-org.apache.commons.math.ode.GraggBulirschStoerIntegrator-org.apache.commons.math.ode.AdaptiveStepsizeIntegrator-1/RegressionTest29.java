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
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray9);
        java.lang.Object[] objArray18 = derivativeException17.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException17);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!]");
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        double double46 = graggBulirschStoerIntegrator38.getMaxStep();
        java.lang.String str47 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) ' ', (double) 10, (double) 'a');
        double double53 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) -1, (double) 0, (double) (byte) 1);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, 3);
        graggBulirschStoerIntegrator4.setStepsizeControl(3.0d, 5.916079783099616d, 5.009970139234591d, 0.0d);
        java.lang.String str14 = graggBulirschStoerIntegrator4.getName();
        java.lang.String str15 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str14, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str15, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getMaxStep();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setOrderControl(0, (double) (byte) 100, (double) (short) -1);
        java.lang.String str56 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator38.getStepHandler();
        boolean boolean62 = stepHandler61.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 100L, (double) (byte) -1, (double) 100, (double) 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction10, (double) (short) 10, 0.0d, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction15, 1.0d, 10.0d, (int) (short) 0);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) 10.0f, (double) '4', (double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler25 = graggBulirschStoerIntegrator24.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler25);
        stepHandler25.reset();
        boolean boolean28 = stepHandler25.requiresDenseOutput();
        stepHandler25.reset();
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        derivativeException3.addSuppressed((java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray11 = derivativeException9.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException9);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException26);
        integratorException12.addSuppressed((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException12);
        java.lang.String str31 = derivativeException30.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[hi!]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.ode.DerivativeException: " + "'", str31, "org.apache.commons.math.ode.DerivativeException: ");
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, (double) (byte) 1, (double) '#');
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) 100, (double) 10L, (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) '#');
        double double15 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double27 = switchingFunctionsHandler26.getEventTime();
        double[] doubleArray35 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean36 = switchingFunctionsHandler26.reset((double) (byte) 1, doubleArray35);
        boolean boolean37 = switchingFunctionsHandler0.reset((double) 0L, doubleArray35);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double42 = switchingFunctionsHandler41.getEventTime();
        double[] doubleArray50 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean51 = switchingFunctionsHandler41.reset((double) (byte) 1, doubleArray50);
        boolean boolean52 = switchingFunctionsHandler39.reset(0.0d, doubleArray50);
        boolean boolean53 = switchingFunctionsHandler0.reset(0.0d, doubleArray50);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler0.evaluateStep(stepInterpolator54);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        switchingFunctionsHandler0.add(switchingFunction56, (double) (short) 1, (double) '4', 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        switchingFunctionsHandler0.add(switchingFunction61, (double) 0L, (double) 1, (int) (byte) 10);
        boolean boolean66 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        switchingFunctionsHandler0.add(switchingFunction67, 9.848857801796104d, 3.0d, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        switchingFunctionsHandler0.add(switchingFunction72, 72.11102550927978d, (double) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator19.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double26 = switchingFunctionsHandler25.getEventTime();
        double[] doubleArray34 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean35 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray34);
        double[] doubleArray39 = new double[] { 100.0f, 100 };
        boolean boolean40 = switchingFunctionsHandler25.reset(Double.NaN, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray39, doubleArray41);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler43 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double44 = switchingFunctionsHandler43.getEventTime();
        double[] doubleArray52 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean53 = switchingFunctionsHandler43.reset((double) (byte) 1, doubleArray52);
        double[] doubleArray57 = new double[] { 100.0f, 100 };
        boolean boolean58 = switchingFunctionsHandler43.reset(Double.NaN, doubleArray57);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray41, doubleArray57);
        graggBulirschStoerIntegrator59.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator59.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler67 = graggBulirschStoerIntegrator59.getStepHandler();
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler67);
        double double69 = graggBulirschStoerIntegrator19.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler70 = graggBulirschStoerIntegrator19.getStepHandler();
        double double71 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction72, (double) 1.0f, (double) 0L, (-1));
        double double77 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        double double78 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction20, (double) 100.0f, (double) 0, 0);
        double double25 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        double double26 = graggBulirschStoerIntegrator19.getMaxStep();
        java.lang.String str27 = graggBulirschStoerIntegrator19.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction28, (double) (short) 10, 0.0d, 0);
        double double33 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setInitialStepSize(35.0d);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator40.setInitialStepSize((double) 10L);
        java.lang.String str43 = graggBulirschStoerIntegrator40.getName();
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator40.getStepHandler();
        graggBulirschStoerIntegrator40.setInterpolationControl(false, (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator40.getStepHandler();
        graggBulirschStoerIntegrator40.setStabilityCheck(true, (int) (byte) 0, (int) (short) 100, (double) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator40.getStepHandler();
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler54);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        stepHandler54.handleStep(stepInterpolator56, true);
        stepHandler54.reset();
        boolean boolean60 = stepHandler54.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str27, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str43, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        boolean boolean5 = switchingFunctionsHandler0.stop();
        double double6 = switchingFunctionsHandler0.getEventTime();
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, 3.1622776601683795d, (double) 10, 0.0d);
        graggBulirschStoerIntegrator4.setOrderControl(0, (double) 2, (double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction9, 97.0d, (double) (-1.0f), (int) (byte) 10);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) ' ');
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction19, 38.3753555559862d, 10.0d, 3);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (short) 100);
        double double27 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(100.0d, 0.0d, (double) 2, (double) 100);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler6 = graggBulirschStoerIntegrator4.getStepHandler();
        boolean boolean7 = stepHandler6.requiresDenseOutput();
        stepHandler6.reset();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double52 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStabilityCheck(false, 2, 3, (double) (short) 10);
        java.lang.String str58 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction59, 31.209033090201576d, 56.23413251903491d, (int) '#');
        double double64 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double65 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str58, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException24);
        java.lang.String str26 = derivativeException24.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException27);
        java.lang.String str29 = derivativeException27.getPattern();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str26, "org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str29, "org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        boolean boolean13 = switchingFunctionsHandler0.reset(0.0d, doubleArray11);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        switchingFunctionsHandler0.add(switchingFunction14, (-1.0d), (double) 10, (int) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler0.add(switchingFunction19, (double) 100, (double) 'a', (int) 'a');
        double double24 = switchingFunctionsHandler0.getEventTime();
        boolean boolean25 = switchingFunctionsHandler0.stop();
        boolean boolean26 = switchingFunctionsHandler0.isEmpty();
        double double27 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler0.add(switchingFunction28, 8.62834797213047d, 13.37480609952844d, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double52 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double53 = graggBulirschStoerIntegrator38.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction54, (double) (short) 0, (double) 100L, 10);
        org.apache.commons.math.ode.StepHandler stepHandler59 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) -1, (double) (-1L), (double) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler64 = graggBulirschStoerIntegrator38.getStepHandler();
        java.lang.String str65 = graggBulirschStoerIntegrator38.getName();
        double double66 = graggBulirschStoerIntegrator38.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler67 = graggBulirschStoerIntegrator38.getStepHandler();
        boolean boolean68 = stepHandler67.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertNotNull(stepHandler64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str65, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) (short) -1, (double) 3, (double) (-1.0f), (double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction26, (double) 100, (double) 2, (int) (byte) 10);
        java.lang.String str31 = graggBulirschStoerIntegrator19.getName();
        double double32 = graggBulirschStoerIntegrator19.getMinStep();
        graggBulirschStoerIntegrator19.setInitialStepSize((-1.0d));
        double double35 = graggBulirschStoerIntegrator19.getMaxStep();
        graggBulirschStoerIntegrator19.setOrderControl((int) (short) -1, (double) 0L, (double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str31, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray38, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray20, doubleArray40);
        switchingFunctionsHandler0.stepAccepted((double) ' ', doubleArray40);
        boolean boolean44 = switchingFunctionsHandler0.stop();
        double double45 = switchingFunctionsHandler0.getEventTime();
        double double46 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        switchingFunctionsHandler0.add(switchingFunction47, (double) 1L, (double) '#', (int) (short) -1);
        boolean boolean52 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStabilityCheck(false, (int) (short) 100, (int) 'a', (double) (-1L));
        double double26 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = graggBulirschStoerIntegrator19.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator19.getStepHandler();
        graggBulirschStoerIntegrator19.setInitialStepSize(17.88854381999832d);
        double double31 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        double double46 = graggBulirschStoerIntegrator38.getMaxStep();
        double double47 = graggBulirschStoerIntegrator38.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator38.getStepHandler();
        java.lang.String str49 = graggBulirschStoerIntegrator38.getName();
        double double50 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setOrderControl((int) (byte) 0, 2.514866859365871d, 42.661458015403085d);
        double double55 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str49, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray18 = derivativeException16.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray18);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!]");
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) 100L, (double) 10.0f, (double) 100, (double) '#');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double31 = switchingFunctionsHandler30.getEventTime();
        double[] doubleArray39 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean40 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray39);
        double[] doubleArray44 = new double[] { 100.0f, 100 };
        boolean boolean45 = switchingFunctionsHandler30.reset(Double.NaN, doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray44, doubleArray46);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double49 = switchingFunctionsHandler48.getEventTime();
        double[] doubleArray57 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean58 = switchingFunctionsHandler48.reset((double) (byte) 1, doubleArray57);
        double[] doubleArray62 = new double[] { 100.0f, 100 };
        boolean boolean63 = switchingFunctionsHandler48.reset(Double.NaN, doubleArray62);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray46, doubleArray62);
        graggBulirschStoerIntegrator64.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator64.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler72 = graggBulirschStoerIntegrator64.getStepHandler();
        graggBulirschStoerIntegrator64.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler77 = graggBulirschStoerIntegrator64.getStepHandler();
        boolean boolean78 = stepHandler77.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator79 = null;
        stepHandler77.handleStep(stepInterpolator79, true);
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler77);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction83 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction83, (double) 100, (double) (short) -1, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler88 = graggBulirschStoerIntegrator19.getStepHandler();
        double double89 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        double double90 = graggBulirschStoerIntegrator19.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(stepHandler88);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + (-1.0d) + "'", double90 == (-1.0d));
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        boolean boolean22 = switchingFunctionsHandler20.evaluateStep(stepInterpolator21);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double27 = switchingFunctionsHandler26.getEventTime();
        double[] doubleArray35 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean36 = switchingFunctionsHandler26.reset((double) (byte) 1, doubleArray35);
        double[] doubleArray40 = new double[] { 100.0f, 100 };
        boolean boolean41 = switchingFunctionsHandler26.reset(Double.NaN, doubleArray40);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray40, doubleArray42);
        switchingFunctionsHandler20.stepAccepted((double) (short) 10, doubleArray42);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0.0f, (double) '4', doubleArray18, doubleArray42);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double51 = switchingFunctionsHandler50.getEventTime();
        double[] doubleArray59 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean60 = switchingFunctionsHandler50.reset((double) (byte) 1, doubleArray59);
        double[] doubleArray64 = new double[] { 100.0f, 100 };
        boolean boolean65 = switchingFunctionsHandler50.reset(Double.NaN, doubleArray64);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray64, doubleArray66);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double69 = switchingFunctionsHandler68.getEventTime();
        double[] doubleArray77 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean78 = switchingFunctionsHandler68.reset((double) (byte) 1, doubleArray77);
        double[] doubleArray82 = new double[] { 100.0f, 100 };
        boolean boolean83 = switchingFunctionsHandler68.reset(Double.NaN, doubleArray82);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray66, doubleArray82);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator85 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, (double) 100L, doubleArray18, doubleArray66);
        graggBulirschStoerIntegrator85.setStepsizeControl((double) (-1), (double) 'a', (double) (byte) -1, (double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler91 = graggBulirschStoerIntegrator85.getStepHandler();
        double double92 = graggBulirschStoerIntegrator85.getCurrentStepStart();
        double double93 = graggBulirschStoerIntegrator85.getCurrentStepStart();
        java.lang.Class<?> wildcardClass94 = graggBulirschStoerIntegrator85.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(stepHandler91);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) 100, (double) (byte) 100, (double) (short) 0);
        graggBulirschStoerIntegrator4.setOrderControl(1, 35.0d, (double) 100);
        double double9 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (short) 10, (int) (byte) 100, 52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction15, 4.216965034285822d, (double) 3, 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 31.622776601683793d + "'", double9 == 31.622776601683793d);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) 100, (double) (byte) 100, (double) (short) 0);
        graggBulirschStoerIntegrator4.setOrderControl(1, 35.0d, (double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction9, 5.009970139234591d, (double) 10L, (int) (byte) 10);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) '4', (double) (byte) 100, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double12 = switchingFunctionsHandler11.getEventTime();
        double[] doubleArray20 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean21 = switchingFunctionsHandler11.reset((double) (byte) 1, doubleArray20);
        double[] doubleArray25 = new double[] { 100.0f, 100 };
        boolean boolean26 = switchingFunctionsHandler11.reset(Double.NaN, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double34 = switchingFunctionsHandler33.getEventTime();
        double[] doubleArray42 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean43 = switchingFunctionsHandler33.reset((double) (byte) 1, doubleArray42);
        double[] doubleArray47 = new double[] { 100.0f, 100 };
        boolean boolean48 = switchingFunctionsHandler33.reset(Double.NaN, doubleArray47);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray47, doubleArray49);
        switchingFunctionsHandler27.stepAccepted((double) (short) 10, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0.0f, (double) '4', doubleArray25, doubleArray49);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler57 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double58 = switchingFunctionsHandler57.getEventTime();
        double[] doubleArray66 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean67 = switchingFunctionsHandler57.reset((double) (byte) 1, doubleArray66);
        double[] doubleArray71 = new double[] { 100.0f, 100 };
        boolean boolean72 = switchingFunctionsHandler57.reset(Double.NaN, doubleArray71);
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray71, doubleArray73);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler75 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double76 = switchingFunctionsHandler75.getEventTime();
        double[] doubleArray84 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean85 = switchingFunctionsHandler75.reset((double) (byte) 1, doubleArray84);
        double[] doubleArray89 = new double[] { 100.0f, 100 };
        boolean boolean90 = switchingFunctionsHandler75.reset(Double.NaN, doubleArray89);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator91 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray73, doubleArray89);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator92 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, (double) 100L, doubleArray25, doubleArray73);
        boolean boolean93 = switchingFunctionsHandler0.reset(0.0d, doubleArray25);
        boolean boolean94 = switchingFunctionsHandler0.isEmpty();
        boolean boolean95 = switchingFunctionsHandler0.isEmpty();
        boolean boolean96 = switchingFunctionsHandler0.stop();
        double double97 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator19.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        stepHandler20.handleStep(stepInterpolator21, true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(stepHandler20);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        boolean boolean6 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler12.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler12.evaluateStep(stepInterpolator15);
        boolean boolean17 = switchingFunctionsHandler12.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double22 = switchingFunctionsHandler21.getEventTime();
        double[] doubleArray30 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean31 = switchingFunctionsHandler21.reset((double) (byte) 1, doubleArray30);
        double[] doubleArray35 = new double[] { 100.0f, 100 };
        boolean boolean36 = switchingFunctionsHandler21.reset(Double.NaN, doubleArray35);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double40 = switchingFunctionsHandler39.getEventTime();
        double[] doubleArray48 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean49 = switchingFunctionsHandler39.reset((double) (byte) 1, doubleArray48);
        double[] doubleArray53 = new double[] { 100.0f, 100 };
        boolean boolean54 = switchingFunctionsHandler39.reset(Double.NaN, doubleArray53);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray53, doubleArray55);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray35, doubleArray55);
        switchingFunctionsHandler12.stepAccepted((double) 0L, doubleArray55);
        double[] doubleArray59 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator60 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 10, doubleArray55, doubleArray59);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler61 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean62 = switchingFunctionsHandler61.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator63 = null;
        boolean boolean64 = switchingFunctionsHandler61.evaluateStep(stepInterpolator63);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        boolean boolean66 = switchingFunctionsHandler61.evaluateStep(stepInterpolator65);
        boolean boolean67 = switchingFunctionsHandler61.stop();
        double double68 = switchingFunctionsHandler61.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        boolean boolean70 = switchingFunctionsHandler61.evaluateStep(stepInterpolator69);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler74 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double75 = switchingFunctionsHandler74.getEventTime();
        double[] doubleArray83 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean84 = switchingFunctionsHandler74.reset((double) (byte) 1, doubleArray83);
        double[] doubleArray88 = new double[] { 100.0f, 100 };
        boolean boolean89 = switchingFunctionsHandler74.reset(Double.NaN, doubleArray88);
        double[] doubleArray90 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator91 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray88, doubleArray90);
        boolean boolean92 = switchingFunctionsHandler61.reset((double) (byte) -1, doubleArray88);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator93 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', 5.477225575051661d, doubleArray55, doubleArray88);
        switchingFunctionsHandler0.stepAccepted((double) (short) -1, doubleArray88);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator95 = null;
        boolean boolean96 = switchingFunctionsHandler0.evaluateStep(stepInterpolator95);
        double double97 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, 5.477225575051661d, Double.NaN, (double) (byte) 1);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        double double6 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setStepsizeControl((double) (-1.0f), (double) 10.0f, 5.916079783099616d, 3.0d);
        java.lang.String str12 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) ' ', 10, (double) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray36, doubleArray38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double41 = switchingFunctionsHandler40.getEventTime();
        double[] doubleArray49 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean50 = switchingFunctionsHandler40.reset((double) (byte) 1, doubleArray49);
        double[] doubleArray54 = new double[] { 100.0f, 100 };
        boolean boolean55 = switchingFunctionsHandler40.reset(Double.NaN, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray38, doubleArray54);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator56.addSwitchingFunction(switchingFunction57, 1.0d, (double) '4', (int) ' ');
        double double62 = graggBulirschStoerIntegrator56.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler65 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double66 = switchingFunctionsHandler65.getEventTime();
        double[] doubleArray74 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean75 = switchingFunctionsHandler65.reset((double) (byte) 1, doubleArray74);
        double[] doubleArray79 = new double[] { 100.0f, 100 };
        boolean boolean80 = switchingFunctionsHandler65.reset(Double.NaN, doubleArray79);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray79, doubleArray81);
        graggBulirschStoerIntegrator82.setOrderControl((int) (byte) -1, 0.0d, (double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler87 = graggBulirschStoerIntegrator82.getStepHandler();
        graggBulirschStoerIntegrator56.setStepHandler(stepHandler87);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator89 = null;
        stepHandler87.handleStep(stepInterpolator89, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator92 = null;
        stepHandler87.handleStep(stepInterpolator92, false);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler87);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertNotNull(stepHandler87);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction39, 1.0d, (double) '4', (int) ' ');
        double double44 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 3);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double54 = switchingFunctionsHandler53.getEventTime();
        double[] doubleArray62 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean63 = switchingFunctionsHandler53.reset((double) (byte) 1, doubleArray62);
        double[] doubleArray67 = new double[] { 100.0f, 100 };
        boolean boolean68 = switchingFunctionsHandler53.reset(Double.NaN, doubleArray67);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray67, doubleArray69);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double72 = switchingFunctionsHandler71.getEventTime();
        double[] doubleArray80 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean81 = switchingFunctionsHandler71.reset((double) (byte) 1, doubleArray80);
        double[] doubleArray85 = new double[] { 100.0f, 100 };
        boolean boolean86 = switchingFunctionsHandler71.reset(Double.NaN, doubleArray85);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator87 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray69, doubleArray85);
        double[] doubleArray88 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator89 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray69, doubleArray88);
        org.apache.commons.math.ode.StepHandler stepHandler90 = graggBulirschStoerIntegrator89.getStepHandler();
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler90);
        boolean boolean92 = stepHandler90.requiresDenseOutput();
        boolean boolean93 = stepHandler90.requiresDenseOutput();
        stepHandler90.reset();
        stepHandler90.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(stepHandler90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 0, (double) 100, (double) 1L);
        graggBulirschStoerIntegrator4.setOrderControl((int) (byte) 0, (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator4.getStepHandler();
        double double10 = graggBulirschStoerIntegrator4.getMaxStep();
        double double11 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double12 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        graggBulirschStoerIntegrator38.setOrderControl((int) '4', (double) (byte) 1, 1.0d);
        graggBulirschStoerIntegrator38.setStepsizeControl(100.0d, (double) 2, (double) (-1), (double) (short) 1);
        double double59 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double60 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double61 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) (byte) 10, 0.0d, 7.211102550927978d, 9.848857801796104d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        boolean boolean5 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        boolean boolean8 = switchingFunctionsHandler0.isEmpty();
        boolean boolean9 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler11.evaluateStep(stepInterpolator12);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double18 = switchingFunctionsHandler17.getEventTime();
        double[] doubleArray26 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean27 = switchingFunctionsHandler17.reset((double) (byte) 1, doubleArray26);
        double[] doubleArray31 = new double[] { 100.0f, 100 };
        boolean boolean32 = switchingFunctionsHandler17.reset(Double.NaN, doubleArray31);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray31, doubleArray33);
        switchingFunctionsHandler11.stepAccepted((double) (short) 10, doubleArray33);
        boolean boolean36 = switchingFunctionsHandler0.reset((double) (short) 100, doubleArray33);
        double double37 = switchingFunctionsHandler0.getEventTime();
        boolean boolean38 = switchingFunctionsHandler0.stop();
        double double39 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        java.lang.String[] strArray13 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray13);
        java.lang.Object[] objArray21 = derivativeException20.getArguments();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[, hi!, hi!, hi!, hi!, hi!]");
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.String str16 = derivativeException14.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException14);
        java.lang.Throwable[] throwableArray19 = derivativeException10.getSuppressed();
        java.lang.Throwable[] throwableArray20 = derivativeException10.getSuppressed();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.String str32 = derivativeException30.getPattern();
        java.lang.String[] strArray42 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException45);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException45);
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException45);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException45);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("", strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray64);
        org.apache.commons.math.ode.IntegratorException integratorException67 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray64);
        org.apache.commons.math.ode.IntegratorException integratorException72 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray64);
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray81);
        org.apache.commons.math.ode.IntegratorException integratorException83 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray81);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray81);
        org.apache.commons.math.ode.IntegratorException integratorException85 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException84);
        java.lang.Throwable[] throwableArray86 = derivativeException84.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException87 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException84);
        integratorException72.addSuppressed((java.lang.Throwable) derivativeException84);
        java.lang.String str89 = integratorException72.getPattern();
        derivativeException10.addSuppressed((java.lang.Throwable) integratorException72);
        org.apache.commons.math.ode.DerivativeException derivativeException91 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.Object[] objArray92 = derivativeException91.getArguments();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str89, "org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[]");
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        double double12 = switchingFunctionsHandler0.getEventTime();
        boolean boolean13 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler15.evaluateStep(stepInterpolator16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double22 = switchingFunctionsHandler21.getEventTime();
        double[] doubleArray30 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean31 = switchingFunctionsHandler21.reset((double) (byte) 1, doubleArray30);
        double[] doubleArray35 = new double[] { 100.0f, 100 };
        boolean boolean36 = switchingFunctionsHandler21.reset(Double.NaN, doubleArray35);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray35, doubleArray37);
        switchingFunctionsHandler15.stepAccepted((double) (short) 10, doubleArray37);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double42 = switchingFunctionsHandler41.getEventTime();
        double[] doubleArray50 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean51 = switchingFunctionsHandler41.reset((double) (byte) 1, doubleArray50);
        boolean boolean52 = switchingFunctionsHandler15.reset(3.1622776601683795d, doubleArray50);
        switchingFunctionsHandler0.stepAccepted((double) 100, doubleArray50);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler0.evaluateStep(stepInterpolator54);
        double double56 = switchingFunctionsHandler0.getEventTime();
        boolean boolean57 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        switchingFunctionsHandler0.add(switchingFunction58, 13.33521432163324d, 1.7320508075688772d, (int) ' ');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException25);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException25);
        java.lang.Object[] objArray30 = derivativeException25.getArguments();
        java.lang.Object[] objArray31 = derivativeException25.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException33);
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException34);
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[hi!]");
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (-1L));
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler55 = graggBulirschStoerIntegrator38.getStepHandler();
        double double56 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double57 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction58, (double) (byte) 100, 0.0d, (int) (short) 1);
        java.lang.String str63 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStabilityCheck(false, (int) ' ', (int) (short) 10, 3.1622776601683795d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str63, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) '4');
        double double47 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setOrderControl((int) ' ', (double) 10.0f, (double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction52, (double) (short) -1, (double) (short) 0, (int) (byte) -1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler59 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double60 = switchingFunctionsHandler59.getEventTime();
        double[] doubleArray68 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean69 = switchingFunctionsHandler59.reset((double) (byte) 1, doubleArray68);
        double[] doubleArray73 = new double[] { 100.0f, 100 };
        boolean boolean74 = switchingFunctionsHandler59.reset(Double.NaN, doubleArray73);
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator76 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray73, doubleArray75);
        graggBulirschStoerIntegrator76.setInterpolationControl(true, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler80 = graggBulirschStoerIntegrator76.getStepHandler();
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler80);
        graggBulirschStoerIntegrator38.setInterpolationControl(true, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertNotNull(stepHandler80);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) '4', (double) (byte) 100, (int) (byte) 1);
        boolean boolean6 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double13 = switchingFunctionsHandler12.getEventTime();
        double[] doubleArray21 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean22 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray21);
        double[] doubleArray26 = new double[] { 100.0f, 100 };
        boolean boolean27 = switchingFunctionsHandler12.reset(Double.NaN, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray26, doubleArray28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double31 = switchingFunctionsHandler30.getEventTime();
        double[] doubleArray39 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean40 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray39);
        double[] doubleArray44 = new double[] { 100.0f, 100 };
        boolean boolean45 = switchingFunctionsHandler30.reset(Double.NaN, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray28, doubleArray44);
        boolean boolean47 = switchingFunctionsHandler0.reset(100.0d, doubleArray28);
        double double48 = switchingFunctionsHandler0.getEventTime();
        double double49 = switchingFunctionsHandler0.getEventTime();
        double double50 = switchingFunctionsHandler0.getEventTime();
        boolean boolean51 = switchingFunctionsHandler0.stop();
        double double52 = switchingFunctionsHandler0.getEventTime();
        double double53 = switchingFunctionsHandler0.getEventTime();
        double double54 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray10);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException35);
        java.lang.Object[] objArray37 = derivativeException35.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException38 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException35);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException35);
        java.lang.Throwable[] throwableArray41 = derivativeException35.getSuppressed();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray44);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException45);
        java.lang.String str47 = derivativeException45.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException45);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException45);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException62 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray59);
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException62);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException63);
        java.lang.Throwable[] throwableArray65 = derivativeException35.getSuppressed();
        java.lang.String str66 = derivativeException35.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException35);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", strArray74);
        org.apache.commons.math.ode.IntegratorException integratorException80 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException79);
        derivativeException35.addSuppressed((java.lang.Throwable) derivativeException79);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException79);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException79);
        java.lang.String str84 = derivativeException79.getPattern();
        java.lang.String str85 = derivativeException79.getPattern();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str84, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str85, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, Double.NaN, (double) 10.0f, 0);
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        switchingFunctionsHandler0.add(switchingFunction8, (double) 100.0f, 3.1622776601683795d, (int) (byte) -1);
        double double13 = switchingFunctionsHandler0.getEventTime();
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        boolean boolean15 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double22 = switchingFunctionsHandler21.getEventTime();
        double[] doubleArray30 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean31 = switchingFunctionsHandler21.reset((double) (byte) 1, doubleArray30);
        boolean boolean32 = switchingFunctionsHandler19.reset(0.0d, doubleArray30);
        double double33 = switchingFunctionsHandler19.getEventTime();
        double double34 = switchingFunctionsHandler19.getEventTime();
        double double35 = switchingFunctionsHandler19.getEventTime();
        boolean boolean36 = switchingFunctionsHandler19.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double double49 = switchingFunctionsHandler38.getEventTime();
        boolean boolean50 = switchingFunctionsHandler38.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler52 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean53 = switchingFunctionsHandler52.isEmpty();
        double[] doubleArray55 = new double[] {};
        switchingFunctionsHandler52.stepAccepted(0.0d, doubleArray55);
        boolean boolean57 = switchingFunctionsHandler38.reset(17.78279410038923d, doubleArray55);
        switchingFunctionsHandler19.stepAccepted((double) 10L, doubleArray55);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler59 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean60 = switchingFunctionsHandler59.isEmpty();
        double[] doubleArray62 = new double[] {};
        switchingFunctionsHandler59.stepAccepted(0.0d, doubleArray62);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(56.568542494923804d, 17.78279410038923d, doubleArray55, doubleArray62);
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted((double) (byte) 1, doubleArray62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException28);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) 100, 0.0d, (double) 0L);
        graggBulirschStoerIntegrator4.setStepsizeControl(Double.NaN, (double) 10.0f, (double) (short) 0, (double) (short) 10);
        double double10 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double16 = switchingFunctionsHandler15.getEventTime();
        double[] doubleArray24 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean25 = switchingFunctionsHandler15.reset((double) (byte) 1, doubleArray24);
        double[] doubleArray29 = new double[] { 100.0f, 100 };
        boolean boolean30 = switchingFunctionsHandler15.reset(Double.NaN, doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray29, doubleArray31);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double34 = switchingFunctionsHandler33.getEventTime();
        double[] doubleArray42 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean43 = switchingFunctionsHandler33.reset((double) (byte) 1, doubleArray42);
        double[] doubleArray47 = new double[] { 100.0f, 100 };
        boolean boolean48 = switchingFunctionsHandler33.reset(Double.NaN, doubleArray47);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray31, doubleArray47);
        graggBulirschStoerIntegrator49.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        graggBulirschStoerIntegrator49.setInterpolationControl(false, (int) '4');
        graggBulirschStoerIntegrator49.setOrderControl((int) '4', Double.NaN, (double) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        graggBulirschStoerIntegrator49.addSwitchingFunction(switchingFunction62, (double) 100, (double) (-1), (int) (byte) 1);
        graggBulirschStoerIntegrator49.setStabilityCheck(false, (int) 'a', (int) (short) 1, 100.0d);
        double double72 = graggBulirschStoerIntegrator49.getCurrentStepStart();
        graggBulirschStoerIntegrator49.setInitialStepSize(3.0d);
        org.apache.commons.math.ode.StepHandler stepHandler75 = graggBulirschStoerIntegrator49.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler76 = graggBulirschStoerIntegrator49.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler76);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler75);
        org.junit.Assert.assertNotNull(stepHandler76);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) '4', (double) (byte) 100, (int) (byte) 1);
        boolean boolean6 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double13 = switchingFunctionsHandler12.getEventTime();
        double[] doubleArray21 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean22 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray21);
        double[] doubleArray26 = new double[] { 100.0f, 100 };
        boolean boolean27 = switchingFunctionsHandler12.reset(Double.NaN, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray26, doubleArray28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double31 = switchingFunctionsHandler30.getEventTime();
        double[] doubleArray39 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean40 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray39);
        double[] doubleArray44 = new double[] { 100.0f, 100 };
        boolean boolean45 = switchingFunctionsHandler30.reset(Double.NaN, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray28, doubleArray44);
        boolean boolean47 = switchingFunctionsHandler0.reset(100.0d, doubleArray28);
        double double48 = switchingFunctionsHandler0.getEventTime();
        boolean boolean49 = switchingFunctionsHandler0.isEmpty();
        double double50 = switchingFunctionsHandler0.getEventTime();
        boolean boolean51 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler53.evaluateStep(stepInterpolator54);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler59 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double60 = switchingFunctionsHandler59.getEventTime();
        double[] doubleArray68 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean69 = switchingFunctionsHandler59.reset((double) (byte) 1, doubleArray68);
        double[] doubleArray73 = new double[] { 100.0f, 100 };
        boolean boolean74 = switchingFunctionsHandler59.reset(Double.NaN, doubleArray73);
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator76 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray73, doubleArray75);
        switchingFunctionsHandler53.stepAccepted((double) (short) 10, doubleArray75);
        boolean boolean78 = switchingFunctionsHandler0.reset((double) '#', doubleArray75);
        double double79 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction80 = null;
        switchingFunctionsHandler0.add(switchingFunction80, (double) 10L, (double) 0L, (int) (short) 10);
        double double85 = switchingFunctionsHandler0.getEventTime();
        java.lang.Class<?> wildcardClass86 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException12);
        java.lang.Object[] objArray14 = integratorException13.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        boolean boolean13 = switchingFunctionsHandler0.reset(0.0d, doubleArray11);
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double17 = switchingFunctionsHandler16.getEventTime();
        double[] doubleArray25 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean26 = switchingFunctionsHandler16.reset((double) (byte) 1, doubleArray25);
        double[] doubleArray30 = new double[] { 100.0f, 100 };
        boolean boolean31 = switchingFunctionsHandler16.reset(Double.NaN, doubleArray30);
        switchingFunctionsHandler0.stepAccepted((double) 'a', doubleArray30);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        switchingFunctionsHandler0.add(switchingFunction33, (double) 1L, (double) (byte) -1, (int) (short) 0);
        boolean boolean38 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        switchingFunctionsHandler40.add(switchingFunction41, (double) '4', (double) (byte) 100, (int) (byte) 1);
        boolean boolean46 = switchingFunctionsHandler40.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        switchingFunctionsHandler40.add(switchingFunction47, (double) (-1), (double) 0.0f, 2);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        switchingFunctionsHandler53.add(switchingFunction54, (double) '4', (double) (byte) 100, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        switchingFunctionsHandler53.add(switchingFunction59, (double) 1L, (double) 1, 1);
        boolean boolean64 = switchingFunctionsHandler53.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double69 = switchingFunctionsHandler68.getEventTime();
        double[] doubleArray77 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean78 = switchingFunctionsHandler68.reset((double) (byte) 1, doubleArray77);
        boolean boolean79 = switchingFunctionsHandler66.reset(0.0d, doubleArray77);
        boolean boolean80 = switchingFunctionsHandler53.reset(52.0d, doubleArray77);
        boolean boolean81 = switchingFunctionsHandler40.reset(5.623413251903491d, doubleArray77);
        boolean boolean82 = switchingFunctionsHandler0.reset(9.300868483181675d, doubleArray77);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) (short) -1, (double) 3, (double) (-1.0f), (double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction26, (double) 100, (double) 2, (int) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator19.getStepHandler();
        double double32 = graggBulirschStoerIntegrator19.getMaxStep();
        double double33 = graggBulirschStoerIntegrator19.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator19.getStepHandler();
        double double35 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        integratorException11.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        org.apache.commons.math.ode.IntegratorException integratorException40 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException39);
        integratorException11.addSuppressed((java.lang.Throwable) integratorException40);
        java.lang.Throwable[] throwableArray42 = integratorException11.getSuppressed();
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException53);
        org.apache.commons.math.ode.IntegratorException integratorException55 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException54);
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException("", strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray64);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException66);
        integratorException54.addSuppressed((java.lang.Throwable) derivativeException66);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException66);
        org.apache.commons.math.ode.IntegratorException integratorException70 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException66);
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException66);
        integratorException11.addSuppressed((java.lang.Throwable) derivativeException66);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray64);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 100L, (double) (byte) -1, (double) 100, (double) 3);
        double double10 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler12 = graggBulirschStoerIntegrator4.getStepHandler();
        boolean boolean13 = stepHandler12.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), 32.0d, (double) (short) 10, (double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (byte) 100, 0.0d, (-1));
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator4.getStepHandler();
        double double11 = graggBulirschStoerIntegrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler12 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double18 = switchingFunctionsHandler17.getEventTime();
        double[] doubleArray26 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean27 = switchingFunctionsHandler17.reset((double) (byte) 1, doubleArray26);
        double[] doubleArray31 = new double[] { 100.0f, 100 };
        boolean boolean32 = switchingFunctionsHandler17.reset(Double.NaN, doubleArray31);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray31, doubleArray33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double36 = switchingFunctionsHandler35.getEventTime();
        double[] doubleArray44 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean45 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray44);
        double[] doubleArray49 = new double[] { 100.0f, 100 };
        boolean boolean50 = switchingFunctionsHandler35.reset(Double.NaN, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray33, doubleArray49);
        graggBulirschStoerIntegrator51.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double57 = graggBulirschStoerIntegrator51.getCurrentStepStart();
        graggBulirschStoerIntegrator51.setInitialStepSize((double) 1L);
        graggBulirschStoerIntegrator51.setInitialStepSize((double) (short) -1);
        double double62 = graggBulirschStoerIntegrator51.getCurrentStepStart();
        double double63 = graggBulirschStoerIntegrator51.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        graggBulirschStoerIntegrator51.addSwitchingFunction(switchingFunction64, (double) 0L, (double) (-1), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator51.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler69);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction71 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction71, (double) (short) 100, (double) 0L, (int) (short) 1);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler69);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        double[] doubleArray7 = new double[] { (short) 1, 3.1622776601683795d, '#', 0.0d, 0.0d };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double11 = switchingFunctionsHandler10.getEventTime();
        double[] doubleArray19 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean20 = switchingFunctionsHandler10.reset((double) (byte) 1, doubleArray19);
        double[] doubleArray24 = new double[] { 100.0f, 100 };
        boolean boolean25 = switchingFunctionsHandler10.reset(Double.NaN, doubleArray24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double29 = switchingFunctionsHandler28.getEventTime();
        double[] doubleArray37 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean38 = switchingFunctionsHandler28.reset((double) (byte) 1, doubleArray37);
        double[] doubleArray42 = new double[] { 100.0f, 100 };
        boolean boolean43 = switchingFunctionsHandler28.reset(Double.NaN, doubleArray42);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray42, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray24, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, 10.0d, doubleArray7, doubleArray44);
        graggBulirschStoerIntegrator47.setInterpolationControl(false, 2);
        graggBulirschStoerIntegrator47.setInitialStepSize((double) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler53 = graggBulirschStoerIntegrator47.getStepHandler();
        double double54 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        double double55 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 3.1622776601683795, 35.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        boolean boolean4 = switchingFunctionsHandler0.isEmpty();
        boolean boolean5 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        switchingFunctionsHandler0.add(switchingFunction8, 18.708286933869708d, (-1.0d), (int) ' ');
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = switchingFunctionsHandler0.evaluateStep(stepInterpolator13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, 3.1622776601683795d, (double) (-1), 5.916079783099616d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 17.78279410038923d + "'", double5 == 17.78279410038923d);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(52.0d, (double) (-1L), (double) (short) 100, 0.0d);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException32);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(17.78279410038923d, (double) (byte) 1, 17.320508075688775d, (-1.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (byte) 10, (double) (short) 100, (int) 'a');
        double double10 = graggBulirschStoerIntegrator4.getMinStep();
        double double11 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 17.78279410038923d + "'", double10 == 17.78279410038923d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) (byte) 100, (double) (short) 1, 0.0d, 10.0d);
        double double56 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setStabilityCheck(true, (int) (short) 1, (int) '4', 4.161791450287818d);
        double double62 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        java.lang.Class<?> wildcardClass63 = graggBulirschStoerIntegrator38.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(6.928935924497552d, (double) 100L, (double) 1.0f, 5.009970139234591d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) 'a', (double) (short) 10, 5.916079783099616d);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) ' ', 100, 15.298193747370034d);
        double double10 = graggBulirschStoerIntegrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction11, 13.92838827718412d, (double) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 97.0d + "'", double10 == 97.0d);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 100, (double) 0L, (-0.0d), (double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) 'a', (double) (short) 0, (int) (short) 1);
        double double10 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction11, 72.11102550927978d, (double) ' ', (int) ' ');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray34, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double[] doubleArray52 = new double[] { 100.0f, 100 };
        boolean boolean53 = switchingFunctionsHandler38.reset(Double.NaN, doubleArray52);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray36, doubleArray52);
        graggBulirschStoerIntegrator54.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str60 = graggBulirschStoerIntegrator54.getName();
        graggBulirschStoerIntegrator54.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        graggBulirschStoerIntegrator54.setOrderControl((int) '4', (double) (byte) 1, 1.0d);
        graggBulirschStoerIntegrator54.setStepsizeControl(100.0d, (double) 2, (double) (-1), (double) (short) 1);
        double double75 = graggBulirschStoerIntegrator54.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction76 = null;
        graggBulirschStoerIntegrator54.addSwitchingFunction(switchingFunction76, (double) 10, (double) (short) 1, (int) (byte) 10);
        double double81 = graggBulirschStoerIntegrator54.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler82 = graggBulirschStoerIntegrator54.getStepHandler();
        stepHandler82.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator84 = null;
        stepHandler82.handleStep(stepInterpolator84, false);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler82);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str60, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(stepHandler82);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, (double) (byte) 1, (double) '#');
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) 100, (double) 10L, (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator4.getStepHandler();
        double double12 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        java.lang.String str13 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler14 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (short) 1, (double) (short) 1, 100.0d);
        double double20 = graggBulirschStoerIntegrator19.getMaxStep();
        double double21 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setInterpolationControl(true, 3);
        org.apache.commons.math.ode.StepHandler stepHandler25 = graggBulirschStoerIntegrator19.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler25);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 0, (double) 100, (double) 1L);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) ' ');
        java.lang.String str9 = graggBulirschStoerIntegrator4.getName();
        double double10 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str9, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double[] doubleArray52 = new double[] { 100.0f, 100 };
        boolean boolean53 = switchingFunctionsHandler38.reset(Double.NaN, doubleArray52);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray52, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray34, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (-1.0d), doubleArray16, doubleArray34);
        double double58 = graggBulirschStoerIntegrator57.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator57.addSwitchingFunction(switchingFunction59, 100.0d, (double) 'a', 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        graggBulirschStoerIntegrator57.addSwitchingFunction(switchingFunction64, (double) (byte) 1, (double) 10.0f, (int) (byte) 1);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 0, (double) 100, (double) 1L);
        graggBulirschStoerIntegrator73.setOrderControl((int) (byte) 0, (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler78 = graggBulirschStoerIntegrator73.getStepHandler();
        boolean boolean79 = stepHandler78.requiresDenseOutput();
        graggBulirschStoerIntegrator57.setStepHandler(stepHandler78);
        double double81 = graggBulirschStoerIntegrator57.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction82 = null;
        graggBulirschStoerIntegrator57.addSwitchingFunction(switchingFunction82, 56.568542494923804d, 1.7320508075688772d, (int) (byte) 1);
        double double87 = graggBulirschStoerIntegrator57.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        boolean boolean3 = switchingFunctionsHandler0.stop();
        double double4 = switchingFunctionsHandler0.getEventTime();
        boolean boolean5 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler0.add(switchingFunction6, 4.161791450287818d, 17.78279410038923d, (int) (short) -1);
        boolean boolean11 = switchingFunctionsHandler0.stop();
        double[] doubleArray13 = null;
        boolean boolean14 = switchingFunctionsHandler0.reset((double) 2, doubleArray13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException", strArray10);
        java.lang.Throwable[] throwableArray15 = derivativeException14.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray15);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setInterpolationControl(true, (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction50, (double) '#', (double) (byte) 100, 10);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (short) 100);
        graggBulirschStoerIntegrator38.setStabilityCheck(false, 0, (int) '#', 97.0d);
        double double62 = graggBulirschStoerIntegrator38.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        double double12 = switchingFunctionsHandler0.getEventTime();
        boolean boolean13 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler15.evaluateStep(stepInterpolator16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double22 = switchingFunctionsHandler21.getEventTime();
        double[] doubleArray30 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean31 = switchingFunctionsHandler21.reset((double) (byte) 1, doubleArray30);
        double[] doubleArray35 = new double[] { 100.0f, 100 };
        boolean boolean36 = switchingFunctionsHandler21.reset(Double.NaN, doubleArray35);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray35, doubleArray37);
        switchingFunctionsHandler15.stepAccepted((double) (short) 10, doubleArray37);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double42 = switchingFunctionsHandler41.getEventTime();
        double[] doubleArray50 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean51 = switchingFunctionsHandler41.reset((double) (byte) 1, doubleArray50);
        boolean boolean52 = switchingFunctionsHandler15.reset(3.1622776601683795d, doubleArray50);
        switchingFunctionsHandler0.stepAccepted((double) 100, doubleArray50);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler0.evaluateStep(stepInterpolator54);
        boolean boolean56 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler58 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean59 = switchingFunctionsHandler58.isEmpty();
        double[] doubleArray61 = new double[] {};
        switchingFunctionsHandler58.stepAccepted(0.0d, doubleArray61);
        boolean boolean63 = switchingFunctionsHandler0.reset((double) 10, doubleArray61);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        boolean boolean65 = switchingFunctionsHandler0.evaluateStep(stepInterpolator64);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        double double12 = switchingFunctionsHandler0.getEventTime();
        boolean boolean13 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler15.evaluateStep(stepInterpolator16);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        boolean boolean19 = switchingFunctionsHandler15.evaluateStep(stepInterpolator18);
        boolean boolean20 = switchingFunctionsHandler15.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler22.evaluateStep(stepInterpolator23);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double29 = switchingFunctionsHandler28.getEventTime();
        double[] doubleArray37 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean38 = switchingFunctionsHandler28.reset((double) (byte) 1, doubleArray37);
        double[] doubleArray42 = new double[] { 100.0f, 100 };
        boolean boolean43 = switchingFunctionsHandler28.reset(Double.NaN, doubleArray42);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray42, doubleArray44);
        switchingFunctionsHandler22.stepAccepted((double) (short) 10, doubleArray44);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double49 = switchingFunctionsHandler48.getEventTime();
        double[] doubleArray57 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean58 = switchingFunctionsHandler48.reset((double) (byte) 1, doubleArray57);
        boolean boolean59 = switchingFunctionsHandler22.reset((double) 0L, doubleArray57);
        boolean boolean60 = switchingFunctionsHandler15.reset(3.1622776601683795d, doubleArray57);
        boolean boolean61 = switchingFunctionsHandler0.reset((double) 0, doubleArray57);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        switchingFunctionsHandler0.add(switchingFunction62, 0.0d, (double) '#', 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        switchingFunctionsHandler0.add(switchingFunction67, 35.0d, Double.NaN, 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        switchingFunctionsHandler0.add(switchingFunction72, (double) (byte) 1, (double) (byte) -1, 0);
        boolean boolean77 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction78 = null;
        switchingFunctionsHandler0.add(switchingFunction78, 4.449373890263558d, 17.78279410038923d, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-0.0d), (double) (byte) 1, 100.0d, 9.848857801796104d);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double8 = switchingFunctionsHandler7.getEventTime();
        double[] doubleArray16 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean17 = switchingFunctionsHandler7.reset((double) (byte) 1, doubleArray16);
        double[] doubleArray21 = new double[] { 100.0f, 100 };
        boolean boolean22 = switchingFunctionsHandler7.reset(Double.NaN, doubleArray21);
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray21, doubleArray23);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        graggBulirschStoerIntegrator24.addSwitchingFunction(switchingFunction25, (double) 100.0f, (double) 0, 0);
        double double30 = graggBulirschStoerIntegrator24.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator24.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler31);
        graggBulirschStoerIntegrator4.setStepsizeControl(12.823355189994377d, 0.0d, (double) (short) 100, 1.7782794100389228d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(stepHandler31);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getMaxStep();
        double double51 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        java.lang.String str52 = graggBulirschStoerIntegrator38.getName();
        java.lang.String str53 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator38.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str52, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str53, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler54);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double[] doubleArray52 = new double[] { 100.0f, 100 };
        boolean boolean53 = switchingFunctionsHandler38.reset(Double.NaN, doubleArray52);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray52, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray34, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (-1.0d), doubleArray16, doubleArray34);
        graggBulirschStoerIntegrator57.setOrderControl((int) '#', (double) (-1.0f), (double) (byte) -1);
        double double62 = graggBulirschStoerIntegrator57.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        graggBulirschStoerIntegrator57.addSwitchingFunction(switchingFunction63, 3.1622776601683795d, (double) 1, (int) 'a');
        double double68 = graggBulirschStoerIntegrator57.getCurrentStepStart();
        java.lang.String str69 = graggBulirschStoerIntegrator57.getName();
        java.lang.String str70 = graggBulirschStoerIntegrator57.getName();
        double double71 = graggBulirschStoerIntegrator57.getCurrentStepStart();
        java.lang.Class<?> wildcardClass72 = graggBulirschStoerIntegrator57.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str69, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str70, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean3 = switchingFunctionsHandler2.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler2.evaluateStep(stepInterpolator4);
        boolean boolean6 = switchingFunctionsHandler2.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean9 = switchingFunctionsHandler8.isEmpty();
        double[] doubleArray11 = new double[] {};
        switchingFunctionsHandler8.stepAccepted(0.0d, doubleArray11);
        switchingFunctionsHandler2.stepAccepted(5.916079783099616d, doubleArray11);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double15 = switchingFunctionsHandler14.getEventTime();
        double[] doubleArray23 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean24 = switchingFunctionsHandler14.reset((double) (byte) 1, doubleArray23);
        boolean boolean25 = switchingFunctionsHandler14.isEmpty();
        double double26 = switchingFunctionsHandler14.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        boolean boolean28 = switchingFunctionsHandler14.evaluateStep(stepInterpolator27);
        double double29 = switchingFunctionsHandler14.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler14.evaluateStep(stepInterpolator30);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double36 = switchingFunctionsHandler35.getEventTime();
        double[] doubleArray44 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean45 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray44);
        double[] doubleArray49 = new double[] { 100.0f, 100 };
        boolean boolean50 = switchingFunctionsHandler35.reset(Double.NaN, doubleArray49);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray49, doubleArray51);
        switchingFunctionsHandler14.stepAccepted((double) (byte) -1, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(10.0d, 15.298193747370034d, doubleArray11, doubleArray49);
        double double55 = graggBulirschStoerIntegrator54.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        graggBulirschStoerIntegrator54.addSwitchingFunction(switchingFunction56, 12.823355189994377d, 12.368586720951603d, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        java.lang.String str51 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction52, (double) (-1L), 0.0d, (int) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator38.getStepHandler();
        stepHandler57.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str51, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler57);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction39, 1.0d, (double) '4', (int) ' ');
        double double44 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        java.lang.String str45 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        java.lang.String str47 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setInitialStepSize(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction50, 32.0d, (double) 10L, 0);
        double double55 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str45, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        double double12 = switchingFunctionsHandler0.getEventTime();
        boolean boolean13 = switchingFunctionsHandler0.stop();
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler0.evaluateStep(stepInterpolator16);
        double double18 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getMaxStep();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setOrderControl(0, (double) (byte) 100, (double) (short) -1);
        java.lang.String str56 = graggBulirschStoerIntegrator38.getName();
        java.lang.String str57 = graggBulirschStoerIntegrator38.getName();
        double double58 = graggBulirschStoerIntegrator38.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction59, (double) 0.0f, (double) ' ', (int) '#');
        org.apache.commons.math.ode.StepHandler stepHandler64 = null;
        // The following exception was thrown during execution in test generation
        try {
            graggBulirschStoerIntegrator38.setStepHandler(stepHandler64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1L);
        graggBulirschStoerIntegrator38.setOrderControl(0, (double) 10L, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator38.getStepHandler();
        double double52 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 1.0f, (double) 1.0f, (double) 0.0f);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10L, 17.78279410038923d, (double) ' ', Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator62.getStepHandler();
        graggBulirschStoerIntegrator57.setStepHandler(stepHandler63);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        stepHandler63.handleStep(stepInterpolator65, false);
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler63);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(stepHandler63);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction39, 1.0d, (double) '4', (int) ' ');
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, (double) 0L, (double) (-1L));
        double double49 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setStabilityCheck(false, (int) (short) 100, (int) (byte) 100, (double) 3);
        double double55 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double56 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction57, 23.40347319320716d, 31.622776601683793d, 0);
        java.lang.String str62 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str62, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray9);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Gragg-Bulirsch-Stoer", objArray12);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException13);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, hi!, hi!, hi!, hi!, hi!]");
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler52 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler53 = graggBulirschStoerIntegrator38.getStepHandler();
        stepHandler53.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray22, doubleArray38);
        double[] doubleArray41 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray22, doubleArray41);
        double double43 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double44 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        graggBulirschStoerIntegrator42.setStabilityCheck(true, (int) (short) 10, (int) 'a', (double) 1.0f);
        double double50 = graggBulirschStoerIntegrator42.getMinStep();
        java.lang.String str51 = graggBulirschStoerIntegrator42.getName();
        graggBulirschStoerIntegrator42.setStabilityCheck(false, (int) (short) 0, 1, (double) 100L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction57, (-0.0d), 23.40347319320716d, 2);
        org.apache.commons.math.ode.StepHandler stepHandler62 = graggBulirschStoerIntegrator42.getStepHandler();
        double double63 = graggBulirschStoerIntegrator42.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str51, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-0.0d) + "'", double63 == (-0.0d));
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 1L, (double) 10.0f, 10.0d, (double) '#');
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler53 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction54, 1.7782794100389228d, 0.0d, (int) (byte) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction59, (double) (-1L), 97.0d, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler0.evaluateStep(stepInterpolator5);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        boolean boolean11 = switchingFunctionsHandler8.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double16 = switchingFunctionsHandler15.getEventTime();
        double[] doubleArray24 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean25 = switchingFunctionsHandler15.reset((double) (byte) 1, doubleArray24);
        double[] doubleArray29 = new double[] { 100.0f, 100 };
        boolean boolean30 = switchingFunctionsHandler15.reset(Double.NaN, doubleArray29);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double34 = switchingFunctionsHandler33.getEventTime();
        double[] doubleArray42 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean43 = switchingFunctionsHandler33.reset((double) (byte) 1, doubleArray42);
        double[] doubleArray47 = new double[] { 100.0f, 100 };
        boolean boolean48 = switchingFunctionsHandler33.reset(Double.NaN, doubleArray47);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray47, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray29, doubleArray49);
        switchingFunctionsHandler8.stepAccepted((double) '#', doubleArray29);
        boolean boolean53 = switchingFunctionsHandler0.reset(0.0d, doubleArray29);
        boolean boolean54 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        switchingFunctionsHandler0.add(switchingFunction55, (double) 0L, (double) (short) 0, (int) (short) 10);
        double double60 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        boolean boolean6 = switchingFunctionsHandler0.stop();
        double double7 = switchingFunctionsHandler0.getEventTime();
        boolean boolean8 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean13 = switchingFunctionsHandler12.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        boolean boolean15 = switchingFunctionsHandler12.evaluateStep(stepInterpolator14);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler12.evaluateStep(stepInterpolator16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double20 = switchingFunctionsHandler19.getEventTime();
        double[] doubleArray28 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean29 = switchingFunctionsHandler19.reset((double) (byte) 1, doubleArray28);
        switchingFunctionsHandler12.stepAccepted((double) 3, doubleArray28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler31.evaluateStep(stepInterpolator32);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double38 = switchingFunctionsHandler37.getEventTime();
        double[] doubleArray46 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean47 = switchingFunctionsHandler37.reset((double) (byte) 1, doubleArray46);
        double[] doubleArray51 = new double[] { 100.0f, 100 };
        boolean boolean52 = switchingFunctionsHandler37.reset(Double.NaN, doubleArray51);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray51, doubleArray53);
        switchingFunctionsHandler31.stepAccepted((double) (short) 10, doubleArray53);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler57 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double58 = switchingFunctionsHandler57.getEventTime();
        double[] doubleArray66 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean67 = switchingFunctionsHandler57.reset((double) (byte) 1, doubleArray66);
        boolean boolean68 = switchingFunctionsHandler31.reset((double) 0L, doubleArray66);
        boolean boolean69 = switchingFunctionsHandler31.isEmpty();
        double double70 = switchingFunctionsHandler31.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler72 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double73 = switchingFunctionsHandler72.getEventTime();
        double[] doubleArray81 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean82 = switchingFunctionsHandler72.reset((double) (byte) 1, doubleArray81);
        switchingFunctionsHandler31.stepAccepted((double) (byte) 0, doubleArray81);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1), 7.211102550927978d, doubleArray28, doubleArray81);
        boolean boolean85 = switchingFunctionsHandler0.reset(4.161791450287818d, doubleArray28);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator86 = null;
        boolean boolean87 = switchingFunctionsHandler0.evaluateStep(stepInterpolator86);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException11);
        java.lang.String str14 = integratorException13.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException13);
        java.lang.String[] strArray27 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray27);
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray27);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray27);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        derivativeException36.addSuppressed((java.lang.Throwable) derivativeException42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray52);
        org.apache.commons.math.ode.IntegratorException integratorException55 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException54);
        derivativeException44.addSuppressed((java.lang.Throwable) derivativeException54);
        derivativeException32.addSuppressed((java.lang.Throwable) derivativeException54);
        java.lang.Object[] objArray58 = derivativeException54.getArguments();
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException54);
        java.lang.String[] strArray74 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray74);
        org.apache.commons.math.ode.IntegratorException integratorException77 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray74);
        org.apache.commons.math.ode.IntegratorException integratorException80 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray74);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray74);
        org.apache.commons.math.ode.IntegratorException integratorException83 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException82);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException82);
        java.lang.Class<?> wildcardClass85 = derivativeException15.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!, , , hi!, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[hi!, , , hi!, ]");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) '4');
        double double47 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) '#', 17.78279410038923d, 9.848857801796104d, (double) 0);
        graggBulirschStoerIntegrator38.setInitialStepSize(13.37480609952844d);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator59.setInitialStepSize((double) 10L);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler64 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double65 = switchingFunctionsHandler64.getEventTime();
        double[] doubleArray73 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean74 = switchingFunctionsHandler64.reset((double) (byte) 1, doubleArray73);
        double[] doubleArray78 = new double[] { 100.0f, 100 };
        boolean boolean79 = switchingFunctionsHandler64.reset(Double.NaN, doubleArray78);
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray78, doubleArray80);
        graggBulirschStoerIntegrator81.setOrderControl((int) (byte) -1, 0.0d, (double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler86 = graggBulirschStoerIntegrator81.getStepHandler();
        boolean boolean87 = stepHandler86.requiresDenseOutput();
        boolean boolean88 = stepHandler86.requiresDenseOutput();
        stepHandler86.reset();
        graggBulirschStoerIntegrator59.setStepHandler(stepHandler86);
        stepHandler86.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator92 = null;
        stepHandler86.handleStep(stepInterpolator92, true);
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler86);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
        org.junit.Assert.assertNotNull(stepHandler86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray9);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray9);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray24);
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException28);
        java.lang.Object[] objArray31 = derivativeException30.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray33 = derivativeException30.getArguments();
        integratorException12.addSuppressed((java.lang.Throwable) derivativeException30);
        java.lang.Throwable[] throwableArray35 = derivativeException30.getSuppressed();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray41);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("", strArray41);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray41);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException44);
        java.lang.Throwable[] throwableArray46 = derivativeException44.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException47 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray46);
        derivativeException30.addSuppressed((java.lang.Throwable) integratorException47);
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        org.apache.commons.math.ode.IntegratorException integratorException51 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", objArray50);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException51);
        derivativeException30.addSuppressed((java.lang.Throwable) integratorException51);
        java.lang.Throwable[] throwableArray54 = integratorException51.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException51);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double27 = switchingFunctionsHandler26.getEventTime();
        double[] doubleArray35 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean36 = switchingFunctionsHandler26.reset((double) (byte) 1, doubleArray35);
        boolean boolean37 = switchingFunctionsHandler0.reset((double) 0L, doubleArray35);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double42 = switchingFunctionsHandler41.getEventTime();
        double[] doubleArray50 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean51 = switchingFunctionsHandler41.reset((double) (byte) 1, doubleArray50);
        boolean boolean52 = switchingFunctionsHandler39.reset(0.0d, doubleArray50);
        boolean boolean53 = switchingFunctionsHandler0.reset(0.0d, doubleArray50);
        boolean boolean54 = switchingFunctionsHandler0.isEmpty();
        boolean boolean55 = switchingFunctionsHandler0.isEmpty();
        boolean boolean56 = switchingFunctionsHandler0.isEmpty();
        double double57 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        switchingFunctionsHandler0.add(switchingFunction58, (double) 10L, 3.0d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) '4');
        double double47 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler49 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((-1), (double) '4', (double) 0.0f);
        double double54 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setInitialStepSize(2.0d);
        java.lang.String str57 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction39, 1.0d, (double) '4', (int) ' ');
        double double44 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double48 = switchingFunctionsHandler47.getEventTime();
        double[] doubleArray56 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean57 = switchingFunctionsHandler47.reset((double) (byte) 1, doubleArray56);
        double[] doubleArray61 = new double[] { 100.0f, 100 };
        boolean boolean62 = switchingFunctionsHandler47.reset(Double.NaN, doubleArray61);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray61, doubleArray63);
        graggBulirschStoerIntegrator64.setOrderControl((int) (byte) -1, 0.0d, (double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator64.getStepHandler();
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler69);
        org.apache.commons.math.ode.StepHandler stepHandler71 = graggBulirschStoerIntegrator38.getStepHandler();
        boolean boolean72 = stepHandler71.requiresDenseOutput();
        boolean boolean73 = stepHandler71.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertNotNull(stepHandler71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        graggBulirschStoerIntegrator38.setOrderControl((int) '4', (double) (byte) 1, 1.0d);
        graggBulirschStoerIntegrator38.setStepsizeControl(100.0d, (double) 2, (double) (-1), (double) (short) 1);
        double double59 = graggBulirschStoerIntegrator38.getMinStep();
        double double60 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction61, (double) (-1), 10.0d, 3);
        double double66 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double67 = graggBulirschStoerIntegrator38.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, (double) 1.0f, (double) (-1L));
        double double43 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) 'a');
        double double48 = graggBulirschStoerIntegrator38.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler49 = graggBulirschStoerIntegrator38.getStepHandler();
        double double50 = graggBulirschStoerIntegrator38.getMaxStep();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Throwable[] throwableArray13 = derivativeException12.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException12);
        java.lang.String str15 = integratorException14.getPattern();
        java.lang.Throwable[] throwableArray16 = integratorException14.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) throwableArray16);
        java.lang.String str18 = integratorException17.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException" + "'", str18, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException7);
        java.lang.String str9 = derivativeException7.getPattern();
        java.lang.Object[] objArray10 = derivativeException7.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", objArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", objArray10);
        java.lang.Object[] objArray13 = integratorException12.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", objArray13);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", objArray13);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[hi!]");
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        double[] doubleArray4 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double6 = switchingFunctionsHandler5.getEventTime();
        double[] doubleArray14 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean15 = switchingFunctionsHandler5.reset((double) (byte) 1, doubleArray14);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) ' ', doubleArray4, doubleArray14);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        switchingFunctionsHandler19.add(switchingFunction20, (double) '4', (double) (byte) 100, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler19.add(switchingFunction25, (double) 1L, (double) 1, 1);
        boolean boolean30 = switchingFunctionsHandler19.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double35 = switchingFunctionsHandler34.getEventTime();
        double[] doubleArray43 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean44 = switchingFunctionsHandler34.reset((double) (byte) 1, doubleArray43);
        boolean boolean45 = switchingFunctionsHandler32.reset(0.0d, doubleArray43);
        boolean boolean46 = switchingFunctionsHandler19.reset(52.0d, doubleArray43);
        boolean boolean47 = switchingFunctionsHandler17.reset(17.320508075688775d, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) 0, doubleArray4, doubleArray43);
        double double49 = graggBulirschStoerIntegrator48.getCurrentStepStart();
        double double50 = graggBulirschStoerIntegrator48.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        boolean boolean3 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double8 = switchingFunctionsHandler7.getEventTime();
        double[] doubleArray16 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean17 = switchingFunctionsHandler7.reset((double) (byte) 1, doubleArray16);
        double[] doubleArray21 = new double[] { 100.0f, 100 };
        boolean boolean22 = switchingFunctionsHandler7.reset(Double.NaN, doubleArray21);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double26 = switchingFunctionsHandler25.getEventTime();
        double[] doubleArray34 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean35 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray34);
        double[] doubleArray39 = new double[] { 100.0f, 100 };
        boolean boolean40 = switchingFunctionsHandler25.reset(Double.NaN, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray39, doubleArray41);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray21, doubleArray41);
        switchingFunctionsHandler0.stepAccepted((double) '#', doubleArray21);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        boolean boolean46 = switchingFunctionsHandler0.evaluateStep(stepInterpolator45);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        switchingFunctionsHandler0.add(switchingFunction47, 0.0d, 31.209033090201576d, (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        switchingFunctionsHandler0.add(switchingFunction52, (double) '4', 4.161791450287818d, (int) (short) 10);
        double double57 = switchingFunctionsHandler0.getEventTime();
        boolean boolean58 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        graggBulirschStoerIntegrator38.setOrderControl((int) '4', (double) (byte) 1, 1.0d);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 2, (double) (byte) 100, (double) (short) 100, (double) 10.0f);
        double double59 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double60 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction62, 5.623413251903491d, 18.708286933869708d, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(stepHandler61);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray10);
        java.lang.Throwable[] throwableArray20 = integratorException19.getSuppressed();
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        java.lang.String[] strArray40 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray40);
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray40);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException44);
        derivativeException29.addSuppressed((java.lang.Throwable) derivativeException45);
        java.lang.String str47 = derivativeException45.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException45);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        integratorException19.addSuppressed((java.lang.Throwable) derivativeException48);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str47, "org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler2.evaluateStep(stepInterpolator5);
        boolean boolean7 = switchingFunctionsHandler2.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double12 = switchingFunctionsHandler11.getEventTime();
        double[] doubleArray20 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean21 = switchingFunctionsHandler11.reset((double) (byte) 1, doubleArray20);
        double[] doubleArray25 = new double[] { 100.0f, 100 };
        boolean boolean26 = switchingFunctionsHandler11.reset(Double.NaN, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double30 = switchingFunctionsHandler29.getEventTime();
        double[] doubleArray38 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean39 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray38);
        double[] doubleArray43 = new double[] { 100.0f, 100 };
        boolean boolean44 = switchingFunctionsHandler29.reset(Double.NaN, doubleArray43);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray43, doubleArray45);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray25, doubleArray45);
        switchingFunctionsHandler2.stepAccepted((double) 0L, doubleArray45);
        double[] doubleArray49 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 10, doubleArray45, doubleArray49);
        double double51 = graggBulirschStoerIntegrator50.getMinStep();
        graggBulirschStoerIntegrator50.setOrderControl(2, (double) 10, (double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        graggBulirschStoerIntegrator50.addSwitchingFunction(switchingFunction56, 10.0d, (double) 100, 10);
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator50.getStepHandler();
        java.lang.String str62 = graggBulirschStoerIntegrator50.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str62, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.Object[] objArray17 = derivativeException15.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException15);
        java.lang.Throwable[] throwableArray21 = derivativeException15.getSuppressed();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        java.lang.String str27 = derivativeException25.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException25);
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException42);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException43);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException("", strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray52);
        derivativeException45.addSuppressed((java.lang.Throwable) derivativeException57);
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray67);
        org.apache.commons.math.ode.IntegratorException integratorException69 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray67);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray67);
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException70);
        java.lang.Throwable[] throwableArray72 = derivativeException70.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException73 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException70);
        java.lang.Object[] objArray74 = integratorException73.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException75 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException73);
        derivativeException57.addSuppressed((java.lang.Throwable) integratorException75);
        java.lang.String str77 = derivativeException57.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: " + "'", str77, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ");
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        java.lang.String[] strArray17 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray17);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray17);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setInterpolationControl(true, (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction50, (double) '#', (double) (byte) 100, 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction55, (-0.0d), 0.0d, (int) (byte) -1);
        double double60 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction20, (double) 100.0f, (double) 0, 0);
        double double25 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStabilityCheck(true, 1, (int) (byte) 0, (-1.0d));
        graggBulirschStoerIntegrator19.setStepsizeControl(0.0d, 1.0d, (double) (short) -1, (double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction36, Double.NaN, (double) (-1.0f), 3);
        org.apache.commons.math.ode.StepHandler stepHandler41 = graggBulirschStoerIntegrator19.getStepHandler();
        graggBulirschStoerIntegrator19.setStabilityCheck(true, 0, 0, (double) 10.0f);
        java.lang.String str47 = graggBulirschStoerIntegrator19.getName();
        double double48 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl(100, 3.1622776601683795d, (double) (short) 100);
        graggBulirschStoerIntegrator38.setStabilityCheck(true, 0, 1, (double) '#');
        java.lang.String str57 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (short) 1, (double) (short) 1, 100.0d);
        double double63 = graggBulirschStoerIntegrator62.getMaxStep();
        double double64 = graggBulirschStoerIntegrator62.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator62.setOrderControl(0, (double) (-1), (double) (short) 100);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator73.setStepsizeControl((double) 100L, (double) (byte) -1, (double) 100, (double) 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        graggBulirschStoerIntegrator73.addSwitchingFunction(switchingFunction79, (double) (short) 10, 0.0d, (int) 'a');
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator73.getStepHandler();
        graggBulirschStoerIntegrator62.setStepHandler(stepHandler84);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator86 = null;
        stepHandler84.handleStep(stepInterpolator86, true);
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler84);
        org.apache.commons.math.ode.StepHandler stepHandler90 = graggBulirschStoerIntegrator38.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 1.0d + "'", double63 == 1.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertNotNull(stepHandler90);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        java.lang.Object[] objArray22 = derivativeException20.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("", objArray22);
        java.lang.Object[] objArray24 = integratorException23.getArguments();
        java.lang.Object[] objArray25 = integratorException23.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException23);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray32 = derivativeException31.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        java.lang.Throwable[] throwableArray34 = derivativeException33.getSuppressed();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        derivativeException40.addSuppressed((java.lang.Throwable) derivativeException50);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException50);
        derivativeException33.addSuppressed((java.lang.Throwable) derivativeException52);
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException33);
        integratorException23.addSuppressed((java.lang.Throwable) integratorException54);
        derivativeException14.addSuppressed((java.lang.Throwable) integratorException54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException14);
        java.lang.Object[] objArray59 = derivativeException58.getArguments();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[hi!]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[hi!]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[hi!]");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl(100, 3.1622776601683795d, (double) (short) 100);
        graggBulirschStoerIntegrator38.setStabilityCheck(true, 0, 1, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setInitialStepSize(1.7320508075688772d);
        java.lang.String str60 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str60, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("", strArray4);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) throwableArray7);
        java.lang.String[] strArray19 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray19);
        java.lang.Throwable[] throwableArray23 = derivativeException22.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray23);
        integratorException8.addSuppressed((java.lang.Throwable) integratorException24);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.String str32 = derivativeException30.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.Throwable[] throwableArray34 = derivativeException30.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray34);
        integratorException24.addSuppressed((java.lang.Throwable) integratorException35);
        java.lang.Throwable[] throwableArray37 = integratorException35.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException35);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray46);
        java.lang.String str49 = integratorException48.getPattern();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray52);
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException53);
        java.lang.Object[] objArray55 = derivativeException53.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException56 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException53);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException53);
        java.lang.String str58 = derivativeException57.getPattern();
        java.lang.Object[] objArray59 = derivativeException57.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException57);
        integratorException48.addSuppressed((java.lang.Throwable) derivativeException60);
        java.lang.String[] strArray69 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("", strArray69);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray77);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException78);
        derivativeException70.addSuppressed((java.lang.Throwable) derivativeException79);
        java.lang.Throwable[] throwableArray81 = derivativeException70.getSuppressed();
        java.lang.Object[] objArray82 = derivativeException70.getArguments();
        java.lang.Throwable[] throwableArray83 = derivativeException70.getSuppressed();
        integratorException48.addSuppressed((java.lang.Throwable) derivativeException70);
        integratorException35.addSuppressed((java.lang.Throwable) integratorException48);
        org.apache.commons.math.ode.DerivativeException derivativeException86 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException35);
        java.lang.Object[] objArray87 = derivativeException86.getArguments();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[hi!]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[]");
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double8 = switchingFunctionsHandler7.getEventTime();
        double[] doubleArray16 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean17 = switchingFunctionsHandler7.reset((double) (byte) 1, doubleArray16);
        double[] doubleArray21 = new double[] { 100.0f, 100 };
        boolean boolean22 = switchingFunctionsHandler7.reset(Double.NaN, doubleArray21);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double26 = switchingFunctionsHandler25.getEventTime();
        double[] doubleArray34 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean35 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray34);
        double[] doubleArray39 = new double[] { 100.0f, 100 };
        boolean boolean40 = switchingFunctionsHandler25.reset(Double.NaN, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray39, doubleArray41);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray21, doubleArray41);
        switchingFunctionsHandler2.stepAccepted(0.0d, doubleArray41);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double50 = switchingFunctionsHandler49.getEventTime();
        double[] doubleArray58 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean59 = switchingFunctionsHandler49.reset((double) (byte) 1, doubleArray58);
        double[] doubleArray63 = new double[] { 100.0f, 100 };
        boolean boolean64 = switchingFunctionsHandler49.reset(Double.NaN, doubleArray63);
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray63, doubleArray65);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler67 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double68 = switchingFunctionsHandler67.getEventTime();
        double[] doubleArray76 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean77 = switchingFunctionsHandler67.reset((double) (byte) 1, doubleArray76);
        double[] doubleArray81 = new double[] { 100.0f, 100 };
        boolean boolean82 = switchingFunctionsHandler67.reset(Double.NaN, doubleArray81);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator83 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray65, doubleArray81);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) (short) 1, doubleArray41, doubleArray65);
        org.apache.commons.math.ode.StepHandler stepHandler85 = graggBulirschStoerIntegrator84.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler86 = graggBulirschStoerIntegrator84.getStepHandler();
        double double87 = graggBulirschStoerIntegrator84.getCurrentStepStart();
        double double88 = graggBulirschStoerIntegrator84.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(stepHandler85);
        org.junit.Assert.assertNotNull(stepHandler86);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException21);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        java.lang.Object[] objArray28 = derivativeException26.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException29 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        derivativeException21.addSuppressed((java.lang.Throwable) derivativeException26);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException26);
        java.lang.String str33 = derivativeException26.getPattern();
        java.lang.Object[] objArray34 = derivativeException26.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[hi!]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[hi!]");
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction39, 1.0d, (double) '4', (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction44, (double) 0, (-1.0d), (int) '#');
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction52, (double) (byte) -1, (double) 100.0f, 2);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) ' ');
        double double60 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 1, 17.320508075688775d, (double) 100L, 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray34, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray16, doubleArray36);
        java.lang.String str39 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 1.0f, (double) 1.0f, (double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator44.getStepHandler();
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler45);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) ' ');
        graggBulirschStoerIntegrator38.setStepsizeControl((double) (byte) 0, 4.161791450287818d, (double) (short) 1, 1.7782794100389228d);
        graggBulirschStoerIntegrator38.setStepsizeControl(8.366600265340756d, 7.691605673134586d, (double) 2, 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str39, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        double[] doubleArray7 = new double[] { (short) 1, 3.1622776601683795d, '#', 0.0d, 0.0d };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double11 = switchingFunctionsHandler10.getEventTime();
        double[] doubleArray19 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean20 = switchingFunctionsHandler10.reset((double) (byte) 1, doubleArray19);
        double[] doubleArray24 = new double[] { 100.0f, 100 };
        boolean boolean25 = switchingFunctionsHandler10.reset(Double.NaN, doubleArray24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double29 = switchingFunctionsHandler28.getEventTime();
        double[] doubleArray37 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean38 = switchingFunctionsHandler28.reset((double) (byte) 1, doubleArray37);
        double[] doubleArray42 = new double[] { 100.0f, 100 };
        boolean boolean43 = switchingFunctionsHandler28.reset(Double.NaN, doubleArray42);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray42, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray24, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, 10.0d, doubleArray7, doubleArray44);
        graggBulirschStoerIntegrator47.setInterpolationControl(false, 2);
        graggBulirschStoerIntegrator47.setInitialStepSize((double) (short) 0);
        double double53 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        double double54 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 3.1622776601683795, 35.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.Object[] objArray9 = derivativeException8.getArguments();
        java.lang.Object[] objArray10 = derivativeException8.getArguments();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[, hi!, hi!, hi!, hi!, hi!]");
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 2.0d, 32.0d, 17.88854381999832d);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator9 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-0.0d), (double) (byte) 1, 100.0d, 9.848857801796104d);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double13 = switchingFunctionsHandler12.getEventTime();
        double[] doubleArray21 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean22 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray21);
        double[] doubleArray26 = new double[] { 100.0f, 100 };
        boolean boolean27 = switchingFunctionsHandler12.reset(Double.NaN, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray26, doubleArray28);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        graggBulirschStoerIntegrator29.addSwitchingFunction(switchingFunction30, (double) 100.0f, (double) 0, 0);
        double double35 = graggBulirschStoerIntegrator29.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler36 = graggBulirschStoerIntegrator29.getStepHandler();
        graggBulirschStoerIntegrator9.setStepHandler(stepHandler36);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler36);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(stepHandler36);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, Double.NaN, (double) 10.0f, 0);
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        switchingFunctionsHandler0.add(switchingFunction8, (double) 100.0f, 3.1622776601683795d, (int) (byte) -1);
        boolean boolean13 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        switchingFunctionsHandler0.add(switchingFunction14, 56.23413251903491d, 56.23413251903491d, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        boolean boolean22 = switchingFunctionsHandler20.evaluateStep(stepInterpolator21);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler20.add(switchingFunction23, (double) (short) 1, (double) '4', (int) '#');
        boolean boolean28 = switchingFunctionsHandler20.stop();
        boolean boolean29 = switchingFunctionsHandler20.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        switchingFunctionsHandler20.add(switchingFunction30, (double) (byte) 1, (double) 1, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double41 = switchingFunctionsHandler40.getEventTime();
        double[] doubleArray49 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean50 = switchingFunctionsHandler40.reset((double) (byte) 1, doubleArray49);
        double[] doubleArray54 = new double[] { 100.0f, 100 };
        boolean boolean55 = switchingFunctionsHandler40.reset(Double.NaN, doubleArray54);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray54, doubleArray56);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler58 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double59 = switchingFunctionsHandler58.getEventTime();
        double[] doubleArray67 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean68 = switchingFunctionsHandler58.reset((double) (byte) 1, doubleArray67);
        double[] doubleArray72 = new double[] { 100.0f, 100 };
        boolean boolean73 = switchingFunctionsHandler58.reset(Double.NaN, doubleArray72);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(32.0d, 9.848857801796104d, doubleArray54, doubleArray72);
        boolean boolean75 = switchingFunctionsHandler20.reset((double) (short) -1, doubleArray72);
        boolean boolean76 = switchingFunctionsHandler0.reset(5.009970139234591d, doubleArray72);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator38.getStepHandler();
        double double52 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setStabilityCheck(true, (int) (short) 0, 100, (double) (byte) 0);
        double double58 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setOrderControl(0, (double) (short) 10, 2.514866859365871d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        double[] doubleArray2 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double4 = switchingFunctionsHandler3.getEventTime();
        double[] doubleArray12 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean13 = switchingFunctionsHandler3.reset((double) (byte) 1, doubleArray12);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) ' ', doubleArray2, doubleArray12);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        java.lang.String str16 = graggBulirschStoerIntegrator14.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator14.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str16, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray9);
        java.lang.Object[] objArray12 = derivativeException11.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: Gragg-Bulirsch-Stoer", objArray12);
        java.lang.Throwable[] throwableArray14 = integratorException13.getSuppressed();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[, hi!, hi!, hi!, hi!, hi!]");
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 100L, (double) (byte) -1, (double) 100, (double) 3);
        double double10 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator4.getStepHandler();
        double double12 = graggBulirschStoerIntegrator4.getMinStep();
        double double13 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        java.lang.String str15 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str15, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler18.evaluateStep(stepInterpolator19);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        switchingFunctionsHandler18.add(switchingFunction21, (double) (short) 1, (double) '4', (int) '#');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double30 = switchingFunctionsHandler29.getEventTime();
        double[] doubleArray38 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean39 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray38);
        boolean boolean40 = switchingFunctionsHandler27.reset(0.0d, doubleArray38);
        boolean boolean41 = switchingFunctionsHandler18.reset((double) (byte) 100, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray16, doubleArray38);
        double double43 = graggBulirschStoerIntegrator42.getMaxStep();
        graggBulirschStoerIntegrator42.setInterpolationControl(false, (int) (byte) -1);
        double double47 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double48 = graggBulirschStoerIntegrator42.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 0, (double) 100, (double) 1L);
        graggBulirschStoerIntegrator4.setOrderControl((int) (byte) 0, (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator4.getStepHandler();
        java.lang.String str11 = graggBulirschStoerIntegrator4.getName();
        java.lang.String str12 = graggBulirschStoerIntegrator4.getName();
        double double13 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str11, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator19.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction21, (double) (short) 1, (double) (-1L), (int) (byte) 100);
        graggBulirschStoerIntegrator19.setStabilityCheck(false, (int) (byte) 10, 1, 8.366600265340756d);
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator19.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler32 = graggBulirschStoerIntegrator19.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertNotNull(stepHandler32);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, 0.0d, (double) 100L, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double10 = switchingFunctionsHandler9.getEventTime();
        double[] doubleArray18 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean19 = switchingFunctionsHandler9.reset((double) (byte) 1, doubleArray18);
        double[] doubleArray23 = new double[] { 100.0f, 100 };
        boolean boolean24 = switchingFunctionsHandler9.reset(Double.NaN, doubleArray23);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray23, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double28 = switchingFunctionsHandler27.getEventTime();
        double[] doubleArray36 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean37 = switchingFunctionsHandler27.reset((double) (byte) 1, doubleArray36);
        double[] doubleArray41 = new double[] { 100.0f, 100 };
        boolean boolean42 = switchingFunctionsHandler27.reset(Double.NaN, doubleArray41);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray25, doubleArray41);
        graggBulirschStoerIntegrator43.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator43.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        graggBulirschStoerIntegrator43.setStepsizeControl((double) 1L, (double) 10.0f, 10.0d, (double) '#');
        graggBulirschStoerIntegrator43.setInterpolationControl(true, (int) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler59 = graggBulirschStoerIntegrator43.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        stepHandler59.handleStep(stepInterpolator60, false);
        stepHandler59.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        stepHandler59.handleStep(stepInterpolator64, false);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler59);
        double double68 = graggBulirschStoerIntegrator4.getMaxStep();
        double double69 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, (double) 1.0f, (double) (-1L));
        double double43 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStabilityCheck(false, (int) (short) 100, (-1), (double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction49, 1.0d, (double) 1L, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator38.getStepHandler();
        double double55 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        java.lang.String str56 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction57, 10.0d, 72.11102550927978d, (int) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray22, doubleArray38);
        double[] doubleArray41 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray22, doubleArray41);
        double double43 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double44 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double45 = graggBulirschStoerIntegrator42.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction46, (double) (byte) 10, 1.0d, (int) 'a');
        double double51 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler52 = graggBulirschStoerIntegrator42.getStepHandler();
        java.lang.String str53 = graggBulirschStoerIntegrator42.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator58 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator58.setInitialStepSize((double) 10L);
        java.lang.String str61 = graggBulirschStoerIntegrator58.getName();
        org.apache.commons.math.ode.StepHandler stepHandler62 = graggBulirschStoerIntegrator58.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator58.getStepHandler();
        graggBulirschStoerIntegrator42.setStepHandler(stepHandler63);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.0d) + "'", double45 == (-0.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str53, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str61, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertNotNull(stepHandler63);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, 5.916079783099616d, 23.40347319320716d, (double) (byte) 10);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction8, 18.708286933869708d, (double) 'a', (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction13, 5.916079783099616d, 31.209033090201576d, (int) (byte) 10);
        double double18 = graggBulirschStoerIntegrator4.getMinStep();
        graggBulirschStoerIntegrator4.setInitialStepSize((-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException12);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException27);
        java.lang.String str29 = integratorException27.getPattern();
        java.lang.String str30 = integratorException27.getPattern();
        integratorException14.addSuppressed((java.lang.Throwable) integratorException27);
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException27);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 0.0d, 0.0d, 35.0d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction6, (double) 'a', 17.78279410038923d, (int) (short) 1);
        double double11 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, 100);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray8);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray12 = derivativeException11.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException11);
        java.lang.String str14 = integratorException13.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException13);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray23);
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException25);
        integratorException13.addSuppressed((java.lang.Throwable) integratorException26);
        java.lang.Object[] objArray28 = integratorException26.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException26);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException29);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 1.0f, (double) 1.0f, (double) 0.0f);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double8 = switchingFunctionsHandler7.getEventTime();
        double[] doubleArray16 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean17 = switchingFunctionsHandler7.reset((double) (byte) 1, doubleArray16);
        double[] doubleArray21 = new double[] { 100.0f, 100 };
        boolean boolean22 = switchingFunctionsHandler7.reset(Double.NaN, doubleArray21);
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray21, doubleArray23);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        graggBulirschStoerIntegrator24.addSwitchingFunction(switchingFunction25, (double) 100.0f, (double) 0, 0);
        double double30 = graggBulirschStoerIntegrator24.getCurrentStepStart();
        double double31 = graggBulirschStoerIntegrator24.getMaxStep();
        graggBulirschStoerIntegrator24.setInitialStepSize((double) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator24.getStepHandler();
        stepHandler34.reset();
        boolean boolean36 = stepHandler34.requiresDenseOutput();
        boolean boolean37 = stepHandler34.requiresDenseOutput();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler34);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) 'a');
        double double42 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double43 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        integratorException11.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException11);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException26);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException28);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray7);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray7);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException13);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray20);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray32 = derivativeException30.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException30);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        derivativeException25.addSuppressed((java.lang.Throwable) derivativeException30);
        java.lang.Throwable[] throwableArray36 = derivativeException30.getSuppressed();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        java.lang.String str42 = derivativeException40.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException40);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException57);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException58);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException69);
        org.apache.commons.math.ode.IntegratorException integratorException71 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException70);
        org.apache.commons.math.ode.IntegratorException integratorException72 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException71);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException72);
        derivativeException30.addSuppressed((java.lang.Throwable) integratorException72);
        java.lang.String str75 = derivativeException30.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException76 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException30);
        derivativeException13.addSuppressed((java.lang.Throwable) integratorException76);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(5.916079783099616d, 0.0d, 32.0d, 38.3753555559862d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double6 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations7 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler9.evaluateStep(stepInterpolator10);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler9.evaluateStep(stepInterpolator12);
        boolean boolean14 = switchingFunctionsHandler9.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler9.evaluateStep(stepInterpolator15);
        boolean boolean17 = switchingFunctionsHandler9.isEmpty();
        boolean boolean18 = switchingFunctionsHandler9.stop();
        double double19 = switchingFunctionsHandler9.getEventTime();
        double double20 = switchingFunctionsHandler9.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        boolean boolean42 = switchingFunctionsHandler40.evaluateStep(stepInterpolator41);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        switchingFunctionsHandler40.add(switchingFunction43, (double) (short) 1, (double) '4', (int) '#');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double52 = switchingFunctionsHandler51.getEventTime();
        double[] doubleArray60 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean61 = switchingFunctionsHandler51.reset((double) (byte) 1, doubleArray60);
        boolean boolean62 = switchingFunctionsHandler49.reset(0.0d, doubleArray60);
        boolean boolean63 = switchingFunctionsHandler40.reset((double) (byte) 100, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray38, doubleArray60);
        boolean boolean65 = switchingFunctionsHandler9.reset(3.1622776601683795d, doubleArray60);
        double[] doubleArray67 = null;
        // The following exception was thrown during execution in test generation
        try {
            graggBulirschStoerIntegrator4.integrate(firstOrderDifferentialEquations7, (double) 3, doubleArray60, 15.06756998238367d, doubleArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.String str22 = derivativeException19.getPattern();
        java.lang.Object[] objArray23 = derivativeException19.getArguments();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str22, "org.apache.commons.math.ode.DerivativeException");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction20, (double) 100.0f, (double) 0, 0);
        double double25 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction26, (double) 100, (double) 0, 0);
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator19.getStepHandler();
        graggBulirschStoerIntegrator19.setOrderControl(0, (-1.0d), 17.320508075688775d);
        graggBulirschStoerIntegrator19.setStabilityCheck(true, 0, (int) (short) 100, 20.400469235504897d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction41, (double) 2, (double) (short) 10, 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction46, 23.40347319320716d, (double) 1, 100);
        graggBulirschStoerIntegrator19.setInterpolationControl(false, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(stepHandler31);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray22, doubleArray38);
        double[] doubleArray41 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray22, doubleArray41);
        double double43 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double44 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double45 = graggBulirschStoerIntegrator42.getMaxStep();
        double double46 = graggBulirschStoerIntegrator42.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction47, (-1.0d), (double) 1.0f, 1);
        graggBulirschStoerIntegrator42.setStabilityCheck(false, (int) (short) -1, (int) (short) 100, (-0.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction57, (double) (-1L), 31.622776601683793d, (int) '#');
        double double62 = graggBulirschStoerIntegrator42.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-0.0d) + "'", double46 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        integratorException11.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.IntegratorException integratorException28 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException23);
        java.lang.String str29 = integratorException28.getPattern();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 1L, (double) 10.0f, 10.0d, (double) '#');
        graggBulirschStoerIntegrator38.setInterpolationControl(true, (int) (short) 0);
        java.lang.String str54 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl(3.1622776601683795d, (double) 100, (double) (-1L), 0.0d);
        double double60 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setOrderControl((int) (byte) 0, (double) (short) 1, 5.916079783099616d);
        org.apache.commons.math.ode.StepHandler stepHandler65 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStabilityCheck(false, (int) (short) 1, 2, (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler71 = graggBulirschStoerIntegrator38.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str54, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler65);
        org.junit.Assert.assertNotNull(stepHandler71);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray22, doubleArray38);
        double[] doubleArray41 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray22, doubleArray41);
        java.lang.String str43 = graggBulirschStoerIntegrator42.getName();
        double double44 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str43, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray9);
        java.lang.String str18 = derivativeException17.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org.apache.commons.math.ode.DerivativeException" + "'", str18, "org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction48, (double) (-1.0f), (double) 100, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction53, (double) 'a', (double) '4', (int) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStepsizeControl(1.0d, (double) ' ', Double.NaN, 0.0d);
        double double64 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler65 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction66, 4.161791450287818d, (double) 10L, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, (double) 1.0f, (double) (-1L));
        double double43 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction45, (double) (short) 100, 3.1622776601683795d, (int) (byte) 10);
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, (double) 2, (double) 10L, (double) (short) 10);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction6, 17.320508075688775d, 31.71666350274487d, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) '4');
        graggBulirschStoerIntegrator38.setOrderControl((int) '4', Double.NaN, (double) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction51, (double) (short) 10, (double) 0.0f, 0);
        double double56 = graggBulirschStoerIntegrator38.getMinStep();
        graggBulirschStoerIntegrator38.setOrderControl(3, 42.661458015403085d, (double) (short) -1);
        graggBulirschStoerIntegrator38.setOrderControl((int) (byte) 100, 13.37480609952844d, 9.26731744662116d);
        java.lang.String str65 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str65, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction20, (double) 100.0f, (double) 0, 0);
        double double25 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        double double26 = graggBulirschStoerIntegrator19.getMaxStep();
        java.lang.String str27 = graggBulirschStoerIntegrator19.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction28, (double) (short) 10, 0.0d, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction33, 9.848857801796104d, (double) (byte) 0, (int) (byte) 10);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler42 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double43 = switchingFunctionsHandler42.getEventTime();
        double[] doubleArray51 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean52 = switchingFunctionsHandler42.reset((double) (byte) 1, doubleArray51);
        double[] doubleArray56 = new double[] { 100.0f, 100 };
        boolean boolean57 = switchingFunctionsHandler42.reset(Double.NaN, doubleArray56);
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray56, doubleArray58);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double61 = switchingFunctionsHandler60.getEventTime();
        double[] doubleArray69 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean70 = switchingFunctionsHandler60.reset((double) (byte) 1, doubleArray69);
        double[] doubleArray74 = new double[] { 100.0f, 100 };
        boolean boolean75 = switchingFunctionsHandler60.reset(Double.NaN, doubleArray74);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator76 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray58, doubleArray74);
        graggBulirschStoerIntegrator76.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator76.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        double double84 = graggBulirschStoerIntegrator76.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler85 = graggBulirschStoerIntegrator76.getStepHandler();
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler85);
        graggBulirschStoerIntegrator19.setStabilityCheck(true, (int) (short) 0, (int) (byte) 1, 12.368586720951603d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str27, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler85);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler52 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction53, 0.0d, (double) (byte) 1, (-1));
        double double58 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, 10);
        double double62 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double63 = graggBulirschStoerIntegrator38.getMaxStep();
        double double64 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double65 = graggBulirschStoerIntegrator38.getMinStep();
        double double66 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) (byte) 0, (double) (short) -1, Double.NaN);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 10L);
        java.lang.String str7 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler8 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler12 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction16, 9.898464007679532d, 0.0d, 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction21, 5.623413251903491d, 9.26731744662116d, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction26, (double) ' ', 10.0d, (int) '4');
        double double31 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double32 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double33 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str7, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(13.33521432163324d, 5.009970139234591d, (double) 100L, (double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, 0.0d, 0.0d, (int) (short) 100);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException26 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray16);
        java.lang.Throwable[] throwableArray27 = integratorException26.getSuppressed();
        java.lang.String str28 = integratorException26.toString();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException" + "'", str28, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException");
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (-1L));
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler55 = graggBulirschStoerIntegrator38.getStepHandler();
        double double56 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction57, (double) 2, 3.1622776601683795d, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction62, (double) 10, (double) 100L, (int) 'a');
        double double67 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray6);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        java.lang.Object[] objArray18 = derivativeException16.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        derivativeException11.addSuppressed((java.lang.Throwable) derivativeException16);
        java.lang.Throwable[] throwableArray22 = derivativeException16.getSuppressed();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray25);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        java.lang.String str28 = derivativeException26.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException26);
        derivativeException16.addSuppressed((java.lang.Throwable) derivativeException26);
        java.lang.Throwable[] throwableArray31 = derivativeException16.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException32 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", (java.lang.Object[]) throwableArray31);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException42);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException43);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray47);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        java.lang.Object[] objArray50 = derivativeException48.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException51 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException48);
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException48);
        derivativeException43.addSuppressed((java.lang.Throwable) derivativeException48);
        java.lang.Throwable[] throwableArray54 = derivativeException48.getSuppressed();
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray57);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException58);
        java.lang.String str60 = derivativeException58.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException58);
        derivativeException48.addSuppressed((java.lang.Throwable) derivativeException58);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("", strArray72);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray72);
        org.apache.commons.math.ode.DerivativeException derivativeException75 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray72);
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException75);
        derivativeException48.addSuppressed((java.lang.Throwable) derivativeException76);
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray83);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException("", strArray83);
        org.apache.commons.math.ode.DerivativeException derivativeException86 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray83);
        org.apache.commons.math.ode.DerivativeException derivativeException87 = new org.apache.commons.math.ode.DerivativeException("", strArray83);
        org.apache.commons.math.ode.DerivativeException derivativeException88 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException87);
        org.apache.commons.math.ode.IntegratorException integratorException89 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException88);
        org.apache.commons.math.ode.IntegratorException integratorException90 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException89);
        org.apache.commons.math.ode.DerivativeException derivativeException91 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException90);
        derivativeException48.addSuppressed((java.lang.Throwable) integratorException90);
        java.lang.String str93 = derivativeException48.getPattern();
        java.lang.Throwable[] throwableArray94 = derivativeException48.getSuppressed();
        integratorException32.addSuppressed((java.lang.Throwable) derivativeException48);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(throwableArray94);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException19);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray31);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray31);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException34);
        java.lang.Throwable[] throwableArray36 = derivativeException34.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException37 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException34);
        derivativeException19.addSuppressed((java.lang.Throwable) integratorException37);
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException37);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) '4', (double) (byte) 100, (int) (byte) 1);
        boolean boolean6 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        switchingFunctionsHandler0.add(switchingFunction7, (double) (-1), (double) 0.0f, 2);
        boolean boolean12 = switchingFunctionsHandler0.stop();
        boolean boolean13 = switchingFunctionsHandler0.isEmpty();
        boolean boolean14 = switchingFunctionsHandler0.stop();
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, 7.952707287670506d, (double) 3, 17.752843424574987d);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double6 = switchingFunctionsHandler5.getEventTime();
        double[] doubleArray14 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean15 = switchingFunctionsHandler5.reset((double) (byte) 1, doubleArray14);
        double[] doubleArray19 = new double[] { 100.0f, 100 };
        boolean boolean20 = switchingFunctionsHandler5.reset(Double.NaN, doubleArray19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double26 = switchingFunctionsHandler25.getEventTime();
        double[] doubleArray34 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean35 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray34);
        double[] doubleArray39 = new double[] { 100.0f, 100 };
        boolean boolean40 = switchingFunctionsHandler25.reset(Double.NaN, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray39, doubleArray41);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double46 = switchingFunctionsHandler45.getEventTime();
        double[] doubleArray54 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean55 = switchingFunctionsHandler45.reset((double) (byte) 1, doubleArray54);
        double[] doubleArray59 = new double[] { 100.0f, 100 };
        boolean boolean60 = switchingFunctionsHandler45.reset(Double.NaN, doubleArray59);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler63 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double64 = switchingFunctionsHandler63.getEventTime();
        double[] doubleArray72 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean73 = switchingFunctionsHandler63.reset((double) (byte) 1, doubleArray72);
        double[] doubleArray77 = new double[] { 100.0f, 100 };
        boolean boolean78 = switchingFunctionsHandler63.reset(Double.NaN, doubleArray77);
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray77, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray59, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, 10.0d, doubleArray39, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator83 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(1.0d, (double) '#', doubleArray19, doubleArray39);
        boolean boolean84 = switchingFunctionsHandler0.reset((double) (short) 0, doubleArray39);
        boolean boolean85 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator86 = null;
        boolean boolean87 = switchingFunctionsHandler0.evaluateStep(stepInterpolator86);
        double double88 = switchingFunctionsHandler0.getEventTime();
        boolean boolean89 = switchingFunctionsHandler0.isEmpty();
        double double90 = switchingFunctionsHandler0.getEventTime();
        double double91 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue(Double.isNaN(double91));
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(4.161791450287818d, (double) 100.0f, 1.0d, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) '4');
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStabilityCheck(false, (int) (short) 100, (int) 'a', (double) (-1L));
        java.lang.String str26 = graggBulirschStoerIntegrator19.getName();
        java.lang.String str27 = graggBulirschStoerIntegrator19.getName();
        java.lang.String str28 = graggBulirschStoerIntegrator19.getName();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) (short) 100, (double) (short) -1, 5.916079783099616d, 100.0d);
        double double34 = graggBulirschStoerIntegrator19.getMaxStep();
        double double35 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str26, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str27, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray36, doubleArray38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler42 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double43 = switchingFunctionsHandler42.getEventTime();
        double[] doubleArray51 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean52 = switchingFunctionsHandler42.reset((double) (byte) 1, doubleArray51);
        double[] doubleArray56 = new double[] { 100.0f, 100 };
        boolean boolean57 = switchingFunctionsHandler42.reset(Double.NaN, doubleArray56);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double61 = switchingFunctionsHandler60.getEventTime();
        double[] doubleArray69 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean70 = switchingFunctionsHandler60.reset((double) (byte) 1, doubleArray69);
        double[] doubleArray74 = new double[] { 100.0f, 100 };
        boolean boolean75 = switchingFunctionsHandler60.reset(Double.NaN, doubleArray74);
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator77 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray74, doubleArray76);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator78 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray56, doubleArray76);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator79 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, 10.0d, doubleArray36, doubleArray76);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(1.0d, (double) '#', doubleArray16, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction81 = null;
        graggBulirschStoerIntegrator80.addSwitchingFunction(switchingFunction81, (double) (byte) 1, (double) (byte) 100, (int) ' ');
        double double86 = graggBulirschStoerIntegrator80.getCurrentStepStart();
        graggBulirschStoerIntegrator80.setOrderControl((int) (byte) 1, 35.0d, (double) (byte) 0);
        double double91 = graggBulirschStoerIntegrator80.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator80.setStabilityCheck(false, (-1), (int) (byte) 100, (double) 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 5.916079783099616d + "'", double91 == 5.916079783099616d);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 3, (-1.0d), (double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (-1), (-1.0d), 0);
        java.lang.String str10 = graggBulirschStoerIntegrator4.getName();
        double double11 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) '#', (int) ' ', Double.NaN);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 0);
        graggBulirschStoerIntegrator4.setOrderControl((int) 'a', (double) 10L, 1.7782794100389228d);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double28 = switchingFunctionsHandler27.getEventTime();
        double[] doubleArray36 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean37 = switchingFunctionsHandler27.reset((double) (byte) 1, doubleArray36);
        double[] doubleArray41 = new double[] { 100.0f, 100 };
        boolean boolean42 = switchingFunctionsHandler27.reset(Double.NaN, doubleArray41);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray41, doubleArray43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double46 = switchingFunctionsHandler45.getEventTime();
        double[] doubleArray54 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean55 = switchingFunctionsHandler45.reset((double) (byte) 1, doubleArray54);
        double[] doubleArray59 = new double[] { 100.0f, 100 };
        boolean boolean60 = switchingFunctionsHandler45.reset(Double.NaN, doubleArray59);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray43, doubleArray59);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        graggBulirschStoerIntegrator61.addSwitchingFunction(switchingFunction62, 1.0d, (double) '4', (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        graggBulirschStoerIntegrator61.addSwitchingFunction(switchingFunction67, Double.NaN, (double) (short) 1, (int) (short) 1);
        graggBulirschStoerIntegrator61.setStabilityCheck(true, 10, 100, 10.0d);
        graggBulirschStoerIntegrator61.setStepsizeControl(52.0d, (-1.0d), (double) 0, (double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler82 = graggBulirschStoerIntegrator61.getStepHandler();
        stepHandler82.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator84 = null;
        stepHandler82.handleStep(stepInterpolator84, true);
        stepHandler82.reset();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler82);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str10, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 5.477225575051661d + "'", double11 == 5.477225575051661d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(stepHandler82);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.Object[] objArray11 = derivativeException10.getArguments();
        java.lang.String[] strArray21 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException24);
        java.lang.String str26 = derivativeException25.getPattern();
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        java.lang.String str29 = derivativeException10.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException30 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException10);
        java.lang.Throwable[] throwableArray31 = derivativeException10.getSuppressed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str26, "org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(3.0d, (double) 1, 100.0d, 38.3753555559862d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, 2.514866859365871d, 38.3753555559862d, (int) (byte) -1);
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 100, (double) 0L, (-0.0d), (double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) 'a', (double) (short) 0, (int) (short) 1);
        java.lang.String str10 = graggBulirschStoerIntegrator4.getName();
        double double11 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction12, 17.78279410038923d, (double) (byte) 10, (int) '#');
        double double17 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction18, (double) 10.0f, 52.0d, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str10, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("", strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        derivativeException10.addSuppressed((java.lang.Throwable) derivativeException19);
        java.lang.Throwable[] throwableArray21 = derivativeException10.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) throwableArray21);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray21);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException(throwable24);
        java.lang.Object[] objArray26 = derivativeException25.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        integratorException23.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.Throwable[] throwableArray29 = integratorException23.getSuppressed();
        java.lang.String[] strArray38 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray38);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        java.lang.Throwable[] throwableArray42 = derivativeException41.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException41);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException43);
        integratorException23.addSuppressed((java.lang.Throwable) derivativeException44);
        java.lang.Throwable[] throwableArray46 = derivativeException44.getSuppressed();
        java.lang.Object[] objArray47 = derivativeException44.getArguments();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getMaxStep();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setOrderControl(0, (double) (byte) 100, (double) (short) -1);
        java.lang.String str56 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator38.getStepHandler();
        double double58 = graggBulirschStoerIntegrator38.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray5 = derivativeException4.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.Throwable[] throwableArray7 = derivativeException6.getSuppressed();
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray19);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        derivativeException6.addSuppressed((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException6);
        java.lang.String str28 = derivativeException6.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("", strArray35);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ode.IntegratorException integratorException42 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException41);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("", strArray48);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("", strArray56);
        derivativeException50.addSuppressed((java.lang.Throwable) derivativeException60);
        java.lang.Object[] objArray62 = derivativeException50.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException63 = new org.apache.commons.math.ode.IntegratorException("", objArray62);
        org.apache.commons.math.ode.IntegratorException integratorException64 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", objArray62);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("", strArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray70);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException("", strArray70);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray77);
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray82);
        org.apache.commons.math.ode.DerivativeException derivativeException84 = new org.apache.commons.math.ode.DerivativeException("", strArray82);
        derivativeException78.addSuppressed((java.lang.Throwable) derivativeException84);
        derivativeException74.addSuppressed((java.lang.Throwable) derivativeException84);
        org.apache.commons.math.ode.DerivativeException derivativeException87 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException84);
        java.lang.String str88 = derivativeException87.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException89 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException87);
        integratorException64.addSuppressed((java.lang.Throwable) derivativeException87);
        java.lang.String str91 = derivativeException87.getPattern();
        integratorException41.addSuppressed((java.lang.Throwable) derivativeException87);
        java.lang.String str93 = integratorException41.getPattern();
        derivativeException29.addSuppressed((java.lang.Throwable) integratorException41);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[hi!]");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        switchingFunctionsHandler0.add(switchingFunction11, (-1.0d), 32.0d, (int) '#');
        boolean boolean16 = switchingFunctionsHandler0.stop();
        double double17 = switchingFunctionsHandler0.getEventTime();
        boolean boolean18 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler0.add(switchingFunction19, 9.848857801796104d, (double) 1L, (int) (byte) -1);
        boolean boolean24 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 3, (double) 10, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (short) -1, 56.23413251903491d, 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction10, (-0.0d), 1.7782794100389228d, 0);
        graggBulirschStoerIntegrator4.setInitialStepSize(1.7320508075688772d);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction48, (double) (-1.0f), (double) 100, (int) (byte) 1);
        double double53 = graggBulirschStoerIntegrator38.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStabilityCheck(true, 10, 3, (double) ' ');
        double double60 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction61, 17.752843424574987d, (double) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, 5.477225575051661d, Double.NaN, (double) (byte) 1);
        graggBulirschStoerIntegrator4.setOrderControl(100, (double) 0.0f, 0.0d);
        double double9 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double15 = switchingFunctionsHandler14.getEventTime();
        double[] doubleArray23 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean24 = switchingFunctionsHandler14.reset((double) (byte) 1, doubleArray23);
        double[] doubleArray28 = new double[] { 100.0f, 100 };
        boolean boolean29 = switchingFunctionsHandler14.reset(Double.NaN, doubleArray28);
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray28, doubleArray30);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double33 = switchingFunctionsHandler32.getEventTime();
        double[] doubleArray41 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean42 = switchingFunctionsHandler32.reset((double) (byte) 1, doubleArray41);
        double[] doubleArray46 = new double[] { 100.0f, 100 };
        boolean boolean47 = switchingFunctionsHandler32.reset(Double.NaN, doubleArray46);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray30, doubleArray46);
        graggBulirschStoerIntegrator48.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        graggBulirschStoerIntegrator48.setInterpolationControl(false, (int) '4');
        double double57 = graggBulirschStoerIntegrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator48.getStepHandler();
        stepHandler58.reset();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler58);
        double double61 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 23.40347319320716d + "'", double9 == 23.40347319320716d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException15);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException15);
        java.lang.Throwable[] throwableArray18 = derivativeException15.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: Gragg-Bulirsch-Stoer", strArray12);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException16);
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException17);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException34 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray31);
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: ", strArray31);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException", strArray31);
        java.lang.Throwable[] throwableArray39 = derivativeException38.getSuppressed();
        derivativeException8.addSuppressed((java.lang.Throwable) derivativeException38);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        java.lang.Object[] objArray51 = derivativeException50.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException50);
        org.apache.commons.math.ode.DerivativeException derivativeException53 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException52);
        derivativeException38.addSuppressed((java.lang.Throwable) derivativeException52);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!]");
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        graggBulirschStoerIntegrator38.setOrderControl((int) '4', (double) (byte) 1, 1.0d);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 2, (double) (byte) 100, (double) (short) 100, (double) 10.0f);
        org.apache.commons.math.ode.StepHandler stepHandler59 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        stepHandler59.handleStep(stepInterpolator60, true);
        stepHandler59.reset();
        boolean boolean64 = stepHandler59.requiresDenseOutput();
        boolean boolean65 = stepHandler59.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) (byte) 100);
        double double48 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction49, (double) 100L, (double) (short) -1, (int) ' ');
        graggBulirschStoerIntegrator38.setInitialStepSize(5.477225575051661d);
        double double56 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, 3);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray22, doubleArray38);
        double[] doubleArray41 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray22, doubleArray41);
        double double43 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double44 = graggBulirschStoerIntegrator42.getCurrentStepStart();
        double double45 = graggBulirschStoerIntegrator42.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator42.setOrderControl((int) 'a', (double) (-1.0f), (double) '4');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction50, 10.0d, (double) (-1.0f), (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction55, (double) (short) 1, (double) 1.0f, 0);
        double double60 = graggBulirschStoerIntegrator42.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-0.0d) + "'", double45 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-0.0d) + "'", double60 == (-0.0d));
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        double double4 = switchingFunctionsHandler0.getEventTime();
        double double5 = switchingFunctionsHandler0.getEventTime();
        boolean boolean6 = switchingFunctionsHandler0.isEmpty();
        boolean boolean7 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, (double) 1.0f, (double) (-1L));
        double double43 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) ' ', (double) (byte) 0, (double) 0.0f, 4.161791450287818d);
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double51 = graggBulirschStoerIntegrator38.getMinStep();
        double double52 = graggBulirschStoerIntegrator38.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        graggBulirschStoerIntegrator19.setInterpolationControl(true, (int) (short) 0);
        graggBulirschStoerIntegrator19.setInitialStepSize(38.3753555559862d);
        double double26 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        double double27 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        double double28 = graggBulirschStoerIntegrator19.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double44 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction48, (double) (-1.0f), (double) 100, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction53, (double) 'a', (double) '4', (int) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStabilityCheck(true, 0, (int) (byte) 1, (double) 1.0f);
        java.lang.String str64 = graggBulirschStoerIntegrator38.getName();
        java.lang.String str65 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str64, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str65, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        java.lang.String str51 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction52, (double) 2, 100.0d, (int) (short) 100);
        double double57 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(17.320508075688775d, (double) 1L, (double) 0.0f, 100.0d);
        graggBulirschStoerIntegrator62.setStepsizeControl(5.916079783099616d, (double) (short) 0, (double) 0L, 0.0d);
        java.lang.String str68 = graggBulirschStoerIntegrator62.getName();
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator62.getStepHandler();
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler69);
        org.apache.commons.math.ode.StepHandler stepHandler71 = graggBulirschStoerIntegrator38.getStepHandler();
        double double72 = graggBulirschStoerIntegrator38.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str51, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str68, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertNotNull(stepHandler71);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double52 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStabilityCheck(false, 2, 3, (double) (short) 10);
        java.lang.String str58 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction59, 31.209033090201576d, 56.23413251903491d, (int) '#');
        double double64 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler65 = graggBulirschStoerIntegrator38.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str58, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) 100L, (double) 10.0f, (double) 100, (double) '#');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double31 = switchingFunctionsHandler30.getEventTime();
        double[] doubleArray39 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean40 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray39);
        double[] doubleArray44 = new double[] { 100.0f, 100 };
        boolean boolean45 = switchingFunctionsHandler30.reset(Double.NaN, doubleArray44);
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray44, doubleArray46);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double49 = switchingFunctionsHandler48.getEventTime();
        double[] doubleArray57 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean58 = switchingFunctionsHandler48.reset((double) (byte) 1, doubleArray57);
        double[] doubleArray62 = new double[] { 100.0f, 100 };
        boolean boolean63 = switchingFunctionsHandler48.reset(Double.NaN, doubleArray62);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray46, doubleArray62);
        graggBulirschStoerIntegrator64.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator64.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler72 = graggBulirschStoerIntegrator64.getStepHandler();
        graggBulirschStoerIntegrator64.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler77 = graggBulirschStoerIntegrator64.getStepHandler();
        boolean boolean78 = stepHandler77.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator79 = null;
        stepHandler77.handleStep(stepInterpolator79, true);
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler77);
        java.lang.String str83 = graggBulirschStoerIntegrator19.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction84 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction84, 1.0d, (double) (byte) 0, (-1));
        double double89 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction90 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction90, 0.0d, (double) 100L, (int) (short) 10);
        double double95 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler96 = graggBulirschStoerIntegrator19.getStepHandler();
        stepHandler96.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str83, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertNotNull(stepHandler96);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStabilityCheck(false, (int) (short) 100, (int) 'a', (double) (-1L));
        java.lang.String str26 = graggBulirschStoerIntegrator19.getName();
        java.lang.String str27 = graggBulirschStoerIntegrator19.getName();
        java.lang.String str28 = graggBulirschStoerIntegrator19.getName();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) (short) 100, (double) (short) -1, 5.916079783099616d, 100.0d);
        graggBulirschStoerIntegrator19.setOrderControl((int) (short) 100, 9.848857801796104d, 0.0d);
        double double38 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        double double39 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str26, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str27, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) 0, (double) 100L, 0.0d, (double) 0.0f);
        java.lang.String str26 = graggBulirschStoerIntegrator19.getName();
        java.lang.String str27 = graggBulirschStoerIntegrator19.getName();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double33 = switchingFunctionsHandler32.getEventTime();
        double[] doubleArray41 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean42 = switchingFunctionsHandler32.reset((double) (byte) 1, doubleArray41);
        double[] doubleArray46 = new double[] { 100.0f, 100 };
        boolean boolean47 = switchingFunctionsHandler32.reset(Double.NaN, doubleArray46);
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray46, doubleArray48);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double51 = switchingFunctionsHandler50.getEventTime();
        double[] doubleArray59 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean60 = switchingFunctionsHandler50.reset((double) (byte) 1, doubleArray59);
        double[] doubleArray64 = new double[] { 100.0f, 100 };
        boolean boolean65 = switchingFunctionsHandler50.reset(Double.NaN, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray48, doubleArray64);
        graggBulirschStoerIntegrator66.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        double double72 = graggBulirschStoerIntegrator66.getCurrentStepStart();
        graggBulirschStoerIntegrator66.setInterpolationControl(false, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction76 = null;
        graggBulirschStoerIntegrator66.addSwitchingFunction(switchingFunction76, (double) (-1.0f), (double) 100, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction81 = null;
        graggBulirschStoerIntegrator66.addSwitchingFunction(switchingFunction81, (double) 'a', (double) '4', (int) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler86 = graggBulirschStoerIntegrator66.getStepHandler();
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler86);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str26, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str27, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler86);
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double[] doubleArray52 = new double[] { 100.0f, 100 };
        boolean boolean53 = switchingFunctionsHandler38.reset(Double.NaN, doubleArray52);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray52, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray34, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (-1.0d), doubleArray16, doubleArray34);
        double double58 = graggBulirschStoerIntegrator57.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator57.addSwitchingFunction(switchingFunction59, 100.0d, (double) 'a', 1);
        double double64 = graggBulirschStoerIntegrator57.getMaxStep();
        graggBulirschStoerIntegrator57.setOrderControl(0, 0.0d, 9.898464007679532d);
        double double69 = graggBulirschStoerIntegrator57.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        graggBulirschStoerIntegrator57.addSwitchingFunction(switchingFunction70, 17.320508075688775d, (double) (byte) 100, (int) (byte) 100);
        graggBulirschStoerIntegrator57.setStabilityCheck(false, (int) (short) 0, (int) '4', 6.928935924497552d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double41 = switchingFunctionsHandler40.getEventTime();
        double[] doubleArray49 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean50 = switchingFunctionsHandler40.reset((double) (byte) 1, doubleArray49);
        double[] doubleArray54 = new double[] { 100.0f, 100 };
        boolean boolean55 = switchingFunctionsHandler40.reset(Double.NaN, doubleArray54);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray54, doubleArray56);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator58 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray36, doubleArray56);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (-1.0d), doubleArray18, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double61 = switchingFunctionsHandler60.getEventTime();
        boolean boolean62 = switchingFunctionsHandler60.isEmpty();
        boolean boolean63 = switchingFunctionsHandler60.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler65 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator66 = null;
        boolean boolean67 = switchingFunctionsHandler65.evaluateStep(stepInterpolator66);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double72 = switchingFunctionsHandler71.getEventTime();
        double[] doubleArray80 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean81 = switchingFunctionsHandler71.reset((double) (byte) 1, doubleArray80);
        double[] doubleArray85 = new double[] { 100.0f, 100 };
        boolean boolean86 = switchingFunctionsHandler71.reset(Double.NaN, doubleArray85);
        double[] doubleArray87 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator88 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray85, doubleArray87);
        switchingFunctionsHandler65.stepAccepted((double) (short) 10, doubleArray87);
        switchingFunctionsHandler60.stepAccepted((double) 100.0f, doubleArray87);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator91 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, (double) (short) 10, doubleArray18, doubleArray87);
        graggBulirschStoerIntegrator91.setInitialStepSize((double) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction94 = null;
        graggBulirschStoerIntegrator91.addSwitchingFunction(switchingFunction94, 4.161791450287818d, 5.477225575051661d, (int) (short) 0);
        double double99 = graggBulirschStoerIntegrator91.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[]");
        org.junit.Assert.assertTrue("'" + double99 + "' != '" + 0.0d + "'", double99 == 0.0d);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        derivativeException13.addSuppressed((java.lang.Throwable) derivativeException19);
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException22);
        java.lang.String str24 = integratorException23.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException23);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        integratorException23.addSuppressed((java.lang.Throwable) derivativeException37);
        java.lang.Throwable[] throwableArray39 = integratorException23.getSuppressed();
        java.lang.Throwable[] throwableArray40 = integratorException23.getSuppressed();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        derivativeException48.addSuppressed((java.lang.Throwable) derivativeException58);
        java.lang.Object[] objArray60 = derivativeException48.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException("", objArray60);
        org.apache.commons.math.ode.IntegratorException integratorException62 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", objArray60);
        java.lang.String[] strArray68 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException69 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException("", strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException71 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray68);
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("", strArray68);
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException76 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray75);
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException81 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray80);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("", strArray80);
        derivativeException76.addSuppressed((java.lang.Throwable) derivativeException82);
        derivativeException72.addSuppressed((java.lang.Throwable) derivativeException82);
        org.apache.commons.math.ode.DerivativeException derivativeException85 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException82);
        java.lang.String str86 = derivativeException85.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException87 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException85);
        integratorException62.addSuppressed((java.lang.Throwable) derivativeException85);
        integratorException23.addSuppressed((java.lang.Throwable) integratorException62);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[hi!]");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        switchingFunctionsHandler0.add(switchingFunction11, (-1.0d), 32.0d, (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        switchingFunctionsHandler0.add(switchingFunction16, (double) 100, (double) 1L, (int) ' ');
        double double21 = switchingFunctionsHandler0.getEventTime();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double8 = switchingFunctionsHandler7.getEventTime();
        double[] doubleArray16 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean17 = switchingFunctionsHandler7.reset((double) (byte) 1, doubleArray16);
        switchingFunctionsHandler0.stepAccepted((double) 3, doubleArray16);
        boolean boolean19 = switchingFunctionsHandler0.stop();
        boolean boolean20 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("", strArray3);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray23);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("", strArray23);
        derivativeException19.addSuppressed((java.lang.Throwable) derivativeException25);
        derivativeException15.addSuppressed((java.lang.Throwable) derivativeException25);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException25);
        derivativeException5.addSuppressed((java.lang.Throwable) derivativeException25);
        java.lang.Object[] objArray30 = derivativeException25.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException25);
        java.lang.Object[] objArray32 = integratorException31.getArguments();
        java.lang.Object[] objArray33 = integratorException31.getArguments();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray42);
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray42);
        org.apache.commons.math.ode.DerivativeException derivativeException45 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray42);
        org.apache.commons.math.ode.IntegratorException integratorException46 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException45);
        java.lang.Throwable[] throwableArray47 = derivativeException45.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException48 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException45);
        integratorException31.addSuppressed((java.lang.Throwable) integratorException48);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException48);
        java.lang.String str51 = integratorException48.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str51, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, 2.0d, (double) (-1.0f), 18.708286933869708d);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray14);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException22);
        java.lang.Throwable[] throwableArray24 = integratorException23.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException23);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, 12.368586720951603d, (double) '4', (int) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        switchingFunctionsHandler0.add(switchingFunction7, 1.7320508075688772d, (double) 100.0f, 1);
        double double12 = switchingFunctionsHandler0.getEventTime();
        double double13 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray6 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double10 = switchingFunctionsHandler9.getEventTime();
        double[] doubleArray18 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean19 = switchingFunctionsHandler9.reset((double) (byte) 1, doubleArray18);
        double[] doubleArray23 = new double[] { 100.0f, 100 };
        boolean boolean24 = switchingFunctionsHandler9.reset(Double.NaN, doubleArray23);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double28 = switchingFunctionsHandler27.getEventTime();
        double[] doubleArray36 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean37 = switchingFunctionsHandler27.reset((double) (byte) 1, doubleArray36);
        double[] doubleArray41 = new double[] { 100.0f, 100 };
        boolean boolean42 = switchingFunctionsHandler27.reset(Double.NaN, doubleArray41);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double46 = switchingFunctionsHandler45.getEventTime();
        double[] doubleArray54 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean55 = switchingFunctionsHandler45.reset((double) (byte) 1, doubleArray54);
        double[] doubleArray59 = new double[] { 100.0f, 100 };
        boolean boolean60 = switchingFunctionsHandler45.reset(Double.NaN, doubleArray59);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray59, doubleArray61);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator63 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray41, doubleArray61);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (-1.0d), doubleArray23, doubleArray41);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (byte) 1, doubleArray6, doubleArray41);
        switchingFunctionsHandler0.stepAccepted(5.916079783099616d, doubleArray41);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator67 = null;
        boolean boolean68 = switchingFunctionsHandler0.evaluateStep(stepInterpolator67);
        double[] doubleArray70 = null;
        boolean boolean71 = switchingFunctionsHandler0.reset((double) 3, doubleArray70);
        boolean boolean72 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator73 = null;
        boolean boolean74 = switchingFunctionsHandler0.evaluateStep(stepInterpolator73);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction75 = null;
        switchingFunctionsHandler0.add(switchingFunction75, 1.0d, 56.23413251903491d, 0);
        boolean boolean80 = switchingFunctionsHandler0.isEmpty();
        double double81 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray16);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray16);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: ", strArray16);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray32 = derivativeException31.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.IntegratorException integratorException34 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException33);
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray37);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException38);
        java.lang.Object[] objArray40 = derivativeException39.getArguments();
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException39);
        java.lang.Throwable[] throwableArray42 = derivativeException41.getSuppressed();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray46);
        org.apache.commons.math.ode.DerivativeException derivativeException48 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        derivativeException48.addSuppressed((java.lang.Throwable) derivativeException58);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException58);
        derivativeException41.addSuppressed((java.lang.Throwable) derivativeException60);
        org.apache.commons.math.ode.IntegratorException integratorException62 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException41);
        derivativeException33.addSuppressed((java.lang.Throwable) derivativeException41);
        derivativeException26.addSuppressed((java.lang.Throwable) derivativeException33);
        org.apache.commons.math.ode.IntegratorException integratorException65 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException33);
        java.lang.String str66 = integratorException65.toString();
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str66, "org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ode.IntegratorException integratorException1 = new org.apache.commons.math.ode.IntegratorException(throwable0);
        org.apache.commons.math.ode.DerivativeException derivativeException2 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException1);
        java.lang.Object[] objArray3 = derivativeException2.getArguments();
        java.lang.String str4 = derivativeException2.getPattern();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        double double4 = switchingFunctionsHandler0.getEventTime();
        double double5 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double8 = switchingFunctionsHandler7.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler7.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double13 = switchingFunctionsHandler12.getEventTime();
        double[] doubleArray21 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean22 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray21);
        boolean boolean23 = switchingFunctionsHandler12.isEmpty();
        double double24 = switchingFunctionsHandler12.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler12.add(switchingFunction25, (double) 100L, (double) 1.0f, (int) (short) -1);
        boolean boolean30 = switchingFunctionsHandler12.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        boolean boolean34 = switchingFunctionsHandler32.evaluateStep(stepInterpolator33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double[] doubleArray52 = new double[] { 100.0f, 100 };
        boolean boolean53 = switchingFunctionsHandler38.reset(Double.NaN, doubleArray52);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray52, doubleArray54);
        switchingFunctionsHandler32.stepAccepted((double) (short) 10, doubleArray54);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler58 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double59 = switchingFunctionsHandler58.getEventTime();
        double[] doubleArray67 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean68 = switchingFunctionsHandler58.reset((double) (byte) 1, doubleArray67);
        boolean boolean69 = switchingFunctionsHandler32.reset((double) 0L, doubleArray67);
        boolean boolean70 = switchingFunctionsHandler12.reset((double) (byte) 10, doubleArray67);
        boolean boolean71 = switchingFunctionsHandler7.reset((double) 0L, doubleArray67);
        switchingFunctionsHandler0.stepAccepted((double) (-1.0f), doubleArray67);
        boolean boolean73 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        boolean boolean75 = switchingFunctionsHandler0.evaluateStep(stepInterpolator74);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction41, 3.1622776601683795d, (double) (short) 10, 3);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction47, 0.0d, (double) '#', 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction52, 1.0d, (double) (short) 0, (int) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setInitialStepSize(59.16079783099616d);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler62 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStepsizeControl(18.708286933869708d, 6.841560230416328d, 100.0d, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertNotNull(stepHandler62);
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException13 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException18);
        java.lang.String str20 = derivativeException18.getPattern();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray29);
        org.apache.commons.math.ode.IntegratorException integratorException31 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) strArray29);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray29);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException32);
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException32);
        java.lang.String str35 = derivativeException32.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException32);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray39);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        java.lang.Object[] objArray42 = derivativeException40.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        derivativeException36.addSuppressed((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        derivativeException14.addSuppressed((java.lang.Throwable) derivativeException46);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray56);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException59);
        org.apache.commons.math.ode.IntegratorException integratorException61 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException60);
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray71);
        org.apache.commons.math.ode.DerivativeException derivativeException73 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray71);
        org.apache.commons.math.ode.DerivativeException derivativeException74 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray71);
        org.apache.commons.math.ode.IntegratorException integratorException75 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray71);
        derivativeException60.addSuppressed((java.lang.Throwable) integratorException75);
        derivativeException46.addSuppressed((java.lang.Throwable) integratorException75);
        java.lang.String str78 = integratorException75.getPattern();
        java.lang.Throwable[] throwableArray79 = integratorException75.getSuppressed();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str35, "org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[hi!]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "org.apache.commons.math.ode.IntegratorException: " + "'", str78, "org.apache.commons.math.ode.IntegratorException: ");
        org.junit.Assert.assertNotNull(throwableArray79);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double50 = graggBulirschStoerIntegrator38.getMaxStep();
        double double51 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        java.lang.String str52 = graggBulirschStoerIntegrator38.getName();
        double double53 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) (-1.0f), 97.0d, 20.400469235504897d, 20.400469235504897d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str52, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray16, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) (short) -1, (double) 3, (double) (-1.0f), (double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction26, (double) 100, (double) 2, (int) (byte) 10);
        double double31 = graggBulirschStoerIntegrator19.getMinStep();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double37 = switchingFunctionsHandler36.getEventTime();
        double[] doubleArray45 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean46 = switchingFunctionsHandler36.reset((double) (byte) 1, doubleArray45);
        double[] doubleArray50 = new double[] { 100.0f, 100 };
        boolean boolean51 = switchingFunctionsHandler36.reset(Double.NaN, doubleArray50);
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray50, doubleArray52);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler54 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double55 = switchingFunctionsHandler54.getEventTime();
        double[] doubleArray63 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean64 = switchingFunctionsHandler54.reset((double) (byte) 1, doubleArray63);
        double[] doubleArray68 = new double[] { 100.0f, 100 };
        boolean boolean69 = switchingFunctionsHandler54.reset(Double.NaN, doubleArray68);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray52, doubleArray68);
        graggBulirschStoerIntegrator70.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator70.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler78 = graggBulirschStoerIntegrator70.getStepHandler();
        graggBulirschStoerIntegrator70.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler83 = graggBulirschStoerIntegrator70.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator84 = null;
        stepHandler83.handleStep(stepInterpolator84, false);
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler83);
        double double88 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(stepHandler78);
        org.junit.Assert.assertNotNull(stepHandler83);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.Object[] objArray6 = derivativeException4.getArguments();
        java.lang.String str7 = derivativeException4.getPattern();
        java.lang.Object[] objArray8 = derivativeException4.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", objArray8);
        java.lang.Throwable[] throwableArray10 = integratorException9.getSuppressed();
        java.lang.String str11 = integratorException9.toString();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer" + "'", str11, "org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException21 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: ", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (-1L));
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler55 = graggBulirschStoerIntegrator38.getStepHandler();
        double double56 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        java.lang.String str57 = graggBulirschStoerIntegrator38.getName();
        java.lang.String str58 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str58, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray5);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException6);
        java.lang.Object[] objArray8 = derivativeException6.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("", objArray8);
        java.lang.Object[] objArray10 = integratorException9.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException11 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", objArray10);
        org.apache.commons.math.ode.IntegratorException integratorException12 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException11);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray18);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException22);
        java.lang.Throwable[] throwableArray24 = derivativeException23.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException35 = new org.apache.commons.math.ode.DerivativeException("", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray34);
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException36);
        derivativeException23.addSuppressed((java.lang.Throwable) derivativeException37);
        integratorException11.addSuppressed((java.lang.Throwable) derivativeException23);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException23);
        java.lang.Throwable[] throwableArray41 = derivativeException23.getSuppressed();
        java.lang.Throwable[] throwableArray42 = derivativeException23.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException43 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) throwableArray42);
        java.lang.Object[] objArray44 = integratorException43.getArguments();
        java.lang.String str45 = integratorException43.getPattern();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[hi!]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[hi!]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator38.getStepHandler();
        double double52 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setInterpolationControl(true, (int) (byte) 100);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction59, Double.NaN, (double) (byte) 1, (int) (short) 10);
        java.lang.String str64 = graggBulirschStoerIntegrator38.getName();
        java.lang.String str65 = graggBulirschStoerIntegrator38.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str64, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str65, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray2);
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.Object[] objArray5 = derivativeException3.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException6 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException6);
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray14);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray21);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray26);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("", strArray26);
        derivativeException22.addSuppressed((java.lang.Throwable) derivativeException28);
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException28);
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException28);
        integratorException6.addSuppressed((java.lang.Throwable) derivativeException28);
        java.lang.Throwable[] throwableArray33 = integratorException6.getSuppressed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 3, 0.0d, (double) (byte) 10, 3.1622776601683795d);
        graggBulirschStoerIntegrator4.setInitialStepSize(10.0d);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double12 = switchingFunctionsHandler11.getEventTime();
        double[] doubleArray20 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean21 = switchingFunctionsHandler11.reset((double) (byte) 1, doubleArray20);
        double[] doubleArray25 = new double[] { 100.0f, 100 };
        boolean boolean26 = switchingFunctionsHandler11.reset(Double.NaN, doubleArray25);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray25, doubleArray27);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double30 = switchingFunctionsHandler29.getEventTime();
        double[] doubleArray38 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean39 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray38);
        double[] doubleArray43 = new double[] { 100.0f, 100 };
        boolean boolean44 = switchingFunctionsHandler29.reset(Double.NaN, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray27, doubleArray43);
        graggBulirschStoerIntegrator45.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str51 = graggBulirschStoerIntegrator45.getName();
        graggBulirschStoerIntegrator45.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        double double57 = graggBulirschStoerIntegrator45.getCurrentStepStart();
        double double58 = graggBulirschStoerIntegrator45.getCurrentStepStart();
        double double59 = graggBulirschStoerIntegrator45.getCurrentSignedStepsize();
        double double60 = graggBulirschStoerIntegrator45.getMaxStep();
        java.lang.String str61 = graggBulirschStoerIntegrator45.getName();
        double double62 = graggBulirschStoerIntegrator45.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator45.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler63);
        double double65 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str51, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str61, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, (double) 1, (double) (short) 0, (double) 100L);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double6 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double7 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double8 = graggBulirschStoerIntegrator4.getMinStep();
        java.lang.String str9 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str9, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("Gragg-Bulirsch-Stoer", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException", (java.lang.Object[]) strArray10);
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException("", strArray28);
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray28);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException39 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException("", strArray36);
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException40);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException41);
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray45);
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException46);
        java.lang.Object[] objArray48 = derivativeException46.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException49 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException46);
        org.apache.commons.math.ode.DerivativeException derivativeException50 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException46);
        derivativeException41.addSuppressed((java.lang.Throwable) derivativeException46);
        derivativeException30.addSuppressed((java.lang.Throwable) derivativeException46);
        java.lang.String str53 = derivativeException30.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException54 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException30);
        java.lang.Object[] objArray55 = derivativeException54.getArguments();
        integratorException19.addSuppressed((java.lang.Throwable) derivativeException54);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[hi!]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str44 = graggBulirschStoerIntegrator38.getName();
        double double45 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 10.0f, (double) (short) 100, 10.0d, (double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator38.getStepHandler();
        double double52 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double53 = graggBulirschStoerIntegrator38.getMaxStep();
        graggBulirschStoerIntegrator38.setInitialStepSize(3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double7 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray15 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean16 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray15);
        double[] doubleArray20 = new double[] { 100.0f, 100 };
        boolean boolean21 = switchingFunctionsHandler6.reset(Double.NaN, doubleArray20);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray20, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double25 = switchingFunctionsHandler24.getEventTime();
        double[] doubleArray33 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean34 = switchingFunctionsHandler24.reset((double) (byte) 1, doubleArray33);
        double[] doubleArray38 = new double[] { 100.0f, 100 };
        boolean boolean39 = switchingFunctionsHandler24.reset(Double.NaN, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray22, doubleArray38);
        double[] doubleArray41 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (-1), doubleArray22, doubleArray41);
        org.apache.commons.math.ode.StepHandler stepHandler43 = graggBulirschStoerIntegrator42.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction44, (double) 0L, (double) 10, 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction49, (double) (short) 10, (double) (byte) 1, (int) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator42.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler57 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double58 = switchingFunctionsHandler57.getEventTime();
        double[] doubleArray66 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean67 = switchingFunctionsHandler57.reset((double) (byte) 1, doubleArray66);
        double[] doubleArray71 = new double[] { 100.0f, 100 };
        boolean boolean72 = switchingFunctionsHandler57.reset(Double.NaN, doubleArray71);
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray71, doubleArray73);
        double double75 = graggBulirschStoerIntegrator74.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler76 = graggBulirschStoerIntegrator74.getStepHandler();
        graggBulirschStoerIntegrator42.setStepHandler(stepHandler76);
        double double78 = graggBulirschStoerIntegrator42.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        graggBulirschStoerIntegrator42.addSwitchingFunction(switchingFunction79, (double) '#', 42.661458015403085d, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException5);
        java.lang.Object[] objArray7 = derivativeException6.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException("", objArray7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: hi!", objArray7);
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException9);
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "hi!", "hi!", "hi!", "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray22);
        org.apache.commons.math.ode.IntegratorException integratorException27 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray22);
        integratorException9.addSuppressed((java.lang.Throwable) integratorException27);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (-0.0d), 0.0d, (double) '4');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double10 = switchingFunctionsHandler9.getEventTime();
        double[] doubleArray18 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean19 = switchingFunctionsHandler9.reset((double) (byte) 1, doubleArray18);
        double[] doubleArray23 = new double[] { 100.0f, 100 };
        boolean boolean24 = switchingFunctionsHandler9.reset(Double.NaN, doubleArray23);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray23, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double28 = switchingFunctionsHandler27.getEventTime();
        double[] doubleArray36 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean37 = switchingFunctionsHandler27.reset((double) (byte) 1, doubleArray36);
        double[] doubleArray41 = new double[] { 100.0f, 100 };
        boolean boolean42 = switchingFunctionsHandler27.reset(Double.NaN, doubleArray41);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray25, doubleArray41);
        graggBulirschStoerIntegrator43.setStepsizeControl((double) 100, (double) (short) 10, (double) 1, (double) 0);
        java.lang.String str49 = graggBulirschStoerIntegrator43.getName();
        graggBulirschStoerIntegrator43.setStepsizeControl((double) 'a', (double) (-1), (double) '#', (double) 'a');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler57 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double58 = switchingFunctionsHandler57.getEventTime();
        double[] doubleArray66 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean67 = switchingFunctionsHandler57.reset((double) (byte) 1, doubleArray66);
        double[] doubleArray71 = new double[] { 100.0f, 100 };
        boolean boolean72 = switchingFunctionsHandler57.reset(Double.NaN, doubleArray71);
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray71, doubleArray73);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction75 = null;
        graggBulirschStoerIntegrator74.addSwitchingFunction(switchingFunction75, (double) 100.0f, (double) 0, 0);
        double double80 = graggBulirschStoerIntegrator74.getCurrentStepStart();
        double double81 = graggBulirschStoerIntegrator74.getMaxStep();
        graggBulirschStoerIntegrator74.setInitialStepSize((double) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator74.getStepHandler();
        graggBulirschStoerIntegrator43.setStepHandler(stepHandler84);
        stepHandler84.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator87 = null;
        stepHandler84.handleStep(stepInterpolator87, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator90 = null;
        stepHandler84.handleStep(stepInterpolator90, false);
        boolean boolean93 = stepHandler84.requiresDenseOutput();
        stepHandler84.reset();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler84);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str49, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + (-1.0d) + "'", double81 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException7 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray6);
        org.apache.commons.math.ode.IntegratorException integratorException8 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException7);
        org.apache.commons.math.ode.IntegratorException integratorException9 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException8);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException19);
        java.lang.Throwable[] throwableArray21 = derivativeException20.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException20);
        integratorException8.addSuppressed((java.lang.Throwable) derivativeException22);
        java.lang.String str24 = derivativeException22.getPattern();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        boolean boolean5 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        boolean boolean8 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double13 = switchingFunctionsHandler12.getEventTime();
        double[] doubleArray21 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean22 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray21);
        boolean boolean23 = switchingFunctionsHandler10.reset(0.0d, doubleArray21);
        boolean boolean24 = switchingFunctionsHandler10.isEmpty();
        double double25 = switchingFunctionsHandler10.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler10.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler29.evaluateStep(stepInterpolator30);
        boolean boolean32 = switchingFunctionsHandler29.stop();
        double double33 = switchingFunctionsHandler29.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double36 = switchingFunctionsHandler35.getEventTime();
        double[] doubleArray44 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean45 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray44);
        boolean boolean46 = switchingFunctionsHandler35.isEmpty();
        double double47 = switchingFunctionsHandler35.getEventTime();
        boolean boolean48 = switchingFunctionsHandler35.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler50.evaluateStep(stepInterpolator51);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler56 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double57 = switchingFunctionsHandler56.getEventTime();
        double[] doubleArray65 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean66 = switchingFunctionsHandler56.reset((double) (byte) 1, doubleArray65);
        double[] doubleArray70 = new double[] { 100.0f, 100 };
        boolean boolean71 = switchingFunctionsHandler56.reset(Double.NaN, doubleArray70);
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray70, doubleArray72);
        switchingFunctionsHandler50.stepAccepted((double) (short) 10, doubleArray72);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler76 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double77 = switchingFunctionsHandler76.getEventTime();
        double[] doubleArray85 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean86 = switchingFunctionsHandler76.reset((double) (byte) 1, doubleArray85);
        boolean boolean87 = switchingFunctionsHandler50.reset(3.1622776601683795d, doubleArray85);
        switchingFunctionsHandler35.stepAccepted((double) 100, doubleArray85);
        boolean boolean89 = switchingFunctionsHandler29.reset((double) (short) 10, doubleArray85);
        boolean boolean90 = switchingFunctionsHandler10.reset((double) 2, doubleArray85);
        boolean boolean91 = switchingFunctionsHandler0.reset((double) (-1), doubleArray85);
        boolean boolean92 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (short) 0, 10.0d, Double.NaN);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (-1L));
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler55 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setStepsizeControl(5.916079783099616d, (double) 0.0f, (double) '#', (double) (-1.0f));
        graggBulirschStoerIntegrator38.setInitialStepSize((double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction64, (double) (-1L), 0.0d, (int) (byte) 1);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        double double71 = graggBulirschStoerIntegrator38.getMaxStep();
        double double72 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double73 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction74, Double.NaN, (double) 3, 100);
        org.apache.commons.math.ode.StepHandler stepHandler79 = graggBulirschStoerIntegrator38.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler79);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double39 = switchingFunctionsHandler38.getEventTime();
        double[] doubleArray47 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean48 = switchingFunctionsHandler38.reset((double) (byte) 1, doubleArray47);
        double[] doubleArray52 = new double[] { 100.0f, 100 };
        boolean boolean53 = switchingFunctionsHandler38.reset(Double.NaN, doubleArray52);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray52, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray34, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (-1.0d), doubleArray16, doubleArray34);
        double double58 = graggBulirschStoerIntegrator57.getMaxStep();
        graggBulirschStoerIntegrator57.setStepsizeControl((double) (byte) -1, (double) 10L, (double) 1L, (double) 100.0f);
        java.lang.String str64 = graggBulirschStoerIntegrator57.getName();
        graggBulirschStoerIntegrator57.setStepsizeControl((double) 0.0f, 15.298193747370034d, 6.841560230416328d, (double) 10);
        graggBulirschStoerIntegrator57.setInitialStepSize((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str64, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double5 = switchingFunctionsHandler4.getEventTime();
        double[] doubleArray13 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean14 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray13);
        double[] doubleArray18 = new double[] { 100.0f, 100 };
        boolean boolean19 = switchingFunctionsHandler4.reset(Double.NaN, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray18, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double23 = switchingFunctionsHandler22.getEventTime();
        double[] doubleArray31 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean32 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray31);
        double[] doubleArray36 = new double[] { 100.0f, 100 };
        boolean boolean37 = switchingFunctionsHandler22.reset(Double.NaN, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray20, doubleArray36);
        graggBulirschStoerIntegrator38.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, (double) (short) 1, (double) 0L, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator38.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction47, (double) 100.0f, (double) 1.0f, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction52, (double) (short) -1, (double) 3, 10);
        java.lang.String str57 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        graggBulirschStoerIntegrator38.addSwitchingFunction(switchingFunction58, 2.0d, 2.0d, (int) (byte) -1);
        double double63 = graggBulirschStoerIntegrator38.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler5.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double12 = switchingFunctionsHandler11.getEventTime();
        double[] doubleArray20 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean21 = switchingFunctionsHandler11.reset((double) (byte) 1, doubleArray20);
        double[] doubleArray25 = new double[] { 100.0f, 100 };
        boolean boolean26 = switchingFunctionsHandler11.reset(Double.NaN, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double30 = switchingFunctionsHandler29.getEventTime();
        double[] doubleArray38 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean39 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray38);
        double[] doubleArray43 = new double[] { 100.0f, 100 };
        boolean boolean44 = switchingFunctionsHandler29.reset(Double.NaN, doubleArray43);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray43, doubleArray45);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray25, doubleArray45);
        switchingFunctionsHandler5.stepAccepted((double) ' ', doubleArray45);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double52 = switchingFunctionsHandler51.getEventTime();
        double[] doubleArray60 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean61 = switchingFunctionsHandler51.reset((double) (byte) 1, doubleArray60);
        double[] doubleArray65 = new double[] { 100.0f, 100 };
        boolean boolean66 = switchingFunctionsHandler51.reset(Double.NaN, doubleArray65);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler69 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double70 = switchingFunctionsHandler69.getEventTime();
        double[] doubleArray78 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean79 = switchingFunctionsHandler69.reset((double) (byte) 1, doubleArray78);
        double[] doubleArray83 = new double[] { 100.0f, 100 };
        boolean boolean84 = switchingFunctionsHandler69.reset(Double.NaN, doubleArray83);
        double[] doubleArray85 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator86 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray83, doubleArray85);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator87 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray65, doubleArray85);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator88 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(5.916079783099616d, 52.0d, doubleArray45, doubleArray65);
        boolean boolean89 = switchingFunctionsHandler0.reset((double) (short) 10, doubleArray45);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction90 = null;
        switchingFunctionsHandler0.add(switchingFunction90, (double) 10, 0.0d, (int) (short) -1);
        boolean boolean95 = switchingFunctionsHandler0.isEmpty();
        java.lang.Class<?> wildcardClass96 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray34, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray16, doubleArray36);
        java.lang.String str39 = graggBulirschStoerIntegrator38.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 1.0f, (double) 1.0f, (double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator44.getStepHandler();
        graggBulirschStoerIntegrator38.setStepHandler(stepHandler45);
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (int) ' ');
        double double50 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        java.lang.String str51 = graggBulirschStoerIntegrator38.getName();
        graggBulirschStoerIntegrator38.setStabilityCheck(true, (int) (byte) 100, 3, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str39, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str51, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        boolean boolean13 = switchingFunctionsHandler0.reset(0.0d, doubleArray11);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        boolean boolean15 = switchingFunctionsHandler0.evaluateStep(stepInterpolator14);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler0.evaluateStep(stepInterpolator16);
        boolean boolean18 = switchingFunctionsHandler0.stop();
        double double19 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double3 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean12 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray11);
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        boolean boolean17 = switchingFunctionsHandler2.reset(Double.NaN, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double21 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray29 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean30 = switchingFunctionsHandler20.reset((double) (byte) 1, doubleArray29);
        double[] doubleArray34 = new double[] { 100.0f, 100 };
        boolean boolean35 = switchingFunctionsHandler20.reset(Double.NaN, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray34, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray16, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler39 = graggBulirschStoerIntegrator38.getStepHandler();
        graggBulirschStoerIntegrator38.setOrderControl((int) (byte) 1, (double) (short) 0, (double) 100);
        graggBulirschStoerIntegrator38.setStepsizeControl(Double.NaN, (double) 100L, (double) 10, (double) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler49 = graggBulirschStoerIntegrator38.getStepHandler();
        double double50 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        double double51 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setInterpolationControl(false, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double6 = switchingFunctionsHandler5.getEventTime();
        double[] doubleArray14 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean15 = switchingFunctionsHandler5.reset((double) (byte) 1, doubleArray14);
        double[] doubleArray19 = new double[] { 100.0f, 100 };
        boolean boolean20 = switchingFunctionsHandler5.reset(Double.NaN, doubleArray19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double24 = switchingFunctionsHandler23.getEventTime();
        double[] doubleArray32 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean33 = switchingFunctionsHandler23.reset((double) (byte) 1, doubleArray32);
        double[] doubleArray37 = new double[] { 100.0f, 100 };
        boolean boolean38 = switchingFunctionsHandler23.reset(Double.NaN, doubleArray37);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray37, doubleArray39);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray19, doubleArray39);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray39);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler0.evaluateStep(stepInterpolator43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double51 = switchingFunctionsHandler50.getEventTime();
        double[] doubleArray59 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean60 = switchingFunctionsHandler50.reset((double) (byte) 1, doubleArray59);
        double[] doubleArray64 = new double[] { 100.0f, 100 };
        boolean boolean65 = switchingFunctionsHandler50.reset(Double.NaN, doubleArray64);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray64, doubleArray66);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double69 = switchingFunctionsHandler68.getEventTime();
        double[] doubleArray77 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean78 = switchingFunctionsHandler68.reset((double) (byte) 1, doubleArray77);
        double[] doubleArray82 = new double[] { 100.0f, 100 };
        boolean boolean83 = switchingFunctionsHandler68.reset(Double.NaN, doubleArray82);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray66, doubleArray82);
        boolean boolean85 = switchingFunctionsHandler0.reset(3.1622776601683795d, doubleArray82);
        double double86 = switchingFunctionsHandler0.getEventTime();
        boolean boolean87 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator88 = null;
        boolean boolean89 = switchingFunctionsHandler0.evaluateStep(stepInterpolator88);
        double double90 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator91 = null;
        boolean boolean92 = switchingFunctionsHandler0.evaluateStep(stepInterpolator91);
        boolean boolean93 = switchingFunctionsHandler0.isEmpty();
        boolean boolean94 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double6 = switchingFunctionsHandler5.getEventTime();
        double[] doubleArray14 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean15 = switchingFunctionsHandler5.reset((double) (byte) 1, doubleArray14);
        double[] doubleArray19 = new double[] { 100.0f, 100 };
        boolean boolean20 = switchingFunctionsHandler5.reset(Double.NaN, doubleArray19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double24 = switchingFunctionsHandler23.getEventTime();
        double[] doubleArray32 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean33 = switchingFunctionsHandler23.reset((double) (byte) 1, doubleArray32);
        double[] doubleArray37 = new double[] { 100.0f, 100 };
        boolean boolean38 = switchingFunctionsHandler23.reset(Double.NaN, doubleArray37);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray37, doubleArray39);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 0.0f, doubleArray19, doubleArray39);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray39);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler0.evaluateStep(stepInterpolator43);
        boolean boolean45 = switchingFunctionsHandler0.isEmpty();
        boolean boolean46 = switchingFunctionsHandler0.isEmpty();
        boolean boolean47 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        switchingFunctionsHandler0.add(switchingFunction48, 17.320508075688775d, (double) (-1), (int) (short) 10);
        boolean boolean53 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        switchingFunctionsHandler0.add(switchingFunction54, (double) 3, (double) 3, (int) (byte) 100);
        boolean boolean59 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) 100, (double) (byte) 100, (double) (short) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        double double6 = graggBulirschStoerIntegrator4.getMinStep();
        java.lang.String str7 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler8 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str7, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        boolean boolean2 = switchingFunctionsHandler0.stop();
        double double3 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double12 = switchingFunctionsHandler11.getEventTime();
        double[] doubleArray20 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean21 = switchingFunctionsHandler11.reset((double) (byte) 1, doubleArray20);
        double[] doubleArray25 = new double[] { 100.0f, 100 };
        boolean boolean26 = switchingFunctionsHandler11.reset(Double.NaN, doubleArray25);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray25, doubleArray27);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double30 = switchingFunctionsHandler29.getEventTime();
        double[] doubleArray38 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean39 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray38);
        double[] doubleArray43 = new double[] { 100.0f, 100 };
        boolean boolean44 = switchingFunctionsHandler29.reset(Double.NaN, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, 0.0d, doubleArray27, doubleArray43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double49 = switchingFunctionsHandler48.getEventTime();
        double[] doubleArray57 = new double[] { 0.0f, 0.0f, (short) 100, (short) -1, (-1), 0.0f };
        boolean boolean58 = switchingFunctionsHandler48.reset((double) (byte) 1, doubleArray57);
        double[] doubleArray62 = new double[] { 100.0f, 100 };
        boolean boolean63 = switchingFunctionsHandler48.reset(Double.NaN, doubleArray62);
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1L), doubleArray62, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(10.0d, 0.0d, doubleArray43, doubleArray64);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 0, doubleArray64);
        double double68 = switchingFunctionsHandler0.getEventTime();
        boolean boolean69 = switchingFunctionsHandler0.stop();
        boolean boolean70 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        boolean boolean72 = switchingFunctionsHandler0.evaluateStep(stepInterpolator71);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 0.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!" };
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray11);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("Gragg-Bulirsch-Stoer", (java.lang.Object[]) strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
    }
}

