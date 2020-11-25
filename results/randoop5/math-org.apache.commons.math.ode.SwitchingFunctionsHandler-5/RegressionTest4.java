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
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray8 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean9 = switchingFunctionsHandler0.reset((double) 0.0f, doubleArray8);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray19 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean20 = switchingFunctionsHandler11.reset((double) 0.0f, doubleArray19);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        switchingFunctionsHandler11.add(switchingFunction21, 0.0d, (double) 100.0f, (int) (short) -1);
        double[] doubleArray27 = null;
        boolean boolean28 = switchingFunctionsHandler11.reset((double) (byte) 10, doubleArray27);
        double double29 = switchingFunctionsHandler11.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray39 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean40 = switchingFunctionsHandler31.reset((double) 0.0f, doubleArray39);
        boolean boolean41 = switchingFunctionsHandler11.reset((double) (byte) 1, doubleArray39);
        switchingFunctionsHandler0.stepAccepted((double) 100L, doubleArray39);
        boolean boolean43 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        boolean boolean3 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler0.add(switchingFunction6, (double) (short) 100, (double) ' ', (int) (short) 100);
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        boolean boolean12 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, 1.0d, (double) (short) -1, 1);
        double double7 = switchingFunctionsHandler0.getEventTime();
        boolean boolean8 = switchingFunctionsHandler0.stop();
        boolean boolean9 = switchingFunctionsHandler0.stop();
        boolean boolean10 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        switchingFunctionsHandler0.add(switchingFunction11, (double) 100, (-1.0d), (int) (short) -1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean18 = switchingFunctionsHandler17.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler17.add(switchingFunction19, 1.0d, (double) (short) -1, 1);
        boolean boolean24 = switchingFunctionsHandler17.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean27 = switchingFunctionsHandler26.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler26.add(switchingFunction28, 1.0d, (double) (short) -1, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        switchingFunctionsHandler26.add(switchingFunction33, (double) 0.0f, (double) ' ', 100);
        double[] doubleArray43 = new double[] { 10.0d, ' ', 10.0f, 0L };
        boolean boolean44 = switchingFunctionsHandler26.reset((double) 'a', doubleArray43);
        boolean boolean45 = switchingFunctionsHandler17.reset((double) (short) -1, doubleArray43);
        boolean boolean46 = switchingFunctionsHandler0.reset((double) (-1), doubleArray43);
        boolean boolean47 = switchingFunctionsHandler0.isEmpty();
        boolean boolean48 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = switchingFunctionsHandler0.evaluateStep(stepInterpolator49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 32.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray8 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean9 = switchingFunctionsHandler0.reset((double) 0.0f, doubleArray8);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler11.evaluateStep(stepInterpolator12);
        double[] doubleArray21 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean22 = switchingFunctionsHandler11.reset((double) (byte) 10, doubleArray21);
        boolean boolean23 = switchingFunctionsHandler0.reset((double) (-1.0f), doubleArray21);
        boolean boolean24 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler0.add(switchingFunction25, (double) 'a', (double) 100L, 10);
        double[] doubleArray31 = null;
        boolean boolean32 = switchingFunctionsHandler0.reset((double) (short) 10, doubleArray31);
        java.lang.Class<?> wildcardClass33 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler0.evaluateStep(stepInterpolator5);
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler9.evaluateStep(stepInterpolator10);
        double[] doubleArray19 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean20 = switchingFunctionsHandler9.reset((double) (byte) 10, doubleArray19);
        switchingFunctionsHandler0.stepAccepted((double) 1L, doubleArray19);
        boolean boolean22 = switchingFunctionsHandler0.stop();
        boolean boolean23 = switchingFunctionsHandler0.isEmpty();
        boolean boolean24 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler0.add(switchingFunction25, (double) 0, (double) (short) 10, (int) (byte) -1);
        double double30 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        switchingFunctionsHandler0.add(switchingFunction31, (double) 100L, 0.0d, (int) (byte) 10);
        boolean boolean36 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray8 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean9 = switchingFunctionsHandler0.reset((double) 0.0f, doubleArray8);
        double double10 = switchingFunctionsHandler0.getEventTime();
        boolean boolean11 = switchingFunctionsHandler0.stop();
        boolean boolean12 = switchingFunctionsHandler0.stop();
        boolean boolean13 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        switchingFunctionsHandler0.add(switchingFunction14, (-1.0d), 0.0d, 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray7 = null;
        boolean boolean8 = switchingFunctionsHandler3.reset((double) (byte) 100, doubleArray7);
        boolean boolean9 = switchingFunctionsHandler3.stop();
        double[] doubleArray12 = new double[] { 100.0d };
        boolean boolean13 = switchingFunctionsHandler3.reset((double) 100L, doubleArray12);
        boolean boolean14 = switchingFunctionsHandler0.reset(0.0d, doubleArray12);
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        boolean boolean16 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler0.add(switchingFunction17, (double) 0.0f, (double) 1.0f, (int) (byte) 1);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray13 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean14 = switchingFunctionsHandler3.reset((double) (byte) 10, doubleArray13);
        switchingFunctionsHandler0.stepAccepted((double) (byte) 0, doubleArray13);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler17 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray25 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean26 = switchingFunctionsHandler17.reset((double) 0.0f, doubleArray25);
        switchingFunctionsHandler0.stepAccepted((double) (-1), doubleArray25);
        boolean boolean28 = switchingFunctionsHandler0.isEmpty();
        boolean boolean29 = switchingFunctionsHandler0.isEmpty();
        boolean boolean30 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        switchingFunctionsHandler0.add(switchingFunction31, (double) (-1.0f), (double) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, 1.0d, (double) (short) -1, 1);
        double double7 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = null;
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        switchingFunctionsHandler0.add(switchingFunction11, (double) (-1.0f), (double) (-1.0f), (int) (byte) -1);
        double double16 = switchingFunctionsHandler0.getEventTime();
        boolean boolean17 = switchingFunctionsHandler0.isEmpty();
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray10 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean11 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray10);
        boolean boolean12 = switchingFunctionsHandler0.stop();
        double double13 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        boolean boolean15 = switchingFunctionsHandler0.evaluateStep(stepInterpolator14);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        switchingFunctionsHandler0.add(switchingFunction16, (double) '#', (double) 0.0f, (int) (byte) 0);
        boolean boolean21 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler23.evaluateStep(stepInterpolator24);
        boolean boolean26 = switchingFunctionsHandler23.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        boolean boolean28 = switchingFunctionsHandler23.evaluateStep(stepInterpolator27);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean31 = switchingFunctionsHandler30.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler33.evaluateStep(stepInterpolator34);
        double[] doubleArray43 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean44 = switchingFunctionsHandler33.reset((double) (byte) 10, doubleArray43);
        switchingFunctionsHandler30.stepAccepted((double) (byte) 0, doubleArray43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray55 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean56 = switchingFunctionsHandler47.reset((double) 0.0f, doubleArray55);
        switchingFunctionsHandler30.stepAccepted((double) (-1), doubleArray55);
        boolean boolean58 = switchingFunctionsHandler23.reset(10.0d, doubleArray55);
        boolean boolean59 = switchingFunctionsHandler0.reset((double) 0.0f, doubleArray55);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        switchingFunctionsHandler0.add(switchingFunction60, (-1.0d), (double) (short) -1, 1);
        boolean boolean65 = switchingFunctionsHandler0.stop();
        boolean boolean66 = switchingFunctionsHandler0.isEmpty();
        java.lang.Class<?> wildcardClass67 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        boolean boolean4 = switchingFunctionsHandler0.stop();
        boolean boolean5 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler0.add(switchingFunction6, (double) 0L, (double) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        boolean boolean2 = switchingFunctionsHandler0.stop();
        boolean boolean3 = switchingFunctionsHandler0.isEmpty();
        boolean boolean4 = switchingFunctionsHandler0.stop();
        boolean boolean5 = switchingFunctionsHandler0.stop();
        double[] doubleArray7 = null;
        switchingFunctionsHandler0.stepAccepted((double) (byte) 100, doubleArray7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, 1.0d, (double) (short) -1, 1);
        boolean boolean7 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean10 = switchingFunctionsHandler9.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        switchingFunctionsHandler9.add(switchingFunction11, 1.0d, (double) (short) -1, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        switchingFunctionsHandler9.add(switchingFunction16, (double) 0.0f, (double) ' ', 100);
        double[] doubleArray26 = new double[] { 10.0d, ' ', 10.0f, 0L };
        boolean boolean27 = switchingFunctionsHandler9.reset((double) 'a', doubleArray26);
        boolean boolean28 = switchingFunctionsHandler0.reset((double) 10.0f, doubleArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray38 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean39 = switchingFunctionsHandler30.reset((double) 0.0f, doubleArray38);
        boolean boolean40 = switchingFunctionsHandler0.reset((double) 1, doubleArray38);
        double double41 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        switchingFunctionsHandler0.add(switchingFunction42, Double.NaN, (double) '#', (int) (byte) 0);
        double double47 = switchingFunctionsHandler0.getEventTime();
        boolean boolean48 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler50.evaluateStep(stepInterpolator51);
        double[] doubleArray60 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean61 = switchingFunctionsHandler50.reset((double) (byte) 10, doubleArray60);
        boolean boolean62 = switchingFunctionsHandler50.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler64 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray72 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean73 = switchingFunctionsHandler64.reset((double) 0.0f, doubleArray72);
        double double74 = switchingFunctionsHandler64.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler76 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray84 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean85 = switchingFunctionsHandler76.reset((double) 0.0f, doubleArray84);
        switchingFunctionsHandler64.stepAccepted(0.0d, doubleArray84);
        boolean boolean87 = switchingFunctionsHandler50.reset((double) 1L, doubleArray84);
        boolean boolean88 = switchingFunctionsHandler0.reset((double) (-1), doubleArray84);
        double double89 = switchingFunctionsHandler0.getEventTime();
        boolean boolean90 = switchingFunctionsHandler0.stop();
        boolean boolean91 = switchingFunctionsHandler0.isEmpty();
        boolean boolean92 = switchingFunctionsHandler0.isEmpty();
        boolean boolean93 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 32.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        boolean boolean3 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean8 = switchingFunctionsHandler7.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        boolean boolean12 = switchingFunctionsHandler10.evaluateStep(stepInterpolator11);
        double[] doubleArray20 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean21 = switchingFunctionsHandler10.reset((double) (byte) 10, doubleArray20);
        switchingFunctionsHandler7.stepAccepted((double) (byte) 0, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray32 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean33 = switchingFunctionsHandler24.reset((double) 0.0f, doubleArray32);
        switchingFunctionsHandler7.stepAccepted((double) (-1), doubleArray32);
        boolean boolean35 = switchingFunctionsHandler0.reset(10.0d, doubleArray32);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler0.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler0.evaluateStep(stepInterpolator38);
        boolean boolean40 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        boolean boolean42 = switchingFunctionsHandler0.evaluateStep(stepInterpolator41);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        switchingFunctionsHandler0.add(switchingFunction43, 0.0d, (double) 1, (int) 'a');
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = switchingFunctionsHandler0.evaluateStep(stepInterpolator48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction2 = null;
        switchingFunctionsHandler0.add(switchingFunction2, 1.0d, (double) (short) -1, 1);
        double double7 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = null;
        boolean boolean10 = switchingFunctionsHandler0.reset((double) (byte) 1, doubleArray9);
        boolean boolean11 = switchingFunctionsHandler0.stop();
        boolean boolean12 = switchingFunctionsHandler0.stop();
        double double13 = switchingFunctionsHandler0.getEventTime();
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray10 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean11 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray10);
        boolean boolean12 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray22 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean23 = switchingFunctionsHandler14.reset((double) 0.0f, doubleArray22);
        double double24 = switchingFunctionsHandler14.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray34 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean35 = switchingFunctionsHandler26.reset((double) 0.0f, doubleArray34);
        switchingFunctionsHandler14.stepAccepted(0.0d, doubleArray34);
        boolean boolean37 = switchingFunctionsHandler0.reset((double) 1L, doubleArray34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler0.evaluateStep(stepInterpolator38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray10 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean11 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray10);
        boolean boolean12 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler0.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        switchingFunctionsHandler0.add(switchingFunction15, 0.0d, (double) (short) 0, (int) (byte) 100);
        boolean boolean20 = switchingFunctionsHandler0.isEmpty();
        boolean boolean21 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        switchingFunctionsHandler0.add(switchingFunction22, (double) 100, (double) (short) 10, (int) (short) 10);
        boolean boolean27 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray4 = null;
        boolean boolean5 = switchingFunctionsHandler0.reset((double) (byte) 100, doubleArray4);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        double[] doubleArray11 = new double[] { (short) -1, (short) -1 };
        switchingFunctionsHandler0.stepAccepted((double) ' ', doubleArray11);
        double double13 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler15.evaluateStep(stepInterpolator16);
        double[] doubleArray25 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean26 = switchingFunctionsHandler15.reset((double) (byte) 10, doubleArray25);
        boolean boolean27 = switchingFunctionsHandler15.stop();
        boolean boolean28 = switchingFunctionsHandler15.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        double[] doubleArray40 = new double[] { ' ', 10.0f, (byte) 10, (-1.0d), (-1.0d), 10 };
        boolean boolean41 = switchingFunctionsHandler30.reset((double) (byte) 10, doubleArray40);
        boolean boolean42 = switchingFunctionsHandler30.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler30.evaluateStep(stepInterpolator43);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        switchingFunctionsHandler30.add(switchingFunction45, 0.0d, (double) (short) 0, (int) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray59 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean60 = switchingFunctionsHandler51.reset((double) 0.0f, doubleArray59);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        switchingFunctionsHandler51.add(switchingFunction61, 0.0d, (double) 100.0f, (int) (short) -1);
        double[] doubleArray67 = null;
        boolean boolean68 = switchingFunctionsHandler51.reset((double) (byte) 10, doubleArray67);
        double double69 = switchingFunctionsHandler51.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler71 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray79 = new double[] { (short) 0, (-1.0d), (short) 100, (short) 10, '4', (short) -1 };
        boolean boolean80 = switchingFunctionsHandler71.reset((double) 0.0f, doubleArray79);
        boolean boolean81 = switchingFunctionsHandler51.reset((double) (byte) 1, doubleArray79);
        boolean boolean82 = switchingFunctionsHandler30.reset((double) ' ', doubleArray79);
        boolean boolean83 = switchingFunctionsHandler15.reset(100.0d, doubleArray79);
        boolean boolean84 = switchingFunctionsHandler0.reset((double) (-1), doubleArray79);
        boolean boolean85 = switchingFunctionsHandler0.isEmpty();
        boolean boolean86 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator87 = null;
        boolean boolean88 = switchingFunctionsHandler0.evaluateStep(stepInterpolator87);
        boolean boolean89 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[32.0, 10.0, 10.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, -1.0, 100.0, 10.0, 52.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }
}

