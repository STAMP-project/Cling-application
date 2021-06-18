import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(Double.NaN);
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double21 = highamHall54Integrator20.getCurrentStepStart();
        double double22 = highamHall54Integrator20.getCurrentSignedStepsize();
        highamHall54Integrator20.setInitialStepSize((-1.0d));
        highamHall54Integrator20.setMinReduction((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator20.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler27);
        java.lang.String str29 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Higham-Hall 5(4)" + "'", str29, "Higham-Hall 5(4)");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setMaxGrowth(0.0d);
        highamHall54Integrator12.setMaxGrowth(7.211102550927978d);
        highamHall54Integrator12.setInitialStepSize(Double.NaN);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator37.setMinReduction((double) (byte) 100);
        double double41 = highamHall54Integrator37.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int47 = highamHall54Integrator46.getOrder();
        double double48 = highamHall54Integrator46.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double54 = highamHall54Integrator53.getMaxGrowth();
        java.lang.String str55 = highamHall54Integrator53.getName();
        double double56 = highamHall54Integrator53.getSafety();
        int int57 = highamHall54Integrator53.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator53.getStepHandler();
        highamHall54Integrator46.setStepHandler(stepHandler58);
        highamHall54Integrator37.setStepHandler(stepHandler58);
        highamHall54Integrator12.setStepHandler(stepHandler58);
        double double62 = highamHall54Integrator12.getMaxStep();
        highamHall54Integrator12.setMaxGrowth(100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Higham-Hall 5(4)" + "'", str55, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.9d + "'", double56 == 0.9d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        highamHall54Integrator12.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction19, (double) 0, (double) ' ', (int) (byte) 0);
        java.lang.String str24 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) (short) 0);
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        int int11 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(0.9d);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize((double) 100L);
        java.lang.String str16 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double double19 = highamHall54Integrator18.getMinStep();
        highamHall54Integrator18.setSafety(0.0d);
        java.lang.String str22 = highamHall54Integrator18.getName();
        double double23 = highamHall54Integrator18.getSafety();
        double double24 = highamHall54Integrator18.getMinStep();
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double double38 = highamHall54Integrator37.getMinStep();
        highamHall54Integrator37.setSafety(0.0d);
        java.lang.String str41 = highamHall54Integrator37.getName();
        double double42 = highamHall54Integrator37.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator18.setStepHandler(stepHandler43);
        highamHall54Integrator4.setStepHandler(stepHandler43);
        double double46 = highamHall54Integrator4.getCurrentStepStart();
        double double47 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(52.0d);
        highamHall54Integrator4.setMinReduction((double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 1);
        highamHall54Integrator4.setMaxGrowth((double) (short) 100);
        double double12 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray19 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) ' ', doubleArray9, doubleArray19);
        highamHall54Integrator20.setInitialStepSize(100.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (-1), Double.NaN, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, Double.NaN, (double) '#', (double) 1.0f);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(52.0d);
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double12 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray22, doubleArray30);
        double[] doubleArray37 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray22, doubleArray37);
        java.lang.String str39 = highamHall54Integrator38.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double45 = highamHall54Integrator44.getMaxGrowth();
        java.lang.String str46 = highamHall54Integrator44.getName();
        double double47 = highamHall54Integrator44.getSafety();
        int int48 = highamHall54Integrator44.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator44.getStepHandler();
        highamHall54Integrator38.setStepHandler(stepHandler49);
        highamHall54Integrator4.setStepHandler(stepHandler49);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Higham-Hall 5(4)" + "'", str39, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9d + "'", double47 == 0.9d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(stepHandler49);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator4.setStepHandler(stepHandler12);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth(7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertNull(stepHandler14);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) 5, 0.9d, 0.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray39, doubleArray47);
        double[] doubleArray54 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray39, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray22, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray13, doubleArray22);
        double double58 = highamHall54Integrator57.getCurrentSignedStepsize();
        highamHall54Integrator57.setSafety(10.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 1L);
        double double14 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        java.lang.String str17 = highamHall54Integrator12.getName();
        highamHall54Integrator12.setMinReduction((double) (short) 10);
        double[] doubleArray25 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray31 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray25, doubleArray31);
        double double33 = highamHall54Integrator32.getMinStep();
        highamHall54Integrator32.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double41 = highamHall54Integrator40.getMaxGrowth();
        double double42 = highamHall54Integrator40.getSafety();
        highamHall54Integrator40.setMaxGrowth((double) 5);
        double[] doubleArray50 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray56 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray50, doubleArray56);
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator57.getStepHandler();
        highamHall54Integrator40.setStepHandler(stepHandler58);
        highamHall54Integrator32.setStepHandler(stepHandler58);
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator32.getStepHandler();
        double double62 = highamHall54Integrator32.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler63 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator32.setSafety((double) (-1.0f));
        double[] doubleArray71 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray77 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray71, doubleArray77);
        double double79 = highamHall54Integrator78.getMinStep();
        highamHall54Integrator78.setSafety(0.0d);
        java.lang.String str82 = highamHall54Integrator78.getName();
        double double83 = highamHall54Integrator78.getSafety();
        double double84 = highamHall54Integrator78.getMinStep();
        highamHall54Integrator78.setMaxGrowth(0.0d);
        highamHall54Integrator78.setInitialStepSize((-1.0d));
        org.apache.commons.math.ode.StepHandler stepHandler89 = highamHall54Integrator78.getStepHandler();
        highamHall54Integrator32.setStepHandler(stepHandler89);
        highamHall54Integrator12.setStepHandler(stepHandler89);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.2d + "'", double62 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Higham-Hall 5(4)" + "'", str82, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler89);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 1);
        highamHall54Integrator4.setSafety((double) 0.0f);
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 10.0f, (double) (byte) -1, (int) (short) -1);
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.211102550927978d + "'", double12 == 7.211102550927978d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        double[] doubleArray10 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray10, doubleArray35);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray45, doubleArray53);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), (double) 1.0f, doubleArray35, doubleArray45);
        highamHall54Integrator55.setMinReduction((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) 0L, 5.0d, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinReduction();
        double double19 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 1.0f, 35.0d, (double) (-1L));
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        highamHall54Integrator4.setInitialStepSize(10.0d);
        double[] doubleArray16 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray22 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray16, doubleArray22);
        double double24 = highamHall54Integrator23.getMinStep();
        highamHall54Integrator23.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double32 = highamHall54Integrator31.getMaxGrowth();
        double double33 = highamHall54Integrator31.getSafety();
        highamHall54Integrator31.setMaxGrowth((double) 5);
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator48.getStepHandler();
        highamHall54Integrator31.setStepHandler(stepHandler49);
        highamHall54Integrator23.setStepHandler(stepHandler49);
        org.apache.commons.math.ode.StepHandler stepHandler52 = highamHall54Integrator23.getStepHandler();
        double double53 = highamHall54Integrator23.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator23.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler54);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.9d + "'", double33 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.2d + "'", double53 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler54);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMaxGrowth((double) '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        java.lang.String str16 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setSafety(0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, 1.0d, (double) (short) 1, (double) 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize((double) (short) 0);
        int int11 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, (double) (-1L), (double) (-1), (double) (-1.0f));
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) (short) 100);
        double double14 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        double double14 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction20, 0.2d, 100.0d, (int) (byte) 10);
        double double25 = highamHall54Integrator12.getCurrentStepStart();
        double double26 = highamHall54Integrator12.getCurrentStepStart();
        highamHall54Integrator12.setInitialStepSize(0.9d);
        double double29 = highamHall54Integrator12.getCurrentStepStart();
        double double30 = highamHall54Integrator12.getCurrentStepStart();
        double double31 = highamHall54Integrator12.getSafety();
        double double32 = highamHall54Integrator12.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) (short) 0, 35.0d, (double) (short) 1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, (double) 10, (double) 0, (double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator14.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler15);
        java.lang.String str17 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        java.lang.String str18 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) 100);
        highamHall54Integrator4.setSafety((double) 0L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) (byte) 10, (double) 10, (int) (short) 0);
        double double21 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction(Double.NaN);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        java.lang.Class<?> wildcardClass9 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(Double.NaN);
        double double15 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        double double17 = highamHall54Integrator4.getMaxGrowth();
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        highamHall54Integrator51.setMaxGrowth((double) 10.0f);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double59 = highamHall54Integrator58.getCurrentStepStart();
        double double60 = highamHall54Integrator58.getCurrentSignedStepsize();
        int int61 = highamHall54Integrator58.getOrder();
        highamHall54Integrator58.setSafety(0.2d);
        double double64 = highamHall54Integrator58.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler65 = highamHall54Integrator58.getStepHandler();
        highamHall54Integrator51.setStepHandler(stepHandler65);
        highamHall54Integrator51.setSafety(97.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(7.211102550927978d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth(5.0d);
        highamHall54Integrator4.setSafety((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations7 = null;
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        double[] doubleArray44 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray50 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray44, doubleArray50);
        double[] doubleArray57 = new double[] { '4', 5, '4' };
        double[] doubleArray63 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray69 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray63, doubleArray69);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray57, doubleArray63);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray50, doubleArray63);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray20, doubleArray50);
        double[] doubleArray75 = null;
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations7, (double) (-1), doubleArray50, 100.0d, doubleArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize(100.0d);
        java.lang.Class<?> wildcardClass9 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1L, 35.0d, (int) ' ');
        highamHall54Integrator4.setMinReduction(0.2d);
        int int15 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, 100.0d, (double) (short) 100, (int) (byte) -1);
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (-1.0f), (double) 100, 0.2d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 100L, (double) (short) 1, 10);
        highamHall54Integrator4.setMaxGrowth(7.211102550927978d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double17 = highamHall54Integrator16.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler18);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        org.apache.commons.math.ode.StepHandler stepHandler52 = highamHall54Integrator51.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler52);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        double double12 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double double28 = highamHall54Integrator27.getMinStep();
        double[] doubleArray34 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray40 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray34, doubleArray40);
        double double42 = highamHall54Integrator41.getMinStep();
        highamHall54Integrator41.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator41.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler45);
        highamHall54Integrator4.setStepHandler(stepHandler45);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, (double) 'a', 0.0d, 5.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        double double7 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.23606797749979d + "'", double5 == 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(0.0d);
        highamHall54Integrator4.setSafety(0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMaxStep();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double double19 = highamHall54Integrator18.getMinStep();
        highamHall54Integrator18.setSafety(0.0d);
        java.lang.String str22 = highamHall54Integrator18.getName();
        double double23 = highamHall54Integrator18.getSafety();
        double double24 = highamHall54Integrator18.getMinStep();
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double double38 = highamHall54Integrator37.getMinStep();
        highamHall54Integrator37.setSafety(0.0d);
        java.lang.String str41 = highamHall54Integrator37.getName();
        double double42 = highamHall54Integrator37.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator18.setStepHandler(stepHandler43);
        highamHall54Integrator4.setStepHandler(stepHandler43);
        double double46 = highamHall54Integrator4.getCurrentStepStart();
        int int47 = highamHall54Integrator4.getOrder();
        java.lang.String str48 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Higham-Hall 5(4)" + "'", str48, "Higham-Hall 5(4)");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) 0, (-1));
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setInitialStepSize((double) 0);
        double double52 = highamHall54Integrator48.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator48.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double[] doubleArray17 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray23 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray17, doubleArray23);
        double double25 = highamHall54Integrator24.getMinStep();
        highamHall54Integrator24.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double33 = highamHall54Integrator32.getMaxGrowth();
        double double34 = highamHall54Integrator32.getSafety();
        highamHall54Integrator32.setMaxGrowth((double) 5);
        double[] doubleArray42 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray48 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray42, doubleArray48);
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator32.setStepHandler(stepHandler50);
        highamHall54Integrator24.setStepHandler(stepHandler50);
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler53);
        double double55 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9d + "'", double34 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double19 = highamHall54Integrator18.getMaxGrowth();
        java.lang.String str20 = highamHall54Integrator18.getName();
        double double21 = highamHall54Integrator18.getSafety();
        int int22 = highamHall54Integrator18.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator18.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler23);
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator4.getStepHandler();
        double[] doubleArray31 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray37 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray31, doubleArray37);
        double double39 = highamHall54Integrator38.getMinStep();
        highamHall54Integrator38.setSafety(0.0d);
        java.lang.String str42 = highamHall54Integrator38.getName();
        double double43 = highamHall54Integrator38.getMaxStep();
        int int44 = highamHall54Integrator38.getOrder();
        highamHall54Integrator38.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double52 = highamHall54Integrator51.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator51.getStepHandler();
        highamHall54Integrator38.setStepHandler(stepHandler53);
        double double55 = highamHall54Integrator38.getCurrentSignedStepsize();
        double double56 = highamHall54Integrator38.getSafety();
        double double57 = highamHall54Integrator38.getCurrentStepStart();
        highamHall54Integrator38.setMinReduction((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator38.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler60);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9d + "'", double21 == 0.9d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(stepHandler60);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (byte) 100, 35.0d, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1L), (double) (byte) -1, (int) 'a');
        double double10 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        java.lang.String str21 = highamHall54Integrator12.getName();
        double double22 = highamHall54Integrator12.getMinStep();
        int int23 = highamHall54Integrator12.getOrder();
        double double24 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setMinReduction((double) (short) 10);
        java.lang.String str27 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, 52.0d, 5.0d, (double) (byte) 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        int int9 = highamHall54Integrator4.getOrder();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMinReduction();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) ' ', 2.23606797749979d, (int) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, Double.NaN, (double) '#', (double) 1.0f);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        double double15 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double double29 = highamHall54Integrator28.getMinStep();
        highamHall54Integrator28.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double37 = highamHall54Integrator36.getMaxGrowth();
        double double38 = highamHall54Integrator36.getSafety();
        highamHall54Integrator36.setMaxGrowth((double) 5);
        double[] doubleArray46 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray52 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray46, doubleArray52);
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator53.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler54);
        highamHall54Integrator28.setStepHandler(stepHandler54);
        highamHall54Integrator28.setMaxGrowth((double) (byte) -1);
        int int59 = highamHall54Integrator28.getOrder();
        highamHall54Integrator28.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        double[] doubleArray72 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray78 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray72, doubleArray78);
        double double80 = highamHall54Integrator79.getMinStep();
        double double81 = highamHall54Integrator79.getMinStep();
        double double82 = highamHall54Integrator79.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler83 = highamHall54Integrator79.getStepHandler();
        highamHall54Integrator66.setStepHandler(stepHandler83);
        highamHall54Integrator28.setStepHandler(stepHandler83);
        highamHall54Integrator4.setStepHandler(stepHandler83);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler83);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double12 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize(32.0d);
        double double15 = highamHall54Integrator4.getMaxGrowth();
        double double16 = highamHall54Integrator4.getMinStep();
        double double17 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNull(stepHandler18);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        double[] doubleArray2 = null;
        double[] doubleArray13 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray23 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray29 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray23, doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray23, doubleArray31);
        double[] doubleArray38 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray23, doubleArray38);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray13, doubleArray38);
        double[] doubleArray48 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray54 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray48, doubleArray54);
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray48, doubleArray56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), (double) 1.0f, doubleArray38, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, Double.NaN, doubleArray2, doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double[] doubleArray2 = null;
        double[] doubleArray10 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray16 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray10, doubleArray16);
        double[] doubleArray26 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray36 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray42 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray36, doubleArray42);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray36, doubleArray44);
        double[] doubleArray51 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray36, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray26, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray10, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (byte) 100, doubleArray2, doubleArray10);
        double double56 = highamHall54Integrator55.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 1, 10.0d, (int) (short) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double17 = highamHall54Integrator16.getCurrentStepStart();
        double double18 = highamHall54Integrator16.getCurrentStepStart();
        double double19 = highamHall54Integrator16.getSafety();
        double double20 = highamHall54Integrator16.getMaxStep();
        double double21 = highamHall54Integrator16.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        highamHall54Integrator4.setMaxGrowth((double) 100L);
        double double26 = highamHall54Integrator4.getMinReduction();
        int int27 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9d + "'", double19 == 0.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2d + "'", double26 == 0.2d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (double) 10L, (double) '4', Double.NaN);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getSafety();
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass14 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double12 = highamHall54Integrator11.getMaxStep();
        int int13 = highamHall54Integrator11.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator11.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(9.343446901438462d, (double) (-1), (double) 5, 35.0d);
        highamHall54Integrator4.setSafety((double) (byte) 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getMinStep();
        double double20 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator4.getStepHandler();
        double double22 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 52.0d + "'", double22 == 52.0d);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        java.lang.String str42 = highamHall54Integrator41.getName();
        double double43 = highamHall54Integrator41.getMinReduction();
        highamHall54Integrator41.setMaxGrowth(52.0d);
        double double46 = highamHall54Integrator41.getMaxGrowth();
        double double47 = highamHall54Integrator41.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.2d + "'", double43 == 0.2d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 52.0d + "'", double46 == 52.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray26, doubleArray34);
        double[] doubleArray41 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray26, doubleArray41);
        double[] doubleArray50 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray56 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray50, doubleArray56);
        double[] doubleArray63 = new double[] { '4', 5, '4' };
        double[] doubleArray69 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray75 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray69, doubleArray75);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray63, doubleArray69);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray56, doubleArray69);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray26, doubleArray56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 0.2d, doubleArray7, doubleArray26);
        double double81 = highamHall54Integrator80.getMaxStep();
        double double82 = highamHall54Integrator80.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.2d + "'", double81 == 0.2d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        highamHall54Integrator12.setMinReduction((double) '#');
        double double24 = highamHall54Integrator12.getSafety();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (-1.0f), (double) 100, 0.2d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double11 = highamHall54Integrator10.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator10.setInitialStepSize((double) 1.0f);
        double double15 = highamHall54Integrator10.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (short) 0);
        java.lang.Class<?> wildcardClass15 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 0L, (double) (byte) 100, (double) 0L);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        int int13 = highamHall54Integrator4.getOrder();
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        double double16 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        int int7 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double13 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMaxGrowth((double) ' ');
        int int19 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        double double22 = highamHall54Integrator12.getMinReduction();
        java.lang.String str23 = highamHall54Integrator12.getName();
        int int24 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMaxGrowth(0.0d);
        double double27 = highamHall54Integrator12.getMinReduction();
        java.lang.Class<?> wildcardClass28 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2d + "'", double27 == 0.2d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        double double15 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(stepHandler16);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.211102550927978d + "'", double7 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, (double) (-1.0f), (double) (short) 100, Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, 22.80350850198276d, (double) (-1), (int) (byte) 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.211102550927978d + "'", double11 == 7.211102550927978d);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double21 = highamHall54Integrator20.getMaxGrowth();
        double double22 = highamHall54Integrator20.getSafety();
        highamHall54Integrator20.setMaxGrowth((double) 5);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler38);
        highamHall54Integrator12.setStepHandler(stepHandler38);
        highamHall54Integrator12.setMaxGrowth((double) (byte) -1);
        int int43 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        double[] doubleArray56 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray62 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray56, doubleArray62);
        double double64 = highamHall54Integrator63.getMinStep();
        double double65 = highamHall54Integrator63.getMinStep();
        double double66 = highamHall54Integrator63.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator63.getStepHandler();
        highamHall54Integrator50.setStepHandler(stepHandler67);
        highamHall54Integrator12.setStepHandler(stepHandler67);
        double double70 = highamHall54Integrator12.getMinReduction();
        java.lang.Class<?> wildcardClass71 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction(0.9d);
        int int10 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass14 = stepHandler13.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) -1);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        double double10 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 'a');
        java.lang.Class<?> wildcardClass12 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        highamHall54Integrator25.setMinReduction((double) '#');
        double double28 = highamHall54Integrator25.getMinStep();
        highamHall54Integrator25.setInitialStepSize((double) 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 52.0d + "'", double28 == 52.0d);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double12 = highamHall54Integrator4.getMinStep();
        double double13 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) 1, 35.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator11.setMinReduction((double) 0.0f);
        int int14 = highamHall54Integrator11.getOrder();
        double double15 = highamHall54Integrator11.getCurrentSignedStepsize();
        highamHall54Integrator11.setInitialStepSize((double) 10.0f);
        double double18 = highamHall54Integrator11.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator11.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler19);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.211102550927978d + "'", double6 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double[] doubleArray4 = new double[] {};
        double[] doubleArray13 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray23 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray29 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray23, doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray23, doubleArray31);
        double[] doubleArray38 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray23, doubleArray38);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray13, doubleArray38);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray4, doubleArray38);
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        double[] doubleArray58 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray49, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, (double) ' ', doubleArray38, doubleArray49);
        highamHall54Integrator60.setInitialStepSize(35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[32.0]");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        highamHall54Integrator31.setSafety(0.0d);
        java.lang.String str35 = highamHall54Integrator31.getName();
        double double36 = highamHall54Integrator31.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler37);
        highamHall54Integrator12.setSafety((double) 10);
        double double41 = highamHall54Integrator12.getMinStep();
        java.lang.Class<?> wildcardClass42 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double[] doubleArray2 = null;
        double[] doubleArray10 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray16 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray10, doubleArray16);
        double[] doubleArray19 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray10, doubleArray19);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (byte) 100, doubleArray2, doubleArray10);
        highamHall54Integrator21.setMaxGrowth(2.23606797749979d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0]");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, 0.0d, (double) '#', 5.0d);
        highamHall54Integrator4.setSafety(52.0d);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMaxStep();
        double double7 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) (byte) -1);
        highamHall54Integrator4.setInitialStepSize((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        int int13 = highamHall54Integrator4.getOrder();
        int int14 = highamHall54Integrator4.getOrder();
        double double15 = highamHall54Integrator4.getMinReduction();
        java.lang.String str16 = highamHall54Integrator4.getName();
        double double17 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(52.0d);
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double12 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        highamHall54Integrator12.setMinReduction((double) '#');
        double double23 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMaxStep();
        java.lang.String str7 = highamHall54Integrator4.getName();
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        int int21 = highamHall54Integrator12.getOrder();
        double double22 = highamHall54Integrator12.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction23, (double) (short) 100, 32.0d, (int) (byte) 100);
        double double28 = highamHall54Integrator12.getCurrentStepStart();
        int int29 = highamHall54Integrator12.getOrder();
        double double30 = highamHall54Integrator12.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray41, doubleArray49);
        double[] doubleArray56 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray41, doubleArray56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray24, doubleArray56);
        double[] doubleArray68 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray74 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray68, doubleArray74);
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray68, doubleArray76);
        double[] doubleArray83 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray68, doubleArray83);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator85 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (short) -1, doubleArray24, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator86 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, 0.0d, doubleArray13, doubleArray24);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) 10L, (double) (byte) 10, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, 1.0d, (double) 100, 5);
        highamHall54Integrator4.setSafety((double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) '#', (double) (short) 0, (-1));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(stepHandler13);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction(5.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray25 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray35, doubleArray43);
        double[] doubleArray50 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray35, doubleArray50);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray25, doubleArray50);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray9, doubleArray50);
        double[] doubleArray54 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 97.0d, doubleArray50, doubleArray54);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        highamHall54Integrator4.setSafety((double) 10L);
        highamHall54Integrator4.setMinReduction((double) 100);
        double double15 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) 5);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        int int26 = highamHall54Integrator25.getOrder();
        double double27 = highamHall54Integrator25.getMaxStep();
        double double28 = highamHall54Integrator25.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(stepHandler15);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        int int13 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 1);
        highamHall54Integrator4.setSafety((double) 0.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, 2.23606797749979d, 7.211102550927978d, (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray19, doubleArray45);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        double[] doubleArray68 = new double[] { '4', 5, '4' };
        double[] doubleArray74 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray80 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray74, doubleArray80);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator82 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray68, doubleArray74);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray61, doubleArray74);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) (byte) 0, doubleArray19, doubleArray61);
        double double85 = highamHall54Integrator84.getMinReduction();
        double double86 = highamHall54Integrator84.getSafety();
        java.lang.String str87 = highamHall54Integrator84.getName();
        double double88 = highamHall54Integrator84.getCurrentSignedStepsize();
        double double89 = highamHall54Integrator84.getCurrentStepStart();
        double double90 = highamHall54Integrator84.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.2d + "'", double85 == 0.2d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.9d + "'", double86 == 0.9d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Higham-Hall 5(4)" + "'", str87, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double20 = highamHall54Integrator19.getMinReduction();
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        double double34 = highamHall54Integrator33.getMinStep();
        highamHall54Integrator33.setSafety(0.0d);
        java.lang.String str37 = highamHall54Integrator33.getName();
        double double38 = highamHall54Integrator33.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator19.setStepHandler(stepHandler39);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator19.getStepHandler();
        double double42 = highamHall54Integrator19.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler43);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Higham-Hall 5(4)" + "'", str37, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler43);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) (-1));
        highamHall54Integrator4.setMinReduction((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (short) 0, (double) ' ', 1.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        double[] doubleArray52 = new double[] { '4', 5, '4' };
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray30, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 1.0d, doubleArray9, doubleArray52);
        double double69 = highamHall54Integrator68.getMinReduction();
        double double70 = highamHall54Integrator68.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.2d + "'", double69 == 0.2d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, 9.343446901438462d, (double) 1, 0);
        int int20 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray37 = new double[] { '4', 5, '4' };
        double[] doubleArray43 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray49 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray43, doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray37, doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray30, doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray9, doubleArray30);
        double[] doubleArray61 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray67 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray61, doubleArray67);
        double[] doubleArray74 = new double[] { '4', 5, '4' };
        double[] doubleArray80 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray86 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray80, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator88 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray74, doubleArray80);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator89 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray67, doubleArray80);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, 0.2d, doubleArray30, doubleArray80);
        double double91 = highamHall54Integrator90.getMinStep();
        int int92 = highamHall54Integrator90.getOrder();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1.0d + "'", double91 == 1.0d);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 5 + "'", int92 == 5);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray26, doubleArray34);
        double[] doubleArray41 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray26, doubleArray41);
        double[] doubleArray50 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray56 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray50, doubleArray56);
        double[] doubleArray63 = new double[] { '4', 5, '4' };
        double[] doubleArray69 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray75 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray69, doubleArray75);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray63, doubleArray69);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray56, doubleArray69);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray26, doubleArray56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 0.2d, doubleArray7, doubleArray26);
        highamHall54Integrator80.setMaxGrowth((double) 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray20 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray11, doubleArray20);
        double[] doubleArray29 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray35 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray29, doubleArray35);
        double[] doubleArray45 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray55, doubleArray63);
        double[] doubleArray70 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray55, doubleArray70);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray45, doubleArray70);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray29, doubleArray70);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 32.0d, doubleArray11, doubleArray70);
        double[] doubleArray80 = new double[] { '4', 5, '4' };
        double[] doubleArray86 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray92 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray86, doubleArray92);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray80, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator95 = new org.apache.commons.math.ode.HighamHall54Integrator(52.0d, 0.9d, doubleArray11, doubleArray86);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 2.23606797749979d, (double) (byte) -1, (double) (short) 0);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        highamHall54Integrator4.setSafety((double) 10L);
        highamHall54Integrator4.setSafety(0.0d);
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 100.0d, (double) (short) 10, (double) 100L);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        highamHall54Integrator4.setMinReduction(35.0d);
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.Class<?> wildcardClass10 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setMaxGrowth((double) ' ');
        double double52 = highamHall54Integrator48.getMaxGrowth();
        highamHall54Integrator48.setMinReduction(0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 32.0d + "'", double52 == 32.0d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, 0.0d, (double) 10L, (double) 'a');
        double double5 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, 0.2d, 1.0d, (int) '4');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double14 = highamHall54Integrator13.getCurrentStepStart();
        double double15 = highamHall54Integrator13.getCurrentSignedStepsize();
        int int16 = highamHall54Integrator13.getOrder();
        double double17 = highamHall54Integrator13.getMinStep();
        highamHall54Integrator13.setMinReduction((double) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator13.addSwitchingFunction(switchingFunction20, (double) 10, (double) (-1L), (int) (byte) 1);
        double double25 = highamHall54Integrator13.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double31 = highamHall54Integrator30.getCurrentStepStart();
        double double32 = highamHall54Integrator30.getCurrentSignedStepsize();
        highamHall54Integrator30.setInitialStepSize((-1.0d));
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator30.getStepHandler();
        highamHall54Integrator13.setStepHandler(stepHandler35);
        highamHall54Integrator4.setStepHandler(stepHandler35);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray7, doubleArray15);
        java.lang.String str17 = highamHall54Integrator16.getName();
        highamHall54Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator16.addSwitchingFunction(switchingFunction20, 0.9d, (double) (byte) 1, 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double26 = highamHall54Integrator25.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator25.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator12.getCurrentStepStart();
        highamHall54Integrator12.setMinReduction((double) (short) 100);
        double double32 = highamHall54Integrator12.getMaxStep();
        highamHall54Integrator12.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, 0.9d, (double) '#', (int) '#');
        double double14 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double11 = highamHall54Integrator10.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator10.setStepHandler(stepHandler12);
        int int14 = highamHall54Integrator10.getOrder();
        java.lang.String str15 = highamHall54Integrator10.getName();
        double double16 = highamHall54Integrator10.getCurrentSignedStepsize();
        int int17 = highamHall54Integrator10.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double23 = highamHall54Integrator22.getCurrentStepStart();
        double double24 = highamHall54Integrator22.getCurrentSignedStepsize();
        int int25 = highamHall54Integrator22.getOrder();
        highamHall54Integrator22.setSafety(0.2d);
        double double28 = highamHall54Integrator22.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator10.setStepHandler(stepHandler29);
        highamHall54Integrator4.setStepHandler(stepHandler29);
        java.lang.Class<?> wildcardClass32 = stepHandler29.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 1.0f, 35.0d, (double) (-1L));
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) '#', 10.0d, 0);
        double double19 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        java.lang.String str12 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        java.lang.String str26 = highamHall54Integrator25.getName();
        double double27 = highamHall54Integrator25.getSafety();
        int int28 = highamHall54Integrator25.getOrder();
        double double29 = highamHall54Integrator25.getMaxStep();
        double double30 = highamHall54Integrator25.getSafety();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9d + "'", double30 == 0.9d);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction20, 0.2d, 100.0d, (int) (byte) 10);
        int int25 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMaxGrowth((double) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double[] doubleArray10 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray10, doubleArray35);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray45, doubleArray53);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, 2.23606797749979d, doubleArray35, doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 100.0f);
        double double16 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 7.211102550927978d + "'", double16 == 7.211102550927978d);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double15 = highamHall54Integrator14.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator14.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction18, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double28 = highamHall54Integrator27.getMaxGrowth();
        double double29 = highamHall54Integrator27.getSafety();
        highamHall54Integrator27.setMaxGrowth((double) 5);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator44.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler45);
        highamHall54Integrator14.setStepHandler(stepHandler45);
        highamHall54Integrator4.setStepHandler(stepHandler45);
        double double49 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7.211102550927978d + "'", double9 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9d + "'", double49 == 0.9d);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        int int9 = highamHall54Integrator4.getOrder();
        double double10 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(Double.NaN, (double) 100L, 0.0d, 52.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double10 = highamHall54Integrator9.getMaxGrowth();
        java.lang.String str11 = highamHall54Integrator9.getName();
        double double12 = highamHall54Integrator9.getMaxGrowth();
        double double13 = highamHall54Integrator9.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator9.getStepHandler();
        double double15 = highamHall54Integrator9.getMinReduction();
        double double16 = highamHall54Integrator9.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double22 = highamHall54Integrator21.getCurrentStepStart();
        highamHall54Integrator21.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator9.setStepHandler(stepHandler25);
        highamHall54Integrator4.setStepHandler(stepHandler25);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(stepHandler25);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1L, 35.0d, (int) ' ');
        double double13 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) (short) 1, (double) (-1L), (int) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) (short) 100, (double) '4', (double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double11 = highamHall54Integrator10.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator10.getName();
        double double13 = highamHall54Integrator10.getMaxGrowth();
        double double14 = highamHall54Integrator10.getCurrentSignedStepsize();
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator27.getStepHandler();
        highamHall54Integrator27.setMinReduction((double) (byte) 100);
        double double31 = highamHall54Integrator27.getMaxGrowth();
        highamHall54Integrator27.setSafety(5.0d);
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator27.getStepHandler();
        highamHall54Integrator10.setStepHandler(stepHandler34);
        highamHall54Integrator4.setStepHandler(stepHandler34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        highamHall54Integrator51.setSafety((double) (short) 100);
        highamHall54Integrator51.setMinReduction((double) 1L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety((double) 1);
        int int14 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 1, 10.0d, (int) (short) 0);
        double double12 = highamHall54Integrator4.getMinStep();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        java.lang.String str42 = highamHall54Integrator41.getName();
        double[] doubleArray48 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray54 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray48, doubleArray54);
        double double56 = highamHall54Integrator55.getMinStep();
        double double57 = highamHall54Integrator55.getMinStep();
        double double58 = highamHall54Integrator55.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler59 = highamHall54Integrator55.getStepHandler();
        highamHall54Integrator41.setStepHandler(stepHandler59);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler59);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        java.lang.String str19 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler20);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        double double14 = highamHall54Integrator12.getMinStep();
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double double28 = highamHall54Integrator27.getMinStep();
        highamHall54Integrator27.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double36 = highamHall54Integrator35.getMaxGrowth();
        double double37 = highamHall54Integrator35.getSafety();
        highamHall54Integrator35.setMaxGrowth((double) 5);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator52.getStepHandler();
        highamHall54Integrator35.setStepHandler(stepHandler53);
        highamHall54Integrator27.setStepHandler(stepHandler53);
        org.apache.commons.math.ode.StepHandler stepHandler56 = highamHall54Integrator27.getStepHandler();
        double double57 = highamHall54Integrator27.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator27.getStepHandler();
        double[] doubleArray64 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray70 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray64, doubleArray70);
        double double72 = highamHall54Integrator71.getMinStep();
        double double73 = highamHall54Integrator71.getMinStep();
        double double74 = highamHall54Integrator71.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler75 = highamHall54Integrator71.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler75);
        double double77 = highamHall54Integrator27.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler78 = highamHall54Integrator27.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler78);
        java.lang.Class<?> wildcardClass80 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.9d + "'", double37 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.2d + "'", double57 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler75);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler78);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        int int12 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 100L, (double) 1L, 35.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray39, doubleArray47);
        double[] doubleArray54 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray39, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray22, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray13, doubleArray22);
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator57.getStepHandler();
        double double59 = highamHall54Integrator57.getMinStep();
        double double60 = highamHall54Integrator57.getMinReduction();
        int int61 = highamHall54Integrator57.getOrder();
        double double62 = highamHall54Integrator57.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.2d + "'", double60 == 0.2d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) -1);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) (-1));
        highamHall54Integrator4.setInitialStepSize((double) 5);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray26, doubleArray34);
        double[] doubleArray41 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray26, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray9, doubleArray41);
        double[] doubleArray46 = null;
        double[] doubleArray54 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray60 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray54, doubleArray60);
        double[] doubleArray63 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray54, doubleArray63);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (byte) 100, doubleArray46, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray9, doubleArray54);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        highamHall54Integrator66.addSwitchingFunction(switchingFunction67, (double) 5, (double) 10L, (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[32.0]");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double13 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 10L);
        double double16 = highamHall54Integrator4.getMinStep();
        int int17 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 1.0d, 1.0d, Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, 0.9d, (double) (short) 10, (-1));
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction(0.2d);
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        java.lang.String str42 = highamHall54Integrator41.getName();
        double double43 = highamHall54Integrator41.getMinReduction();
        highamHall54Integrator41.setMaxGrowth(52.0d);
        highamHall54Integrator41.setInitialStepSize((double) 1.0f);
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator41.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.2d + "'", double43 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler48);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        highamHall54Integrator4.setSafety((double) 0L);
        highamHall54Integrator4.setSafety((double) (short) 1);
        java.lang.String str18 = highamHall54Integrator4.getName();
        double double19 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction22, (double) (short) -1, 5.0d, (int) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) 100.0f, (double) (-1L), 0);
        double double16 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        highamHall54Integrator41.setMaxGrowth((double) (-1));
        int int44 = highamHall54Integrator41.getOrder();
        double double45 = highamHall54Integrator41.getSafety();
        double double46 = highamHall54Integrator41.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.9d + "'", double45 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        highamHall54Integrator4.setMaxGrowth((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double13 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        double double14 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        highamHall54Integrator4.setMaxGrowth((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (short) 1, (double) 0.0f, (double) (-1.0f));
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double11 = highamHall54Integrator10.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator10.getName();
        double double13 = highamHall54Integrator10.getMaxGrowth();
        double double14 = highamHall54Integrator10.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, 0.9d, (double) '#', (int) '#');
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double16 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray26, doubleArray34);
        double[] doubleArray41 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray26, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray9, doubleArray41);
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray53, doubleArray61);
        double[] doubleArray68 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray53, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (short) -1, doubleArray9, doubleArray53);
        java.lang.String str71 = highamHall54Integrator70.getName();
        highamHall54Integrator70.setMaxGrowth(10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Higham-Hall 5(4)" + "'", str71, "Higham-Hall 5(4)");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        highamHall54Integrator12.setMinReduction((double) '#');
        int int23 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        int int17 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        double double19 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double20 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setInitialStepSize((double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        double double16 = highamHall54Integrator12.getSafety();
        double double17 = highamHall54Integrator12.getCurrentStepStart();
        double double18 = highamHall54Integrator12.getMinReduction();
        highamHall54Integrator12.setSafety((double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double[] doubleArray17 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray23 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray17, doubleArray23);
        double double25 = highamHall54Integrator24.getMinStep();
        highamHall54Integrator24.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double33 = highamHall54Integrator32.getMaxGrowth();
        double double34 = highamHall54Integrator32.getSafety();
        highamHall54Integrator32.setMaxGrowth((double) 5);
        double[] doubleArray42 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray48 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray42, doubleArray48);
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator32.setStepHandler(stepHandler50);
        highamHall54Integrator24.setStepHandler(stepHandler50);
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler53);
        java.lang.Class<?> wildcardClass55 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9d + "'", double34 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        int int12 = highamHall54Integrator4.getOrder();
        java.lang.String str13 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction(2.23606797749979d);
        java.lang.String str16 = highamHall54Integrator4.getName();
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double double30 = highamHall54Integrator29.getMinStep();
        highamHall54Integrator29.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double38 = highamHall54Integrator37.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler39 = null;
        highamHall54Integrator37.setStepHandler(stepHandler39);
        int int41 = highamHall54Integrator37.getOrder();
        java.lang.String str42 = highamHall54Integrator37.getName();
        double double43 = highamHall54Integrator37.getCurrentSignedStepsize();
        double double44 = highamHall54Integrator37.getSafety();
        highamHall54Integrator37.setSafety((double) (short) 10);
        highamHall54Integrator37.setInitialStepSize((double) 100);
        java.lang.String str49 = highamHall54Integrator37.getName();
        highamHall54Integrator37.setMinReduction((double) ' ');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double57 = highamHall54Integrator56.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler58 = null;
        highamHall54Integrator56.setStepHandler(stepHandler58);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        highamHall54Integrator56.addSwitchingFunction(switchingFunction60, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double70 = highamHall54Integrator69.getMaxGrowth();
        double double71 = highamHall54Integrator69.getSafety();
        highamHall54Integrator69.setMaxGrowth((double) 5);
        double[] doubleArray79 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray85 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator86 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray79, doubleArray85);
        org.apache.commons.math.ode.StepHandler stepHandler87 = highamHall54Integrator86.getStepHandler();
        highamHall54Integrator69.setStepHandler(stepHandler87);
        highamHall54Integrator56.setStepHandler(stepHandler87);
        highamHall54Integrator37.setStepHandler(stepHandler87);
        highamHall54Integrator29.setStepHandler(stepHandler87);
        highamHall54Integrator4.setStepHandler(stepHandler87);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9d + "'", double44 == 0.9d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Higham-Hall 5(4)" + "'", str49, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.9d + "'", double71 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler87);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray18 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray9, doubleArray18);
        double[] doubleArray20 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 100.0f, doubleArray9, doubleArray20);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0]");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxStep();
        java.lang.String str8 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setSafety(5.0d);
        highamHall54Integrator4.setMaxGrowth((double) (short) 0);
        double double15 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int21 = highamHall54Integrator20.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction22, (double) 1L, (double) (short) -1, 0);
        double double27 = highamHall54Integrator20.getMaxGrowth();
        int int28 = highamHall54Integrator20.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction29, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double34 = highamHall54Integrator20.getMinStep();
        double double35 = highamHall54Integrator20.getMinStep();
        double double36 = highamHall54Integrator20.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator20.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler37);
        double double39 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 52.0d + "'", double34 == 52.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 52.0d + "'", double35 == 52.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 7.211102550927978d + "'", double39 == 7.211102550927978d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) 0.0f, (double) ' ', 0);
        double double18 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) '4', (double) (byte) 0, 22.80350850198276d);
        double double5 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10.0f, (double) 'a', (double) 0L);
        double double5 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getMinStep();
        double double20 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(32.0d);
        double double23 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double15 = highamHall54Integrator14.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator14.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction18, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double28 = highamHall54Integrator27.getMaxGrowth();
        double double29 = highamHall54Integrator27.getSafety();
        highamHall54Integrator27.setMaxGrowth((double) 5);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator44.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler45);
        highamHall54Integrator14.setStepHandler(stepHandler45);
        highamHall54Integrator4.setStepHandler(stepHandler45);
        double double49 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str50 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 7.211102550927978d + "'", double9 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 7.211102550927978d + "'", double49 == 7.211102550927978d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Higham-Hall 5(4)" + "'", str50, "Higham-Hall 5(4)");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, 0.0d, (double) 1L, (double) (byte) 0);
        highamHall54Integrator4.setMinReduction((double) (short) -1);
        highamHall54Integrator4.setMinReduction(52.0d);
        highamHall54Integrator4.setInitialStepSize(7.211102550927978d);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, (double) 'a', 0.0d, 5.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.23606797749979d + "'", double5 == 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 14.727477510336914d + "'", double7 == 14.727477510336914d);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) (short) -1, (double) 10, 14.727477510336914d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize(97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 0L);
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray36 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray46 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray52 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray46, doubleArray52);
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray46, doubleArray54);
        double[] doubleArray61 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray46, doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray36, doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray20, doubleArray61);
        double double65 = highamHall54Integrator64.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator64.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler66);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 2.23606797749979d + "'", double65 == 2.23606797749979d);
        org.junit.Assert.assertNotNull(stepHandler66);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        highamHall54Integrator4.setInitialStepSize(0.0d);
        int int15 = highamHall54Integrator4.getOrder();
        double double16 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNull(stepHandler17);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double11 = highamHall54Integrator10.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator10.setStepHandler(stepHandler12);
        int int14 = highamHall54Integrator10.getOrder();
        java.lang.String str15 = highamHall54Integrator10.getName();
        double double16 = highamHall54Integrator10.getCurrentSignedStepsize();
        double double17 = highamHall54Integrator10.getSafety();
        highamHall54Integrator10.setSafety((double) (short) 10);
        highamHall54Integrator10.setInitialStepSize((double) 100);
        java.lang.String str22 = highamHall54Integrator10.getName();
        highamHall54Integrator10.setMinReduction((double) ' ');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double30 = highamHall54Integrator29.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler31 = null;
        highamHall54Integrator29.setStepHandler(stepHandler31);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator29.addSwitchingFunction(switchingFunction33, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double43 = highamHall54Integrator42.getMaxGrowth();
        double double44 = highamHall54Integrator42.getSafety();
        highamHall54Integrator42.setMaxGrowth((double) 5);
        double[] doubleArray52 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray58 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator59.getStepHandler();
        highamHall54Integrator42.setStepHandler(stepHandler60);
        highamHall54Integrator29.setStepHandler(stepHandler60);
        highamHall54Integrator10.setStepHandler(stepHandler60);
        highamHall54Integrator4.setStepHandler(stepHandler60);
        double double65 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9d + "'", double44 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass17 = stepHandler16.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        double[] doubleArray8 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray18, doubleArray26);
        double[] doubleArray33 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray18, doubleArray33);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray8, doubleArray33);
        highamHall54Integrator35.setMinReduction(Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        highamHall54Integrator35.addSwitchingFunction(switchingFunction38, (-1.0d), (double) 100.0f, (int) 'a');
        java.lang.String str43 = highamHall54Integrator35.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Higham-Hall 5(4)" + "'", str43, "Higham-Hall 5(4)");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setSafety(5.0d);
        double[] doubleArray12 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray18 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray12, doubleArray18);
        double double20 = highamHall54Integrator19.getMinStep();
        highamHall54Integrator19.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double28 = highamHall54Integrator27.getMaxGrowth();
        double double29 = highamHall54Integrator27.getSafety();
        highamHall54Integrator27.setMaxGrowth((double) 5);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator44.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler45);
        highamHall54Integrator19.setStepHandler(stepHandler45);
        highamHall54Integrator4.setStepHandler(stepHandler45);
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getSafety();
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(14.727477510336914d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety((double) 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, 0.0d, (double) 1L, (double) (byte) 0);
        highamHall54Integrator4.setMinReduction((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        double[] doubleArray52 = new double[] { '4', 5, '4' };
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray30, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 1.0d, doubleArray9, doubleArray52);
        double double69 = highamHall54Integrator68.getMaxGrowth();
        double double70 = highamHall54Integrator68.getCurrentStepStart();
        int int71 = highamHall54Integrator68.getOrder();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, 9.343446901438462d, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        double double22 = highamHall54Integrator21.getMinStep();
        highamHall54Integrator21.setSafety(0.0d);
        java.lang.String str25 = highamHall54Integrator21.getName();
        double double26 = highamHall54Integrator21.getSafety();
        double double27 = highamHall54Integrator21.getMinStep();
        java.lang.String str28 = highamHall54Integrator21.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator21.addSwitchingFunction(switchingFunction29, 1.0d, 35.0d, (int) (byte) 10);
        highamHall54Integrator21.setMaxGrowth((double) 10.0f);
        highamHall54Integrator21.setMinReduction((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler38);
        highamHall54Integrator4.setSafety(0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction((double) 10L);
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) (byte) 1, 2.23606797749979d, (double) (byte) 100);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        java.lang.String str26 = highamHall54Integrator25.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double32 = highamHall54Integrator31.getMaxGrowth();
        java.lang.String str33 = highamHall54Integrator31.getName();
        double double34 = highamHall54Integrator31.getSafety();
        int int35 = highamHall54Integrator31.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator25.setStepHandler(stepHandler36);
        highamHall54Integrator25.setMinReduction((double) 10L);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator52.getStepHandler();
        double double54 = highamHall54Integrator52.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double60 = highamHall54Integrator59.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler61 = null;
        highamHall54Integrator59.setStepHandler(stepHandler61);
        int int63 = highamHall54Integrator59.getOrder();
        java.lang.String str64 = highamHall54Integrator59.getName();
        double double65 = highamHall54Integrator59.getCurrentSignedStepsize();
        int int66 = highamHall54Integrator59.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double72 = highamHall54Integrator71.getCurrentStepStart();
        double double73 = highamHall54Integrator71.getCurrentSignedStepsize();
        int int74 = highamHall54Integrator71.getOrder();
        highamHall54Integrator71.setSafety(0.2d);
        double double77 = highamHall54Integrator71.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler78 = highamHall54Integrator71.getStepHandler();
        highamHall54Integrator59.setStepHandler(stepHandler78);
        highamHall54Integrator52.setStepHandler(stepHandler78);
        highamHall54Integrator25.setStepHandler(stepHandler78);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9d + "'", double34 == 0.9d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Higham-Hall 5(4)" + "'", str64, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 5 + "'", int66 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler78);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        highamHall54Integrator41.setMaxGrowth((double) (-1));
        int int44 = highamHall54Integrator41.getOrder();
        highamHall54Integrator41.setInitialStepSize(35.0d);
        java.lang.Class<?> wildcardClass47 = highamHall54Integrator41.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (double) (short) 0, (double) (short) 0, 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) (short) 0);
        highamHall54Integrator4.setSafety(1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety(1.0d);
        highamHall54Integrator4.setMinReduction(Double.NaN);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(stepHandler8);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        int int14 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        int int9 = highamHall54Integrator4.getOrder();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMinReduction();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler14 = null;
        highamHall54Integrator4.setStepHandler(stepHandler14);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        double double15 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, (double) (-1L), (double) (-1), (double) (-1.0f));
        double[] doubleArray10 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray16 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray10, doubleArray16);
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) (byte) 100);
        double double21 = highamHall54Integrator17.getMaxGrowth();
        int int22 = highamHall54Integrator17.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator17.getStepHandler();
        double double24 = highamHall54Integrator17.getCurrentSignedStepsize();
        java.lang.String str25 = highamHall54Integrator17.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        double[] doubleArray36 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray42 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray36, doubleArray42);
        double double44 = highamHall54Integrator43.getMinStep();
        double double45 = highamHall54Integrator43.getMinStep();
        double double46 = highamHall54Integrator43.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator43.getStepHandler();
        highamHall54Integrator30.setStepHandler(stepHandler47);
        highamHall54Integrator17.setStepHandler(stepHandler47);
        highamHall54Integrator4.setStepHandler(stepHandler47);
        double double51 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.2d + "'", double51 == 0.2d);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        highamHall54Integrator4.setMinReduction(35.0d);
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        int int10 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray18 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray9, doubleArray18);
        double[] doubleArray27 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray33 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray27, doubleArray33);
        double[] doubleArray43 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray53, doubleArray61);
        double[] doubleArray68 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray53, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray43, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray27, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 32.0d, doubleArray9, doubleArray68);
        java.lang.Class<?> wildcardClass73 = highamHall54Integrator72.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray28 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray34 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray28, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray28, doubleArray36);
        double[] doubleArray43 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray28, doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray17, doubleArray43);
        highamHall54Integrator45.setInitialStepSize((double) 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction20, 35.0d, (double) 10, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction25, (double) 10L, (double) 1.0f, (int) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator12.getStepHandler();
        double double31 = highamHall54Integrator12.getMaxStep();
        int int32 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) 0.0f, (double) ' ', 0);
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        double double19 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction(14.727477510336914d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        double double14 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator12.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction23, 2.23606797749979d, (double) 0.0f, (int) '#');
        highamHall54Integrator12.setMinReduction((double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray39, doubleArray47);
        double[] doubleArray54 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray39, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray22, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray13, doubleArray22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double63 = highamHall54Integrator62.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler64 = highamHall54Integrator62.getStepHandler();
        highamHall54Integrator57.setStepHandler(stepHandler64);
        highamHall54Integrator57.setInitialStepSize(5.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 32.0d + "'", double63 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler64);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray23 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray33, doubleArray41);
        double[] doubleArray48 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray33, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray23, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray7, doubleArray48);
        double double52 = highamHall54Integrator51.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray20 = new double[] { '4', 5, '4' };
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray13, doubleArray26);
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        double double37 = highamHall54Integrator35.getMinReduction();
        double double38 = highamHall54Integrator35.getCurrentSignedStepsize();
        highamHall54Integrator35.setSafety((double) (-1L));
        double double41 = highamHall54Integrator35.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2d + "'", double37 == 0.2d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (short) 10);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        java.lang.String str16 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) ' ');
        highamHall54Integrator4.setInitialStepSize(0.2d);
        double double21 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double22 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10.0f, (double) ' ', (double) 1L);
        highamHall54Integrator4.setMinReduction(100.0d);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setInitialStepSize((double) 0);
        double double52 = highamHall54Integrator48.getSafety();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9d + "'", double52 == 0.9d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) 0.0f, (double) (byte) 0, (double) 0.0f);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 100L, (double) 1L, 35.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety((double) (byte) 1);
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) 1L);
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) 'a', (double) 5, (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        highamHall54Integrator4.setMaxGrowth(35.0d);
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) ' ');
        highamHall54Integrator4.setMinReduction(0.9d);
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) '#', (double) 10L, 32.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double11 = highamHall54Integrator10.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator10.setStepHandler(stepHandler12);
        int int14 = highamHall54Integrator10.getOrder();
        java.lang.String str15 = highamHall54Integrator10.getName();
        double double16 = highamHall54Integrator10.getCurrentSignedStepsize();
        int int17 = highamHall54Integrator10.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double23 = highamHall54Integrator22.getCurrentStepStart();
        double double24 = highamHall54Integrator22.getCurrentSignedStepsize();
        int int25 = highamHall54Integrator22.getOrder();
        highamHall54Integrator22.setSafety(0.2d);
        double double28 = highamHall54Integrator22.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator10.setStepHandler(stepHandler29);
        highamHall54Integrator4.setStepHandler(stepHandler29);
        double double32 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) 1L, (double) (short) 1, (double) (short) 10);
        double double5 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, 32.0d, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (short) 1, (double) 0.0f, (double) (-1.0f));
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 10, (double) 100.0f, 52.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) (-1L), (double) (short) -1, (int) (short) 10);
        java.lang.String str17 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, 35.0d, 10.0d, (int) 'a');
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMaxStep();
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getMinStep();
        double double10 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator12.setStepHandler(stepHandler16);
        highamHall54Integrator12.setMinReduction((double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) 10.0f, (double) 100L, 7.211102550927978d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        highamHall54Integrator4.setMaxGrowth((double) (short) 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray19, doubleArray45);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray55, doubleArray63);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 35.0d, doubleArray19, doubleArray63);
        double double66 = highamHall54Integrator65.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator65.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 1.0d + "'", double66 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler67);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        highamHall54Integrator4.setSafety(0.9d);
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (short) 10);
        highamHall54Integrator4.setMinReduction((double) 1.0f);
        double double16 = highamHall54Integrator4.getMinStep();
        double double17 = highamHall54Integrator4.getMaxGrowth();
        double double18 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getMinStep();
        double double20 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator4.getStepHandler();
        double double22 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 'a', (double) (short) 1, (double) 1.0f);
        highamHall54Integrator4.setSafety((double) 100L);
        double double7 = highamHall54Integrator4.getMaxStep();
        double double8 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety((double) 0.0f);
        double double16 = highamHall54Integrator4.getMaxGrowth();
        int int17 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, (double) 1.0f, (double) (short) 100, (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction23, 35.0d, (double) 1.0f, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction28, 2.1213203435596424d, (double) (short) 1, 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        double double22 = highamHall54Integrator12.getMinReduction();
        double double23 = highamHall54Integrator12.getSafety();
        int int24 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, 35.0d, 1.0d, 0);
        double double13 = highamHall54Integrator4.getMinReduction();
        int int14 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction50, (double) 10, (double) (byte) 100, (int) (byte) -1);
        double double55 = highamHall54Integrator48.getMinStep();
        highamHall54Integrator48.setMinReduction(52.0d);
        double double58 = highamHall54Integrator48.getMinStep();
        double double59 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double16 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.211102550927978d + "'", double15 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction(100.0d);
        double double14 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        int int14 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) (byte) 0, 0.2d, (double) (byte) 100);
        highamHall54Integrator4.setMaxGrowth((double) 0L);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) '4', (double) 'a', (double) (-1.0f));
        highamHall54Integrator4.setInitialStepSize((double) (byte) 1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) '#');
        double double10 = highamHall54Integrator4.getSafety();
        double double11 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) '4', 0.0d, (int) ' ');
        double double16 = highamHall54Integrator4.getSafety();
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        highamHall54Integrator4.setSafety((double) 100L);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 100, (double) (short) 1, 1);
        double double11 = highamHall54Integrator4.getMinReduction();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray13, doubleArray21);
        double[] doubleArray28 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray13, doubleArray28);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        double[] doubleArray50 = new double[] { '4', 5, '4' };
        double[] doubleArray56 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray62 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray56, doubleArray62);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray50, doubleArray56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray43, doubleArray56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray13, doubleArray43);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray80 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray74, doubleArray80);
        double[] doubleArray83 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray74, doubleArray83);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator85 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, 0.9d, doubleArray13, doubleArray74);
        org.apache.commons.math.ode.StepHandler stepHandler86 = highamHall54Integrator85.getStepHandler();
        int int87 = highamHall54Integrator85.getOrder();
        double double88 = highamHall54Integrator85.getMinReduction();
        double double89 = highamHall54Integrator85.getCurrentSignedStepsize();
        double double90 = highamHall54Integrator85.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[32.0]");
        org.junit.Assert.assertNotNull(stepHandler86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 5 + "'", int87 == 5);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.2d + "'", double88 == 0.2d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 2.1213203435596424d + "'", double89 == 2.1213203435596424d);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator4.getMinReduction();
        double double25 = highamHall54Integrator4.getMinReduction();
        java.lang.String str26 = highamHall54Integrator4.getName();
        int int27 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double13 = highamHall54Integrator4.getSafety();
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        highamHall54Integrator4.setMinReduction((double) 'a');
        double double13 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        double double22 = highamHall54Integrator12.getMinReduction();
        java.lang.String str23 = highamHall54Integrator12.getName();
        int int24 = highamHall54Integrator12.getOrder();
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double double38 = highamHall54Integrator37.getMinStep();
        highamHall54Integrator37.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double46 = highamHall54Integrator45.getMaxGrowth();
        double double47 = highamHall54Integrator45.getSafety();
        highamHall54Integrator45.setMaxGrowth((double) 5);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        org.apache.commons.math.ode.StepHandler stepHandler63 = highamHall54Integrator62.getStepHandler();
        highamHall54Integrator45.setStepHandler(stepHandler63);
        highamHall54Integrator37.setStepHandler(stepHandler63);
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler66);
        java.lang.String str68 = highamHall54Integrator12.getName();
        double double69 = highamHall54Integrator12.getMaxStep();
        double double70 = highamHall54Integrator12.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler71 = null;
        highamHall54Integrator12.setStepHandler(stepHandler71);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9d + "'", double47 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Higham-Hall 5(4)" + "'", str68, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) -1);
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getSafety();
        double double10 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations11 = null;
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double[] doubleArray48 = new double[] { '4', 5, '4' };
        double[] doubleArray54 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray60 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray54, doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray48, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray41, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray20, doubleArray41);
        double[] doubleArray66 = null;
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations11, (double) 10L, doubleArray41, (-1.0d), doubleArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        java.lang.String str11 = highamHall54Integrator4.getName();
        java.lang.String str12 = highamHall54Integrator4.getName();
        java.lang.String str13 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (short) 100, Double.NaN, (double) 10.0f);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) (short) 10, 7.211102550927978d, (int) (byte) -1);
        highamHall54Integrator4.setSafety(14.727477510336914d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray7, doubleArray15);
        java.lang.String str17 = highamHall54Integrator16.getName();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator16.getStepHandler();
        java.lang.String str19 = highamHall54Integrator16.getName();
        highamHall54Integrator16.setMaxGrowth(0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        highamHall54Integrator4.setMinReduction(52.0d);
        java.lang.Class<?> wildcardClass17 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxStep();
        int int13 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, 2.23606797749979d, 35.0d, (double) 5);
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        highamHall54Integrator4.setMaxGrowth(52.0d);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray13, doubleArray21);
        double[] doubleArray32 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray38 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray32, doubleArray38);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray32, doubleArray40);
        double[] doubleArray47 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray32, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray21, doubleArray47);
        double[] doubleArray57 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray63 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray57, doubleArray63);
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray57, doubleArray65);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 35.0d, doubleArray21, doubleArray65);
        double[] doubleArray77 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray83 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray77, doubleArray83);
        double[] doubleArray85 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator86 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray77, doubleArray85);
        double[] doubleArray92 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray77, doubleArray92);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) (short) 0, doubleArray21, doubleArray77);
        double double95 = highamHall54Integrator94.getCurrentSignedStepsize();
        highamHall54Integrator94.setMaxGrowth(14.727477510336914d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray22 = new double[] { '4', 5, '4' };
        double[] doubleArray28 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray34 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray28, doubleArray34);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray22, doubleArray28);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray15, doubleArray28);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        double[] doubleArray61 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray71 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray77 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray71, doubleArray77);
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray71, doubleArray79);
        double[] doubleArray86 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray71, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator88 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray61, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator89 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray45, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 0L, doubleArray28, doubleArray45);
        org.apache.commons.math.ode.StepHandler stepHandler91 = highamHall54Integrator90.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler91);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        double[] doubleArray17 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray23 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray17, doubleArray23);
        double[] doubleArray30 = new double[] { '4', 5, '4' };
        double[] doubleArray36 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray42 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray36, doubleArray42);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray23, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler46);
        highamHall54Integrator4.setInitialStepSize(2.1213203435596424d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler46);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double double21 = highamHall54Integrator20.getMinStep();
        double double22 = highamHall54Integrator20.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction23, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction28, 0.2d, 100.0d, (int) (byte) 10);
        double double33 = highamHall54Integrator20.getCurrentStepStart();
        double double34 = highamHall54Integrator20.getCurrentStepStart();
        highamHall54Integrator20.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double42 = highamHall54Integrator41.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler43 = null;
        highamHall54Integrator41.setStepHandler(stepHandler43);
        int int45 = highamHall54Integrator41.getOrder();
        double[] doubleArray51 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray57 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray51, doubleArray57);
        double double59 = highamHall54Integrator58.getMinStep();
        highamHall54Integrator58.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double67 = highamHall54Integrator66.getMaxGrowth();
        double double68 = highamHall54Integrator66.getSafety();
        highamHall54Integrator66.setMaxGrowth((double) 5);
        double[] doubleArray76 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray82 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray76, doubleArray82);
        org.apache.commons.math.ode.StepHandler stepHandler84 = highamHall54Integrator83.getStepHandler();
        highamHall54Integrator66.setStepHandler(stepHandler84);
        highamHall54Integrator58.setStepHandler(stepHandler84);
        highamHall54Integrator41.setStepHandler(stepHandler84);
        highamHall54Integrator20.setStepHandler(stepHandler84);
        org.apache.commons.math.ode.StepHandler stepHandler89 = highamHall54Integrator20.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler89);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.9d + "'", double68 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertNotNull(stepHandler89);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray28 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray34 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray28, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray28, doubleArray36);
        double[] doubleArray43 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray28, doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray17, doubleArray43);
        java.lang.String str46 = highamHall54Integrator45.getName();
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator45.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler47);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 1.0f);
        double double9 = highamHall54Integrator4.getMinStep();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        int int11 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator4.setStepHandler(stepHandler12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) (-1), (double) 5, (double) 'a');
        double double5 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double[] doubleArray28 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray34 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray28, doubleArray34);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray45, doubleArray53);
        double[] doubleArray60 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray45, doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray28, doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray19, doubleArray28);
        org.apache.commons.math.ode.StepHandler stepHandler64 = highamHall54Integrator63.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler64);
        double double66 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler64);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + (-1.0d) + "'", double66 == (-1.0d));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray20 = new double[] { '4', 5, '4' };
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray13, doubleArray26);
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        double double37 = highamHall54Integrator35.getMinReduction();
        double double38 = highamHall54Integrator35.getMaxGrowth();
        double double39 = highamHall54Integrator35.getMinReduction();
        int int40 = highamHall54Integrator35.getOrder();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2d + "'", double37 == 0.2d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.2d + "'", double39 == 0.2d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        int int13 = highamHall54Integrator4.getOrder();
        int int14 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double20 = highamHall54Integrator19.getMaxGrowth();
        java.lang.String str21 = highamHall54Integrator19.getName();
        double double22 = highamHall54Integrator19.getSafety();
        int int23 = highamHall54Integrator19.getOrder();
        double double24 = highamHall54Integrator19.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double30 = highamHall54Integrator29.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler31 = null;
        highamHall54Integrator29.setStepHandler(stepHandler31);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator29.addSwitchingFunction(switchingFunction33, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double43 = highamHall54Integrator42.getMaxGrowth();
        double double44 = highamHall54Integrator42.getSafety();
        highamHall54Integrator42.setMaxGrowth((double) 5);
        double[] doubleArray52 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray58 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator59.getStepHandler();
        highamHall54Integrator42.setStepHandler(stepHandler60);
        highamHall54Integrator29.setStepHandler(stepHandler60);
        highamHall54Integrator19.setStepHandler(stepHandler60);
        highamHall54Integrator4.setStepHandler(stepHandler60);
        double double65 = highamHall54Integrator4.getCurrentStepStart();
        double double66 = highamHall54Integrator4.getMinStep();
        double double67 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction68 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction68, (double) 100, (double) '#', (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9d + "'", double44 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 52.0d + "'", double66 == 52.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 7.211102550927978d + "'", double67 == 7.211102550927978d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 1.0f, 35.0d, (-1));
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(10.0d);
        int int16 = highamHall54Integrator4.getOrder();
        java.lang.Class<?> wildcardClass17 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) 100, 0.9d, (double) (byte) 1);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double[] doubleArray48 = new double[] { '4', 5, '4' };
        double[] doubleArray54 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray60 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray54, doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray48, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray41, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray11, doubleArray41);
        java.lang.String str65 = highamHall54Integrator64.getName();
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator64.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Higham-Hall 5(4)" + "'", str65, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler66);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        double double50 = highamHall54Integrator48.getMinReduction();
        double double51 = highamHall54Integrator48.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction52, (double) 1.0f, 32.0d, (int) '#');
        double double57 = highamHall54Integrator48.getMinReduction();
        java.lang.String str58 = highamHall54Integrator48.getName();
        double double59 = highamHall54Integrator48.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.2d + "'", double50 == 0.2d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.2d + "'", double57 == 0.2d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Higham-Hall 5(4)" + "'", str58, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, (double) 'a', 0.0d, 5.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.23606797749979d + "'", double5 == 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.23606797749979d + "'", double8 == 2.23606797749979d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) '#');
        double double10 = highamHall54Integrator4.getSafety();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 0.0d, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        java.lang.String str14 = highamHall54Integrator4.getName();
        double double15 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, 0.9d, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) ' ');
        highamHall54Integrator4.setMinReduction(0.9d);
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(7.211102550927978d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) (byte) 10, (double) (-1.0f), 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        int int17 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        double double19 = highamHall54Integrator12.getCurrentSignedStepsize();
        java.lang.String str20 = highamHall54Integrator12.getName();
        double double21 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction22, (double) 5, (double) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, 0.0d, 35.0d, 1.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getSafety();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) '#', (double) 10L, 32.0d);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int11 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double17 = highamHall54Integrator16.getCurrentStepStart();
        double double18 = highamHall54Integrator16.getCurrentSignedStepsize();
        int int19 = highamHall54Integrator16.getOrder();
        highamHall54Integrator16.setSafety(0.2d);
        double double22 = highamHall54Integrator16.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler23);
        int int25 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction26, (double) 1, (double) 1L, (int) (byte) 10);
        highamHall54Integrator4.setSafety(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setSafety(5.0d);
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler7);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double10 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        double double27 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(0.9d);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        double double15 = highamHall54Integrator4.getMaxStep();
        double double16 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (short) 1, (double) 0.0f, (double) (-1.0f));
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double6 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        java.lang.String str19 = highamHall54Integrator12.getName();
        int int20 = highamHall54Integrator12.getOrder();
        double double21 = highamHall54Integrator12.getMinReduction();
        java.lang.String str22 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (byte) 1, (double) (short) 100, (double) 100L);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        double[] doubleArray52 = new double[] { '4', 5, '4' };
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray30, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), 10.0d, doubleArray17, doubleArray30);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double74 = highamHall54Integrator73.getMaxGrowth();
        java.lang.String str75 = highamHall54Integrator73.getName();
        double double76 = highamHall54Integrator73.getSafety();
        int int77 = highamHall54Integrator73.getOrder();
        int int78 = highamHall54Integrator73.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler79 = highamHall54Integrator73.getStepHandler();
        highamHall54Integrator68.setStepHandler(stepHandler79);
        double double81 = highamHall54Integrator68.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction82 = null;
        highamHall54Integrator68.addSwitchingFunction(switchingFunction82, (double) '#', (double) 100L, 1);
        highamHall54Integrator68.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction89 = null;
        highamHall54Integrator68.addSwitchingFunction(switchingFunction89, 97.0d, (double) ' ', (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Higham-Hall 5(4)" + "'", str75, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9d + "'", double76 == 0.9d);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 5 + "'", int77 == 5);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMaxStep();
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (short) -1);
        double double10 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double21 = highamHall54Integrator20.getMaxGrowth();
        double double22 = highamHall54Integrator20.getSafety();
        highamHall54Integrator20.setMaxGrowth((double) 5);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler38);
        highamHall54Integrator12.setStepHandler(stepHandler38);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator12.getStepHandler();
        double double42 = highamHall54Integrator12.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator12.getStepHandler();
        java.lang.String str44 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction45, (double) (byte) 1, 9.343446901438462d, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.2d + "'", double42 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) (byte) -1);
        double double15 = highamHall54Integrator4.getMinReduction();
        int int16 = highamHall54Integrator4.getOrder();
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize(22.80350850198276d);
        double double11 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        int int11 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, 7.211102550927978d, (double) (byte) 0, 0);
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (short) 10);
        highamHall54Integrator4.setMinReduction((double) 1.0f);
        int int16 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray39, doubleArray47);
        double[] doubleArray54 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray39, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray22, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray13, doubleArray22);
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator57.getStepHandler();
        double double59 = highamHall54Integrator57.getMinStep();
        double double60 = highamHall54Integrator57.getMinReduction();
        highamHall54Integrator57.setMaxGrowth(2.1213203435596424d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.2d + "'", double60 == 0.2d);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setMaxGrowth((double) ' ');
        double double52 = highamHall54Integrator48.getSafety();
        highamHall54Integrator48.setInitialStepSize((double) (byte) 10);
        double double55 = highamHall54Integrator48.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction56, (double) (short) 100, 10.0d, 0);
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator48.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9d + "'", double52 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(stepHandler61);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray39, doubleArray47);
        double[] doubleArray54 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray39, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray22, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray13, doubleArray22);
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator57.getStepHandler();
        double double59 = highamHall54Integrator57.getMinStep();
        double double60 = highamHall54Integrator57.getMinReduction();
        highamHall54Integrator57.setInitialStepSize((double) (short) 10);
        double double63 = highamHall54Integrator57.getSafety();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.2d + "'", double60 == 0.2d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.9d + "'", double63 == 0.9d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 0, (double) 100, 0.0d);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray20 = new double[] { '4', 5, '4' };
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray13, doubleArray26);
        double double36 = highamHall54Integrator35.getMinReduction();
        double double37 = highamHall54Integrator35.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.2d + "'", double36 == 0.2d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double[] doubleArray10 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray10, doubleArray35);
        double[] doubleArray46 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray56 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray62 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray56, doubleArray62);
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray56, doubleArray64);
        double[] doubleArray71 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray56, doubleArray71);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray46, doubleArray71);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) 5, doubleArray10, doubleArray46);
        double[] doubleArray80 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray86 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray80, doubleArray86);
        double double88 = highamHall54Integrator87.getMinStep();
        double double89 = highamHall54Integrator87.getMinStep();
        double double90 = highamHall54Integrator87.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler91 = highamHall54Integrator87.getStepHandler();
        highamHall54Integrator74.setStepHandler(stepHandler91);
        double double93 = highamHall54Integrator74.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler91);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        double[] doubleArray52 = new double[] { '4', 5, '4' };
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray30, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 1.0d, doubleArray9, doubleArray52);
        double double69 = highamHall54Integrator68.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        highamHall54Integrator41.setMaxGrowth((double) 5);
        double double44 = highamHall54Integrator41.getMinStep();
        double double45 = highamHall54Integrator41.getMaxStep();
        double double46 = highamHall54Integrator41.getMinReduction();
        java.lang.Class<?> wildcardClass47 = highamHall54Integrator41.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.2d + "'", double46 == 0.2d);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setInitialStepSize((double) (byte) 0);
        highamHall54Integrator4.setSafety((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) 0, 0.0d, (double) ' ');
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (short) 0, 9.343446901438462d, 52.0d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) 10L, 2.23606797749979d, 52.0d);
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, (double) 10, (double) 0, (double) 10);
        java.lang.Class<?> wildcardClass5 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) 1L, (double) 5, (double) 0);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, (double) 1.0f, (double) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator12.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction18, (double) (short) 0, (double) (short) 0, (int) (short) -1);
        double double23 = highamHall54Integrator12.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double15 = highamHall54Integrator14.getMaxGrowth();
        java.lang.String str16 = highamHall54Integrator14.getName();
        double double17 = highamHall54Integrator14.getMaxGrowth();
        double double18 = highamHall54Integrator14.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator14.getStepHandler();
        double double20 = highamHall54Integrator14.getMinReduction();
        double double21 = highamHall54Integrator14.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double27 = highamHall54Integrator26.getCurrentStepStart();
        highamHall54Integrator26.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator14.setStepHandler(stepHandler30);
        highamHall54Integrator4.setStepHandler(stepHandler30);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.211102550927978d + "'", double18 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler30);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double[] doubleArray44 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray35, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 10, doubleArray26, doubleArray35);
        java.lang.String str47 = highamHall54Integrator46.getName();
        highamHall54Integrator46.setMaxGrowth((-1.0d));
        java.lang.String str50 = highamHall54Integrator46.getName();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[32.0]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Higham-Hall 5(4)" + "'", str50, "Higham-Hall 5(4)");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator12.getCurrentStepStart();
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getMaxStep();
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 0L);
        double double19 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (short) 0, 35.0d, (int) '#');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double19 = highamHall54Integrator18.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator18.getStepHandler();
        double double21 = highamHall54Integrator18.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator18.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        highamHall54Integrator4.setMinReduction(1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        double[] doubleArray52 = new double[] { '4', 5, '4' };
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray30, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 1.0d, doubleArray9, doubleArray52);
        double double69 = highamHall54Integrator68.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        highamHall54Integrator68.addSwitchingFunction(switchingFunction70, (-1.0d), (double) (byte) 1, (int) 'a');
        java.lang.String str75 = highamHall54Integrator68.getName();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Higham-Hall 5(4)" + "'", str75, "Higham-Hall 5(4)");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1L, (double) 0, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize(7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 10, 0.2d, (int) (byte) 0);
        double double12 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double26 = highamHall54Integrator25.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator25.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double30 = highamHall54Integrator12.getSafety();
        double double31 = highamHall54Integrator12.getMinReduction();
        double double32 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(Double.NaN, 100.0d, (double) 10L, (double) '#');
        double double5 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) 0.0f, (double) (-1), 5);
        double double16 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction17, (double) (byte) 10, 7.211102550927978d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double[] doubleArray4 = new double[] { 0L, 'a' };
        double[] doubleArray10 = new double[] { '4', 5, '4' };
        double[] doubleArray16 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray22 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray16, doubleArray22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray10, doubleArray16);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) (byte) 100, doubleArray4, doubleArray10);
        double double26 = highamHall54Integrator25.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 31.622776601683793d + "'", double26 == 31.622776601683793d);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator12.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction18, 7.211102550927978d, (double) 'a', (int) '#');
        double double23 = highamHall54Integrator12.getMinReduction();
        double double24 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double21 = highamHall54Integrator20.getMaxGrowth();
        double double22 = highamHall54Integrator20.getSafety();
        highamHall54Integrator20.setMaxGrowth((double) 5);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler38);
        highamHall54Integrator12.setStepHandler(stepHandler38);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator12.getStepHandler();
        double double42 = highamHall54Integrator12.getMinReduction();
        double double43 = highamHall54Integrator12.getMaxStep();
        highamHall54Integrator12.setMinReduction((double) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction46, (double) '#', (double) (byte) 10, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.2d + "'", double42 == 0.2d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator4.setStepHandler(stepHandler12);
        highamHall54Integrator4.setInitialStepSize(0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        highamHall54Integrator25.setMinReduction((double) '#');
        double double28 = highamHall54Integrator25.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator25.addSwitchingFunction(switchingFunction29, (double) ' ', (double) 0.0f, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double15 = highamHall54Integrator14.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator14.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction18, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double28 = highamHall54Integrator27.getMaxGrowth();
        double double29 = highamHall54Integrator27.getSafety();
        highamHall54Integrator27.setMaxGrowth((double) 5);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator44.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler45);
        highamHall54Integrator14.setStepHandler(stepHandler45);
        highamHall54Integrator4.setStepHandler(stepHandler45);
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator4.getStepHandler();
        double double50 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction(1.0d);
        highamHall54Integrator4.setInitialStepSize(97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        int int11 = highamHall54Integrator4.getOrder();
        double[] doubleArray17 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray23 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray17, doubleArray23);
        double double25 = highamHall54Integrator24.getMinStep();
        double double26 = highamHall54Integrator24.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        highamHall54Integrator24.addSwitchingFunction(switchingFunction27, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator24.setSafety(0.2d);
        double double34 = highamHall54Integrator24.getMinReduction();
        java.lang.String str35 = highamHall54Integrator24.getName();
        int int36 = highamHall54Integrator24.getOrder();
        double[] doubleArray42 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray48 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray42, doubleArray48);
        double double50 = highamHall54Integrator49.getMinStep();
        highamHall54Integrator49.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double58 = highamHall54Integrator57.getMaxGrowth();
        double double59 = highamHall54Integrator57.getSafety();
        highamHall54Integrator57.setMaxGrowth((double) 5);
        double[] doubleArray67 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray73 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray67, doubleArray73);
        org.apache.commons.math.ode.StepHandler stepHandler75 = highamHall54Integrator74.getStepHandler();
        highamHall54Integrator57.setStepHandler(stepHandler75);
        highamHall54Integrator49.setStepHandler(stepHandler75);
        org.apache.commons.math.ode.StepHandler stepHandler78 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator24.setStepHandler(stepHandler78);
        highamHall54Integrator4.setStepHandler(stepHandler78);
        double double81 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.2d + "'", double34 == 0.2d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.9d + "'", double59 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler75);
        org.junit.Assert.assertNotNull(stepHandler78);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.9d + "'", double81 == 0.9d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction50, (double) 10, (double) (byte) 100, (int) (byte) -1);
        double double55 = highamHall54Integrator48.getMinStep();
        highamHall54Integrator48.setMinReduction(52.0d);
        double double58 = highamHall54Integrator48.getSafety();
        double double59 = highamHall54Integrator48.getMinReduction();
        double double60 = highamHall54Integrator48.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9d + "'", double58 == 0.9d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 52.0d + "'", double59 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        highamHall54Integrator41.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator41.getStepHandler();
        java.lang.Class<?> wildcardClass45 = stepHandler44.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 100, (double) 'a', 9.343446901438462d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, Double.NaN, 7.211102550927978d, (int) '4');
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray20 = new double[] { '4', 5, '4' };
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray13, doubleArray26);
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        double double37 = highamHall54Integrator35.getMinReduction();
        double double38 = highamHall54Integrator35.getCurrentSignedStepsize();
        double double39 = highamHall54Integrator35.getMinReduction();
        double double40 = highamHall54Integrator35.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2d + "'", double37 == 0.2d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.2d + "'", double39 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        double double63 = highamHall54Integrator62.getMinStep();
        highamHall54Integrator62.setSafety(0.0d);
        java.lang.String str66 = highamHall54Integrator62.getName();
        double double67 = highamHall54Integrator62.getMaxStep();
        int int68 = highamHall54Integrator62.getOrder();
        highamHall54Integrator62.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double76 = highamHall54Integrator75.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler77 = highamHall54Integrator75.getStepHandler();
        highamHall54Integrator62.setStepHandler(stepHandler77);
        highamHall54Integrator48.setStepHandler(stepHandler77);
        double double80 = highamHall54Integrator48.getMinStep();
        highamHall54Integrator48.setSafety((double) (-1));
        double double83 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Higham-Hall 5(4)" + "'", str66, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5 + "'", int68 == 5);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        highamHall54Integrator4.setMinReduction((double) '4');
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(10.0d);
        highamHall54Integrator4.setInitialStepSize((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        double double20 = highamHall54Integrator19.getCurrentSignedStepsize();
        highamHall54Integrator19.setMaxGrowth((double) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction((double) 'a');
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 1L);
        double double10 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double5 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double double19 = highamHall54Integrator18.getMinStep();
        highamHall54Integrator18.setSafety(0.0d);
        java.lang.String str22 = highamHall54Integrator18.getName();
        double double23 = highamHall54Integrator18.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator18.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler24);
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        double[] doubleArray48 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray54 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray48, doubleArray54);
        double[] doubleArray61 = new double[] { '4', 5, '4' };
        double[] doubleArray67 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray73 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray67, doubleArray73);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray61, doubleArray67);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray54, doubleArray67);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray33, doubleArray54);
        highamHall54Integrator77.setSafety((double) (short) 100);
        double double80 = highamHall54Integrator77.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator85 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator85.setMinReduction((double) 0.0f);
        int int88 = highamHall54Integrator85.getOrder();
        double double89 = highamHall54Integrator85.getCurrentSignedStepsize();
        highamHall54Integrator85.setInitialStepSize((double) 10.0f);
        double double92 = highamHall54Integrator85.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler93 = highamHall54Integrator85.getStepHandler();
        highamHall54Integrator77.setStepHandler(stepHandler93);
        highamHall54Integrator4.setStepHandler(stepHandler93);
        double double96 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 52.0d + "'", double80 == 52.0d);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 5 + "'", int88 == 5);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertNotNull(stepHandler93);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 35.0d + "'", double96 == 35.0d);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        double double10 = highamHall54Integrator4.getMaxStep();
        java.lang.String str11 = highamHall54Integrator4.getName();
        java.lang.Class<?> wildcardClass12 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator12.setMaxGrowth((double) ' ');
        double double22 = highamHall54Integrator12.getSafety();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) 0, (double) 1.0f, (int) (byte) 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator21.setMinReduction((double) (byte) 100);
        double double25 = highamHall54Integrator21.getMaxGrowth();
        highamHall54Integrator21.setSafety(5.0d);
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler28);
        double double30 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator12.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction23, 2.23606797749979d, (double) 0.0f, (int) '#');
        double double28 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction50, (double) 10, (double) (byte) 100, (int) (byte) -1);
        double double55 = highamHall54Integrator48.getMinStep();
        highamHall54Integrator48.setMinReduction(52.0d);
        double double58 = highamHall54Integrator48.getSafety();
        highamHall54Integrator48.setSafety(9.343446901438462d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9d + "'", double58 == 0.9d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator4.getMinReduction();
        double double25 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator12.getStepHandler();
        double double18 = highamHall54Integrator12.getMaxGrowth();
        double double19 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (short) 10);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        java.lang.String str16 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) ' ');
        double double19 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getMinReduction();
        double double10 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) (-1), (double) 0, (int) (short) -1);
        double double16 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double20 = highamHall54Integrator19.getCurrentStepStart();
        double double21 = highamHall54Integrator19.getCurrentStepStart();
        double double22 = highamHall54Integrator19.getSafety();
        double double23 = highamHall54Integrator19.getMaxStep();
        double double24 = highamHall54Integrator19.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator19.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator19.getStepHandler();
        double double27 = highamHall54Integrator19.getMaxGrowth();
        highamHall54Integrator19.setInitialStepSize(32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler30);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        highamHall54Integrator4.setMinReduction(2.23606797749979d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, 100.0d, (double) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 7.211102550927978d + "'", double15 == 7.211102550927978d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator19.addSwitchingFunction(switchingFunction20, (-1.0d), 0.0d, 5);
        double double25 = highamHall54Integrator19.getCurrentStepStart();
        int int26 = highamHall54Integrator19.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator19.getStepHandler();
        java.lang.Class<?> wildcardClass28 = stepHandler27.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        java.lang.String str21 = highamHall54Integrator12.getName();
        double double22 = highamHall54Integrator12.getMinStep();
        double double23 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double24 = highamHall54Integrator12.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        int int21 = highamHall54Integrator12.getOrder();
        double double22 = highamHall54Integrator12.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction23, (double) (short) 100, 32.0d, (int) (byte) 100);
        double double28 = highamHall54Integrator12.getCurrentStepStart();
        double double29 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction30, (double) (short) 100, 5.0d, (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        int int17 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        double double19 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double20 = highamHall54Integrator12.getMinStep();
        double double21 = highamHall54Integrator12.getMaxGrowth();
        highamHall54Integrator12.setSafety((double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, (double) (-1L), (double) (-1), (double) (-1.0f));
        highamHall54Integrator4.setInitialStepSize(35.0d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getMinStep();
        double double20 = highamHall54Integrator4.getMaxStep();
        double double21 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        java.lang.String str42 = highamHall54Integrator41.getName();
        double double43 = highamHall54Integrator41.getMinReduction();
        highamHall54Integrator41.setMaxGrowth(52.0d);
        highamHall54Integrator41.setInitialStepSize((double) 1.0f);
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        double double61 = highamHall54Integrator60.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        highamHall54Integrator60.addSwitchingFunction(switchingFunction62, (-1.0d), (double) (short) -1, (int) (short) 10);
        double double67 = highamHall54Integrator60.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler68 = highamHall54Integrator60.getStepHandler();
        double double69 = highamHall54Integrator60.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double75 = highamHall54Integrator74.getMaxGrowth();
        double double76 = highamHall54Integrator74.getSafety();
        highamHall54Integrator74.setMaxGrowth((double) 5);
        double[] doubleArray84 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray90 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator91 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray84, doubleArray90);
        org.apache.commons.math.ode.StepHandler stepHandler92 = highamHall54Integrator91.getStepHandler();
        highamHall54Integrator74.setStepHandler(stepHandler92);
        double double94 = highamHall54Integrator74.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler95 = highamHall54Integrator74.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler96 = highamHall54Integrator74.getStepHandler();
        highamHall54Integrator60.setStepHandler(stepHandler96);
        highamHall54Integrator41.setStepHandler(stepHandler96);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.2d + "'", double43 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9d + "'", double76 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler92);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.2d + "'", double94 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler95);
        org.junit.Assert.assertNotNull(stepHandler96);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(0.9d);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations15 = null;
        double[] doubleArray21 = new double[] { 0L, 'a' };
        double[] doubleArray27 = new double[] { '4', 5, '4' };
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray27, doubleArray33);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) (byte) 100, doubleArray21, doubleArray27);
        double[] doubleArray48 = new double[] {};
        double[] doubleArray57 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray67 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray73 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray67, doubleArray73);
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray67, doubleArray75);
        double[] doubleArray82 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray67, doubleArray82);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray57, doubleArray82);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator85 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray48, doubleArray82);
        double[] doubleArray92 = new double[] { 10L, 0.0d, 32.0d, (byte) 10, 9.343446901438462d, 2.23606797749979d };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (double) (-1L), doubleArray48, doubleArray92);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations15, (double) (short) 100, doubleArray21, (double) (-1L), doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[10.0, 0.0, 32.0, 10.0, 9.343446901438462, 2.23606797749979]");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator12.getStepHandler();
        double double23 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, (double) (byte) 10, (double) (short) 1, 97.0d);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxStep();
        double double13 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray36 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray42 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray36, doubleArray42);
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray53, doubleArray61);
        double[] doubleArray68 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray53, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray36, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray27, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler72 = highamHall54Integrator71.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler72);
        java.lang.Class<?> wildcardClass74 = stepHandler72.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinReduction();
        double double10 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setMaxGrowth((double) ' ');
        double double52 = highamHall54Integrator48.getSafety();
        int int53 = highamHall54Integrator48.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction54, (double) 5, (double) (byte) 10, 0);
        org.apache.commons.math.ode.StepHandler stepHandler59 = highamHall54Integrator48.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9d + "'", double52 == 0.9d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNotNull(stepHandler59);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction19, 2.23606797749979d, (-1.0d), (int) 'a');
        java.lang.Class<?> wildcardClass24 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        double double50 = highamHall54Integrator48.getMinReduction();
        double double51 = highamHall54Integrator48.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.2d + "'", double50 == 0.2d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator19.addSwitchingFunction(switchingFunction20, (-1.0d), 0.0d, 5);
        double double25 = highamHall54Integrator19.getCurrentStepStart();
        int int26 = highamHall54Integrator19.getOrder();
        double double27 = highamHall54Integrator19.getMinStep();
        double double28 = highamHall54Integrator19.getMinStep();
        highamHall54Integrator19.setMinReduction((double) 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(35.0d);
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) 100L, 2.1213203435596424d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        int int9 = highamHall54Integrator4.getOrder();
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        highamHall54Integrator4.setMinReduction(35.0d);
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety((double) (short) 10);
        org.junit.Assert.assertNull(stepHandler9);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (short) 1, (double) 0.0f, (double) (-1.0f));
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double21 = highamHall54Integrator20.getMaxGrowth();
        double double22 = highamHall54Integrator20.getSafety();
        highamHall54Integrator20.setMaxGrowth((double) 5);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator37.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler38);
        highamHall54Integrator12.setStepHandler(stepHandler38);
        highamHall54Integrator12.setInitialStepSize((double) (byte) 1);
        double double43 = highamHall54Integrator12.getMaxStep();
        double double44 = highamHall54Integrator12.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        highamHall54Integrator31.setSafety(0.0d);
        java.lang.String str35 = highamHall54Integrator31.getName();
        double double36 = highamHall54Integrator31.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler37);
        double double39 = highamHall54Integrator12.getCurrentSignedStepsize();
        highamHall54Integrator12.setMinReduction((double) ' ');
        double double42 = highamHall54Integrator12.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(stepHandler43);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        double double14 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double20 = highamHall54Integrator19.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler21 = null;
        highamHall54Integrator19.setStepHandler(stepHandler21);
        int int23 = highamHall54Integrator19.getOrder();
        java.lang.String str24 = highamHall54Integrator19.getName();
        double double25 = highamHall54Integrator19.getCurrentSignedStepsize();
        int int26 = highamHall54Integrator19.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double32 = highamHall54Integrator31.getCurrentStepStart();
        double double33 = highamHall54Integrator31.getCurrentSignedStepsize();
        int int34 = highamHall54Integrator31.getOrder();
        highamHall54Integrator31.setSafety(0.2d);
        double double37 = highamHall54Integrator31.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator19.setStepHandler(stepHandler38);
        highamHall54Integrator12.setStepHandler(stepHandler38);
        double double41 = highamHall54Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        highamHall54Integrator51.setSafety((double) (short) 100);
        double double54 = highamHall54Integrator51.getCurrentSignedStepsize();
        highamHall54Integrator51.setInitialStepSize((double) (-1L));
        highamHall54Integrator51.setInitialStepSize(35.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 7.211102550927978d + "'", double54 == 7.211102550927978d);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(0.0d);
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.Class<?> wildcardClass10 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 1, 22.80350850198276d, (double) (byte) -1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        highamHall54Integrator31.setSafety(0.0d);
        java.lang.String str35 = highamHall54Integrator31.getName();
        double double36 = highamHall54Integrator31.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler37);
        double double39 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double40 = highamHall54Integrator12.getMinStep();
        double double41 = highamHall54Integrator12.getMinReduction();
        java.lang.Class<?> wildcardClass42 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.2d + "'", double41 == 0.2d);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 100.0d, (double) (short) 100, (int) (byte) 100);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double23 = highamHall54Integrator22.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator22.setStepHandler(stepHandler24);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator22.addSwitchingFunction(switchingFunction26, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double36 = highamHall54Integrator35.getMaxGrowth();
        double double37 = highamHall54Integrator35.getSafety();
        highamHall54Integrator35.setMaxGrowth((double) 5);
        double[] doubleArray45 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray51 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray45, doubleArray51);
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator52.getStepHandler();
        highamHall54Integrator35.setStepHandler(stepHandler53);
        highamHall54Integrator22.setStepHandler(stepHandler53);
        highamHall54Integrator4.setStepHandler(stepHandler53);
        java.lang.String str57 = highamHall54Integrator4.getName();
        double double58 = highamHall54Integrator4.getMinReduction();
        java.lang.String str59 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.9d + "'", double37 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Higham-Hall 5(4)" + "'", str57, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.2d + "'", double58 == 0.2d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Higham-Hall 5(4)" + "'", str59, "Higham-Hall 5(4)");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double[] doubleArray19 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray25 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray19, doubleArray25);
        double double27 = highamHall54Integrator26.getMinStep();
        highamHall54Integrator26.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler30);
        highamHall54Integrator12.setInitialStepSize((double) 100L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler30);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double26 = highamHall54Integrator25.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator25.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator12.getCurrentStepStart();
        highamHall54Integrator12.setMinReduction((double) (short) 100);
        double double32 = highamHall54Integrator12.getMaxStep();
        double double33 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double34 = highamHall54Integrator12.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setMaxGrowth(0.0d);
        highamHall54Integrator12.setMaxGrowth(7.211102550927978d);
        highamHall54Integrator12.setInitialStepSize(Double.NaN);
        double double25 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction26, (double) 0.0f, 0.0d, 0);
        double double31 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.211102550927978d + "'", double25 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        int int7 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double13 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety((double) 10);
        double double19 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) '#', 52.0d, (double) (short) 0);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        double double52 = highamHall54Integrator51.getMaxGrowth();
        double double53 = highamHall54Integrator51.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, 0.2d, 9.343446901438462d, 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        highamHall54Integrator51.setSafety((double) (short) 100);
        double double54 = highamHall54Integrator51.getMaxStep();
        highamHall54Integrator51.setSafety((double) '#');
        int int57 = highamHall54Integrator51.getOrder();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 52.0d + "'", double54 == 52.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        java.lang.Class<?> wildcardClass15 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize(22.80350850198276d);
        double double11 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setMaxGrowth((double) ' ');
        double double52 = highamHall54Integrator48.getSafety();
        int int53 = highamHall54Integrator48.getOrder();
        double double54 = highamHall54Integrator48.getMinStep();
        double double55 = highamHall54Integrator48.getCurrentSignedStepsize();
        double double56 = highamHall54Integrator48.getCurrentStepStart();
        double double57 = highamHall54Integrator48.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9d + "'", double52 == 0.9d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 32.0d + "'", double57 == 32.0d);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray30, doubleArray38);
        double[] doubleArray45 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray30, doubleArray45);
        double[] doubleArray52 = new double[] { '4', 5, '4' };
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray30, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 1.0d, doubleArray9, doubleArray52);
        double double69 = highamHall54Integrator68.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        highamHall54Integrator68.addSwitchingFunction(switchingFunction70, (-1.0d), (double) (byte) 1, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double80 = highamHall54Integrator79.getMaxStep();
        int int81 = highamHall54Integrator79.getOrder();
        int int82 = highamHall54Integrator79.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double88 = highamHall54Integrator87.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler89 = highamHall54Integrator87.getStepHandler();
        highamHall54Integrator79.setStepHandler(stepHandler89);
        highamHall54Integrator68.setStepHandler(stepHandler89);
        org.apache.commons.math.ode.StepHandler stepHandler92 = highamHall54Integrator68.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 5 + "'", int82 == 5);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler89);
        org.junit.Assert.assertNotNull(stepHandler92);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, 0.2d, (double) 10L, 10);
        highamHall54Integrator4.setInitialStepSize(35.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator4.getMinReduction();
        double double25 = highamHall54Integrator4.getMinReduction();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 7.211102550927978d + "'", double26 == 7.211102550927978d);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        int int9 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray28, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, doubleArray7, doubleArray28);
        highamHall54Integrator51.setSafety((double) (short) 100);
        highamHall54Integrator51.setMinReduction((double) 5);
        java.lang.String str56 = highamHall54Integrator51.getName();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Higham-Hall 5(4)" + "'", str56, "Higham-Hall 5(4)");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        int int18 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(35.0d);
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double16 = highamHall54Integrator4.getMinStep();
        double double17 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        highamHall54Integrator4.setMaxGrowth((double) 100L);
        double double15 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction(35.0d);
        int int18 = highamHall54Integrator4.getOrder();
        double double19 = highamHall54Integrator4.getMaxGrowth();
        double double20 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 35.0d + "'", double20 == 35.0d);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) '4', 0.0d, (int) ' ');
        double double16 = highamHall54Integrator4.getSafety();
        int int17 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) 10);
        double double11 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, 10.0d, (double) 5, (int) '4');
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety((double) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double9 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) (short) -1);
        double double12 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        double double22 = highamHall54Integrator12.getMinReduction();
        java.lang.String str23 = highamHall54Integrator12.getName();
        int int24 = highamHall54Integrator12.getOrder();
        double double25 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        double[] doubleArray8 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray18, doubleArray26);
        double[] doubleArray33 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray18, doubleArray33);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray8, doubleArray33);
        int int36 = highamHall54Integrator35.getOrder();
        highamHall54Integrator35.setMaxGrowth(0.0d);
        double double39 = highamHall54Integrator35.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray23 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray33, doubleArray41);
        double[] doubleArray48 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray33, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray23, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray7, doubleArray48);
        org.apache.commons.math.ode.StepHandler stepHandler52 = highamHall54Integrator51.getStepHandler();
        highamHall54Integrator51.setSafety((double) 10);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler52);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray33 = new double[] { '4', 5, '4' };
        double[] doubleArray39 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray45 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray39, doubleArray45);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray33, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray11, doubleArray33);
        double double49 = highamHall54Integrator48.getCurrentSignedStepsize();
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        double double63 = highamHall54Integrator62.getMinStep();
        highamHall54Integrator62.setSafety(0.0d);
        java.lang.String str66 = highamHall54Integrator62.getName();
        double double67 = highamHall54Integrator62.getMaxStep();
        int int68 = highamHall54Integrator62.getOrder();
        highamHall54Integrator62.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double76 = highamHall54Integrator75.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler77 = highamHall54Integrator75.getStepHandler();
        highamHall54Integrator62.setStepHandler(stepHandler77);
        highamHall54Integrator48.setStepHandler(stepHandler77);
        double double80 = highamHall54Integrator48.getMinStep();
        highamHall54Integrator48.setSafety((double) (-1));
        double double83 = highamHall54Integrator48.getSafety();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Higham-Hall 5(4)" + "'", str66, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5 + "'", int68 == 5);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray19 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray25 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray19, doubleArray25);
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray19, doubleArray27);
        double[] doubleArray34 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray19, doubleArray34);
        double[] doubleArray41 = new double[] { '4', 5, '4' };
        double[] doubleArray47 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray53 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray47, doubleArray53);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray19, doubleArray41);
        double double57 = highamHall54Integrator56.getCurrentSignedStepsize();
        highamHall54Integrator56.setMinReduction((double) (short) -1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double65 = highamHall54Integrator64.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator64.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        highamHall54Integrator64.addSwitchingFunction(switchingFunction67, (double) 1, 10.0d, (int) (short) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double77 = highamHall54Integrator76.getCurrentStepStart();
        double double78 = highamHall54Integrator76.getCurrentStepStart();
        double double79 = highamHall54Integrator76.getSafety();
        double double80 = highamHall54Integrator76.getMaxStep();
        double double81 = highamHall54Integrator76.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler82 = highamHall54Integrator76.getStepHandler();
        highamHall54Integrator64.setStepHandler(stepHandler82);
        highamHall54Integrator56.setStepHandler(stepHandler82);
        highamHall54Integrator4.setStepHandler(stepHandler82);
        double double86 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 1.0d + "'", double65 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.9d + "'", double79 == 0.9d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray23 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray33, doubleArray41);
        double[] doubleArray48 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray33, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray23, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray7, doubleArray48);
        double double52 = highamHall54Integrator51.getCurrentSignedStepsize();
        highamHall54Integrator51.setMinReduction((double) 10L);
        double double55 = highamHall54Integrator51.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 2.23606797749979d + "'", double52 == 2.23606797749979d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler12);
        org.junit.Assert.assertNull(stepHandler13);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 100.0d, (double) (short) 10, (double) 100L);
        double double5 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, 7.211102550927978d, (double) (byte) 0, 10);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(52.0d, 9.343446901438462d, Double.NaN, 9.343446901438462d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 100, (double) (short) 10, (double) 1);
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        double double6 = highamHall54Integrator4.getSafety();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        double[] doubleArray8 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray18, doubleArray26);
        double[] doubleArray33 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray18, doubleArray33);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray8, doubleArray33);
        highamHall54Integrator35.setMaxGrowth((double) 100L);
        double double38 = highamHall54Integrator35.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        double double7 = highamHall54Integrator4.getMaxStep();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(35.0d);
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray24, doubleArray32);
        double[] doubleArray39 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray24, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray7, doubleArray39);
        double double42 = highamHall54Integrator41.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double48 = highamHall54Integrator47.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler49 = null;
        highamHall54Integrator47.setStepHandler(stepHandler49);
        int int51 = highamHall54Integrator47.getOrder();
        highamHall54Integrator47.setInitialStepSize((double) '#');
        double double54 = highamHall54Integrator47.getMaxStep();
        double double55 = highamHall54Integrator47.getSafety();
        highamHall54Integrator47.setInitialStepSize(Double.NaN);
        double double58 = highamHall54Integrator47.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double64 = highamHall54Integrator63.getCurrentStepStart();
        double double65 = highamHall54Integrator63.getCurrentSignedStepsize();
        highamHall54Integrator63.setInitialStepSize((-1.0d));
        highamHall54Integrator63.setMinReduction((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator63.getStepHandler();
        highamHall54Integrator47.setStepHandler(stepHandler70);
        highamHall54Integrator41.setStepHandler(stepHandler70);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.9d + "'", double55 == 0.9d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler70);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double18 = highamHall54Integrator17.getMaxGrowth();
        double double19 = highamHall54Integrator17.getSafety();
        highamHall54Integrator17.setMaxGrowth((double) 5);
        double[] doubleArray27 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray33 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray27, doubleArray33);
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator34.getStepHandler();
        highamHall54Integrator17.setStepHandler(stepHandler35);
        highamHall54Integrator4.setStepHandler(stepHandler35);
        highamHall54Integrator4.setSafety((double) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction40, (double) '#', 7.211102550927978d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9d + "'", double19 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler35);
    }
}

