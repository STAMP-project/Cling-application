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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxStep();
        double[] doubleArray19 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray25 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray19, doubleArray25);
        double double27 = highamHall54Integrator26.getMinStep();
        highamHall54Integrator26.setSafety(0.0d);
        java.lang.String str30 = highamHall54Integrator26.getName();
        double double31 = highamHall54Integrator26.getMaxStep();
        int int32 = highamHall54Integrator26.getOrder();
        highamHall54Integrator26.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double40 = highamHall54Integrator39.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator39.getStepHandler();
        highamHall54Integrator26.setStepHandler(stepHandler41);
        double double43 = highamHall54Integrator26.getCurrentSignedStepsize();
        double double44 = highamHall54Integrator26.getSafety();
        double double45 = highamHall54Integrator26.getCurrentStepStart();
        highamHall54Integrator26.setMinReduction((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler48);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(stepHandler48);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray19 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) ' ', doubleArray9, doubleArray19);
        double double21 = highamHall54Integrator20.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int25 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety(97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.211102550927978d + "'", double7 == 7.211102550927978d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 1.0f, 35.0d, (double) (-1L));
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 10L);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double11 = highamHall54Integrator4.getMinReduction();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        highamHall54Integrator4.setMinReduction(0.9d);
        double double10 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (byte) 100, 0.0d, 0.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 0.0d, 0.0d, (double) (short) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double10 = highamHall54Integrator9.getCurrentStepStart();
        double double11 = highamHall54Integrator9.getCurrentSignedStepsize();
        highamHall54Integrator9.setMaxGrowth((double) 100);
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray21, doubleArray29);
        java.lang.String str31 = highamHall54Integrator30.getName();
        org.apache.commons.math.ode.StepHandler stepHandler32 = highamHall54Integrator30.getStepHandler();
        highamHall54Integrator9.setStepHandler(stepHandler32);
        highamHall54Integrator4.setStepHandler(stepHandler32);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction35, (double) (byte) -1, 0.0d, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Higham-Hall 5(4)" + "'", str31, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler32);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction53, (double) (short) 0, (double) 5, (int) (short) 0);
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
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        highamHall54Integrator4.setInitialStepSize(1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, 2.23606797749979d, (double) (short) 100, 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, (double) 10, (double) 0, (double) 10);
        highamHall54Integrator23.setMinReduction(7.211102550927978d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double31 = highamHall54Integrator30.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator30.setStepHandler(stepHandler32);
        int int34 = highamHall54Integrator30.getOrder();
        java.lang.String str35 = highamHall54Integrator30.getName();
        double double36 = highamHall54Integrator30.getCurrentSignedStepsize();
        int int37 = highamHall54Integrator30.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double43 = highamHall54Integrator42.getCurrentStepStart();
        double double44 = highamHall54Integrator42.getCurrentSignedStepsize();
        int int45 = highamHall54Integrator42.getOrder();
        highamHall54Integrator42.setSafety(0.2d);
        double double48 = highamHall54Integrator42.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator30.setStepHandler(stepHandler49);
        highamHall54Integrator23.setStepHandler(stepHandler49);
        highamHall54Integrator4.setStepHandler(stepHandler49);
        double double53 = highamHall54Integrator4.getMaxGrowth();
        double double54 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.1213203435596424d, 22.80350850198276d, (double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        double double43 = highamHall54Integrator12.getMaxGrowth();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMaxStep();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator15 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double16 = highamHall54Integrator15.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        highamHall54Integrator15.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator15.getStepHandler();
        double double20 = highamHall54Integrator15.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double26 = highamHall54Integrator25.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator25.setStepHandler(stepHandler27);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator25.addSwitchingFunction(switchingFunction29, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double39 = highamHall54Integrator38.getMaxGrowth();
        double double40 = highamHall54Integrator38.getSafety();
        highamHall54Integrator38.setMaxGrowth((double) 5);
        double[] doubleArray48 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray54 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray48, doubleArray54);
        org.apache.commons.math.ode.StepHandler stepHandler56 = highamHall54Integrator55.getStepHandler();
        highamHall54Integrator38.setStepHandler(stepHandler56);
        highamHall54Integrator25.setStepHandler(stepHandler56);
        highamHall54Integrator15.setStepHandler(stepHandler56);
        highamHall54Integrator4.setStepHandler(stepHandler56);
        highamHall54Integrator4.setMaxGrowth(2.23606797749979d);
        java.lang.String str63 = highamHall54Integrator4.getName();
        double double64 = highamHall54Integrator4.getSafety();
        double double65 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.211102550927978d + "'", double20 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9d + "'", double40 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Higham-Hall 5(4)" + "'", str63, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.9d + "'", double64 == 0.9d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety(5.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        double double31 = highamHall54Integrator12.getMinStep();
        double double32 = highamHall54Integrator12.getMinStep();
        java.lang.String str33 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) 10, (double) (-1L), (int) (byte) 1);
        double double16 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction41, 0.0d, (double) 100L, (int) (short) 1);
        double double46 = highamHall54Integrator12.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.2d + "'", double46 == 0.2d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 32.0d, (double) (short) 100, (double) 1L);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, 0.0d, (double) 100.0f, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.String str19 = highamHall54Integrator4.getName();
        double double20 = highamHall54Integrator4.getMaxGrowth();
        java.lang.Class<?> wildcardClass21 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        java.lang.String str26 = highamHall54Integrator25.getName();
        highamHall54Integrator25.setMaxGrowth((double) 100L);
        double double29 = highamHall54Integrator25.getCurrentSignedStepsize();
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double double43 = highamHall54Integrator42.getMinStep();
        highamHall54Integrator42.setSafety(0.0d);
        java.lang.String str46 = highamHall54Integrator42.getName();
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator42.getStepHandler();
        double double48 = highamHall54Integrator42.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator53.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler55 = highamHall54Integrator53.getStepHandler();
        highamHall54Integrator42.setStepHandler(stepHandler55);
        highamHall54Integrator25.setStepHandler(stepHandler55);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 22.80350850198276d + "'", double29 == 22.80350850198276d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertNotNull(stepHandler55);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        double double25 = highamHall54Integrator12.getSafety();
        double double26 = highamHall54Integrator12.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setSafety((double) (byte) 1);
        double double21 = highamHall54Integrator12.getMaxGrowth();
        java.lang.String str22 = highamHall54Integrator12.getName();
        double double23 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(7.211102550927978d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth(5.0d);
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(35.0d);
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, (double) 100L, (double) 10.0f, (int) (short) 10);
        double double23 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, 0.0d, (double) 1.0f, (int) ' ');
        double double17 = highamHall54Integrator4.getMinStep();
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, 100.0d, 0.0d, (int) '#');
        double double14 = highamHall54Integrator4.getMinStep();
        double double15 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        double double15 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(9.343446901438462d);
        java.lang.Class<?> wildcardClass9 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (short) 10);
        double double14 = highamHall54Integrator4.getMinStep();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setSafety((double) (byte) 1);
        double double21 = highamHall54Integrator12.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setInitialStepSize((double) (byte) 100);
        double double20 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) '4', (double) (byte) 0, 22.80350850198276d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.211102550927978d + "'", double12 == 7.211102550927978d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        double double11 = highamHall54Integrator4.getMinReduction();
        int int12 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(32.0d);
        double double15 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double20 = highamHall54Integrator19.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double23 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        double double10 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler11 = null;
        highamHall54Integrator4.setStepHandler(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMaxGrowth((double) 1);
        highamHall54Integrator12.setMinReduction((double) 100);
        highamHall54Integrator12.setInitialStepSize((double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        highamHall54Integrator12.setInitialStepSize((double) 1);
        double double65 = highamHall54Integrator12.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.2d + "'", double65 == 0.2d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 1L);
        highamHall54Integrator4.setInitialStepSize(0.0d);
        highamHall54Integrator4.setInitialStepSize(0.2d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) 5);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        int int10 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) (short) 1, (double) 5, (int) (byte) 10);
        double double16 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (-1));
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray10 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray10, doubleArray35);
        double[] doubleArray47 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray53 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray47, doubleArray53);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray47, doubleArray55);
        double[] doubleArray62 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray47, doubleArray62);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1, doubleArray35, doubleArray47);
        java.lang.Class<?> wildcardClass65 = highamHall54Integrator64.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        double double31 = highamHall54Integrator12.getMinReduction();
        double double32 = highamHall54Integrator12.getMaxStep();
        double double33 = highamHall54Integrator12.getMinStep();
        double double34 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.211102550927978d + "'", double25 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.2d + "'", double31 == 0.2d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 100, (double) 10L, (double) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) 100);
        highamHall54Integrator4.setSafety((double) 0L);
        java.lang.Class<?> wildcardClass16 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, 14.727477510336914d, 10.0d, (int) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double32 = highamHall54Integrator31.getMaxGrowth();
        java.lang.String str33 = highamHall54Integrator31.getName();
        double double34 = highamHall54Integrator31.getSafety();
        int int35 = highamHall54Integrator31.getOrder();
        double double36 = highamHall54Integrator31.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double42 = highamHall54Integrator41.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler43 = null;
        highamHall54Integrator41.setStepHandler(stepHandler43);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        highamHall54Integrator41.addSwitchingFunction(switchingFunction45, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double55 = highamHall54Integrator54.getMaxGrowth();
        double double56 = highamHall54Integrator54.getSafety();
        highamHall54Integrator54.setMaxGrowth((double) 5);
        double[] doubleArray64 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray70 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray64, doubleArray70);
        org.apache.commons.math.ode.StepHandler stepHandler72 = highamHall54Integrator71.getStepHandler();
        highamHall54Integrator54.setStepHandler(stepHandler72);
        highamHall54Integrator41.setStepHandler(stepHandler72);
        highamHall54Integrator31.setStepHandler(stepHandler72);
        highamHall54Integrator12.setStepHandler(stepHandler72);
        double double77 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator82 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 0.0d, 32.0d, (double) 10.0f);
        org.apache.commons.math.ode.StepHandler stepHandler83 = highamHall54Integrator82.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler83);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9d + "'", double34 == 0.9d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.9d + "'", double56 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler83);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, (double) 1.0f, (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(2.23606797749979d);
        highamHall54Integrator4.setMaxGrowth((double) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(0.0d);
        highamHall54Integrator4.setMinReduction((double) 100L);
        highamHall54Integrator4.setMaxGrowth(9.343446901438462d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        double double71 = highamHall54Integrator68.getSafety();
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.9d + "'", double71 == 0.9d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMinStep();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        highamHall54Integrator4.setMaxGrowth((double) (short) 10);
        highamHall54Integrator4.setMaxGrowth((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 10);
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        int int17 = highamHall54Integrator12.getOrder();
        double double18 = highamHall54Integrator12.getCurrentSignedStepsize();
        int int19 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (-1));
        double double8 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, 10.0d, (double) 0L, 100.0d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, 32.0d, 7.211102550927978d, (double) 100);
        highamHall54Integrator4.setMinReduction(0.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) (short) 0);
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 0.0d, 0.0d, (double) (short) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator25.addSwitchingFunction(switchingFunction29, (double) 1L, 35.0d, (int) '#');
        highamHall54Integrator25.setMaxGrowth((double) (short) -1);
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
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(52.0d, (double) (short) -1, (double) 0L, (double) 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        double[] doubleArray16 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray22 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray16, doubleArray22);
        double double24 = highamHall54Integrator23.getMinStep();
        double double25 = highamHall54Integrator23.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator23.addSwitchingFunction(switchingFunction26, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator23.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator23.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler33);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler33);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass15 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.Class<?> wildcardClass58 = highamHall54Integrator48.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(9.343446901438462d);
        highamHall54Integrator4.setSafety((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (short) 10, (double) 10L, (double) 0L);
        highamHall54Integrator4.setMinReduction(35.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        double double16 = highamHall54Integrator4.getMinReduction();
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double18 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        double double39 = highamHall54Integrator35.getCurrentStepStart();
        double double40 = highamHall54Integrator35.getMinReduction();
        double[] doubleArray46 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray52 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray46, doubleArray52);
        double double54 = highamHall54Integrator53.getMinStep();
        highamHall54Integrator53.setSafety(0.0d);
        java.lang.String str57 = highamHall54Integrator53.getName();
        double double58 = highamHall54Integrator53.getSafety();
        highamHall54Integrator53.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator53.setMaxGrowth((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler63 = highamHall54Integrator53.getStepHandler();
        highamHall54Integrator35.setStepHandler(stepHandler63);
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
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.2d + "'", double40 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Higham-Hall 5(4)" + "'", str57, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler63);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, Double.NaN, (double) '#', (double) 1.0f);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        double double46 = highamHall54Integrator41.getCurrentStepStart();
        double double47 = highamHall54Integrator41.getCurrentStepStart();
        int int48 = highamHall54Integrator41.getOrder();
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(stepHandler12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (byte) 100, 35.0d, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1L), (double) (byte) -1, (int) 'a');
        highamHall54Integrator4.setSafety((double) '4');
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) ' ');
        double double10 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 0.0d, (double) (byte) 0, (double) 1L);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        highamHall54Integrator74.setMinReduction((double) (short) 1);
        int int77 = highamHall54Integrator74.getOrder();
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 5 + "'", int77 == 5);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (byte) 100, 35.0d, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1L), (double) (byte) -1, (int) 'a');
        highamHall54Integrator4.setSafety(10.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        double double7 = highamHall54Integrator4.getMaxStep();
        double double8 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
        double double54 = highamHall54Integrator48.getCurrentSignedStepsize();
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
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator12.setMaxGrowth(0.9d);
        int int22 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        highamHall54Integrator35.addSwitchingFunction(switchingFunction38, 5.0d, (double) (short) 10, (int) (byte) 10);
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
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray21 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) ' ', doubleArray11, doubleArray21);
        double[] doubleArray34 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray40 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray34, doubleArray40);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray34, doubleArray42);
        double[] doubleArray49 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray34, doubleArray49);
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        double[] doubleArray67 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray58, doubleArray67);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 10, doubleArray49, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 0.0d, doubleArray21, doubleArray49);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[32.0]");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety((double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction17, 5.0d, (double) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, 10.0d, (double) 5, (int) '4');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (-1), (double) 1.0f, 5.0d);
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getSafety();
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 0);
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double double26 = highamHall54Integrator25.getMinStep();
        highamHall54Integrator25.setSafety(0.0d);
        java.lang.String str29 = highamHall54Integrator25.getName();
        double double30 = highamHall54Integrator25.getSafety();
        highamHall54Integrator25.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator25.setMaxGrowth(0.9d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double40 = highamHall54Integrator39.getMaxGrowth();
        java.lang.String str41 = highamHall54Integrator39.getName();
        double double42 = highamHall54Integrator39.getMaxGrowth();
        double double43 = highamHall54Integrator39.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator39.getStepHandler();
        double[] doubleArray52 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray58 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray52, doubleArray58);
        double[] doubleArray65 = new double[] { '4', 5, '4' };
        double[] doubleArray71 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray77 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray71, doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray65, doubleArray71);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray58, doubleArray71);
        org.apache.commons.math.ode.StepHandler stepHandler81 = highamHall54Integrator80.getStepHandler();
        highamHall54Integrator39.setStepHandler(stepHandler81);
        highamHall54Integrator25.setStepHandler(stepHandler81);
        highamHall54Integrator4.setStepHandler(stepHandler81);
        double double85 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Higham-Hall 5(4)" + "'", str29, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 7.211102550927978d + "'", double43 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getMaxStep();
        double double16 = highamHall54Integrator12.getCurrentStepStart();
        java.lang.String str17 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getMinStep();
        double double15 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler9);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) (short) 100, (double) (short) 1, (int) (short) 0);
        double double15 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        highamHall54Integrator4.setSafety(0.0d);
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
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        highamHall54Integrator4.setMaxGrowth((double) (short) 10);
        double double13 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.lang.Class<?> wildcardClass26 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        highamHall54Integrator4.setMaxGrowth((double) 10);
        highamHall54Integrator4.setInitialStepSize((double) 1L);
        double double20 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) 10, Double.NaN, 0.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(2.1213203435596424d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (short) 1, (double) 100, (double) 10L);
        double[] doubleArray10 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray16 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray10, doubleArray16);
        double double18 = highamHall54Integrator17.getMinStep();
        highamHall54Integrator17.setSafety(0.0d);
        java.lang.String str21 = highamHall54Integrator17.getName();
        double double22 = highamHall54Integrator17.getSafety();
        java.lang.String str23 = highamHall54Integrator17.getName();
        double[] doubleArray29 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray35 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray29, doubleArray35);
        double double37 = highamHall54Integrator36.getMinStep();
        highamHall54Integrator36.setSafety(0.0d);
        java.lang.String str40 = highamHall54Integrator36.getName();
        highamHall54Integrator36.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        highamHall54Integrator36.addSwitchingFunction(switchingFunction43, (double) 0, (double) ' ', (int) (byte) 0);
        highamHall54Integrator36.setMaxGrowth((double) (byte) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator54.setMinReduction((double) 0.0f);
        int int57 = highamHall54Integrator54.getOrder();
        double double58 = highamHall54Integrator54.getCurrentSignedStepsize();
        highamHall54Integrator54.setInitialStepSize((double) 10.0f);
        double double61 = highamHall54Integrator54.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator54.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler62);
        highamHall54Integrator17.setStepHandler(stepHandler62);
        highamHall54Integrator4.setStepHandler(stepHandler62);
        double double66 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1L, 35.0d, (int) ' ');
        highamHall54Integrator4.setMinReduction(0.2d);
        int int15 = highamHall54Integrator4.getOrder();
        double double16 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction20, 0.2d, 100.0d, (int) (byte) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction25, 0.0d, (double) 0.0f, (int) '4');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double35 = highamHall54Integrator34.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator34.getStepHandler();
        double double37 = highamHall54Integrator34.getMaxStep();
        double[] doubleArray43 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray49 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray43, doubleArray49);
        double double51 = highamHall54Integrator50.getMinStep();
        highamHall54Integrator50.setSafety(0.0d);
        java.lang.String str54 = highamHall54Integrator50.getName();
        double double55 = highamHall54Integrator50.getMaxStep();
        int int56 = highamHall54Integrator50.getOrder();
        highamHall54Integrator50.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double64 = highamHall54Integrator63.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler65 = highamHall54Integrator63.getStepHandler();
        highamHall54Integrator50.setStepHandler(stepHandler65);
        double double67 = highamHall54Integrator50.getCurrentSignedStepsize();
        double double68 = highamHall54Integrator50.getSafety();
        double double69 = highamHall54Integrator50.getCurrentStepStart();
        highamHall54Integrator50.setMinReduction((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler72 = highamHall54Integrator50.getStepHandler();
        highamHall54Integrator34.setStepHandler(stepHandler72);
        highamHall54Integrator12.setStepHandler(stepHandler72);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Higham-Hall 5(4)" + "'", str54, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler65);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(stepHandler72);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) 10, (double) (byte) 0, (int) (short) -1);
        highamHall54Integrator4.setMaxGrowth((double) '#');
        int int17 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (byte) 1, (double) (byte) 0, (double) (short) 10);
        java.lang.Class<?> wildcardClass5 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
        highamHall54Integrator25.setInitialStepSize((double) 100.0f);
        double double31 = highamHall54Integrator25.getSafety();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        highamHall54Integrator4.setMinReduction((double) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        java.lang.String str16 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 10, 9.343446901438462d, (double) 1.0f);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.String str15 = highamHall54Integrator4.getName();
        double double16 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        highamHall54Integrator12.setSafety((double) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, (double) (byte) 100, 32.0d, 10.0d);
        double double5 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        highamHall54Integrator12.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double34 = highamHall54Integrator33.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler35 = null;
        highamHall54Integrator33.setStepHandler(stepHandler35);
        int int37 = highamHall54Integrator33.getOrder();
        double[] doubleArray43 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray49 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray43, doubleArray49);
        double double51 = highamHall54Integrator50.getMinStep();
        highamHall54Integrator50.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double59 = highamHall54Integrator58.getMaxGrowth();
        double double60 = highamHall54Integrator58.getSafety();
        highamHall54Integrator58.setMaxGrowth((double) 5);
        double[] doubleArray68 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray74 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray68, doubleArray74);
        org.apache.commons.math.ode.StepHandler stepHandler76 = highamHall54Integrator75.getStepHandler();
        highamHall54Integrator58.setStepHandler(stepHandler76);
        highamHall54Integrator50.setStepHandler(stepHandler76);
        highamHall54Integrator33.setStepHandler(stepHandler76);
        highamHall54Integrator12.setStepHandler(stepHandler76);
        org.apache.commons.math.ode.StepHandler stepHandler81 = highamHall54Integrator12.getStepHandler();
        double double82 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.9d + "'", double60 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(0.9d);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        double double15 = highamHall54Integrator4.getMaxStep();
        double double16 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        int int26 = highamHall54Integrator25.getOrder();
        highamHall54Integrator25.setMaxGrowth(0.0d);
        java.lang.String str29 = highamHall54Integrator25.getName();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Higham-Hall 5(4)" + "'", str29, "Higham-Hall 5(4)");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (short) 100, (double) 1, (double) (short) -1);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        double double49 = highamHall54Integrator48.getMaxStep();
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
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray20 = new double[] { '4', 5, '4' };
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray13, doubleArray26);
        highamHall54Integrator35.setMinReduction(0.9486832980505138d);
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
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        java.lang.String str43 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Higham-Hall 5(4)" + "'", str43, "Higham-Hall 5(4)");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        double double46 = highamHall54Integrator45.getMinStep();
        double double47 = highamHall54Integrator45.getCurrentSignedStepsize();
        java.lang.String str48 = highamHall54Integrator45.getName();
        highamHall54Integrator45.setMinReduction(0.2d);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Higham-Hall 5(4)" + "'", str48, "Higham-Hall 5(4)");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray7, doubleArray15);
        java.lang.String str17 = highamHall54Integrator16.getName();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator16.setMaxGrowth(0.0d);
        double double21 = highamHall54Integrator16.getCurrentSignedStepsize();
        java.lang.String str22 = highamHall54Integrator16.getName();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        double double18 = highamHall54Integrator12.getMinStep();
        double double19 = highamHall54Integrator12.getCurrentStepStart();
        double double20 = highamHall54Integrator12.getCurrentSignedStepsize();
        java.lang.String str21 = highamHall54Integrator12.getName();
        highamHall54Integrator12.setInitialStepSize((double) (-1));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (short) 0, Double.NaN, 5.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth(0.2d);
        highamHall54Integrator4.setInitialStepSize((double) 1.0f);
        double double17 = highamHall54Integrator4.getMinStep();
        java.lang.String str18 = highamHall54Integrator4.getName();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        double double33 = highamHall54Integrator31.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        highamHall54Integrator31.addSwitchingFunction(switchingFunction34, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator31.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler41);
        highamHall54Integrator4.setMaxGrowth(0.0d);
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler41);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        double double14 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double15 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        double double46 = highamHall54Integrator45.getMaxGrowth();
        int int47 = highamHall54Integrator45.getOrder();
        double double48 = highamHall54Integrator45.getMaxStep();
        highamHall54Integrator45.setMaxGrowth((double) (-1));
        highamHall54Integrator45.setMinReduction((double) 10L);
        double double53 = highamHall54Integrator45.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        int int11 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(stepHandler12);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double[] doubleArray8 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray18, doubleArray26);
        double[] doubleArray33 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray18, doubleArray33);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray8, doubleArray33);
        highamHall54Integrator35.setMinReduction(10.0d);
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
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(35.0d, 0.0d, (double) 10L, 52.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, Double.NaN, (double) ' ', 10.0d);
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        int int10 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        double[] doubleArray48 = new double[] { 10L, 0.0d, 32.0d, (byte) 10, 9.343446901438462d, 2.23606797749979d };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (double) (-1L), doubleArray4, doubleArray48);
        double double50 = highamHall54Integrator49.getCurrentSignedStepsize();
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 0.0, 32.0, 10.0, 9.343446901438462, 2.23606797749979]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 1.0d + "'", double50 == 1.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction41, 0.0d, (double) 100L, (int) (short) 1);
        highamHall54Integrator12.setMinReduction((double) 0L);
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
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, 100.0d, (double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction41, 0.0d, 10.0d, (int) (short) 100);
        double double46 = highamHall54Integrator12.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 'a', 1.0d, (int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(9.343446901438462d);
        double double9 = highamHall54Integrator4.getMinStep();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        double double52 = highamHall54Integrator51.getMinStep();
        double double53 = highamHall54Integrator51.getMaxGrowth();
        double double54 = highamHall54Integrator51.getMinReduction();
        highamHall54Integrator51.setSafety(0.0d);
        double double57 = highamHall54Integrator51.getSafety();
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.2d + "'", double54 == 0.2d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(7.211102550927978d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxStep();
        java.lang.Class<?> wildcardClass13 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        double double85 = highamHall54Integrator84.getSafety();
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
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.9d + "'", double85 == 0.9d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 1.0d, 1.0d, Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, 0.9d, (double) (short) 10, (-1));
        double double10 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) 10);
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double double26 = highamHall54Integrator25.getMinStep();
        highamHall54Integrator25.setSafety(0.0d);
        java.lang.String str29 = highamHall54Integrator25.getName();
        double double30 = highamHall54Integrator25.getSafety();
        double double31 = highamHall54Integrator25.getMinStep();
        java.lang.String str32 = highamHall54Integrator25.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator25.addSwitchingFunction(switchingFunction33, 1.0d, 35.0d, (int) (byte) 10);
        highamHall54Integrator25.setMaxGrowth((double) 10.0f);
        highamHall54Integrator25.setMinReduction((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator25.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler42);
        double double44 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Higham-Hall 5(4)" + "'", str29, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Higham-Hall 5(4)" + "'", str32, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        highamHall54Integrator4.setSafety((double) 0L);
        highamHall54Integrator4.setSafety((double) (short) 1);
        double double18 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) (-1));
        double double21 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.211102550927978d + "'", double18 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator19.addSwitchingFunction(switchingFunction20, (double) (byte) -1, (double) '#', (int) (short) 0);
        double double25 = highamHall54Integrator19.getSafety();
        int int26 = highamHall54Integrator19.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
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
        highamHall54Integrator12.setInitialStepSize(Double.NaN);
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
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double[] doubleArray2 = null;
        double[] doubleArray10 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray16 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray10, doubleArray16);
        double[] doubleArray27 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray33 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray27, doubleArray33);
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray27, doubleArray35);
        double[] doubleArray42 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray27, doubleArray42);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray10, doubleArray42);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, (double) ' ', doubleArray2, doubleArray42);
        double double46 = highamHall54Integrator45.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
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
        double double46 = highamHall54Integrator41.getCurrentStepStart();
        double double47 = highamHall54Integrator41.getCurrentStepStart();
        double double48 = highamHall54Integrator41.getMaxGrowth();
        double double49 = highamHall54Integrator41.getSafety();
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9d + "'", double49 == 0.9d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        highamHall54Integrator4.setMinReduction(0.2d);
        java.lang.String str16 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth(2.23606797749979d);
        double double19 = highamHall54Integrator4.getMaxStep();
        int int20 = highamHall54Integrator4.getOrder();
        double double21 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray7, doubleArray15);
        highamHall54Integrator16.setMinReduction((double) 0L);
        highamHall54Integrator16.setMinReduction(22.80350850198276d);
        double double21 = highamHall54Integrator16.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        double double11 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety(7.211102550927978d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) 0.0f, 0.2d, (int) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double13 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction((double) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        highamHall54Integrator4.setSafety(0.9d);
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getMinReduction();
        int int9 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.2d, 0.0d, 22.80350850198276d, (double) (byte) 10);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator9.setMinReduction((double) 0.0f);
        int int12 = highamHall54Integrator9.getOrder();
        double double13 = highamHall54Integrator9.getCurrentSignedStepsize();
        highamHall54Integrator9.setInitialStepSize((double) 10.0f);
        double double16 = highamHall54Integrator9.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
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
        double double74 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety((double) 0.0f);
        highamHall54Integrator4.setSafety((double) (-1));
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
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.2d + "'", double74 == 0.2d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, 2.1213203435596424d, 1.0d, 10);
        double[] doubleArray25 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray31 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray25, doubleArray31);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray25, doubleArray33);
        double[] doubleArray40 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray25, doubleArray40);
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        double[] doubleArray62 = new double[] { '4', 5, '4' };
        double[] doubleArray68 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray74 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray68, doubleArray74);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray62, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray55, doubleArray68);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray25, doubleArray55);
        double[] doubleArray86 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray92 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray86, doubleArray92);
        double[] doubleArray95 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator96 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray86, doubleArray95);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator97 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, 0.9d, doubleArray25, doubleArray86);
        org.apache.commons.math.ode.StepHandler stepHandler98 = highamHall54Integrator97.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler98);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[32.0]");
        org.junit.Assert.assertNotNull(stepHandler98);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.2d, (double) ' ', 0.9486832980505138d, 0.9486832980505138d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) ' ', (double) ' ', (double) 100);
        highamHall54Integrator4.setMinReduction((double) (short) 1);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, 9.343446901438462d, (double) (byte) -1, Double.NaN);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        java.lang.String str11 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(7.211102550927978d);
        double double14 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, (double) (byte) 0, (double) (-1L), 10);
        double double20 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction39, (double) (byte) 10, 0.0d, (int) (byte) -1);
        double double44 = highamHall54Integrator4.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        org.apache.commons.math.ode.StepHandler stepHandler96 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety(7.211102550927978d);
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
        org.junit.Assert.assertNotNull(stepHandler96);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray20 = new double[] { '4', 5, '4' };
        double[] doubleArray26 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray32 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray26, doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray20, doubleArray26);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray13, doubleArray26);
        double double36 = highamHall54Integrator35.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        highamHall54Integrator35.addSwitchingFunction(switchingFunction37, (double) (-1.0f), 35.0d, (int) (byte) 0);
        double double42 = highamHall54Integrator35.getMinStep();
        highamHall54Integrator35.setSafety((double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.9d + "'", double36 == 0.9d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double18 = highamHall54Integrator17.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler19);
        double double21 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9d + "'", double21 == 0.9d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        int int7 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double13 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        highamHall54Integrator4.setMaxGrowth((double) (-1.0f));
        double[] doubleArray23 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray29 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray23, doubleArray29);
        double double31 = highamHall54Integrator30.getMinStep();
        double double32 = highamHall54Integrator30.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator30.addSwitchingFunction(switchingFunction33, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator30.setSafety(0.2d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        highamHall54Integrator30.addSwitchingFunction(switchingFunction40, (double) (short) -1, 5.0d, (int) (byte) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double50 = highamHall54Integrator49.getMaxGrowth();
        java.lang.String str51 = highamHall54Integrator49.getName();
        double double52 = highamHall54Integrator49.getSafety();
        int int53 = highamHall54Integrator49.getOrder();
        double double54 = highamHall54Integrator49.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double60 = highamHall54Integrator59.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler61 = null;
        highamHall54Integrator59.setStepHandler(stepHandler61);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        highamHall54Integrator59.addSwitchingFunction(switchingFunction63, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double73 = highamHall54Integrator72.getMaxGrowth();
        double double74 = highamHall54Integrator72.getSafety();
        highamHall54Integrator72.setMaxGrowth((double) 5);
        double[] doubleArray82 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray88 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator89 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray82, doubleArray88);
        org.apache.commons.math.ode.StepHandler stepHandler90 = highamHall54Integrator89.getStepHandler();
        highamHall54Integrator72.setStepHandler(stepHandler90);
        highamHall54Integrator59.setStepHandler(stepHandler90);
        highamHall54Integrator49.setStepHandler(stepHandler90);
        highamHall54Integrator30.setStepHandler(stepHandler90);
        highamHall54Integrator4.setStepHandler(stepHandler90);
        java.lang.String str96 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Higham-Hall 5(4)" + "'", str51, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.9d + "'", double52 == 0.9d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.9d + "'", double74 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler90);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Higham-Hall 5(4)" + "'", str96, "Higham-Hall 5(4)");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        org.apache.commons.math.ode.StepHandler stepHandler87 = highamHall54Integrator84.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler87);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setInitialStepSize((double) (byte) 0);
        highamHall54Integrator4.setMinReduction((double) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) (short) -1, (double) (short) 10, Double.NaN);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double11 = highamHall54Integrator10.getCurrentStepStart();
        double double12 = highamHall54Integrator10.getCurrentSignedStepsize();
        double double13 = highamHall54Integrator10.getSafety();
        double double14 = highamHall54Integrator10.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getMaxStep();
        double[] doubleArray15 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray21 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray15, doubleArray21);
        double double23 = highamHall54Integrator22.getMinStep();
        highamHall54Integrator22.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double31 = highamHall54Integrator30.getMaxGrowth();
        double double32 = highamHall54Integrator30.getSafety();
        highamHall54Integrator30.setMaxGrowth((double) 5);
        double[] doubleArray40 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray46 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray40, doubleArray46);
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator47.getStepHandler();
        highamHall54Integrator30.setStepHandler(stepHandler48);
        highamHall54Integrator22.setStepHandler(stepHandler48);
        highamHall54Integrator22.setInitialStepSize((double) (byte) 1);
        double double53 = highamHall54Integrator22.getCurrentSignedStepsize();
        double[] doubleArray59 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray65 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray59, doubleArray65);
        double double67 = highamHall54Integrator66.getMinStep();
        highamHall54Integrator66.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double75 = highamHall54Integrator74.getMaxGrowth();
        double double76 = highamHall54Integrator74.getSafety();
        highamHall54Integrator74.setMaxGrowth((double) 5);
        double[] doubleArray84 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray90 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator91 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray84, doubleArray90);
        org.apache.commons.math.ode.StepHandler stepHandler92 = highamHall54Integrator91.getStepHandler();
        highamHall54Integrator74.setStepHandler(stepHandler92);
        highamHall54Integrator66.setStepHandler(stepHandler92);
        highamHall54Integrator22.setStepHandler(stepHandler92);
        highamHall54Integrator4.setStepHandler(stepHandler92);
        double double97 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double98 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.9d + "'", double32 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9d + "'", double76 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler92);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.9d + "'", double98 == 0.9d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety((-1.0d));
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int12 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.211102550927978d + "'", double11 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9d + "'", double58 == 0.9d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray7, doubleArray15);
        java.lang.String str17 = highamHall54Integrator16.getName();
        double double18 = highamHall54Integrator16.getMaxGrowth();
        highamHall54Integrator16.setInitialStepSize(0.9d);
        highamHall54Integrator16.setInitialStepSize(0.9d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        double double24 = highamHall54Integrator4.getCurrentStepStart();
        double double25 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.9d + "'", double19 == 0.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getMinStep();
        double[] doubleArray17 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray23 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray17, doubleArray23);
        double[] doubleArray33 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray43 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray49 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray43, doubleArray49);
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray43, doubleArray51);
        double[] doubleArray58 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray43, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray33, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray17, doubleArray58);
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator61.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler62);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction64, (double) (short) -1, 97.0d, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler62);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        highamHall54Integrator41.setInitialStepSize((double) 100);
        double double47 = highamHall54Integrator41.getSafety();
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9d + "'", double47 == 0.9d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator12.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler30);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(35.0d, (double) '#', (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        double double63 = highamHall54Integrator12.getMaxGrowth();
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 7.211102550927978d + "'", double63 == 7.211102550927978d);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        highamHall54Integrator12.setSafety((double) 10.0f);
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
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 0L);
        highamHall54Integrator4.setInitialStepSize((double) 100L);
        double double15 = highamHall54Integrator4.getSafety();
        double double16 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) (-1));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double15 = highamHall54Integrator14.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator14.setStepHandler(stepHandler16);
        double double18 = highamHall54Integrator14.getMaxGrowth();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        highamHall54Integrator31.setSafety(0.0d);
        java.lang.String str35 = highamHall54Integrator31.getName();
        double double36 = highamHall54Integrator31.getSafety();
        double double37 = highamHall54Integrator31.getMinStep();
        java.lang.String str38 = highamHall54Integrator31.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        highamHall54Integrator31.addSwitchingFunction(switchingFunction39, 1.0d, 35.0d, (int) (byte) 10);
        highamHall54Integrator31.setMaxGrowth((double) 10.0f);
        highamHall54Integrator31.setMinReduction((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator14.setStepHandler(stepHandler48);
        highamHall54Integrator4.setStepHandler(stepHandler48);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Higham-Hall 5(4)" + "'", str38, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler48);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        java.lang.String str18 = highamHall54Integrator12.getName();
        double double19 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        double double11 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double15 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        int int13 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double[] doubleArray7 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray13 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray7, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray7, doubleArray15);
        java.lang.String str17 = highamHall54Integrator16.getName();
        highamHall54Integrator16.setMinReduction(100.0d);
        java.lang.String str20 = highamHall54Integrator16.getName();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
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
        double[] doubleArray79 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray85 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator86 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray79, doubleArray85);
        double double87 = highamHall54Integrator86.getMinStep();
        highamHall54Integrator86.setSafety(0.0d);
        java.lang.String str90 = highamHall54Integrator86.getName();
        double double91 = highamHall54Integrator86.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler92 = highamHall54Integrator86.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler92);
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
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Higham-Hall 5(4)" + "'", str90, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler92);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        double double60 = highamHall54Integrator48.getSafety();
        double double61 = highamHall54Integrator48.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.9d + "'", double60 == 0.9d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, 0.0d, (double) 10L, (double) 'a');
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        double double7 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        java.lang.String str19 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.2d, (double) ' ', (double) ' ', (double) 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        highamHall54Integrator74.setMinReduction((double) (short) 1);
        double double77 = highamHall54Integrator74.getMaxStep();
        int int78 = highamHall54Integrator74.getOrder();
        double double79 = highamHall54Integrator74.getCurrentStepStart();
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
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 5.0d + "'", double77 == 5.0d);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, 7.211102550927978d, (double) (short) 0, (double) '#');
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100L, 0.0d, (int) '4');
        highamHall54Integrator4.setMinReduction(0.9d);
        double double15 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getMaxStep();
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        java.lang.String str7 = highamHall54Integrator4.getName();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, Double.NaN, (double) '#', (double) 1.0f);
        double double18 = highamHall54Integrator17.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler19);
        java.lang.Class<?> wildcardClass21 = stepHandler19.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        highamHall54Integrator4.setSafety(2.23606797749979d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1L, (double) 0, (double) (byte) 0);
        double[] doubleArray25 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray31 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray25, doubleArray31);
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator32.setMinReduction((double) (byte) 100);
        double double36 = highamHall54Integrator32.getMaxGrowth();
        highamHall54Integrator32.setSafety(5.0d);
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator19.setStepHandler(stepHandler39);
        highamHall54Integrator4.setStepHandler(stepHandler39);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler39);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, 0.9486832980505138d, (double) (-1L), (int) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        double double11 = highamHall54Integrator4.getMinReduction();
        double double12 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
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
        java.lang.String str48 = highamHall54Integrator4.getName();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Higham-Hall 5(4)" + "'", str48, "Higham-Hall 5(4)");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (short) 0, 2.23606797749979d, 0.9486832980505138d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 1, 10.0d, (int) (short) 0);
        double double12 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray20 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray11, doubleArray20);
        double[] doubleArray29 = new double[] { '4', 5, '4' };
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray29, doubleArray35);
        double[] doubleArray51 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray57 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray51, doubleArray57);
        double[] doubleArray64 = new double[] { '4', 5, '4' };
        double[] doubleArray70 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray76 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray70, doubleArray76);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray64, doubleArray70);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray57, doubleArray70);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 100L, doubleArray29, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray20, doubleArray57);
        double[] doubleArray82 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator(0.2d, 5.0d, doubleArray20, doubleArray82);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double[] doubleArray12 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray22, doubleArray30);
        double[] doubleArray37 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray22, doubleArray37);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray12, doubleArray37);
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray49, doubleArray57);
        double[] doubleArray64 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray49, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1, doubleArray37, doubleArray49);
        double[] doubleArray69 = null;
        double[] doubleArray77 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray83 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray77, doubleArray83);
        double[] doubleArray86 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray77, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator88 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (byte) 100, doubleArray69, doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator89 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), 0.0d, doubleArray49, doubleArray77);
        highamHall54Integrator89.setSafety((double) (short) 10);
        double double92 = highamHall54Integrator89.getMaxGrowth();
        highamHall54Integrator89.setSafety((double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[32.0]");
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 10.0d + "'", double92 == 10.0d);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        double double20 = highamHall54Integrator19.getCurrentSignedStepsize();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations21 = null;
        double[] doubleArray23 = null;
        double[] doubleArray32 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray38 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray32, doubleArray38);
        double[] doubleArray45 = new double[] { '4', 5, '4' };
        double[] doubleArray51 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray57 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray51, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray45, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray38, doubleArray51);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator19.integrate(firstOrderDifferentialEquations21, 0.9486832980505138d, doubleArray23, (double) (byte) 1, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        double double29 = highamHall54Integrator19.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        highamHall54Integrator19.addSwitchingFunction(switchingFunction30, 2.23606797749979d, (double) 100L, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth(97.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        double[] doubleArray31 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray37 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray31, doubleArray37);
        double double39 = highamHall54Integrator38.getMinStep();
        double double40 = highamHall54Integrator38.getMinStep();
        double double41 = highamHall54Integrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator38.getStepHandler();
        highamHall54Integrator25.setStepHandler(stepHandler42);
        highamHall54Integrator12.setStepHandler(stepHandler42);
        java.lang.String str45 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Higham-Hall 5(4)" + "'", str45, "Higham-Hall 5(4)");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double[] doubleArray10 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray10, doubleArray35);
        double[] doubleArray47 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray53 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray47, doubleArray53);
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray47, doubleArray55);
        double[] doubleArray62 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray47, doubleArray62);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1, doubleArray35, doubleArray47);
        highamHall54Integrator64.setMinReduction((double) 1);
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
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 0);
        double double16 = highamHall54Integrator4.getSafety();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        double double18 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction(31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) 100);
        double[] doubleArray24 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray34 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray40 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray34, doubleArray40);
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray34, doubleArray42);
        double[] doubleArray49 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray34, doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray24, doubleArray49);
        double[] doubleArray61 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray67 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray61, doubleArray67);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray61, doubleArray69);
        double[] doubleArray76 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray61, doubleArray76);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1, doubleArray49, doubleArray61);
        org.apache.commons.math.ode.StepHandler stepHandler79 = highamHall54Integrator78.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler79);
        int int81 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        highamHall54Integrator12.setSafety((double) (byte) -1);
        double double27 = highamHall54Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator19.addSwitchingFunction(switchingFunction20, (-1.0d), 0.0d, 5);
        double double25 = highamHall54Integrator19.getCurrentStepStart();
        int int26 = highamHall54Integrator19.getOrder();
        double double27 = highamHall54Integrator19.getCurrentSignedStepsize();
        double double28 = highamHall54Integrator19.getMinStep();
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
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, Double.NaN, (double) '#', Double.NaN);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (short) 10, 0.9486832980505138d, (int) (byte) 1);
        highamHall54Integrator4.setSafety((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, (double) 10L, 7.211102550927978d, (double) 10.0f);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double22 = highamHall54Integrator21.getMaxGrowth();
        java.lang.String str23 = highamHall54Integrator21.getName();
        double double24 = highamHall54Integrator21.getSafety();
        int int25 = highamHall54Integrator21.getOrder();
        double double26 = highamHall54Integrator21.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double32 = highamHall54Integrator31.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator31.setStepHandler(stepHandler33);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        highamHall54Integrator31.addSwitchingFunction(switchingFunction35, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double45 = highamHall54Integrator44.getMaxGrowth();
        double double46 = highamHall54Integrator44.getSafety();
        highamHall54Integrator44.setMaxGrowth((double) 5);
        double[] doubleArray54 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray60 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray54, doubleArray60);
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator61.getStepHandler();
        highamHall54Integrator44.setStepHandler(stepHandler62);
        highamHall54Integrator31.setStepHandler(stepHandler62);
        highamHall54Integrator21.setStepHandler(stepHandler62);
        highamHall54Integrator12.setStepHandler(stepHandler62);
        java.lang.String str67 = highamHall54Integrator12.getName();
        java.lang.String str68 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Higham-Hall 5(4)" + "'", str67, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Higham-Hall 5(4)" + "'", str68, "Higham-Hall 5(4)");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        java.lang.String str18 = highamHall54Integrator12.getName();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        highamHall54Integrator31.setSafety(0.0d);
        java.lang.String str35 = highamHall54Integrator31.getName();
        highamHall54Integrator31.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        highamHall54Integrator31.addSwitchingFunction(switchingFunction38, (double) 0, (double) ' ', (int) (byte) 0);
        highamHall54Integrator31.setMaxGrowth((double) (byte) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator49.setMinReduction((double) 0.0f);
        int int52 = highamHall54Integrator49.getOrder();
        double double53 = highamHall54Integrator49.getCurrentSignedStepsize();
        highamHall54Integrator49.setInitialStepSize((double) 10.0f);
        double double56 = highamHall54Integrator49.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler57 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator31.setStepHandler(stepHandler57);
        highamHall54Integrator12.setStepHandler(stepHandler57);
        double double60 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (-1), 9.343446901438462d, (double) (-1.0f));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(Double.NaN);
        java.lang.String str12 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler13);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(7.211102550927978d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (byte) -1, (double) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety(97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        int int8 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 1.0d, 7.211102550927978d, (double) (short) 10);
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(10.0d);
        int int16 = highamHall54Integrator4.getOrder();
        double double17 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        org.apache.commons.math.ode.StepHandler stepHandler57 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety((double) (-1L));
        double double60 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction61, 100.0d, (double) (byte) -1, 5);
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
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (byte) 0, 7.211102550927978d, (double) (-1));
        double double5 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (short) 10, 97.0d, (double) 0.0f);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, 2.23606797749979d, (double) 1L, 100.0d);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) '4', 32.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        highamHall54Integrator4.setSafety((double) 5);
        double double15 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction41, 0.0d, 10.0d, (int) (short) 100);
        double double46 = highamHall54Integrator12.getCurrentStepStart();
        java.lang.String str47 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        double double29 = highamHall54Integrator25.getMaxGrowth();
        double double30 = highamHall54Integrator25.getSafety();
        highamHall54Integrator25.setInitialStepSize((double) (short) 0);
        double double33 = highamHall54Integrator25.getCurrentSignedStepsize();
        double double34 = highamHall54Integrator25.getMaxStep();
        double double35 = highamHall54Integrator25.getCurrentStepStart();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 22.80350850198276d + "'", double33 == 22.80350850198276d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 100, (double) (short) 1, 1);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator12.setMaxGrowth(0.9d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction22, (-1.0d), (double) 1L, (int) (byte) -1);
        java.lang.String str27 = highamHall54Integrator12.getName();
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double[] doubleArray52 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray58 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray52, doubleArray58);
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray52, doubleArray60);
        double[] doubleArray67 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray52, doubleArray67);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 2.23606797749979d, doubleArray35, doubleArray52);
        highamHall54Integrator69.setSafety((double) (short) 0);
        double double72 = highamHall54Integrator69.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler73 = highamHall54Integrator69.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler73);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler73);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) 1L, 52.0d, 0);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        double double31 = highamHall54Integrator12.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction32, (double) '4', 0.0d, (int) (short) 100);
        double double37 = highamHall54Integrator12.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setSafety((double) 100.0f);
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxStep();
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler15);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 0L);
        highamHall54Integrator4.setInitialStepSize((double) 100L);
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double17 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        double double59 = highamHall54Integrator48.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(9.343446901438462d, (double) (-1), (double) 10.0f, (double) 100.0f);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) 1, 0.0d, 32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, 14.727477510336914d, (int) (byte) 100);
        int int11 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray24 = new double[] { '4', 5, '4' };
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray24, doubleArray30);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray17, doubleArray30);
        double[] doubleArray47 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray53 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray47, doubleArray53);
        double[] doubleArray63 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray73 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray79 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray73, doubleArray79);
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator82 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray73, doubleArray81);
        double[] doubleArray88 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator89 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray73, doubleArray88);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray63, doubleArray88);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator91 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray47, doubleArray88);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator92 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 0L, doubleArray30, doubleArray47);
        double[] doubleArray93 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) 1, doubleArray47, doubleArray93);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(0.9d);
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        double double26 = highamHall54Integrator25.getMinStep();
        double double27 = highamHall54Integrator25.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        highamHall54Integrator25.addSwitchingFunction(switchingFunction28, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator25.addSwitchingFunction(switchingFunction33, 0.2d, 100.0d, (int) (byte) 10);
        double double38 = highamHall54Integrator25.getCurrentStepStart();
        double double39 = highamHall54Integrator25.getCurrentStepStart();
        highamHall54Integrator25.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double47 = highamHall54Integrator46.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler48 = null;
        highamHall54Integrator46.setStepHandler(stepHandler48);
        int int50 = highamHall54Integrator46.getOrder();
        double[] doubleArray56 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray62 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray56, doubleArray62);
        double double64 = highamHall54Integrator63.getMinStep();
        highamHall54Integrator63.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double72 = highamHall54Integrator71.getMaxGrowth();
        double double73 = highamHall54Integrator71.getSafety();
        highamHall54Integrator71.setMaxGrowth((double) 5);
        double[] doubleArray81 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray87 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator88 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray81, doubleArray87);
        org.apache.commons.math.ode.StepHandler stepHandler89 = highamHall54Integrator88.getStepHandler();
        highamHall54Integrator71.setStepHandler(stepHandler89);
        highamHall54Integrator63.setStepHandler(stepHandler89);
        highamHall54Integrator46.setStepHandler(stepHandler89);
        highamHall54Integrator25.setStepHandler(stepHandler89);
        highamHall54Integrator4.setStepHandler(stepHandler89);
        double double95 = highamHall54Integrator4.getMaxStep();
        double double96 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 10.0d + "'", double72 == 10.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.9d + "'", double73 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler89);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 35.0d + "'", double95 == 35.0d);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 35.0d + "'", double96 == 35.0d);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 10.0f, 0.0d, 5);
        highamHall54Integrator4.setMaxGrowth(0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
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
        java.lang.String str49 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) ' ');
        double double52 = highamHall54Integrator4.getMaxGrowth();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Higham-Hall 5(4)" + "'", str49, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double21 = highamHall54Integrator20.getMaxGrowth();
        java.lang.String str22 = highamHall54Integrator20.getName();
        double double23 = highamHall54Integrator20.getSafety();
        int int24 = highamHall54Integrator20.getOrder();
        double double25 = highamHall54Integrator20.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double31 = highamHall54Integrator30.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator30.setStepHandler(stepHandler32);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        highamHall54Integrator30.addSwitchingFunction(switchingFunction34, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double44 = highamHall54Integrator43.getMaxGrowth();
        double double45 = highamHall54Integrator43.getSafety();
        highamHall54Integrator43.setMaxGrowth((double) 5);
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator60.getStepHandler();
        highamHall54Integrator43.setStepHandler(stepHandler61);
        highamHall54Integrator30.setStepHandler(stepHandler61);
        highamHall54Integrator20.setStepHandler(stepHandler61);
        highamHall54Integrator4.setStepHandler(stepHandler61);
        double double66 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double67 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.9d + "'", double45 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        highamHall54Integrator41.addSwitchingFunction(switchingFunction47, (double) 10.0f, (double) (-1.0f), (int) (byte) 100);
        java.lang.String str52 = highamHall54Integrator41.getName();
        double double53 = highamHall54Integrator41.getSafety();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Higham-Hall 5(4)" + "'", str52, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.9d + "'", double53 == 0.9d);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(35.0d, 7.211102550927978d, (double) ' ', 10.0d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), 16.1245154965971d, 0.9d, 2.1213203435596424d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        double double26 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction27, (double) (short) 10, 16.1245154965971d, (-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double37 = highamHall54Integrator36.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler38 = null;
        highamHall54Integrator36.setStepHandler(stepHandler38);
        int int40 = highamHall54Integrator36.getOrder();
        double double41 = highamHall54Integrator36.getMaxStep();
        int int42 = highamHall54Integrator36.getOrder();
        double double43 = highamHall54Integrator36.getMaxStep();
        highamHall54Integrator36.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator36.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double52 = highamHall54Integrator51.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator51.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler53);
        highamHall54Integrator4.setStepHandler(stepHandler53);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (short) 100, (double) 1.0f, 100);
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
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
        double double27 = highamHall54Integrator12.getMinReduction();
        double double28 = highamHall54Integrator12.getMinStep();
        double double29 = highamHall54Integrator12.getMaxGrowth();
        double double30 = highamHall54Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2d + "'", double27 == 0.2d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        double[] doubleArray59 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray65 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray59, doubleArray65);
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray59, doubleArray67);
        double[] doubleArray74 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray59, doubleArray74);
        double[] doubleArray83 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray89 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray83, doubleArray89);
        double[] doubleArray92 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray83, doubleArray92);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 10, doubleArray74, doubleArray83);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator95 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9486832980505138d, 0.2d, doubleArray19, doubleArray83);
        highamHall54Integrator95.setInitialStepSize((double) (byte) 10);
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
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[32.0]");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        double double24 = highamHall54Integrator12.getCurrentStepStart();
        int int25 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double[] doubleArray12 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray22 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray28 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray22, doubleArray28);
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray22, doubleArray30);
        double[] doubleArray37 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray22, doubleArray37);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray12, doubleArray37);
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray49, doubleArray57);
        double[] doubleArray64 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray49, doubleArray64);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 1, doubleArray37, doubleArray49);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray80 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray74, doubleArray80);
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray74, doubleArray82);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, 0.0d, doubleArray37, doubleArray74);
        java.lang.String str85 = highamHall54Integrator84.getName();
        double double86 = highamHall54Integrator84.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Higham-Hall 5(4)" + "'", str85, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.2d + "'", double86 == 0.2d);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, (double) (-1L), (double) (-1), (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        double double44 = highamHall54Integrator41.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        highamHall54Integrator41.addSwitchingFunction(switchingFunction45, 0.2d, (double) 10, 5);
        double double50 = highamHall54Integrator41.getCurrentStepStart();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9d + "'", double44 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        highamHall54Integrator4.setMaxGrowth((double) (-1L));
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
        double double45 = highamHall54Integrator12.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 1.0f);
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(14.727477510336914d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (byte) 100, 35.0d, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1L), (double) (byte) -1, (int) 'a');
        highamHall54Integrator4.setMaxGrowth(0.0d);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        highamHall54Integrator4.setMinReduction(0.9d);
        double double21 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
        double double39 = highamHall54Integrator35.getMaxGrowth();
        highamHall54Integrator35.setMaxGrowth((double) 100L);
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
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double13 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) (short) 100);
        double double16 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        java.lang.String str55 = highamHall54Integrator51.getName();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Higham-Hall 5(4)" + "'", str55, "Higham-Hall 5(4)");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double15 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) (short) -1, 0.0d, 10);
        java.lang.String str21 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize(10.0d);
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double20 = highamHall54Integrator19.getMinReduction();
        double double21 = highamHall54Integrator19.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator4.getMaxStep();
        java.lang.String str25 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        double double75 = highamHall54Integrator74.getMinReduction();
        java.lang.String str76 = highamHall54Integrator74.getName();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.2d + "'", double75 == 0.2d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Higham-Hall 5(4)" + "'", str76, "Higham-Hall 5(4)");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
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
        highamHall54Integrator41.setMinReduction((double) 10L);
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
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) (-1));
        double double10 = highamHall54Integrator4.getSafety();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(0.0d);
        highamHall54Integrator4.setMinReduction((double) 100L);
        highamHall54Integrator4.setSafety(0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        highamHall54Integrator12.setMinReduction((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler31);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations7 = null;
        double[] doubleArray16 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray22 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray16, doubleArray22);
        double[] doubleArray32 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray42 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray48 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray42, doubleArray48);
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray42, doubleArray50);
        double[] doubleArray57 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray42, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray32, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, 5.0d, doubleArray16, doubleArray57);
        double[] doubleArray69 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray75 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray69, doubleArray75);
        double[] doubleArray82 = new double[] { '4', 5, '4' };
        double[] doubleArray88 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray94 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator95 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray88, doubleArray94);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator96 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray82, doubleArray88);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator97 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray75, doubleArray88);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations7, 0.0d, doubleArray16, (double) (byte) 10, doubleArray88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray94), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        double double46 = highamHall54Integrator45.getMinStep();
        double double47 = highamHall54Integrator45.getCurrentSignedStepsize();
        java.lang.String str48 = highamHall54Integrator45.getName();
        java.lang.Class<?> wildcardClass49 = highamHall54Integrator45.getClass();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Higham-Hall 5(4)" + "'", str48, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        highamHall54Integrator4.setMinReduction(0.9d);
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double10 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations11 = null;
        double[] doubleArray13 = null;
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations11, (double) 10L, doubleArray13, 5.0d, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 1L, 7.211102550927978d, (double) 'a');
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9486832980505138d + "'", double5 == 0.9486832980505138d);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
        highamHall54Integrator4.setSafety((double) 100.0f);
        double double16 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, 32.0d, 10.0d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        java.lang.String str47 = highamHall54Integrator41.getName();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, Double.NaN, (double) '#', (double) 1.0f);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction((double) 1L);
        java.lang.Class<?> wildcardClass8 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, Double.NaN, (double) 1L, 0.2d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (double) 'a', 32.0d, (double) 0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, 52.0d, 2.23606797749979d, (int) '#');
        double double16 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        highamHall54Integrator4.setMinReduction((double) '4');
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        double double25 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 7.211102550927978d + "'", double25 == 7.211102550927978d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
        highamHall54Integrator12.setSafety((double) (-1.0f));
        highamHall54Integrator12.setSafety((double) 100);
        highamHall54Integrator12.setMinReduction(52.0d);
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
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMaxGrowth((double) 100L);
        highamHall54Integrator12.setInitialStepSize(9.343446901438462d);
        double double21 = highamHall54Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
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
        double double46 = highamHall54Integrator45.getMaxGrowth();
        int int47 = highamHall54Integrator45.getOrder();
        double double48 = highamHall54Integrator45.getMaxStep();
        double double49 = highamHall54Integrator45.getCurrentSignedStepsize();
        highamHall54Integrator45.setInitialStepSize((double) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        double double49 = highamHall54Integrator4.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }
}

