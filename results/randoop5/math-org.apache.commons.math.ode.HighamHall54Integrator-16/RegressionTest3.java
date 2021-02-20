import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, (double) 10, (double) 0, (double) (short) 0);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        int int7 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, 0.0d, (double) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 5, 2.1213203435596424d, 14.727477510336914d);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(5.0d);
        int int10 = highamHall54Integrator4.getOrder();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 10.0d, (double) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        highamHall54Integrator4.setMinReduction((double) '4');
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setSafety(0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) 0, (-1));
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, 100.0d, (double) 100L, 1);
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) '#');
        java.lang.String str10 = highamHall54Integrator4.getName();
        java.lang.Class<?> wildcardClass11 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass8 = stepHandler7.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        double double13 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(22.80350850198276d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 1.0f, 35.0d, (double) (-1L));
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize(52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 0.0d, 0.0d, (double) (short) 1);
        double double5 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, 97.0d, (double) 10.0f, (double) (-1L));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(Double.NaN, 0.0d, 2.1213203435596424d, (double) '#');
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) ' ', (double) ' ', (double) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, Double.NaN, 0.0d, (int) ' ');
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        double double16 = highamHall54Integrator12.getSafety();
        double double17 = highamHall54Integrator12.getCurrentSignedStepsize();
        java.lang.String str18 = highamHall54Integrator12.getName();
        double double19 = highamHall54Integrator12.getSafety();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        double double13 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        double double69 = highamHall54Integrator68.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setSafety((double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction19, (double) (byte) 100, (double) (short) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, 35.0d, 1.0d, 0);
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        double double26 = highamHall54Integrator4.getMaxGrowth();
        double double27 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 5.0d + "'", double26 == 5.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.0d + "'", double27 == 5.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) 100);
        highamHall54Integrator4.setSafety((double) 0L);
        java.lang.String str16 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) 0L);
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        highamHall54Integrator4.setMinReduction((double) (-1));
        double double9 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        highamHall54Integrator12.setSafety((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        highamHall54Integrator4.setMinReduction((double) (byte) 10);
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        double double16 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double17 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety((double) 1);
        highamHall54Integrator4.setMaxGrowth((double) 10.0f);
        double[] doubleArray27 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray33 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray27, doubleArray33);
        double double35 = highamHall54Integrator34.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        highamHall54Integrator34.addSwitchingFunction(switchingFunction36, (-1.0d), (double) (short) -1, (int) (short) 10);
        double double41 = highamHall54Integrator34.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator34.getStepHandler();
        double double43 = highamHall54Integrator34.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double49 = highamHall54Integrator48.getMaxGrowth();
        double double50 = highamHall54Integrator48.getSafety();
        highamHall54Integrator48.setMaxGrowth((double) 5);
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator65.getStepHandler();
        highamHall54Integrator48.setStepHandler(stepHandler66);
        double double68 = highamHall54Integrator48.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler69 = highamHall54Integrator48.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator48.getStepHandler();
        highamHall54Integrator34.setStepHandler(stepHandler70);
        highamHall54Integrator4.setStepHandler(stepHandler70);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.9d + "'", double50 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.2d + "'", double68 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertNotNull(stepHandler70);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        highamHall54Integrator4.setMinReduction(10.0d);
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
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        double double50 = highamHall54Integrator4.getMaxGrowth();
        int int51 = highamHall54Integrator4.getOrder();
        int int52 = highamHall54Integrator4.getOrder();
        int int53 = highamHall54Integrator4.getOrder();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        highamHall54Integrator4.setInitialStepSize(5.0d);
        double double19 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction20, (double) (short) 100, (double) '#', 10);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) (short) -1);
        int int10 = highamHall54Integrator4.getOrder();
        int int11 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double17 = highamHall54Integrator16.getMaxGrowth();
        java.lang.String str18 = highamHall54Integrator16.getName();
        double double19 = highamHall54Integrator16.getMaxGrowth();
        double double20 = highamHall54Integrator16.getCurrentSignedStepsize();
        highamHall54Integrator16.setMaxGrowth(0.0d);
        double double23 = highamHall54Integrator16.getCurrentStepStart();
        highamHall54Integrator16.setInitialStepSize(10.0d);
        double double26 = highamHall54Integrator16.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double32 = highamHall54Integrator31.getMinReduction();
        double double33 = highamHall54Integrator31.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler34);
        highamHall54Integrator4.setStepHandler(stepHandler34);
        java.lang.Class<?> wildcardClass37 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 7.211102550927978d + "'", double20 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        double double16 = highamHall54Integrator12.getSafety();
        double double17 = highamHall54Integrator12.getCurrentSignedStepsize();
        double double18 = highamHall54Integrator12.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 100, (double) (short) 1, 1);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        java.lang.Class<?> wildcardClass13 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMinStep();
        double[] doubleArray23 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray29 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray23, doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray23, doubleArray31);
        double[] doubleArray38 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray23, doubleArray38);
        java.lang.String str40 = highamHall54Integrator39.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double46 = highamHall54Integrator45.getMaxGrowth();
        java.lang.String str47 = highamHall54Integrator45.getName();
        double double48 = highamHall54Integrator45.getSafety();
        int int49 = highamHall54Integrator45.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator39.setStepHandler(stepHandler50);
        highamHall54Integrator4.setStepHandler(stepHandler50);
        double double53 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.9d + "'", double48 == 0.9d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 7.211102550927978d + "'", double53 == 7.211102550927978d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        double double18 = highamHall54Integrator12.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double24 = highamHall54Integrator23.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator23.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator23.addSwitchingFunction(switchingFunction26, (double) 1, 10.0d, (int) (short) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double36 = highamHall54Integrator35.getCurrentStepStart();
        double double37 = highamHall54Integrator35.getCurrentStepStart();
        double double38 = highamHall54Integrator35.getSafety();
        double double39 = highamHall54Integrator35.getMaxStep();
        double double40 = highamHall54Integrator35.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler41);
        highamHall54Integrator12.setStepHandler(stepHandler41);
        double double44 = highamHall54Integrator12.getSafety();
        java.lang.Class<?> wildcardClass45 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(10.0d);
        int int16 = highamHall54Integrator4.getOrder();
        int int17 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1L, 35.0d, (int) ' ');
        double double13 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) (short) 1, (double) (-1L), (int) (short) 100);
        highamHall54Integrator4.setInitialStepSize(35.0d);
        double double21 = highamHall54Integrator4.getMinReduction();
        java.lang.Class<?> wildcardClass22 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) (-1L), (double) (short) -1, (int) (short) 10);
        double double17 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 52.0d + "'", double17 == 52.0d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray21, doubleArray29);
        double[] doubleArray36 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray21, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray11, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray2, doubleArray36);
        highamHall54Integrator39.setMinReduction(5.0d);
        highamHall54Integrator39.setMinReduction((-1.0d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, (double) 'a', 0.0d, 5.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.23606797749979d + "'", double5 == 2.23606797749979d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getMaxStep();
        double double15 = highamHall54Integrator4.getMinReduction();
        java.lang.String str16 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        double double51 = highamHall54Integrator48.getMinStep();
        highamHall54Integrator48.setMaxGrowth(35.0d);
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
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) (short) 10, (double) 10, 2.1213203435596424d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        double double46 = highamHall54Integrator12.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double12 = highamHall54Integrator4.getMinStep();
        double double13 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) 0.0f, (double) 10L, (double) (byte) 0);
        java.lang.String str5 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        double double28 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) 5);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) (short) 100, (double) '4', (double) (byte) -1);
        highamHall54Integrator4.setSafety((double) ' ');
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double11 = highamHall54Integrator10.getMinStep();
        double double12 = highamHall54Integrator10.getMaxStep();
        java.lang.String str13 = highamHall54Integrator10.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int19 = highamHall54Integrator18.getOrder();
        double[] doubleArray25 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray31 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray25, doubleArray31);
        double double33 = highamHall54Integrator32.getMinStep();
        highamHall54Integrator32.setSafety(0.0d);
        java.lang.String str36 = highamHall54Integrator32.getName();
        double double37 = highamHall54Integrator32.getSafety();
        double double38 = highamHall54Integrator32.getMinStep();
        double[] doubleArray44 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray50 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray44, doubleArray50);
        double double52 = highamHall54Integrator51.getMinStep();
        highamHall54Integrator51.setSafety(0.0d);
        java.lang.String str55 = highamHall54Integrator51.getName();
        double double56 = highamHall54Integrator51.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler57 = highamHall54Integrator51.getStepHandler();
        highamHall54Integrator32.setStepHandler(stepHandler57);
        highamHall54Integrator18.setStepHandler(stepHandler57);
        highamHall54Integrator10.setStepHandler(stepHandler57);
        highamHall54Integrator4.setStepHandler(stepHandler57);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Higham-Hall 5(4)" + "'", str55, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler57);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int17 = highamHall54Integrator16.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator16.addSwitchingFunction(switchingFunction18, (double) 1L, (double) (short) -1, 0);
        double double23 = highamHall54Integrator16.getSafety();
        double double24 = highamHall54Integrator16.getSafety();
        double double25 = highamHall54Integrator16.getCurrentStepStart();
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        double[] doubleArray46 = new double[] { '4', 5, '4' };
        double[] doubleArray52 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray58 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray46, doubleArray52);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray39, doubleArray52);
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator61.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler62);
        highamHall54Integrator4.setStepHandler(stepHandler62);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler62);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        double double71 = highamHall54Integrator68.getMaxGrowth();
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) '#');
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
        org.junit.Assert.assertNotNull(stepHandler67);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) ' ', (double) 100L, 0.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety((double) '#');
        java.lang.String str18 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        double double28 = highamHall54Integrator19.getMaxStep();
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
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        int int6 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (byte) 0);
        double double9 = highamHall54Integrator4.getMinStep();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        double double50 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction((double) 0);
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
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(100.0d);
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety((-1.0d));
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        highamHall54Integrator19.setSafety((double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, 2.23606797749979d, 0.0d, (double) 0.0f);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction14, (-1.0d), (double) (short) -1, (int) (short) 10);
        double double19 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator12.getStepHandler();
        double double21 = highamHall54Integrator12.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        int int17 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        double double19 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) (-1), (double) 5, (double) 'a');
        double double5 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray13, doubleArray21);
        java.lang.String str23 = highamHall54Integrator22.getName();
        double double24 = highamHall54Integrator22.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double30 = highamHall54Integrator29.getMaxGrowth();
        java.lang.String str31 = highamHall54Integrator29.getName();
        double double32 = highamHall54Integrator29.getMaxGrowth();
        double double33 = highamHall54Integrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator29.getStepHandler();
        double[] doubleArray42 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray48 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray42, doubleArray48);
        double[] doubleArray55 = new double[] { '4', 5, '4' };
        double[] doubleArray61 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray67 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray61, doubleArray67);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray55, doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray48, doubleArray61);
        org.apache.commons.math.ode.StepHandler stepHandler71 = highamHall54Integrator70.getStepHandler();
        highamHall54Integrator29.setStepHandler(stepHandler71);
        highamHall54Integrator22.setStepHandler(stepHandler71);
        highamHall54Integrator4.setStepHandler(stepHandler71);
        highamHall54Integrator4.setSafety((double) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Higham-Hall 5(4)" + "'", str31, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 7.211102550927978d + "'", double33 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler71);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double24 = highamHall54Integrator23.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler25 = null;
        highamHall54Integrator23.setStepHandler(stepHandler25);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        highamHall54Integrator23.addSwitchingFunction(switchingFunction27, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double37 = highamHall54Integrator36.getMaxGrowth();
        double double38 = highamHall54Integrator36.getSafety();
        highamHall54Integrator36.setMaxGrowth((double) 5);
        double[] doubleArray46 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray52 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray46, doubleArray52);
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator53.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler54);
        highamHall54Integrator23.setStepHandler(stepHandler54);
        highamHall54Integrator4.setStepHandler(stepHandler54);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction58, 0.9d, (double) 0, (int) (short) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler54);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction((-1.0d));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
        org.junit.Assert.assertNull(stepHandler17);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 5);
        highamHall54Integrator4.setMinReduction(35.0d);
        double[] doubleArray19 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray25 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray19, doubleArray25);
        double double27 = highamHall54Integrator26.getMinStep();
        highamHall54Integrator26.setSafety(0.0d);
        java.lang.String str30 = highamHall54Integrator26.getName();
        double double31 = highamHall54Integrator26.getSafety();
        highamHall54Integrator26.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator26.setMaxGrowth(0.9d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        highamHall54Integrator26.addSwitchingFunction(switchingFunction36, (-1.0d), (double) 1L, (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler41);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler41);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 0.0d, 0.0d, (double) (short) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double26 = highamHall54Integrator25.getCurrentStepStart();
        double double27 = highamHall54Integrator25.getCurrentSignedStepsize();
        highamHall54Integrator25.setMaxGrowth((double) 100);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray37, doubleArray45);
        java.lang.String str47 = highamHall54Integrator46.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator46.getStepHandler();
        highamHall54Integrator25.setStepHandler(stepHandler48);
        highamHall54Integrator20.setStepHandler(stepHandler48);
        highamHall54Integrator4.setStepHandler(stepHandler48);
        org.apache.commons.math.ode.StepHandler stepHandler52 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler52);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), 5.0d, 0.2d, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety(32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.apache.commons.math.ode.StepHandler stepHandler78 = highamHall54Integrator74.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler78);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray28 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray34 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray28, doubleArray34);
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray28, doubleArray36);
        double[] doubleArray43 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray28, doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray11, doubleArray43);
        double[] doubleArray55 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray61 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray55, doubleArray61);
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray55, doubleArray63);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray80 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray74, doubleArray80);
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray74, doubleArray82);
        double[] doubleArray89 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray74, doubleArray89);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator91 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray63, doubleArray89);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator92 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) 10, doubleArray43, doubleArray63);
        double[] doubleArray93 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) '4', doubleArray43, doubleArray93);
        int int95 = highamHall54Integrator94.getOrder();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 5 + "'", int95 == 5);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        double double31 = highamHall54Integrator25.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 2.23606797749979d, (double) 10.0f, (double) 100);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        java.lang.Class<?> wildcardClass49 = highamHall54Integrator41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 10, (double) (byte) 100, 5.0d);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.String str32 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Higham-Hall 5(4)" + "'", str32, "Higham-Hall 5(4)");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.String str95 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) (short) 10);
        double double98 = highamHall54Integrator4.getCurrentStepStart();
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
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Higham-Hall 5(4)" + "'", str95, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.lang.String str46 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction47, (double) 0.0f, 5.0d, (int) (byte) 100);
        int int52 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double58 = highamHall54Integrator57.getCurrentStepStart();
        double double59 = highamHall54Integrator57.getCurrentSignedStepsize();
        int int60 = highamHall54Integrator57.getOrder();
        highamHall54Integrator57.setSafety(0.2d);
        double double63 = highamHall54Integrator57.getMaxGrowth();
        double double64 = highamHall54Integrator57.getMaxStep();
        double double65 = highamHall54Integrator57.getMaxStep();
        highamHall54Integrator57.setSafety(32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler68 = highamHall54Integrator57.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler68);
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler68);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        double double23 = highamHall54Integrator12.getMinStep();
        java.lang.String str24 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(31.622776601683793d, (double) 0.0f, 0.0d, 1.0d);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getSafety();
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        int int12 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations38 = null;
        double[] doubleArray40 = null;
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray53, doubleArray61);
        double[] doubleArray68 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray53, doubleArray68);
        double[] doubleArray77 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray83 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray77, doubleArray83);
        double[] doubleArray86 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray77, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator88 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 10, doubleArray68, doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator12.integrate(firstOrderDifferentialEquations38, (double) (byte) 100, doubleArray40, 0.0d, doubleArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[32.0]");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        highamHall54Integrator4.setMinReduction(35.0d);
        highamHall54Integrator4.setMaxGrowth(1.0d);
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, 0.0d, (double) 1.0f, (int) ' ');
        highamHall54Integrator4.setMinReduction(31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
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
        double double56 = highamHall54Integrator48.getMinReduction();
        highamHall54Integrator48.setMaxGrowth((double) '4');
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
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.2d + "'", double56 == 0.2d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        highamHall54Integrator4.setMinReduction((double) '4');
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction43, (double) 0, (double) '4', (int) '4');
        highamHall54Integrator12.setInitialStepSize((double) (short) -1);
        double double50 = highamHall54Integrator12.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.2d + "'", double50 == 0.2d);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) 100.0f, (double) (short) 100, 52.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double35 = highamHall54Integrator34.getMaxGrowth();
        java.lang.String str36 = highamHall54Integrator34.getName();
        double double37 = highamHall54Integrator34.getMaxGrowth();
        double double38 = highamHall54Integrator34.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator34.getStepHandler();
        double[] doubleArray47 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray53 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray47, doubleArray53);
        double[] doubleArray60 = new double[] { '4', 5, '4' };
        double[] doubleArray66 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray72 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray66, doubleArray72);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray60, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray53, doubleArray66);
        org.apache.commons.math.ode.StepHandler stepHandler76 = highamHall54Integrator75.getStepHandler();
        highamHall54Integrator34.setStepHandler(stepHandler76);
        highamHall54Integrator12.setStepHandler(stepHandler76);
        double double79 = highamHall54Integrator12.getSafety();
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
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 7.211102550927978d + "'", double38 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinReduction();
        int int10 = highamHall54Integrator4.getOrder();
        java.lang.Class<?> wildcardClass11 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(52.0d, (double) 100L, (double) 100, (double) 0L);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations6 = null;
        double[] doubleArray8 = null;
        double[] doubleArray23 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray29 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray23, doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray23, doubleArray31);
        double[] doubleArray38 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray23, doubleArray38);
        double[] doubleArray47 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray53 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray47, doubleArray53);
        double[] doubleArray60 = new double[] { '4', 5, '4' };
        double[] doubleArray66 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray72 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray66, doubleArray72);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray60, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 0, doubleArray53, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 7.211102550927978d, doubleArray23, doubleArray53);
        double[] doubleArray84 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray90 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator91 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray84, doubleArray90);
        double[] doubleArray93 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray84, doubleArray93);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator95 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, 0.9d, doubleArray23, doubleArray84);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations6, 10.0d, doubleArray8, 0.9d, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray90), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray93), "[32.0]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) 0L, 52.0d, 7.211102550927978d);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) (short) -1);
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (short) 1, Double.NaN, 1);
        double double14 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 1, (double) 0, 7.211102550927978d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (byte) 0, (double) 0, (int) (short) 100);
        highamHall54Integrator4.setSafety((double) '4');
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(2.23606797749979d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, 0.0d, (double) (byte) -1, 0);
        java.lang.Class<?> wildcardClass21 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        double double31 = highamHall54Integrator12.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.2d + "'", double31 == 0.2d);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) (short) 100, (double) 10.0f);
        highamHall54Integrator4.setMinReduction((-1.0d));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        java.lang.String str17 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction18, (double) ' ', 52.0d, (int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = highamHall54Integrator12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 1.0d, 1.0d, Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, 0.9d, (double) (short) 10, (-1));
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        double double15 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double21 = highamHall54Integrator20.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler22 = null;
        highamHall54Integrator20.setStepHandler(stepHandler22);
        int int24 = highamHall54Integrator20.getOrder();
        java.lang.String str25 = highamHall54Integrator20.getName();
        double double26 = highamHall54Integrator20.getCurrentSignedStepsize();
        int int27 = highamHall54Integrator20.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double33 = highamHall54Integrator32.getCurrentStepStart();
        double double34 = highamHall54Integrator32.getCurrentSignedStepsize();
        int int35 = highamHall54Integrator32.getOrder();
        highamHall54Integrator32.setSafety(0.2d);
        double double38 = highamHall54Integrator32.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler39);
        highamHall54Integrator4.setStepHandler(stepHandler39);
        java.lang.String str42 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) (-1L), (double) 0, 35.0d);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getMaxStep();
        double double7 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        java.lang.String str86 = highamHall54Integrator84.getName();
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
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Higham-Hall 5(4)" + "'", str86, "Higham-Hall 5(4)");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        double double11 = highamHall54Integrator4.getMinReduction();
        double[] doubleArray17 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray23 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray17, doubleArray23);
        double double25 = highamHall54Integrator24.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator24.addSwitchingFunction(switchingFunction26, (-1.0d), (double) (short) -1, (int) (short) 10);
        double double31 = highamHall54Integrator24.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler32 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler32);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        java.lang.String str36 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str21 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction91 = null;
        highamHall54Integrator90.addSwitchingFunction(switchingFunction91, 32.0d, 100.0d, (int) (byte) -1);
        highamHall54Integrator90.setSafety(0.0d);
        double double98 = highamHall54Integrator90.getMaxGrowth();
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
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 10.0d + "'", double98 == 10.0d);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.Class<?> wildcardClass6 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        double double71 = highamHall54Integrator12.getCurrentSignedStepsize();
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
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 1.0f);
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        double double22 = highamHall54Integrator21.getMinStep();
        highamHall54Integrator21.setSafety(0.0d);
        java.lang.String str25 = highamHall54Integrator21.getName();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator21.getStepHandler();
        double double27 = highamHall54Integrator21.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator32.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator21.setStepHandler(stepHandler34);
        highamHall54Integrator4.setStepHandler(stepHandler34);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxStep();
        java.lang.String str13 = highamHall54Integrator4.getName();
        double double14 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        double double27 = highamHall54Integrator4.getCurrentStepStart();
        double double28 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) 10, Double.NaN, (double) (byte) 0);
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations5 = null;
        double[] doubleArray12 = new double[] { '4', 5, '4' };
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray12, doubleArray18);
        double[] doubleArray35 = new double[] { '4', 5, '4' };
        double[] doubleArray41 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray47 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray41, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray35, doubleArray41);
        double[] doubleArray57 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray63 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray57, doubleArray63);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray80 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray74, doubleArray80);
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray74, doubleArray82);
        double[] doubleArray89 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray74, doubleArray89);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator91 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 2.23606797749979d, doubleArray57, doubleArray74);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator92 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) '#', doubleArray41, doubleArray57);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations5, (double) 100L, doubleArray18, (double) (short) 10, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) 0L);
        highamHall54Integrator4.setMinReduction((double) 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        highamHall54Integrator4.setSafety((double) 0L);
        highamHall54Integrator4.setSafety((double) (short) 1);
        int int18 = highamHall54Integrator4.getOrder();
        double double19 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMaxGrowth((double) 10L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        java.lang.String str44 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(2.23606797749979d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        highamHall54Integrator4.setSafety(0.9d);
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        double double53 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize(9.343446901438462d);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, (double) 5, 14.727477510336914d, 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) ' ');
        highamHall54Integrator4.setMinReduction((double) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, 35.0d, 0.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (-1), (double) 1.0f, 5.0d);
        highamHall54Integrator4.setMinReduction((double) (-1));
        highamHall54Integrator4.setMinReduction((double) 1);
        double double9 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        java.lang.String str7 = highamHall54Integrator4.getName();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) 1.0f, (-1.0d), 5);
        double double14 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction((double) 5);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        highamHall54Integrator4.setMaxGrowth(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        double double47 = highamHall54Integrator45.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 0.0d, 0.2d, (int) (byte) 100);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        int int12 = highamHall54Integrator4.getOrder();
        java.lang.String str13 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction(2.23606797749979d);
        double double16 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray21, doubleArray29);
        double[] doubleArray36 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray21, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray11, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray2, doubleArray36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        highamHall54Integrator39.addSwitchingFunction(switchingFunction40, (double) (byte) 0, (double) 10, 10);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (-1L), (double) '#', (double) 0.0f);
        double double50 = highamHall54Integrator49.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler51 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator39.setStepHandler(stepHandler51);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler51);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(Double.NaN);
        highamHall54Integrator4.setMinReduction((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertNotNull(stepHandler9);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize((double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, 32.0d, 7.211102550927978d, (int) (byte) 1);
        highamHall54Integrator4.setMaxGrowth((double) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        double double19 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        highamHall54Integrator4.setMinReduction((double) 10);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 10.0f, 0.0d, 5);
        double double13 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        double[] doubleArray54 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray60 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray54, doubleArray60);
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray54, doubleArray62);
        double[] doubleArray69 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray54, doubleArray69);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray37, doubleArray69);
        double[] doubleArray81 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray87 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator88 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray81, doubleArray87);
        double[] doubleArray89 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray81, doubleArray89);
        double[] doubleArray96 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator97 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray81, doubleArray96);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator98 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (short) -1, doubleArray37, doubleArray81);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator99 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 1, doubleArray26, doubleArray37);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[]");
        org.junit.Assert.assertNotNull(doubleArray96);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray96), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double[] doubleArray2 = null;
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        double[] doubleArray31 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray37 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray31, doubleArray37);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray31, doubleArray39);
        double[] doubleArray46 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray31, doubleArray46);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray14, doubleArray46);
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray58, doubleArray66);
        double[] doubleArray73 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray58, doubleArray73);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (short) -1, doubleArray14, doubleArray58);
        double[] doubleArray76 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (-1), doubleArray58, doubleArray76);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator(35.0d, (-1.0d), doubleArray2, doubleArray76);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction(0.2d);
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        highamHall54Integrator12.setInitialStepSize((double) (short) 10);
        double double19 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, (double) 'a', 0.0d, 5.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction(22.80350850198276d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.23606797749979d + "'", double5 == 2.23606797749979d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator12.getStepHandler();
        double double18 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety((double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMinStep();
        double double15 = highamHall54Integrator12.getMinStep();
        double double16 = highamHall54Integrator12.getMaxStep();
        highamHall54Integrator12.setInitialStepSize((double) 'a');
        double double19 = highamHall54Integrator12.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) '#', (double) 0L, 5);
        highamHall54Integrator4.setSafety((double) (byte) 10);
        double double17 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (-1), (double) 1.0f, 5.0d);
        highamHall54Integrator4.setMinReduction((double) (-1));
        highamHall54Integrator4.setMinReduction((double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        double double10 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 7.211102550927978d + "'", double6 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler10);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 100L, (double) 1L, 35.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety((double) (byte) 1);
        double double8 = highamHall54Integrator4.getSafety();
        double double9 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 10, (double) (short) -1, 22.80350850198276d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (short) -1, 0.0d, (int) (short) 10);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        double[] doubleArray53 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray59 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray53, doubleArray59);
        double double61 = highamHall54Integrator60.getMinStep();
        double double62 = highamHall54Integrator60.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        highamHall54Integrator60.addSwitchingFunction(switchingFunction63, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator60.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator60.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler70);
        highamHall54Integrator12.setSafety((double) (short) 100);
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
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler70);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) 1L, (double) (short) 1, (double) (short) 10);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(stepHandler7);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, 31.622776601683793d, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        highamHall54Integrator57.addSwitchingFunction(switchingFunction58, (double) (-1.0f), (double) (short) 0, (int) (byte) -1);
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
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) '4', (double) (short) -1, (double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) (byte) -1, (int) (short) 100);
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 16.1245154965971d + "'", double10 == 16.1245154965971d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        double double20 = highamHall54Integrator4.getCurrentStepStart();
        double double21 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 10, 0.2d, (int) (byte) 0);
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getMaxStep();
        double double15 = highamHall54Integrator4.getMinReduction();
        double double16 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int13 = highamHall54Integrator12.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction14, (double) 1L, (double) (short) -1, 0);
        int int19 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMaxGrowth((-1.0d));
        double double22 = highamHall54Integrator12.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler23);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction25, 31.622776601683793d, (double) (byte) 100, (int) (short) -1);
        double[] doubleArray35 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray41 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray35, doubleArray41);
        double double43 = highamHall54Integrator42.getMinStep();
        highamHall54Integrator42.setSafety(0.0d);
        java.lang.String str46 = highamHall54Integrator42.getName();
        double double47 = highamHall54Integrator42.getMaxStep();
        int int48 = highamHall54Integrator42.getOrder();
        highamHall54Integrator42.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double56 = highamHall54Integrator55.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler57 = highamHall54Integrator55.getStepHandler();
        highamHall54Integrator42.setStepHandler(stepHandler57);
        double double59 = highamHall54Integrator42.getCurrentSignedStepsize();
        double double60 = highamHall54Integrator42.getSafety();
        double double61 = highamHall54Integrator42.getCurrentStepStart();
        highamHall54Integrator42.setMinReduction((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler64 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler64);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(stepHandler64);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 1, 2.23606797749979d, 32.0d);
        highamHall54Integrator4.setMinReduction((double) (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setSafety((double) (short) 100);
        double double14 = highamHall54Integrator4.getMinStep();
        java.lang.String str15 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator59.setMinReduction((double) 0.0f);
        int int62 = highamHall54Integrator59.getOrder();
        double double63 = highamHall54Integrator59.getCurrentSignedStepsize();
        highamHall54Integrator59.setInitialStepSize((double) 10.0f);
        double double66 = highamHall54Integrator59.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator59.getStepHandler();
        highamHall54Integrator51.setStepHandler(stepHandler67);
        highamHall54Integrator51.setMinReduction(0.0d);
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 5 + "'", int62 == 5);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(stepHandler67);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (byte) 1, (double) (byte) 0, (double) (short) 10);
        double double5 = highamHall54Integrator4.getSafety();
        double double6 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        highamHall54Integrator4.setSafety(2.1213203435596424d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getSafety();
        highamHall54Integrator12.setInitialStepSize((double) (byte) 100);
        highamHall54Integrator12.setMaxGrowth((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setSafety((double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMinReduction();
        double double10 = highamHall54Integrator4.getSafety();
        double[] doubleArray16 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray22 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray16, doubleArray22);
        double double24 = highamHall54Integrator23.getMinStep();
        highamHall54Integrator23.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double32 = highamHall54Integrator31.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator31.setStepHandler(stepHandler33);
        int int35 = highamHall54Integrator31.getOrder();
        java.lang.String str36 = highamHall54Integrator31.getName();
        double double37 = highamHall54Integrator31.getCurrentSignedStepsize();
        double double38 = highamHall54Integrator31.getSafety();
        highamHall54Integrator31.setSafety((double) (short) 10);
        highamHall54Integrator31.setInitialStepSize((double) 100);
        java.lang.String str43 = highamHall54Integrator31.getName();
        highamHall54Integrator31.setMinReduction((double) ' ');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double51 = highamHall54Integrator50.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler52 = null;
        highamHall54Integrator50.setStepHandler(stepHandler52);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        highamHall54Integrator50.addSwitchingFunction(switchingFunction54, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double64 = highamHall54Integrator63.getMaxGrowth();
        double double65 = highamHall54Integrator63.getSafety();
        highamHall54Integrator63.setMaxGrowth((double) 5);
        double[] doubleArray73 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray79 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray73, doubleArray79);
        org.apache.commons.math.ode.StepHandler stepHandler81 = highamHall54Integrator80.getStepHandler();
        highamHall54Integrator63.setStepHandler(stepHandler81);
        highamHall54Integrator50.setStepHandler(stepHandler81);
        highamHall54Integrator31.setStepHandler(stepHandler81);
        highamHall54Integrator23.setStepHandler(stepHandler81);
        highamHall54Integrator4.setStepHandler(stepHandler81);
        java.lang.String str87 = highamHall54Integrator4.getName();
        double double88 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Higham-Hall 5(4)" + "'", str43, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.9d + "'", double65 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Higham-Hall 5(4)" + "'", str87, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.9d + "'", double88 == 0.9d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 31.622776601683793d + "'", double7 == 31.622776601683793d);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth((double) 1);
        highamHall54Integrator4.setMaxGrowth((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(stepHandler12);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, 0.0d, (double) 1L, 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, 0.0d, 0.9d, (double) (-1.0f));
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        double double32 = highamHall54Integrator31.getMinStep();
        highamHall54Integrator31.setSafety(0.0d);
        java.lang.String str35 = highamHall54Integrator31.getName();
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator31.getStepHandler();
        double double37 = highamHall54Integrator31.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator42.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator31.setStepHandler(stepHandler44);
        highamHall54Integrator4.setStepHandler(stepHandler44);
        int int47 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNull(stepHandler18);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        int int12 = highamHall54Integrator4.getOrder();
        int int13 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) (byte) -1, (double) (byte) 100, 5);
        highamHall54Integrator4.setMaxGrowth(32.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        highamHall54Integrator12.setInitialStepSize(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction32, 7.211102550927978d, (double) (short) 100, 10);
        int int37 = highamHall54Integrator12.getOrder();
        double double38 = highamHall54Integrator12.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        double double50 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(2.23606797749979d);
        double double53 = highamHall54Integrator4.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 52.0d + "'", double53 == 52.0d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        highamHall54Integrator4.setMaxGrowth((double) 5);
        java.lang.Class<?> wildcardClass50 = highamHall54Integrator4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) (short) 0);
        double double13 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(35.0d, (double) 0L, (double) (short) 100, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        java.lang.String str17 = highamHall54Integrator4.getName();
        double double18 = highamHall54Integrator4.getMaxStep();
        double double19 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator51.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray21, doubleArray29);
        double[] doubleArray36 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray21, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray11, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray2, doubleArray36);
        java.lang.String str40 = highamHall54Integrator39.getName();
        double double41 = highamHall54Integrator39.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double13 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        highamHall54Integrator41.setMinReduction((double) (short) 100);
        double double46 = highamHall54Integrator41.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray21, doubleArray29);
        double[] doubleArray36 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray21, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray11, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray2, doubleArray36);
        java.lang.String str40 = highamHall54Integrator39.getName();
        highamHall54Integrator39.setInitialStepSize(31.622776601683793d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        double double32 = highamHall54Integrator12.getMinReduction();
        double double33 = highamHall54Integrator12.getSafety();
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        double double24 = highamHall54Integrator12.getMinReduction();
        double double25 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.2d + "'", double24 == 0.2d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        double double65 = highamHall54Integrator4.getSafety();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.9d + "'", double65 == 0.9d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        highamHall54Integrator12.setMaxGrowth(35.0d);
        double double34 = highamHall54Integrator12.getMaxGrowth();
        java.lang.String str35 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 35.0d + "'", double34 == 35.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Higham-Hall 5(4)" + "'", str35, "Higham-Hall 5(4)");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 'a', (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (short) 10, 52.0d, (int) (byte) 1);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getMaxStep();
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (short) -1);
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 35.0d, (double) (-1), 2.23606797749979d);
        double double5 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str30 = highamHall54Integrator4.getName();
        double double31 = highamHall54Integrator4.getCurrentStepStart();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(97.0d, 0.0d, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        highamHall54Integrator4.setInitialStepSize(5.0d);
        highamHall54Integrator4.setInitialStepSize(16.1245154965971d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(35.0d);
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double16 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) (short) -1);
        java.lang.String str19 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 7.211102550927978d + "'", double13 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        java.lang.String str16 = highamHall54Integrator12.getName();
        highamHall54Integrator12.setSafety(0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        highamHall54Integrator4.setMinReduction((double) '4');
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double[] doubleArray19 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray25 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray19, doubleArray25);
        double[] doubleArray34 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray40 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray34, doubleArray40);
        double[] doubleArray51 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray57 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray51, doubleArray57);
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray51, doubleArray59);
        double[] doubleArray66 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray51, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray34, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray25, doubleArray34);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (-1.0f), (double) 10L, (double) (byte) 0);
        double double75 = highamHall54Integrator74.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler76 = highamHall54Integrator74.getStepHandler();
        highamHall54Integrator69.setStepHandler(stepHandler76);
        highamHall54Integrator4.setStepHandler(stepHandler76);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 32.0d + "'", double75 == 32.0d);
        org.junit.Assert.assertNotNull(stepHandler76);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, 0.9d, (double) (-1L), (int) '#');
        double double15 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 10.0f, (double) 100.0f, 22.80350850198276d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 10L, (double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) 1L, 52.0d, 0);
        highamHall54Integrator4.setMaxGrowth((double) 100);
        double double16 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator4.getStepHandler();
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        double double15 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxStep();
        java.lang.String str8 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setSafety(5.0d);
        highamHall54Integrator4.setMaxGrowth((double) (short) 0);
        double double15 = highamHall54Integrator4.getMaxStep();
        double[] doubleArray23 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray29 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray23, doubleArray29);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray23, doubleArray31);
        java.lang.String str33 = highamHall54Integrator32.getName();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler34);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (-1.0f), (double) 100, 0.2d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        double double23 = highamHall54Integrator19.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler24);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler24);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 2.23606797749979d, doubleArray7, doubleArray24);
        highamHall54Integrator41.setSafety((double) (short) 0);
        double double44 = highamHall54Integrator41.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        highamHall54Integrator41.addSwitchingFunction(switchingFunction45, (-1.0d), (double) 10L, (int) (short) 100);
        java.lang.Class<?> wildcardClass50 = highamHall54Integrator41.getClass();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 52.0d + "'", double44 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        double double56 = highamHall54Integrator48.getMinReduction();
        double double57 = highamHall54Integrator48.getSafety();
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
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.2d + "'", double56 == 0.2d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.9d + "'", double57 == 0.9d);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.1213203435596424d, (double) (-1.0f), 0.9d, 0.0d);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) -1);
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) 10);
        highamHall54Integrator4.setSafety((double) (-1L));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) 0L, 9.343446901438462d, (double) 5);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double12 = highamHall54Integrator11.getMaxStep();
        int int13 = highamHall54Integrator11.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator11.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator4.getMaxStep();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        double double33 = highamHall54Integrator12.getMaxGrowth();
        double double34 = highamHall54Integrator12.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction23, (double) 100.0f, 2.23606797749979d, (int) (short) -1);
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
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNull(stepHandler20);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, Double.NaN, (double) 10, 100.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        double double8 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        int int26 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMaxGrowth(35.0d);
        highamHall54Integrator12.setMinReduction((double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(35.0d, (-1.0d), (-1.0d), (double) 5);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        java.lang.String str17 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction18, 7.211102550927978d, (-1.0d), (int) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMinReduction();
        double double10 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 2.23606797749979d, doubleArray9, doubleArray26);
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, (double) 100L, doubleArray26, doubleArray55);
        double double58 = highamHall54Integrator57.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler59 = highamHall54Integrator57.getStepHandler();
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9d + "'", double58 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler59);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        double double27 = highamHall54Integrator4.getCurrentStepStart();
        double double28 = highamHall54Integrator4.getMinReduction();
        double double29 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str30 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2d + "'", double28 == 0.2d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (short) 100, (double) 1.0f, 100);
        double double13 = highamHall54Integrator4.getMinReduction();
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, 14.727477510336914d, (double) 10.0f, 0.0d);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxStep();
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double double21 = highamHall54Integrator20.getMinStep();
        highamHall54Integrator20.setSafety(0.0d);
        java.lang.String str24 = highamHall54Integrator20.getName();
        double double25 = highamHall54Integrator20.getMaxStep();
        int int26 = highamHall54Integrator20.getOrder();
        highamHall54Integrator20.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double34 = highamHall54Integrator33.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler35);
        double double37 = highamHall54Integrator20.getCurrentSignedStepsize();
        double double38 = highamHall54Integrator20.getSafety();
        double double39 = highamHall54Integrator20.getCurrentStepStart();
        highamHall54Integrator20.setMinReduction((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator20.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler42);
        highamHall54Integrator4.setSafety(14.727477510336914d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(stepHandler42);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double63 = highamHall54Integrator62.getCurrentStepStart();
        double double64 = highamHall54Integrator62.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler65 = highamHall54Integrator62.getStepHandler();
        highamHall54Integrator57.setStepHandler(stepHandler65);
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
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxStep();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (short) 0, (double) ' ', 1.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double double21 = highamHall54Integrator20.getMinStep();
        highamHall54Integrator20.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double29 = highamHall54Integrator28.getMaxGrowth();
        double double30 = highamHall54Integrator28.getSafety();
        highamHall54Integrator28.setMaxGrowth((double) 5);
        double[] doubleArray38 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray44 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray38, doubleArray44);
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator28.setStepHandler(stepHandler46);
        highamHall54Integrator20.setStepHandler(stepHandler46);
        highamHall54Integrator20.setMaxGrowth((double) (byte) -1);
        int int51 = highamHall54Integrator20.getOrder();
        highamHall54Integrator20.setMinReduction((-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 10.0d, 0.0d, (double) (-1.0f));
        double[] doubleArray64 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray70 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray64, doubleArray70);
        double double72 = highamHall54Integrator71.getMinStep();
        double double73 = highamHall54Integrator71.getMinStep();
        double double74 = highamHall54Integrator71.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler75 = highamHall54Integrator71.getStepHandler();
        highamHall54Integrator58.setStepHandler(stepHandler75);
        highamHall54Integrator20.setStepHandler(stepHandler75);
        highamHall54Integrator4.setStepHandler(stepHandler75);
        double double79 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9d + "'", double30 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler75);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.2d + "'", double79 == 0.2d);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        highamHall54Integrator12.setInitialStepSize((double) 1.0f);
        double double40 = highamHall54Integrator12.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) (-1L), (double) 0, 35.0d);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        int int35 = highamHall54Integrator25.getOrder();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.Class<?> wildcardClass40 = stepHandler38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray15, doubleArray24);
        double[] doubleArray65 = new double[] { '4', 5, '4' };
        double[] doubleArray71 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray77 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray71, doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray65, doubleArray71);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, doubleArray15, doubleArray65);
        double double81 = highamHall54Integrator80.getMaxGrowth();
        highamHall54Integrator80.setSafety((double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
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
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        java.lang.String str11 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(7.211102550927978d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) 10.0f, (double) 10L, (int) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction20, 0.2d, 100.0d, (int) (byte) 10);
        highamHall54Integrator12.setInitialStepSize((double) 10.0f);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double32 = highamHall54Integrator31.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator31.setStepHandler(stepHandler33);
        int int35 = highamHall54Integrator31.getOrder();
        double double36 = highamHall54Integrator31.getMaxStep();
        double double37 = highamHall54Integrator31.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double43 = highamHall54Integrator42.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler44 = null;
        highamHall54Integrator42.setStepHandler(stepHandler44);
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator42.getStepHandler();
        double double47 = highamHall54Integrator42.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double53 = highamHall54Integrator52.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler54 = null;
        highamHall54Integrator52.setStepHandler(stepHandler54);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        highamHall54Integrator52.addSwitchingFunction(switchingFunction56, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double66 = highamHall54Integrator65.getMaxGrowth();
        double double67 = highamHall54Integrator65.getSafety();
        highamHall54Integrator65.setMaxGrowth((double) 5);
        double[] doubleArray75 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray81 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator82 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray75, doubleArray81);
        org.apache.commons.math.ode.StepHandler stepHandler83 = highamHall54Integrator82.getStepHandler();
        highamHall54Integrator65.setStepHandler(stepHandler83);
        highamHall54Integrator52.setStepHandler(stepHandler83);
        highamHall54Integrator42.setStepHandler(stepHandler83);
        highamHall54Integrator31.setStepHandler(stepHandler83);
        highamHall54Integrator12.setStepHandler(stepHandler83);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 7.211102550927978d + "'", double47 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1.0d + "'", double53 == 1.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.9d + "'", double67 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler83);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double12 = highamHall54Integrator4.getMinStep();
        int int13 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        highamHall54Integrator4.setSafety((double) 10L);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        double double5 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1.0f, 0.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str13 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (byte) 0, 1.0d, (double) 5);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) '#', (double) 1.0f, (double) (short) -1);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        highamHall54Integrator45.setInitialStepSize((double) (byte) 0);
        double double50 = highamHall54Integrator45.getCurrentStepStart();
        double double51 = highamHall54Integrator45.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        double double37 = highamHall54Integrator35.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.2d + "'", double37 == 0.2d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray11, doubleArray19);
        double[] doubleArray26 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray11, doubleArray26);
        double[] doubleArray37 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray43 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray37, doubleArray43);
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray37, doubleArray45);
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray58, doubleArray66);
        double[] doubleArray73 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray58, doubleArray73);
        double[] doubleArray80 = new double[] { '4', 5, '4' };
        double[] doubleArray86 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray92 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray86, doubleArray92);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray80, doubleArray86);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator95 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, (double) 100, doubleArray58, doubleArray80);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator96 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 1.0d, doubleArray37, doubleArray80);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator97 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, 0.2d, doubleArray26, doubleArray37);
        double double98 = highamHall54Integrator97.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 0.2d + "'", double98 == 0.2d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), 31.622776601683793d, (double) (-1), (double) '4');
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        int int6 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (byte) 0);
        double double9 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxGrowth();
        int int17 = highamHall54Integrator12.getOrder();
        double double18 = highamHall54Integrator12.getCurrentSignedStepsize();
        highamHall54Integrator12.setInitialStepSize(2.23606797749979d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double[] doubleArray4 = new double[] { 0L, 'a' };
        double[] doubleArray10 = new double[] { '4', 5, '4' };
        double[] doubleArray16 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray22 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray16, doubleArray22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray10, doubleArray16);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) (byte) 100, doubleArray4, doubleArray10);
        java.lang.String str26 = highamHall54Integrator25.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        double double43 = highamHall54Integrator12.getCurrentSignedStepsize();
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        double double57 = highamHall54Integrator56.getMinStep();
        highamHall54Integrator56.setSafety(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double65 = highamHall54Integrator64.getMaxGrowth();
        double double66 = highamHall54Integrator64.getSafety();
        highamHall54Integrator64.setMaxGrowth((double) 5);
        double[] doubleArray74 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray80 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray74, doubleArray80);
        org.apache.commons.math.ode.StepHandler stepHandler82 = highamHall54Integrator81.getStepHandler();
        highamHall54Integrator64.setStepHandler(stepHandler82);
        highamHall54Integrator56.setStepHandler(stepHandler82);
        highamHall54Integrator12.setStepHandler(stepHandler82);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction86 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction86, 0.0d, (double) 100.0f, (int) (byte) -1);
        highamHall54Integrator12.setSafety((double) (short) 100);
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.9d + "'", double66 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler82);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        highamHall54Integrator25.setMinReduction((double) '#');
        double double28 = highamHall54Integrator25.getMinReduction();
        highamHall54Integrator25.setInitialStepSize((double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double9 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) (short) -1);
        highamHall54Integrator4.setSafety(7.211102550927978d);
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) (byte) 1, (double) 1, (double) (byte) -1);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, (double) 0.0f, (double) 0.0f);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        double double8 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety(22.80350850198276d);
        highamHall54Integrator4.setMaxGrowth((double) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 1.0f, (double) (short) 1, 10.0d);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9486832980505138d + "'", double5 == 0.9486832980505138d);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        highamHall54Integrator48.setMaxGrowth((double) (-1.0f));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction58, (double) (byte) 10, (double) 5, 10);
        highamHall54Integrator48.setMaxGrowth((double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler65 = highamHall54Integrator48.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, 0.0d, 14.727477510336914d, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) 10L, (double) 100L, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double15 = highamHall54Integrator4.getSafety();
        java.lang.String str16 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.Class<?> wildcardClass9 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) 'a', (double) 0.0f, (double) '4');
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, 100.0d, 35.0d, (double) ' ');
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        double double67 = highamHall54Integrator51.getMaxGrowth();
        double double68 = highamHall54Integrator51.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 52.0d + "'", double68 == 52.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.Class<?> wildcardClass9 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        double double16 = highamHall54Integrator12.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction17, (double) (byte) 1, (double) (short) 100, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double18 = highamHall54Integrator17.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler19 = null;
        highamHall54Integrator17.setStepHandler(stepHandler19);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        highamHall54Integrator17.addSwitchingFunction(switchingFunction21, (double) 1, (double) 0L, (int) 'a');
        double double26 = highamHall54Integrator17.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator17.getStepHandler();
        double double28 = highamHall54Integrator17.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int34 = highamHall54Integrator33.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        highamHall54Integrator33.addSwitchingFunction(switchingFunction35, (double) 1L, (double) (short) -1, 0);
        int int40 = highamHall54Integrator33.getOrder();
        highamHall54Integrator33.setMaxGrowth((-1.0d));
        double double43 = highamHall54Integrator33.getMinReduction();
        double double44 = highamHall54Integrator33.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator17.setStepHandler(stepHandler45);
        highamHall54Integrator4.setStepHandler(stepHandler45);
        highamHall54Integrator4.setMaxGrowth(22.80350850198276d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2d + "'", double26 == 0.2d);
        org.junit.Assert.assertNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.2d + "'", double43 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        int int43 = highamHall54Integrator12.getOrder();
        java.lang.String str44 = highamHall54Integrator12.getName();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double[] doubleArray2 = null;
        double[] doubleArray14 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray20 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray14, doubleArray20);
        double[] doubleArray31 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray37 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray31, doubleArray37);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray31, doubleArray39);
        double[] doubleArray46 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray31, doubleArray46);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray14, doubleArray46);
        double[] doubleArray58 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray64 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray58, doubleArray64);
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray58, doubleArray66);
        double[] doubleArray77 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray83 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray77, doubleArray83);
        double[] doubleArray85 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator86 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray77, doubleArray85);
        double[] doubleArray92 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray77, doubleArray92);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator94 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray66, doubleArray92);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator95 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) 10, doubleArray46, doubleArray66);
        double[] doubleArray96 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator97 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) '4', doubleArray46, doubleArray96);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator98 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 32.0d, doubleArray2, doubleArray46);
        org.apache.commons.math.ode.StepHandler stepHandler99 = highamHall54Integrator98.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler99);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        double double19 = highamHall54Integrator4.getCurrentStepStart();
        double double20 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int23 = highamHall54Integrator22.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        highamHall54Integrator22.addSwitchingFunction(switchingFunction24, (double) 1L, (double) (short) -1, 0);
        int int29 = highamHall54Integrator22.getOrder();
        highamHall54Integrator22.setMaxGrowth((-1.0d));
        double double32 = highamHall54Integrator22.getMinReduction();
        double double33 = highamHall54Integrator22.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler34);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 7.211102550927978d + "'", double10 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.2d + "'", double11 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        double double15 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        double double8 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) '#');
        double double11 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) 5);
        highamHall54Integrator4.setSafety((double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', 2.23606797749979d, doubleArray7, doubleArray24);
        highamHall54Integrator41.setSafety((double) (short) 0);
        double double44 = highamHall54Integrator41.getCurrentStepStart();
        double double45 = highamHall54Integrator41.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        highamHall54Integrator41.addSwitchingFunction(switchingFunction46, 0.0d, (double) (byte) 10, (int) '#');
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
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.2d + "'", double45 == 0.2d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) 1L);
        double double8 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) 1L, 52.0d, 0);
        highamHall54Integrator4.setMaxGrowth((double) 100);
        double double16 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        double double19 = highamHall54Integrator4.getSafety();
        double double20 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        highamHall54Integrator4.setMinReduction(35.0d);
        int int9 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double15 = highamHall54Integrator14.getMaxGrowth();
        double double16 = highamHall54Integrator14.getSafety();
        highamHall54Integrator14.setMaxGrowth((double) 5);
        double[] doubleArray24 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray30 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray24, doubleArray30);
        org.apache.commons.math.ode.StepHandler stepHandler32 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator14.setStepHandler(stepHandler32);
        highamHall54Integrator4.setStepHandler(stepHandler32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler32);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        double[] doubleArray49 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray55 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray49, doubleArray55);
        double double57 = highamHall54Integrator56.getMinStep();
        double double58 = highamHall54Integrator56.getMinStep();
        double double59 = highamHall54Integrator56.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator56.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler60);
        double double62 = highamHall54Integrator12.getMaxGrowth();
        int int63 = highamHall54Integrator12.getOrder();
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
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 10, 0.2d, (int) (byte) 0);
        java.lang.String str12 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double15 = highamHall54Integrator4.getMaxStep();
        double double16 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth(2.1213203435596424d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((-1.0d));
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety(Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, (double) (short) -1, (double) 100L, 0);
        double double23 = highamHall54Integrator4.getMaxGrowth();
        double double24 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        double double27 = highamHall54Integrator4.getCurrentStepStart();
        double double28 = highamHall54Integrator4.getMinReduction();
        double double29 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2d + "'", double28 == 0.2d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double[] doubleArray6 = new double[] { 0L, 'a' };
        double[] doubleArray12 = new double[] { '4', 5, '4' };
        double[] doubleArray18 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray24 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray18, doubleArray24);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray12, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) (byte) 100, doubleArray6, doubleArray12);
        double[] doubleArray32 = null;
        double[] doubleArray40 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray46 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray40, doubleArray46);
        double[] doubleArray49 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray40, doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (byte) 100, doubleArray32, doubleArray40);
        double[] doubleArray61 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray67 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray61, doubleArray67);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator70 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray61, doubleArray69);
        double[] doubleArray80 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray86 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator87 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray80, doubleArray86);
        double[] doubleArray88 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator89 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray80, doubleArray88);
        double[] doubleArray95 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator96 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray80, doubleArray95);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator97 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (short) 10, doubleArray69, doubleArray95);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator98 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100L, doubleArray40, doubleArray95);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator99 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 22.80350850198276d, doubleArray6, doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[]");
        org.junit.Assert.assertNotNull(doubleArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray95), "[10.0, 1.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.Class<?> wildcardClass9 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 52.0d, (double) 10.0f, (double) 'a');
        double double5 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 10);
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getSafety();
        int int11 = highamHall54Integrator4.getOrder();
        double double12 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) -1);
        highamHall54Integrator4.setMinReduction((-1.0d));
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        int int14 = highamHall54Integrator4.getOrder();
        double double15 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction(0.0d);
        highamHall54Integrator4.setSafety((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 7.211102550927978d + "'", double7 == 7.211102550927978d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        int int6 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        double double15 = highamHall54Integrator4.getSafety();
        double double16 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        highamHall54Integrator35.setSafety(0.2d);
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
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMinStep();
        int int15 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        double double20 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) '4');
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(52.0d);
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        double double55 = highamHall54Integrator48.getCurrentStepStart();
        int int56 = highamHall54Integrator48.getOrder();
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
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getMinReduction();
        double double7 = highamHall54Integrator4.getMinReduction();
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) 10);
        double double11 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) (short) -1);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        double double27 = highamHall54Integrator12.getCurrentStepStart();
        highamHall54Integrator12.setMinReduction((double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        double double17 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction43, (double) 0, (double) '4', (int) '4');
        double double48 = highamHall54Integrator12.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 5);
        double double9 = highamHall54Integrator4.getMaxGrowth();
        double double10 = highamHall54Integrator4.getMinReduction();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 5.0d + "'", double9 == 5.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 7.211102550927978d + "'", double11 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 5.0d + "'", double12 == 5.0d);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        highamHall54Integrator4.setMinReduction((double) (-1));
        double double9 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(9.343446901438462d, (double) 1, (double) (short) 1, 32.0d);
        highamHall54Integrator4.setMaxGrowth(14.727477510336914d);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        highamHall54Integrator4.setSafety((double) 0L);
        highamHall54Integrator4.setSafety((double) (short) 1);
        int int18 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        double double11 = highamHall54Integrator4.getSafety();
        java.lang.String str12 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), 35.0d, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) '#');
        double double10 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety(35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        int int12 = highamHall54Integrator4.getOrder();
        java.lang.String str13 = highamHall54Integrator4.getName();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.9d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        double double7 = highamHall54Integrator4.getMaxStep();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        int int11 = highamHall54Integrator4.getOrder();
        double double12 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (short) 100, Double.NaN, (double) 10.0f);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(14.727477510336914d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 100L, (double) 1L, 35.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety((double) (-1L));
        highamHall54Integrator4.setMaxGrowth((double) (byte) 10);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        double double55 = highamHall54Integrator51.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        java.lang.String str16 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator12.getStepHandler();
        double double18 = highamHall54Integrator12.getCurrentSignedStepsize();
        highamHall54Integrator12.setSafety((double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) 0.0f, (double) (-1), 5);
        double double16 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize(5.0d);
        double double19 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str20 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 7.211102550927978d + "'", double19 == 7.211102550927978d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMaxStep();
        java.lang.String str8 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        java.lang.Class<?> wildcardClass11 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        highamHall54Integrator35.setSafety((double) 100.0f);
        double double43 = highamHall54Integrator35.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        int int77 = highamHall54Integrator12.getOrder();
        double double78 = highamHall54Integrator12.getMinReduction();
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
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 5 + "'", int77 == 5);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.2d + "'", double78 == 0.2d);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) 'a', (double) 0.0f, (double) '4');
        highamHall54Integrator4.setMinReduction(0.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) 10L, (double) (byte) 0, (int) '4');
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(2.23606797749979d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertNull(stepHandler10);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        double double53 = highamHall54Integrator51.getMaxStep();
        highamHall54Integrator51.setInitialStepSize(5.0d);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 5.0d + "'", double53 == 5.0d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) '4', (double) (short) -1, (double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) (byte) -1, (int) (short) 100);
        double double10 = highamHall54Integrator4.getSafety();
        java.lang.Class<?> wildcardClass11 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        highamHall54Integrator12.setSafety(16.1245154965971d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2d + "'", double27 == 0.2d);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        highamHall54Integrator4.setMinReduction(35.0d);
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        double double10 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double[] doubleArray5 = new double[] { '4', 5, '4' };
        double[] doubleArray11 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray17 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray11, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) 100.0f, doubleArray5, doubleArray11);
        double double20 = highamHall54Integrator19.getMinReduction();
        double double21 = highamHall54Integrator19.getMaxStep();
        double double22 = highamHall54Integrator19.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 5.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, Double.NaN, (double) (short) 0, 2.23606797749979d);
        highamHall54Integrator4.setInitialStepSize(22.80350850198276d);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler9 = null;
        highamHall54Integrator4.setStepHandler(stepHandler9);
        highamHall54Integrator4.setSafety((double) 10L);
        highamHall54Integrator4.setSafety(0.0d);
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator12.getStepHandler();
        double double18 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, 0.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator23.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator23.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler25);
        int int27 = highamHall54Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (byte) 100);
        highamHall54Integrator12.setMaxGrowth((double) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler13);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        double double12 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) (short) -1);
        highamHall54Integrator4.setSafety((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        double double7 = highamHall54Integrator4.getMinReduction();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        int int13 = highamHall54Integrator12.getOrder();
        int int14 = highamHall54Integrator12.getOrder();
        double double15 = highamHall54Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getMaxStep();
        double double15 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        double double56 = highamHall54Integrator48.getMinStep();
        double double57 = highamHall54Integrator48.getMinStep();
        double double58 = highamHall54Integrator48.getMaxGrowth();
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
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        java.lang.Class<?> wildcardClass90 = doubleArray49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getMinStep();
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double double28 = highamHall54Integrator27.getMinStep();
        highamHall54Integrator27.setSafety(0.0d);
        java.lang.String str31 = highamHall54Integrator27.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double37 = highamHall54Integrator36.getMaxGrowth();
        java.lang.String str38 = highamHall54Integrator36.getName();
        double double39 = highamHall54Integrator36.getSafety();
        int int40 = highamHall54Integrator36.getOrder();
        double double41 = highamHall54Integrator36.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double47 = highamHall54Integrator46.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler48 = null;
        highamHall54Integrator46.setStepHandler(stepHandler48);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        highamHall54Integrator46.addSwitchingFunction(switchingFunction50, (double) 1, (double) 0L, (int) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double60 = highamHall54Integrator59.getMaxGrowth();
        double double61 = highamHall54Integrator59.getSafety();
        highamHall54Integrator59.setMaxGrowth((double) 5);
        double[] doubleArray69 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray75 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray69, doubleArray75);
        org.apache.commons.math.ode.StepHandler stepHandler77 = highamHall54Integrator76.getStepHandler();
        highamHall54Integrator59.setStepHandler(stepHandler77);
        highamHall54Integrator46.setStepHandler(stepHandler77);
        highamHall54Integrator36.setStepHandler(stepHandler77);
        highamHall54Integrator27.setStepHandler(stepHandler77);
        highamHall54Integrator4.setStepHandler(stepHandler77);
        double double83 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Higham-Hall 5(4)" + "'", str31, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Higham-Hall 5(4)" + "'", str38, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.9d + "'", double39 == 0.9d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.9d + "'", double61 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 7.211102550927978d + "'", double83 == 7.211102550927978d);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        int int43 = highamHall54Integrator12.getOrder();
        highamHall54Integrator12.setMaxGrowth((double) (byte) 0);
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
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        double double23 = highamHall54Integrator12.getMaxGrowth();
        double double24 = highamHall54Integrator12.getMaxGrowth();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        double double75 = highamHall54Integrator4.getMaxStep();
        double double76 = highamHall54Integrator4.getMinStep();
        double double77 = highamHall54Integrator4.getCurrentSignedStepsize();
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) 10, Double.NaN, 0.0d);
        double double5 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        highamHall54Integrator4.setMaxGrowth(0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        highamHall54Integrator12.setSafety(0.0d);
        java.lang.String str16 = highamHall54Integrator12.getName();
        double double17 = highamHall54Integrator12.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) (-1.0f));
        double double21 = highamHall54Integrator12.getSafety();
        java.lang.String str22 = highamHall54Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
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
        highamHall54Integrator51.setMaxGrowth((double) (byte) 100);
        double double59 = highamHall54Integrator51.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray24 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray9, doubleArray24);
        int int26 = highamHall54Integrator25.getOrder();
        double double27 = highamHall54Integrator25.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator25.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler28);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        double double61 = highamHall54Integrator60.getMinStep();
        double double62 = highamHall54Integrator60.getSafety();
        highamHall54Integrator60.setMaxGrowth((double) 0.0f);
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
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.9d + "'", double62 == 0.9d);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (-1.0f), (double) 100, 0.2d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 100L, (double) (short) 1, 10);
        highamHall54Integrator4.setSafety((double) 100.0f);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 1L);
        highamHall54Integrator4.setInitialStepSize(0.0d);
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        double double15 = highamHall54Integrator4.getMinReduction();
        double double16 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double[] doubleArray2 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 10, 0, 0.0f, Double.NaN, (short) 0, 1.0f };
        double[] doubleArray21 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray27 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray21, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray21, doubleArray29);
        double[] doubleArray36 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray21, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) (byte) 100, doubleArray11, doubleArray36);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((-1.0d), (double) '4', doubleArray2, doubleArray36);
        java.lang.String str40 = highamHall54Integrator39.getName();
        highamHall54Integrator39.setInitialStepSize((double) ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, NaN, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 0.2d, 0.0d, 97.0d);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double47 = highamHall54Integrator46.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator46.getStepHandler();
        highamHall54Integrator41.setStepHandler(stepHandler48);
        double double50 = highamHall54Integrator41.getMinStep();
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (short) 100, (double) 1.0f, 100);
        double double13 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) 1L, (double) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getSafety();
        double double9 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinReduction();
        int int10 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (byte) 100, (double) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) 1L);
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        highamHall54Integrator4.setMinReduction((double) '4');
        highamHall54Integrator4.setSafety(1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass13 = stepHandler12.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, 2.23606797749979d, (double) '4', (int) '4');
        double double13 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) 100.0f, (double) (short) 100, 5);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) '#', (double) (byte) 10, 0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) (-1.0f), 1.0d, 1);
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        double double23 = highamHall54Integrator12.getMinStep();
        double double24 = highamHall54Integrator12.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        highamHall54Integrator4.setSafety((double) (short) -1);
        double double7 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setInitialStepSize((double) (byte) 0);
        double double12 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int18 = highamHall54Integrator17.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator17.addSwitchingFunction(switchingFunction19, (double) 1L, (double) (short) -1, 0);
        double double24 = highamHall54Integrator17.getMaxGrowth();
        double double25 = highamHall54Integrator17.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler26);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double[] doubleArray9 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray15 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray9, doubleArray15);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray9, doubleArray17);
        double[] doubleArray19 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, 1.0d, doubleArray17, doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getMinReduction();
        double double9 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, 0.0d, (double) 10L, (int) (byte) 10);
        double double15 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth(0.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '#', (double) (byte) -1, 100.0d, 0.0d);
        double double5 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (-1));
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int9 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        highamHall54Integrator12.setMaxGrowth((double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) 1, 0.0d, 32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, 14.727477510336914d, (int) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 10, 0.2d, (int) (byte) 0);
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double18 = highamHall54Integrator17.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator17.getStepHandler();
        double double20 = highamHall54Integrator17.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        double[] doubleArray27 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray33 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray27, doubleArray33);
        double double35 = highamHall54Integrator34.getMinStep();
        highamHall54Integrator34.setSafety(0.0d);
        java.lang.String str38 = highamHall54Integrator34.getName();
        double double39 = highamHall54Integrator34.getSafety();
        java.lang.String str40 = highamHall54Integrator34.getName();
        double[] doubleArray46 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray52 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray46, doubleArray52);
        double double54 = highamHall54Integrator53.getMinStep();
        highamHall54Integrator53.setSafety(0.0d);
        java.lang.String str57 = highamHall54Integrator53.getName();
        highamHall54Integrator53.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        highamHall54Integrator53.addSwitchingFunction(switchingFunction60, (double) 0, (double) ' ', (int) (byte) 0);
        highamHall54Integrator53.setMaxGrowth((double) (byte) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator71.setMinReduction((double) 0.0f);
        int int74 = highamHall54Integrator71.getOrder();
        double double75 = highamHall54Integrator71.getCurrentSignedStepsize();
        highamHall54Integrator71.setInitialStepSize((double) 10.0f);
        double double78 = highamHall54Integrator71.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler79 = highamHall54Integrator71.getStepHandler();
        highamHall54Integrator53.setStepHandler(stepHandler79);
        highamHall54Integrator34.setStepHandler(stepHandler79);
        highamHall54Integrator17.setStepHandler(stepHandler79);
        highamHall54Integrator4.setStepHandler(stepHandler79);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.211102550927978d + "'", double12 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Higham-Hall 5(4)" + "'", str38, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Higham-Hall 5(4)" + "'", str57, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(stepHandler79);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        highamHall54Integrator45.setSafety((double) 0.0f);
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
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        double double7 = highamHall54Integrator4.getMinStep();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, 32.0d, (double) (-1L), (double) (byte) 10);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations6 = null;
        double[] doubleArray13 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray19 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray13, doubleArray19);
        double[] doubleArray33 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray39 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray33, doubleArray39);
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray33, doubleArray41);
        double[] doubleArray48 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray33, doubleArray48);
        double[] doubleArray57 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray63 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray57, doubleArray63);
        double[] doubleArray66 = new double[] { ' ' };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) 10.0f, doubleArray57, doubleArray66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, 0.0d, doubleArray48, doubleArray57);
        // The following exception was thrown during execution in test generation
        try {
            highamHall54Integrator4.integrate(firstOrderDifferentialEquations6, (double) 0.0f, doubleArray13, (double) (short) 10, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[32.0]");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '#');
        highamHall54Integrator4.setMinReduction((double) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        int int15 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (-1.0d), (double) 10, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        int int12 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getSafety();
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setMinReduction(52.0d);
        double double7 = highamHall54Integrator4.getMaxStep();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        double double10 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        highamHall54Integrator45.setSafety((double) 10L);
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
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        double double28 = highamHall54Integrator12.getSafety();
        double double29 = highamHall54Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2d + "'", double28 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        double double41 = highamHall54Integrator12.getSafety();
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9d + "'", double41 == 0.9d);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler7 = null;
        highamHall54Integrator4.setStepHandler(stepHandler7);
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(52.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) (-1L), (double) (short) -1, (int) (short) 10);
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str18 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, Double.NaN, (double) 10, 100.0d);
        highamHall54Integrator4.setMinReduction((double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler7);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        int int8 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        double double11 = highamHall54Integrator4.getSafety();
        java.lang.String str12 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, 1.0d, (double) 10.0f, 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 0, (double) (byte) -1, (int) (byte) 1);
        highamHall54Integrator4.setMinReduction((double) ' ');
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) 10);
        double double15 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 7.211102550927978d + "'", double12 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        double double65 = highamHall54Integrator64.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator64.getStepHandler();
        int int67 = highamHall54Integrator64.getOrder();
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
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.9d + "'", double65 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 5 + "'", int67 == 5);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        double[] doubleArray5 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray11 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray5, doubleArray11);
        double double13 = highamHall54Integrator12.getMinStep();
        double double14 = highamHall54Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction15, (double) 1L, (double) 1L, (int) 'a');
        highamHall54Integrator12.setSafety(0.2d);
        double double22 = highamHall54Integrator12.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator12.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(5.0d, (double) '4', (double) (short) -1, (double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) (byte) -1, (int) (short) 100);
        double double10 = highamHall54Integrator4.getCurrentStepStart();
        double[] doubleArray20 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray26 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray20, doubleArray26);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray20, doubleArray28);
        double[] doubleArray35 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray20, doubleArray35);
        java.lang.String str37 = highamHall54Integrator36.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double43 = highamHall54Integrator42.getMaxGrowth();
        java.lang.String str44 = highamHall54Integrator42.getName();
        double double45 = highamHall54Integrator42.getSafety();
        int int46 = highamHall54Integrator42.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler47);
        double double49 = highamHall54Integrator36.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator36.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler50);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Higham-Hall 5(4)" + "'", str37, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.9d + "'", double45 == 0.9d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 52.0d + "'", double49 == 52.0d);
        org.junit.Assert.assertNotNull(stepHandler50);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double[] doubleArray4 = null;
        double[] doubleArray12 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray18 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray12, doubleArray18);
        double[] doubleArray29 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray35 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray29, doubleArray35);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) 10L, doubleArray29, doubleArray37);
        double[] doubleArray44 = new double[] { 10, 1, 1.0d, 1.0f, 100 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 10, doubleArray29, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 1, doubleArray12, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, (double) ' ', doubleArray4, doubleArray44);
        double[] doubleArray50 = new double[] { ' ', (byte) 1 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) 0, doubleArray44, doubleArray50);
        highamHall54Integrator51.setSafety((double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[10.0, 1.0, 1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[32.0, 1.0]");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, 32.0d, (double) (-1L), (double) (byte) 10);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.Class<?> wildcardClass6 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 1L, (double) (short) -1, 0);
        double double11 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        highamHall54Integrator4.setSafety((double) 0L);
        highamHall54Integrator4.setSafety((double) (short) 1);
        double double18 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double19 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 7.211102550927978d + "'", double18 == 7.211102550927978d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator12.addSwitchingFunction(switchingFunction25, Double.NaN, 52.0d, (int) (short) 1);
        double double30 = highamHall54Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        double double22 = highamHall54Integrator12.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, 31.622776601683793d, (double) '4', (double) 100);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        highamHall54Integrator84.setMinReduction(100.0d);
        double double87 = highamHall54Integrator84.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double87));
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (short) 1);
        double double8 = highamHall54Integrator4.getMaxGrowth();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double10 = highamHall54Integrator4.getMaxGrowth();
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
        highamHall54Integrator23.setInitialStepSize((double) (byte) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double59 = highamHall54Integrator58.getMaxGrowth();
        double double60 = highamHall54Integrator58.getSafety();
        highamHall54Integrator58.setMaxGrowth((double) 5);
        double[] doubleArray68 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray74 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray68, doubleArray74);
        org.apache.commons.math.ode.StepHandler stepHandler76 = highamHall54Integrator75.getStepHandler();
        highamHall54Integrator58.setStepHandler(stepHandler76);
        org.apache.commons.math.ode.StepHandler stepHandler78 = highamHall54Integrator58.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler78);
        highamHall54Integrator4.setStepHandler(stepHandler78);
        double double81 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
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
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.9d + "'", double60 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertNotNull(stepHandler78);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.9d + "'", double81 == 0.9d);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        highamHall54Integrator4.setInitialStepSize((double) 100);
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        highamHall54Integrator4.setMinReduction(52.0d);
        highamHall54Integrator4.setSafety((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        double double22 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator15 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator15.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        highamHall54Integrator15.setStepHandler(stepHandler18);
        double double20 = highamHall54Integrator15.getSafety();
        highamHall54Integrator15.setMinReduction(52.0d);
        double double23 = highamHall54Integrator15.getSafety();
        double double24 = highamHall54Integrator15.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator15.addSwitchingFunction(switchingFunction25, 2.23606797749979d, (double) (short) 100, 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, (double) 10, (double) 0, (double) 10);
        highamHall54Integrator34.setMinReduction(7.211102550927978d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double42 = highamHall54Integrator41.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler43 = null;
        highamHall54Integrator41.setStepHandler(stepHandler43);
        int int45 = highamHall54Integrator41.getOrder();
        java.lang.String str46 = highamHall54Integrator41.getName();
        double double47 = highamHall54Integrator41.getCurrentSignedStepsize();
        int int48 = highamHall54Integrator41.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double54 = highamHall54Integrator53.getCurrentStepStart();
        double double55 = highamHall54Integrator53.getCurrentSignedStepsize();
        int int56 = highamHall54Integrator53.getOrder();
        highamHall54Integrator53.setSafety(0.2d);
        double double59 = highamHall54Integrator53.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator53.getStepHandler();
        highamHall54Integrator41.setStepHandler(stepHandler60);
        highamHall54Integrator34.setStepHandler(stepHandler60);
        highamHall54Integrator15.setStepHandler(stepHandler60);
        highamHall54Integrator4.setStepHandler(stepHandler60);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler60);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double7 = highamHall54Integrator4.getMaxStep();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        int int15 = highamHall54Integrator14.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction16, (double) 1L, (double) (short) -1, 0);
        double double21 = highamHall54Integrator14.getSafety();
        double double22 = highamHall54Integrator14.getSafety();
        double double23 = highamHall54Integrator14.getMaxGrowth();
        double double24 = highamHall54Integrator14.getMinStep();
        double[] doubleArray30 = new double[] { 100.0f, 100L, 100L };
        double[] doubleArray36 = new double[] { 1.0f, 100.0f, (-1.0d), (short) 10, (-1) };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) 0.0f, doubleArray30, doubleArray36);
        double double38 = highamHall54Integrator37.getMinStep();
        highamHall54Integrator37.setSafety(0.0d);
        java.lang.String str41 = highamHall54Integrator37.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double47 = highamHall54Integrator46.getMaxGrowth();
        java.lang.String str48 = highamHall54Integrator46.getName();
        double double49 = highamHall54Integrator46.getSafety();
        int int50 = highamHall54Integrator46.getOrder();
        double double51 = highamHall54Integrator46.getMaxStep();
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
        highamHall54Integrator46.setStepHandler(stepHandler87);
        highamHall54Integrator37.setStepHandler(stepHandler87);
        highamHall54Integrator14.setStepHandler(stepHandler87);
        highamHall54Integrator4.setStepHandler(stepHandler87);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.9d + "'", double21 == 0.9d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Higham-Hall 5(4)" + "'", str48, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9d + "'", double49 == 0.9d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
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
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getMaxStep();
        double double12 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(32.0d);
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        double double75 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction(16.1245154965971d);
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
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.2d + "'", double75 == 0.2d);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        highamHall54Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 1, (double) 0L, (int) 'a');
        double double13 = highamHall54Integrator4.getMinReduction();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction((-1.0d));
        highamHall54Integrator4.setInitialStepSize(9.343446901438462d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 7.211102550927978d + "'", double14 == 7.211102550927978d);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) (short) 1, 1.0d, (double) (-1));
        double double5 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        highamHall54Integrator4.setInitialStepSize((double) 1);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int7 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(0.2d);
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        highamHall54Integrator16.addSwitchingFunction(switchingFunction17, (double) 0, (double) (byte) -1, (int) (byte) 1);
        highamHall54Integrator16.setMinReduction((double) ' ');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double29 = highamHall54Integrator28.getMaxGrowth();
        java.lang.String str30 = highamHall54Integrator28.getName();
        double double31 = highamHall54Integrator28.getSafety();
        int int32 = highamHall54Integrator28.getOrder();
        int int33 = highamHall54Integrator28.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler34);
        highamHall54Integrator4.setStepHandler(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        double double31 = highamHall54Integrator12.getSafety();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, (double) '4', (double) 100.0f);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) (short) 100, (double) '4', (double) (byte) -1);
        double double5 = highamHall54Integrator4.getMinReduction();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        double double31 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        int int6 = highamHall54Integrator4.getOrder();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) '#');
        double double10 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) (byte) 10, (double) 10, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) (-1));
        double double10 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) (short) -1);
        double double13 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setSafety((double) (-1));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (byte) 100, 35.0d, 0.0d);
        double double5 = highamHall54Integrator4.getMaxStep();
        double double6 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 1.0d, 1.0d, Double.NaN);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator12.getStepHandler();
        double double29 = highamHall54Integrator12.getSafety();
        java.lang.Class<?> wildcardClass30 = highamHall54Integrator12.getClass();
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
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        java.lang.String str66 = highamHall54Integrator4.getName();
        int int67 = highamHall54Integrator4.getOrder();
        double double68 = highamHall54Integrator4.getMinStep();
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Higham-Hall 5(4)" + "'", str66, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 5 + "'", int67 == 5);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1.0f), (double) 5, (double) 5, 0.9d);
        highamHall54Integrator4.setSafety((double) (short) 1);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        double double10 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, 0.0d, (double) 100, (double) '#');
        java.lang.Class<?> wildcardClass5 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 10, (double) (short) 100, 0.0d, 100.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
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
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 1.0f, 35.0d, (double) (-1L));
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 10L);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.9d);
        highamHall54Integrator4.setMinReduction(0.9d);
        double double10 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
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
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, (double) (byte) 100, 0.0d, 0.0d);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.1213203435596424d, 22.80350850198276d, (double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 32.0d, (double) (short) 100, (double) 1L);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, 0.0d, (double) 100.0f, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) -1, (double) '4', (double) (byte) 0, 22.80350850198276d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double5 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) 5);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 7.211102550927978d + "'", double8 == 7.211102550927978d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
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
}

