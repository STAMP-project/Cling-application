import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(33.46640106136302d, 5.916079783099616d, 98.48857801796105d, (double) '#');
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        double[] doubleArray12 = new double[] { 1L, (short) 0, ' ', 10.0f, (byte) 10, (-1.0d) };
        double[] doubleArray21 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray23 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray21, doubleArray23);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 31.144823004794873d, doubleArray12, doubleArray21);
        double[] doubleArray34 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray36 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray34, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) '#', doubleArray21, doubleArray34);
        double[] doubleArray49 = new double[] { 1L, (short) 0, ' ', 10.0f, (byte) 10, (-1.0d) };
        double[] doubleArray58 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray60 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray58, doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 31.144823004794873d, doubleArray49, doubleArray58);
        double[] doubleArray71 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray73 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray71, doubleArray73);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) '#', doubleArray58, doubleArray71);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) 100.0f, doubleArray34, doubleArray71);
        double double77 = highamHall54Integrator76.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction78 = null;
        highamHall54Integrator76.addSwitchingFunction(switchingFunction78, (double) '4', 97.0d, (int) (byte) -1);
        java.lang.String str83 = highamHall54Integrator76.getName();
        java.lang.String str84 = highamHall54Integrator76.getName();
        double double85 = highamHall54Integrator76.getCurrentStepStart();
        double double86 = highamHall54Integrator76.getSafety();
        java.lang.String str87 = highamHall54Integrator76.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction88 = null;
        highamHall54Integrator76.addSwitchingFunction(switchingFunction88, (double) (short) 0, (double) (short) 0, (int) (short) 100);
        java.lang.String str93 = highamHall54Integrator76.getName();
        double double94 = highamHall54Integrator76.getMinStep();
        highamHall54Integrator76.setMinReduction((double) 1L);
        java.lang.String str97 = highamHall54Integrator76.getName();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 32.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 0.0, 32.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Higham-Hall 5(4)" + "'", str83, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Higham-Hall 5(4)" + "'", str84, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.9d + "'", double86 == 0.9d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Higham-Hall 5(4)" + "'", str87, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Higham-Hall 5(4)" + "'", str93, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 1.0d + "'", double94 == 1.0d);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Higham-Hall 5(4)" + "'", str97, "Higham-Hall 5(4)");
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        double double12 = highamHall54Integrator11.getCurrentSignedStepsize();
        highamHall54Integrator11.setMinReduction((double) (byte) 10);
        double double15 = highamHall54Integrator11.getMaxStep();
        int int16 = highamHall54Integrator11.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator11.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator11.addSwitchingFunction(switchingFunction18, 32.0d, (double) (byte) 100, (int) (short) -1);
        double double23 = highamHall54Integrator11.getMaxGrowth();
        double[] doubleArray32 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray34 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray32, doubleArray34);
        double[] doubleArray44 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray46 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray44, doubleArray46);
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator47.getStepHandler();
        highamHall54Integrator35.setStepHandler(stepHandler48);
        java.lang.String str50 = highamHall54Integrator35.getName();
        highamHall54Integrator35.setMaxGrowth((double) 100);
        double double53 = highamHall54Integrator35.getMinStep();
        int int54 = highamHall54Integrator35.getOrder();
        java.lang.String str55 = highamHall54Integrator35.getName();
        int int56 = highamHall54Integrator35.getOrder();
        double double57 = highamHall54Integrator35.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator11.setStepHandler(stepHandler58);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.144823004794873d + "'", double12 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Higham-Hall 5(4)" + "'", str50, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 97.0d + "'", double53 == 97.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Higham-Hall 5(4)" + "'", str55, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 31.144823004794873d + "'", double57 == 31.144823004794873d);
        org.junit.Assert.assertNotNull(stepHandler58);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, (double) 1, (double) (byte) 0, 1.0d);
        double double5 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) (byte) 0);
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator11.addSwitchingFunction(switchingFunction12, (double) 'a', 0.0d, 5);
        java.lang.String str17 = highamHall54Integrator11.getName();
        highamHall54Integrator11.setMinReduction(100.0d);
        double double20 = highamHall54Integrator11.getMinStep();
        double double21 = highamHall54Integrator11.getMinReduction();
        double double22 = highamHall54Integrator11.getCurrentSignedStepsize();
        highamHall54Integrator11.setMinReduction(22.80350850198276d);
        double double25 = highamHall54Integrator11.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 97.0d + "'", double20 == 97.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 31.144823004794873d + "'", double22 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(20.654650327566205d, 0.0d, 17.78279410038923d, 59.16079783099616d);
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        double double12 = highamHall54Integrator11.getCurrentSignedStepsize();
        highamHall54Integrator11.setMinReduction((double) (byte) 10);
        double double15 = highamHall54Integrator11.getSafety();
        double double16 = highamHall54Integrator11.getMaxStep();
        highamHall54Integrator11.setInitialStepSize((double) (byte) 100);
        double double19 = highamHall54Integrator11.getMaxStep();
        double double20 = highamHall54Integrator11.getCurrentStepStart();
        double double21 = highamHall54Integrator11.getCurrentStepStart();
        double double22 = highamHall54Integrator11.getMinReduction();
        double double23 = highamHall54Integrator11.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.144823004794873d + "'", double12 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(31.622776601683793d, 7.211102550927978d, (double) (short) 10, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray17 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray15, doubleArray17);
        java.lang.Object[] objArray19 = new java.lang.Object[] { (byte) -1, (short) 1, 1.0d, (-1.0f), 1, 'a' };
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray19);
        java.lang.Object[] objArray21 = integratorException20.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", objArray21);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException22);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException22);
        org.apache.commons.math.ode.IntegratorException integratorException25 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException24);
        java.lang.Object[] objArray26 = integratorException24.getArguments();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.IntegratorException integratorException23 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException17 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException18 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("Higham-Hall 5(4)", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException20 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException19);
        java.lang.Throwable[] throwableArray21 = integratorException19.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray21);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, (double) 1, (double) (byte) 0, 1.0d);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.lang.String[] strArray13 = new java.lang.String[] { "org.apache.commons.math.ode.IntegratorException: hi!", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException16 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray13);
        org.apache.commons.math.ode.IntegratorException integratorException24 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (double) (byte) 10, (double) 100.0f, 0.9d);
        double double5 = highamHall54Integrator4.getMinStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray15);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("Higham-Hall 5(4)", strArray15);
        java.lang.Throwable[] throwableArray25 = derivativeException24.getSuppressed();
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, Double.NaN, (double) 'a', 1.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        highamHall54Integrator11.setMaxGrowth((double) (-1));
        double double14 = highamHall54Integrator11.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator11.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator11.getStepHandler();
        int int17 = highamHall54Integrator11.getOrder();
        highamHall54Integrator11.setSafety(97.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator11.addSwitchingFunction(switchingFunction20, 0.9d, 5.916079783099616d, (int) '4');
        double double25 = highamHall54Integrator11.getMinReduction();
        java.lang.String str26 = highamHall54Integrator11.getName();
        int int27 = highamHall54Integrator11.getOrder();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        double[] doubleArray12 = new double[] { 1L, (short) 0, ' ', 10.0f, (byte) 10, (-1.0d) };
        double[] doubleArray21 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray23 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray21, doubleArray23);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 31.144823004794873d, doubleArray12, doubleArray21);
        double[] doubleArray36 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray38 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray36, doubleArray38);
        double[] doubleArray48 = new double[] { 1L, (short) 0, ' ', 10.0f, (byte) 10, (-1.0d) };
        double[] doubleArray57 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray59 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray57, doubleArray59);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 31.144823004794873d, doubleArray48, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (-1L), doubleArray36, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) (-1L), doubleArray21, doubleArray36);
        double[] doubleArray72 = new double[] { 1L, (short) 0, ' ', 10.0f, (byte) 10, (-1.0d) };
        double[] doubleArray81 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray83 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray81, doubleArray83);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator85 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 31.144823004794873d, doubleArray72, doubleArray81);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator86 = new org.apache.commons.math.ode.HighamHall54Integrator(2.4957893743180684d, 31.144823004794873d, doubleArray21, doubleArray81);
        double double87 = highamHall54Integrator86.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 32.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 0.0, 32.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 0.0, 32.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 2.4957893743180684d + "'", double87 == 2.4957893743180684d);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        highamHall54Integrator11.setMaxGrowth((double) (-1));
        double double14 = highamHall54Integrator11.getMaxStep();
        highamHall54Integrator11.setInitialStepSize((double) 0);
        double double17 = highamHall54Integrator11.getCurrentStepStart();
        highamHall54Integrator11.setSafety((double) (-1L));
        double double20 = highamHall54Integrator11.getMinReduction();
        int int21 = highamHall54Integrator11.getOrder();
        java.lang.String str22 = highamHall54Integrator11.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) (short) 10, (double) '4', (double) 100L);
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        double[] doubleArray15 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray17 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray15, doubleArray17);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator18.getStepHandler();
        double[] doubleArray28 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray30 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray28, doubleArray30);
        double double32 = highamHall54Integrator31.getCurrentSignedStepsize();
        highamHall54Integrator31.setMaxGrowth((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator31.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator18.setStepHandler(stepHandler36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator18.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler38);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction40, 0.0d, (double) 'a', 0);
        double double45 = highamHall54Integrator4.getMinReduction();
        java.lang.String str46 = highamHall54Integrator4.getName();
        double double47 = highamHall54Integrator4.getMinReduction();
        int int48 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 31.144823004794873d + "'", double32 == 31.144823004794873d);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.2d + "'", double45 == 0.2d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.2d + "'", double47 == 0.2d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException8 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray7);
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException8);
        java.lang.Throwable[] throwableArray10 = derivativeException9.getSuppressed();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray22);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray22);
        java.lang.String str28 = derivativeException27.getPattern();
        derivativeException9.addSuppressed((java.lang.Throwable) derivativeException27);
        java.lang.String str30 = derivativeException27.toString();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "org.apache.commons.math.ode.IntegratorException: hi!" + "'", str28, "org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str30, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!");
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, (double) (byte) -1, (double) 0L, (double) (short) 100);
        highamHall54Integrator4.setMinReduction((double) (byte) -1);
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 10L);
        double double10 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 0.9d, (double) (byte) 100, (double) '4');
        double[] doubleArray13 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray15 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray13, doubleArray15);
        double[] doubleArray25 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray27 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray25, doubleArray27);
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler29);
        highamHall54Integrator4.setStepHandler(stepHandler29);
        highamHall54Integrator4.setSafety(100.0d);
        int int34 = highamHall54Integrator4.getOrder();
        java.lang.String str35 = highamHall54Integrator4.getName();
        double double36 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0]");
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray9);
        java.lang.Object[] objArray13 = derivativeException12.getArguments();
        java.lang.String str14 = derivativeException12.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException12);
        double[] doubleArray31 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray33 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray31, doubleArray33);
        java.lang.Object[] objArray35 = new java.lang.Object[] { (byte) -1, (short) 1, 1.0d, (-1.0f), 1, 'a' };
        org.apache.commons.math.ode.IntegratorException integratorException36 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray35);
        java.lang.Object[] objArray37 = integratorException36.getArguments();
        java.lang.String str38 = integratorException36.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException39 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException36);
        org.apache.commons.math.ode.DerivativeException derivativeException40 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException36);
        org.apache.commons.math.ode.IntegratorException integratorException41 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException36);
        org.apache.commons.math.ode.DerivativeException derivativeException42 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException36);
        java.lang.Throwable[] throwableArray43 = integratorException36.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException44 = new org.apache.commons.math.ode.IntegratorException("hi!", (java.lang.Object[]) throwableArray43);
        java.lang.Throwable[] throwableArray45 = integratorException44.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException44);
        derivativeException12.addSuppressed((java.lang.Throwable) integratorException44);
        java.lang.Throwable[] throwableArray48 = derivativeException12.getSuppressed();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!, , , , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[hi!, , , , , ]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.ode.DerivativeException: hi!" + "'", str14, "org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("Higham-Hall 5(4)", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException19 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException22 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException27 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: ", strArray17);
        org.apache.commons.math.ode.DerivativeException derivativeException28 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray17);
        java.lang.Throwable[] throwableArray29 = derivativeException28.getSuppressed();
        java.lang.Object[] objArray30 = derivativeException28.getArguments();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, , , , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[hi!, , , , , ]");
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 10L, 5.0d, (double) 100L);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        double[] doubleArray10 = new double[] { 1L, (short) 0, ' ', 10.0f, (byte) 10, (-1.0d) };
        double[] doubleArray19 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray21 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray19, doubleArray21);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 31.144823004794873d, doubleArray10, doubleArray19);
        double[] doubleArray32 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray34 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray32, doubleArray34);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) '#', doubleArray19, doubleArray32);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        highamHall54Integrator36.addSwitchingFunction(switchingFunction37, (double) 1.0f, (double) (short) 1, (int) (short) -1);
        highamHall54Integrator36.setMinReduction((double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator36.getStepHandler();
        double double45 = highamHall54Integrator36.getMinStep();
        double double46 = highamHall54Integrator36.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0, 32.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0]");
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 35.0d + "'", double45 == 35.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        double[] doubleArray14 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray16 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray14, doubleArray16);
        java.lang.Object[] objArray18 = new java.lang.Object[] { (byte) -1, (short) 1, 1.0d, (-1.0f), 1, 'a' };
        org.apache.commons.math.ode.IntegratorException integratorException19 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray18);
        java.lang.Object[] objArray20 = integratorException19.getArguments();
        java.lang.String str21 = integratorException19.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException22 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException19);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.DerivativeException derivativeException33 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        integratorException22.addSuppressed((java.lang.Throwable) derivativeException33);
        double[] doubleArray49 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray51 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray49, doubleArray51);
        java.lang.Object[] objArray53 = new java.lang.Object[] { (byte) -1, (short) 1, 1.0d, (-1.0f), 1, 'a' };
        org.apache.commons.math.ode.IntegratorException integratorException54 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray53);
        java.lang.Object[] objArray55 = integratorException54.getArguments();
        java.lang.String str56 = integratorException54.getPattern();
        org.apache.commons.math.ode.IntegratorException integratorException57 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) integratorException54);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException66 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray65);
        org.apache.commons.math.ode.DerivativeException derivativeException67 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException66);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException66);
        integratorException57.addSuppressed((java.lang.Throwable) derivativeException68);
        derivativeException33.addSuppressed((java.lang.Throwable) integratorException57);
        java.lang.String str71 = derivativeException33.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException72 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException33);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[-1, 1, 1.0, -1.0, 1, a]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException14 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException17 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", strArray12);
        java.lang.Throwable[] throwableArray19 = derivativeException18.getSuppressed();
        java.lang.String str20 = derivativeException18.getPattern();
        java.lang.Object[] objArray21 = derivativeException18.getArguments();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException31 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException31);
        org.apache.commons.math.ode.IntegratorException integratorException33 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException32);
        java.lang.Throwable[] throwableArray34 = integratorException33.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException35 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray34);
        java.lang.Throwable[] throwableArray36 = integratorException35.getSuppressed();
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException35);
        org.apache.commons.math.ode.DerivativeException derivativeException38 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException35);
        java.lang.String str39 = derivativeException38.getPattern();
        derivativeException18.addSuppressed((java.lang.Throwable) derivativeException38);
        java.lang.String str41 = derivativeException38.getPattern();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException55 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException("", strArray54);
        org.apache.commons.math.ode.DerivativeException derivativeException61 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException60);
        org.apache.commons.math.ode.IntegratorException integratorException62 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException61);
        java.lang.Throwable[] throwableArray63 = derivativeException61.getSuppressed();
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray77);
        java.lang.Object[] objArray79 = derivativeException78.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException80 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", objArray79);
        org.apache.commons.math.ode.IntegratorException integratorException81 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", objArray79);
        org.apache.commons.math.ode.IntegratorException integratorException82 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", objArray79);
        org.apache.commons.math.ode.IntegratorException integratorException83 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", objArray79);
        org.apache.commons.math.ode.IntegratorException integratorException84 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", objArray79);
        org.apache.commons.math.ode.IntegratorException integratorException85 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: Higham-Hall 5(4)", objArray79);
        derivativeException61.addSuppressed((java.lang.Throwable) integratorException85);
        org.apache.commons.math.ode.IntegratorException integratorException87 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) derivativeException61);
        derivativeException38.addSuppressed((java.lang.Throwable) derivativeException61);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str20, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, , , , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[hi!, , , , , ]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str39, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!" + "'", str41, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.IntegratorException: hi!");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[hi!, , , , , ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[hi!, , , , , ]");
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (short) 10, (double) 100, (double) (short) 0);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(stepHandler7);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) 0, (double) 'a', (double) (-1));
        int int5 = highamHall54Integrator4.getOrder();
        double[] doubleArray14 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray16 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray14, doubleArray16);
        double[] doubleArray26 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray28 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray26, doubleArray28);
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator29.getStepHandler();
        highamHall54Integrator17.setStepHandler(stepHandler30);
        int int32 = highamHall54Integrator17.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler33);
        int int35 = highamHall54Integrator4.getOrder();
        java.lang.String str36 = highamHall54Integrator4.getName();
        java.lang.String str37 = highamHall54Integrator4.getName();
        int int38 = highamHall54Integrator4.getOrder();
        java.lang.String str39 = highamHall54Integrator4.getName();
        java.lang.String str40 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction41, 56.568542494923804d, 23.62362101477432d, 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0]");
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Higham-Hall 5(4)" + "'", str37, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Higham-Hall 5(4)" + "'", str39, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(9.848857801796104d, 0.0d, 1.0d, (double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.DerivativeException: hi!", strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.IntegratorException: hi!", strArray10);
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) strArray10);
        org.apache.commons.math.ode.DerivativeException derivativeException15 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) integratorException14);
        java.lang.String str16 = derivativeException15.toString();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        double double12 = highamHall54Integrator11.getCurrentSignedStepsize();
        highamHall54Integrator11.setMinReduction((double) (byte) 10);
        double double15 = highamHall54Integrator11.getCurrentSignedStepsize();
        java.lang.String str16 = highamHall54Integrator11.getName();
        highamHall54Integrator11.setMinReduction(0.0d);
        java.lang.String str19 = highamHall54Integrator11.getName();
        int int20 = highamHall54Integrator11.getOrder();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.144823004794873d + "'", double12 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 31.144823004794873d + "'", double15 == 31.144823004794873d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException10 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException10);
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException11);
        java.lang.Object[] objArray13 = derivativeException12.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException14 = new org.apache.commons.math.ode.IntegratorException("hi!", objArray13);
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", objArray13);
        java.lang.String str16 = integratorException15.getPattern();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!" + "'", str16, "org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!");
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        highamHall54Integrator11.setMaxGrowth((double) (-1));
        double double14 = highamHall54Integrator11.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator11.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator11.getStepHandler();
        double[] doubleArray25 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray27 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray25, doubleArray27);
        highamHall54Integrator28.setMaxGrowth((double) (-1));
        double double31 = highamHall54Integrator28.getSafety();
        double double32 = highamHall54Integrator28.getMinReduction();
        double double33 = highamHall54Integrator28.getMaxStep();
        java.lang.String str34 = highamHall54Integrator28.getName();
        double[] doubleArray43 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray45 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray43, doubleArray45);
        double[] doubleArray55 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray57 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray55, doubleArray57);
        org.apache.commons.math.ode.StepHandler stepHandler59 = highamHall54Integrator58.getStepHandler();
        highamHall54Integrator46.setStepHandler(stepHandler59);
        highamHall54Integrator28.setStepHandler(stepHandler59);
        highamHall54Integrator11.setStepHandler(stepHandler59);
        double double63 = highamHall54Integrator11.getCurrentSignedStepsize();
        double double64 = highamHall54Integrator11.getMinStep();
        highamHall54Integrator11.setMinReduction(Double.NaN);
        highamHall54Integrator11.setSafety(7.211102550927978d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Higham-Hall 5(4)" + "'", str34, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0]");
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 31.144823004794873d + "'", double63 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 97.0d + "'", double64 == 97.0d);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        double[] doubleArray2 = null;
        double[] doubleArray17 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray19 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray17, doubleArray19);
        double[] doubleArray29 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray31 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray29, doubleArray31);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator(0.2d, 31.144823004794873d, doubleArray17, doubleArray31);
        double[] doubleArray44 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray46 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray44, doubleArray46);
        double[] doubleArray50 = new double[] { (-1L), 97.0d };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) 0, doubleArray46, doubleArray50);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, (double) (short) -1, doubleArray31, doubleArray46);
        double[] doubleArray55 = null;
        double[] doubleArray64 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray66 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray64, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) 100, doubleArray55, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) (-1.0f), doubleArray46, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 1, doubleArray2, doubleArray64);
        double double71 = highamHall54Integrator70.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.2d + "'", double71 == 0.2d);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        double double12 = highamHall54Integrator11.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator11.addSwitchingFunction(switchingFunction13, (double) '4', 1.0d, 0);
        highamHall54Integrator11.setMaxGrowth(35.0d);
        highamHall54Integrator11.setInitialStepSize((double) (short) -1);
        double double22 = highamHall54Integrator11.getMaxGrowth();
        int int23 = highamHall54Integrator11.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        highamHall54Integrator11.addSwitchingFunction(switchingFunction24, (double) (byte) 100, (double) 100.0f, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.144823004794873d + "'", double12 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) (short) 10, (double) '4', (double) 100L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (byte) -1, (double) 1, 5);
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety(24.322992790977874d);
        java.lang.String str15 = highamHall54Integrator4.getName();
        double double16 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        highamHall54Integrator11.setMaxGrowth((double) (-1));
        double double14 = highamHall54Integrator11.getSafety();
        double double15 = highamHall54Integrator11.getSafety();
        highamHall54Integrator11.setMaxGrowth((-1.0d));
        highamHall54Integrator11.setMaxGrowth((double) (-1L));
        int int20 = highamHall54Integrator11.getOrder();
        java.lang.String str21 = highamHall54Integrator11.getName();
        double double22 = highamHall54Integrator11.getMinReduction();
        double double23 = highamHall54Integrator11.getCurrentStepStart();
        java.lang.String str24 = highamHall54Integrator11.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        double[] doubleArray8 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray8, doubleArray10);
        highamHall54Integrator11.setMaxGrowth((double) (-1));
        double double14 = highamHall54Integrator11.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, 1.0d, (double) (byte) 0, (double) 1.0f);
        highamHall54Integrator19.setSafety(1.0d);
        double double22 = highamHall54Integrator19.getMinReduction();
        double[] doubleArray31 = new double[] { 1.0d, 100.0d, 1.0d, (short) -1, (byte) 100, (-1.0f) };
        double[] doubleArray33 = new double[] { 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (byte) 10, doubleArray31, doubleArray33);
        double double35 = highamHall54Integrator34.getCurrentSignedStepsize();
        highamHall54Integrator34.setMaxGrowth((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator34.getStepHandler();
        highamHall54Integrator19.setStepHandler(stepHandler38);
        highamHall54Integrator11.setStepHandler(stepHandler38);
        double double41 = highamHall54Integrator11.getCurrentStepStart();
        double double42 = highamHall54Integrator11.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, 1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 31.144823004794873d + "'", double35 == 31.144823004794873d);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
    }
}

