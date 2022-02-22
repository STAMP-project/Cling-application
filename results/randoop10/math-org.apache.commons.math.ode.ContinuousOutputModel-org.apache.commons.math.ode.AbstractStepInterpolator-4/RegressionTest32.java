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
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        double double9 = continuousOutputModel6.getFinalTime();
        boolean boolean10 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        double double12 = continuousOutputModel6.getFinalTime();
        double double13 = continuousOutputModel6.getInitialTime();
        double double14 = continuousOutputModel6.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel6.handleStep(stepInterpolator15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean2 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        double double13 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double15 = continuousOutputModel14.getFinalTime();
        double double16 = continuousOutputModel14.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel14);
        double double18 = continuousOutputModel10.getInitialTime();
        double double19 = continuousOutputModel10.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel20.reset();
        double double24 = continuousOutputModel20.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel20);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean29 = continuousOutputModel28.requiresDenseOutput();
        double double30 = continuousOutputModel28.getInitialTime();
        boolean boolean31 = continuousOutputModel28.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double33 = continuousOutputModel32.getFinalTime();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        boolean boolean37 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel28.append(continuousOutputModel32);
        continuousOutputModel26.append(continuousOutputModel28);
        continuousOutputModel10.append(continuousOutputModel28);
        double double41 = continuousOutputModel10.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel10);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        java.lang.Class<?> wildcardClass45 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double4 = continuousOutputModel3.getFinalTime();
        double double5 = continuousOutputModel3.getInitialTime();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel3.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        double double13 = continuousOutputModel7.getFinalTime();
        boolean boolean14 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        boolean boolean16 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel7.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        double double21 = continuousOutputModel19.getInitialTime();
        boolean boolean22 = continuousOutputModel19.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getFinalTime();
        double double25 = continuousOutputModel23.getInitialTime();
        boolean boolean26 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel23.reset();
        boolean boolean28 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel19.append(continuousOutputModel23);
        continuousOutputModel17.append(continuousOutputModel19);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean32 = continuousOutputModel31.requiresDenseOutput();
        boolean boolean33 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel31.reset();
        boolean boolean35 = continuousOutputModel31.requiresDenseOutput();
        boolean boolean36 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel31);
        boolean boolean38 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel31.reset();
        double double40 = continuousOutputModel31.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel31);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel42 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean43 = continuousOutputModel42.requiresDenseOutput();
        boolean boolean44 = continuousOutputModel42.requiresDenseOutput();
        continuousOutputModel42.reset();
        boolean boolean46 = continuousOutputModel42.requiresDenseOutput();
        double double47 = continuousOutputModel42.getFinalTime();
        boolean boolean48 = continuousOutputModel42.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel42.requiresDenseOutput();
        double double50 = continuousOutputModel42.getFinalTime();
        continuousOutputModel42.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean53 = continuousOutputModel52.requiresDenseOutput();
        boolean boolean54 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel52.reset();
        boolean boolean56 = continuousOutputModel52.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double58 = continuousOutputModel57.getFinalTime();
        double double59 = continuousOutputModel57.getInitialTime();
        boolean boolean60 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel52.append(continuousOutputModel57);
        double double62 = continuousOutputModel57.getInitialTime();
        double double63 = continuousOutputModel57.getFinalTime();
        continuousOutputModel57.reset();
        double double65 = continuousOutputModel57.getFinalTime();
        continuousOutputModel57.reset();
        boolean boolean67 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel42.append(continuousOutputModel57);
        continuousOutputModel42.reset();
        continuousOutputModel0.append(continuousOutputModel42);
        // The following exception was thrown during execution in test generation
        try {
            double double71 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean13 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        double double19 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel20.reset();
        boolean boolean24 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double26 = continuousOutputModel25.getFinalTime();
        double double27 = continuousOutputModel25.getInitialTime();
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel25);
        continuousOutputModel15.append(continuousOutputModel20);
        continuousOutputModel6.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        continuousOutputModel40.reset();
        boolean boolean46 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel15.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean52 = continuousOutputModel51.requiresDenseOutput();
        boolean boolean53 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel51.reset();
        boolean boolean55 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel51.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double58 = continuousOutputModel57.getFinalTime();
        continuousOutputModel57.reset();
        continuousOutputModel51.append(continuousOutputModel57);
        continuousOutputModel57.reset();
        boolean boolean62 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel57.reset();
        boolean boolean64 = continuousOutputModel57.requiresDenseOutput();
        boolean boolean65 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel40.append(continuousOutputModel57);
        continuousOutputModel57.reset();
        double double68 = continuousOutputModel57.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        double double17 = continuousOutputModel0.getInitialTime();
        double double18 = continuousOutputModel0.getInitialTime();
        boolean boolean19 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean20 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        continuousOutputModel21.reset();
        boolean boolean25 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel21);
        double double27 = continuousOutputModel21.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        double double10 = continuousOutputModel0.getInitialTime();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getFinalTime();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel16);
        double double20 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        double double25 = continuousOutputModel21.getInitialTime();
        continuousOutputModel21.reset();
        boolean boolean27 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel21);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        double double31 = continuousOutputModel29.getInitialTime();
        boolean boolean32 = continuousOutputModel29.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double34 = continuousOutputModel33.getFinalTime();
        double double35 = continuousOutputModel33.getInitialTime();
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        continuousOutputModel33.reset();
        boolean boolean38 = continuousOutputModel33.requiresDenseOutput();
        continuousOutputModel29.append(continuousOutputModel33);
        continuousOutputModel29.reset();
        continuousOutputModel21.append(continuousOutputModel29);
        continuousOutputModel0.append(continuousOutputModel21);
        boolean boolean43 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean47 = continuousOutputModel46.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel46);
        boolean boolean49 = continuousOutputModel46.requiresDenseOutput();
        double double50 = continuousOutputModel46.getFinalTime();
        double double51 = continuousOutputModel46.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean54 = continuousOutputModel53.requiresDenseOutput();
        boolean boolean55 = continuousOutputModel53.requiresDenseOutput();
        double double56 = continuousOutputModel53.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean58 = continuousOutputModel57.requiresDenseOutput();
        continuousOutputModel53.append(continuousOutputModel57);
        continuousOutputModel52.append(continuousOutputModel57);
        boolean boolean61 = continuousOutputModel57.requiresDenseOutput();
        double double62 = continuousOutputModel57.getInitialTime();
        continuousOutputModel57.reset();
        double double64 = continuousOutputModel57.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel65 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean66 = continuousOutputModel65.requiresDenseOutput();
        boolean boolean67 = continuousOutputModel65.requiresDenseOutput();
        continuousOutputModel65.reset();
        boolean boolean69 = continuousOutputModel65.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel70 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double71 = continuousOutputModel70.getFinalTime();
        double double72 = continuousOutputModel70.getInitialTime();
        boolean boolean73 = continuousOutputModel70.requiresDenseOutput();
        continuousOutputModel65.append(continuousOutputModel70);
        continuousOutputModel70.reset();
        double double76 = continuousOutputModel70.getInitialTime();
        double double77 = continuousOutputModel70.getFinalTime();
        continuousOutputModel57.append(continuousOutputModel70);
        double double79 = continuousOutputModel70.getInitialTime();
        double double80 = continuousOutputModel70.getInitialTime();
        boolean boolean81 = continuousOutputModel70.requiresDenseOutput();
        continuousOutputModel46.append(continuousOutputModel70);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator83 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel46.handleStep(stepInterpolator83, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.io.IOException iOException11 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException12 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException11);
        java.lang.Object[] objArray14 = mathException13.getArguments();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", objArray14);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double19 = continuousOutputModel18.getFinalTime();
        double double20 = continuousOutputModel18.getInitialTime();
        boolean boolean21 = continuousOutputModel18.requiresDenseOutput();
        double double22 = continuousOutputModel18.getInitialTime();
        java.io.IOException iOException25 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException25);
        java.io.IOException iOException30 = new java.io.IOException("hi!");
        java.io.IOException iOException31 = new java.io.IOException("", (java.lang.Throwable) iOException30);
        org.apache.commons.math.ode.DerivativeException derivativeException32 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException30);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double35 = continuousOutputModel34.getFinalTime();
        double double36 = continuousOutputModel34.getInitialTime();
        java.lang.Object[] objArray37 = new java.lang.Object[] { double22, mathException27, iOException30, false, continuousOutputModel34 };
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException47 = new org.apache.commons.math.ode.DerivativeException("", strArray46);
        java.io.IOException iOException51 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException52 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException51);
        java.lang.Object[] objArray54 = mathException53.getArguments();
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray46, (java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray37, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray14, (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", objArray14);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException59);
        java.lang.Throwable[] throwableArray62 = mathException61.getSuppressed();
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException77 = new org.apache.commons.math.ode.DerivativeException("", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException78 = new org.apache.commons.math.ode.DerivativeException("hi!", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException79 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: ", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException("", strArray76);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("", (java.lang.Object[]) strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException82 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.ode.DerivativeException: ", strArray76);
        org.apache.commons.math.ode.DerivativeException derivativeException83 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: java.io.IOException: ", strArray76);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException83);
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Object[]) throwableArray62, (java.lang.Throwable) mathException84);
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: java.io.IOException: hi!", (java.lang.Object[]) throwableArray62);
        java.io.IOException iOException89 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException90 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException89);
        org.apache.commons.math.MathException mathException91 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException89);
        java.io.IOException iOException92 = new java.io.IOException((java.lang.Throwable) mathException91);
        mathException86.addSuppressed((java.lang.Throwable) mathException91);
        java.io.IOException iOException94 = new java.io.IOException((java.lang.Throwable) mathException86);
        java.io.IOException iOException95 = new java.io.IOException((java.lang.Throwable) mathException86);
        org.apache.commons.math.MathException mathException96 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException86);
        java.io.IOException iOException97 = new java.io.IOException((java.lang.Throwable) mathException86);
        org.apache.commons.math.MathException mathException98 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException97);
        java.lang.Throwable[] throwableArray99 = mathException98.getSuppressed();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(throwableArray99);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        double double17 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean25 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel24);
        continuousOutputModel19.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel24.requiresDenseOutput();
        double double29 = continuousOutputModel24.getInitialTime();
        continuousOutputModel24.reset();
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        double double35 = continuousOutputModel32.getFinalTime();
        boolean boolean36 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        double double38 = continuousOutputModel32.getFinalTime();
        double double39 = continuousOutputModel32.getFinalTime();
        continuousOutputModel24.append(continuousOutputModel32);
        continuousOutputModel24.reset();
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean44 = continuousOutputModel43.requiresDenseOutput();
        double double45 = continuousOutputModel43.getInitialTime();
        boolean boolean46 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel43.append(continuousOutputModel47);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double52 = continuousOutputModel51.getFinalTime();
        double double53 = continuousOutputModel51.getInitialTime();
        boolean boolean54 = continuousOutputModel51.requiresDenseOutput();
        double double55 = continuousOutputModel51.getInitialTime();
        continuousOutputModel51.reset();
        boolean boolean57 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel43.append(continuousOutputModel51);
        continuousOutputModel51.reset();
        continuousOutputModel24.append(continuousOutputModel51);
        continuousOutputModel9.append(continuousOutputModel51);
        continuousOutputModel9.reset();
        boolean boolean63 = continuousOutputModel9.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        double double22 = continuousOutputModel0.getInitialTime();
        double double23 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean26 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean28 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        boolean boolean31 = continuousOutputModel29.requiresDenseOutput();
        double double32 = continuousOutputModel29.getFinalTime();
        continuousOutputModel29.reset();
        boolean boolean34 = continuousOutputModel29.requiresDenseOutput();
        continuousOutputModel29.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        double double39 = continuousOutputModel36.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean41 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel36.append(continuousOutputModel40);
        boolean boolean43 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel36.reset();
        continuousOutputModel29.append(continuousOutputModel36);
        boolean boolean46 = continuousOutputModel29.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double48 = continuousOutputModel47.getFinalTime();
        double double49 = continuousOutputModel47.getInitialTime();
        boolean boolean50 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel29.append(continuousOutputModel47);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean53 = continuousOutputModel52.requiresDenseOutput();
        boolean boolean54 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel52.reset();
        continuousOutputModel52.reset();
        boolean boolean57 = continuousOutputModel52.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double59 = continuousOutputModel58.getFinalTime();
        double double60 = continuousOutputModel58.getInitialTime();
        double double61 = continuousOutputModel58.getFinalTime();
        boolean boolean62 = continuousOutputModel58.requiresDenseOutput();
        continuousOutputModel52.append(continuousOutputModel58);
        boolean boolean64 = continuousOutputModel58.requiresDenseOutput();
        continuousOutputModel47.append(continuousOutputModel58);
        continuousOutputModel47.reset();
        continuousOutputModel0.append(continuousOutputModel47);
        continuousOutputModel47.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel69 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean70 = continuousOutputModel69.requiresDenseOutput();
        boolean boolean71 = continuousOutputModel69.requiresDenseOutput();
        continuousOutputModel69.reset();
        boolean boolean73 = continuousOutputModel69.requiresDenseOutput();
        continuousOutputModel69.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel75 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double76 = continuousOutputModel75.getFinalTime();
        continuousOutputModel75.reset();
        continuousOutputModel69.append(continuousOutputModel75);
        double double79 = continuousOutputModel75.getInitialTime();
        boolean boolean80 = continuousOutputModel75.requiresDenseOutput();
        continuousOutputModel47.append(continuousOutputModel75);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.reset();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean10 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        continuousOutputModel6.reset();
        double double13 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean13 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        double double19 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel20.reset();
        boolean boolean24 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double26 = continuousOutputModel25.getFinalTime();
        double double27 = continuousOutputModel25.getInitialTime();
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel25);
        continuousOutputModel15.append(continuousOutputModel20);
        continuousOutputModel6.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        continuousOutputModel40.reset();
        boolean boolean46 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel15.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel40.reset();
        continuousOutputModel40.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel40.handleStep(stepInterpolator53, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        double double12 = continuousOutputModel9.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel13);
        continuousOutputModel9.reset();
        boolean boolean17 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        double double24 = continuousOutputModel19.getFinalTime();
        boolean boolean25 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel19);
        continuousOutputModel4.append(continuousOutputModel19);
        continuousOutputModel19.reset();
        boolean boolean29 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.handleStep(stepInterpolator31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getInitialTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        double double19 = continuousOutputModel14.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        boolean boolean23 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel20.reset();
        double double25 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel26);
        continuousOutputModel14.append(continuousOutputModel26);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean32 = continuousOutputModel31.requiresDenseOutput();
        double double33 = continuousOutputModel31.getInitialTime();
        boolean boolean34 = continuousOutputModel31.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double36 = continuousOutputModel35.getFinalTime();
        double double37 = continuousOutputModel35.getInitialTime();
        boolean boolean38 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel35.reset();
        boolean boolean40 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel31.append(continuousOutputModel35);
        continuousOutputModel35.reset();
        double double43 = continuousOutputModel35.getInitialTime();
        continuousOutputModel35.reset();
        boolean boolean45 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel35);
        continuousOutputModel10.append(continuousOutputModel26);
        boolean boolean48 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        continuousOutputModel0.append(continuousOutputModel10);
        double double51 = continuousOutputModel10.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean13 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        double double19 = continuousOutputModel15.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean21 = continuousOutputModel20.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel20.reset();
        boolean boolean24 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double26 = continuousOutputModel25.getFinalTime();
        double double27 = continuousOutputModel25.getInitialTime();
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel20.append(continuousOutputModel25);
        continuousOutputModel15.append(continuousOutputModel20);
        continuousOutputModel6.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel36);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        double double44 = continuousOutputModel40.getInitialTime();
        continuousOutputModel40.reset();
        boolean boolean46 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel15.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        double double51 = continuousOutputModel40.getInitialTime();
        continuousOutputModel40.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double54 = continuousOutputModel53.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean56 = continuousOutputModel55.requiresDenseOutput();
        double double57 = continuousOutputModel55.getInitialTime();
        boolean boolean58 = continuousOutputModel55.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel59 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double60 = continuousOutputModel59.getFinalTime();
        double double61 = continuousOutputModel59.getInitialTime();
        boolean boolean62 = continuousOutputModel59.requiresDenseOutput();
        continuousOutputModel59.reset();
        boolean boolean64 = continuousOutputModel59.requiresDenseOutput();
        continuousOutputModel55.append(continuousOutputModel59);
        continuousOutputModel53.append(continuousOutputModel55);
        double double67 = continuousOutputModel53.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel68 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean69 = continuousOutputModel68.requiresDenseOutput();
        boolean boolean70 = continuousOutputModel68.requiresDenseOutput();
        continuousOutputModel68.reset();
        continuousOutputModel68.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double74 = continuousOutputModel73.getFinalTime();
        double double75 = continuousOutputModel73.getInitialTime();
        boolean boolean76 = continuousOutputModel73.requiresDenseOutput();
        continuousOutputModel73.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel78 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean79 = continuousOutputModel78.requiresDenseOutput();
        double double80 = continuousOutputModel78.getInitialTime();
        continuousOutputModel73.append(continuousOutputModel78);
        continuousOutputModel68.append(continuousOutputModel78);
        boolean boolean83 = continuousOutputModel68.requiresDenseOutput();
        boolean boolean84 = continuousOutputModel68.requiresDenseOutput();
        continuousOutputModel68.reset();
        continuousOutputModel53.append(continuousOutputModel68);
        continuousOutputModel68.reset();
        continuousOutputModel40.append(continuousOutputModel68);
        double double89 = continuousOutputModel68.getFinalTime();
        continuousOutputModel68.reset();
        continuousOutputModel68.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel68.setInterpolatedTime((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean26 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel21);
        continuousOutputModel17.reset();
        double double29 = continuousOutputModel17.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel17);
        continuousOutputModel17.reset();
        boolean boolean32 = continuousOutputModel17.requiresDenseOutput();
        double double33 = continuousOutputModel17.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean13 = continuousOutputModel5.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.setInterpolatedTime((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean4 = continuousOutputModel3.requiresDenseOutput();
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        continuousOutputModel3.reset();
        boolean boolean8 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        double double13 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel14);
        boolean boolean17 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        continuousOutputModel3.append(continuousOutputModel10);
        continuousOutputModel3.reset();
        continuousOutputModel0.append(continuousOutputModel3);
        double double22 = continuousOutputModel3.getFinalTime();
        boolean boolean23 = continuousOutputModel3.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel3.handleStep(stepInterpolator24, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        continuousOutputModel11.append(continuousOutputModel15);
        double double19 = continuousOutputModel11.getFinalTime();
        boolean boolean20 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean23 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        boolean boolean29 = continuousOutputModel26.requiresDenseOutput();
        double double30 = continuousOutputModel26.getInitialTime();
        continuousOutputModel26.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        boolean boolean34 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        boolean boolean36 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double38 = continuousOutputModel37.getFinalTime();
        double double39 = continuousOutputModel37.getInitialTime();
        boolean boolean40 = continuousOutputModel37.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel37);
        continuousOutputModel37.reset();
        double double43 = continuousOutputModel37.getInitialTime();
        double double44 = continuousOutputModel37.getFinalTime();
        continuousOutputModel37.reset();
        double double46 = continuousOutputModel37.getFinalTime();
        continuousOutputModel26.append(continuousOutputModel37);
        continuousOutputModel11.append(continuousOutputModel26);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel26.append(continuousOutputModel49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        boolean boolean14 = continuousOutputModel10.requiresDenseOutput();
        double double15 = continuousOutputModel10.getFinalTime();
        boolean boolean16 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean18 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        double double17 = continuousOutputModel14.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean20 = continuousOutputModel18.requiresDenseOutput();
        double double21 = continuousOutputModel18.getFinalTime();
        double double22 = continuousOutputModel18.getInitialTime();
        boolean boolean23 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel14.append(continuousOutputModel18);
        continuousOutputModel0.append(continuousOutputModel18);
        boolean boolean26 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean28 = continuousOutputModel18.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel18.setInterpolatedTime((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        double double11 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        double double13 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        continuousOutputModel7.reset();
        boolean boolean16 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        double double12 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        boolean boolean14 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double20 = continuousOutputModel19.getFinalTime();
        double double21 = continuousOutputModel19.getInitialTime();
        boolean boolean22 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel15.append(continuousOutputModel19);
        continuousOutputModel19.reset();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel28.reset();
        boolean boolean30 = continuousOutputModel28.requiresDenseOutput();
        continuousOutputModel19.append(continuousOutputModel28);
        continuousOutputModel5.append(continuousOutputModel19);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean34 = continuousOutputModel33.requiresDenseOutput();
        boolean boolean35 = continuousOutputModel33.requiresDenseOutput();
        double double36 = continuousOutputModel33.getFinalTime();
        continuousOutputModel33.reset();
        boolean boolean38 = continuousOutputModel33.requiresDenseOutput();
        continuousOutputModel33.reset();
        double double40 = continuousOutputModel33.getInitialTime();
        continuousOutputModel19.append(continuousOutputModel33);
        continuousOutputModel19.reset();
        double double43 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean8 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel7.requiresDenseOutput();
        continuousOutputModel7.reset();
        boolean boolean11 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getFinalTime();
        double double14 = continuousOutputModel12.getInitialTime();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel12);
        boolean boolean17 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel12);
        boolean boolean20 = continuousOutputModel0.requiresDenseOutput();
        double double21 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        double double12 = continuousOutputModel9.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel13);
        continuousOutputModel9.reset();
        boolean boolean17 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        double double24 = continuousOutputModel19.getFinalTime();
        boolean boolean25 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel19);
        continuousOutputModel4.append(continuousOutputModel19);
        continuousOutputModel19.reset();
        boolean boolean29 = continuousOutputModel19.requiresDenseOutput();
        double double30 = continuousOutputModel19.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel15.reset();
        boolean boolean20 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel11.append(continuousOutputModel15);
        continuousOutputModel7.append(continuousOutputModel11);
        double double23 = continuousOutputModel11.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel11);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double28 = continuousOutputModel0.getFinalTime();
        double double29 = continuousOutputModel0.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel13);
        double double17 = continuousOutputModel9.getInitialTime();
        double double18 = continuousOutputModel9.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel9);
        double double20 = continuousOutputModel9.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        continuousOutputModel4.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.reset();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel4.append(continuousOutputModel13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        double double24 = continuousOutputModel22.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel22);
        continuousOutputModel4.append(continuousOutputModel22);
        double double27 = continuousOutputModel4.getFinalTime();
        double double28 = continuousOutputModel4.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double13 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel14.requiresDenseOutput();
        double double22 = continuousOutputModel14.getInitialTime();
        boolean boolean23 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        double double28 = continuousOutputModel26.getInitialTime();
        boolean boolean29 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        boolean boolean33 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean35 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel30);
        continuousOutputModel24.append(continuousOutputModel26);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean39 = continuousOutputModel38.requiresDenseOutput();
        boolean boolean40 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel38.reset();
        boolean boolean42 = continuousOutputModel38.requiresDenseOutput();
        boolean boolean43 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel24.append(continuousOutputModel38);
        boolean boolean45 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel14.append(continuousOutputModel38);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel47.requiresDenseOutput();
        double double50 = continuousOutputModel47.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean52 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel47.append(continuousOutputModel51);
        continuousOutputModel47.reset();
        boolean boolean55 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel47.reset();
        boolean boolean57 = continuousOutputModel47.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean59 = continuousOutputModel58.requiresDenseOutput();
        boolean boolean60 = continuousOutputModel58.requiresDenseOutput();
        double double61 = continuousOutputModel58.getFinalTime();
        continuousOutputModel58.reset();
        boolean boolean63 = continuousOutputModel58.requiresDenseOutput();
        continuousOutputModel47.append(continuousOutputModel58);
        continuousOutputModel58.reset();
        continuousOutputModel14.append(continuousOutputModel58);
        boolean boolean67 = continuousOutputModel14.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        double double11 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        double double13 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        boolean boolean16 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getFinalTime();
        continuousOutputModel23.reset();
        continuousOutputModel17.append(continuousOutputModel23);
        boolean boolean27 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean28 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.handleStep(stepInterpolator30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean16 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        double double18 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        boolean boolean27 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        double double31 = continuousOutputModel29.getInitialTime();
        continuousOutputModel24.append(continuousOutputModel29);
        continuousOutputModel19.append(continuousOutputModel29);
        boolean boolean34 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean35 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel19);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel19.setInterpolatedTime((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        double double12 = continuousOutputModel5.getFinalTime();
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        double double17 = continuousOutputModel15.getInitialTime();
        continuousOutputModel15.reset();
        continuousOutputModel15.reset();
        continuousOutputModel5.append(continuousOutputModel15);
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        double double10 = continuousOutputModel0.getInitialTime();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getFinalTime();
        double double14 = continuousOutputModel12.getInitialTime();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel16);
        double double20 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        double double25 = continuousOutputModel21.getInitialTime();
        continuousOutputModel21.reset();
        boolean boolean27 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel21);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean30 = continuousOutputModel29.requiresDenseOutput();
        double double31 = continuousOutputModel29.getInitialTime();
        boolean boolean32 = continuousOutputModel29.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double34 = continuousOutputModel33.getFinalTime();
        double double35 = continuousOutputModel33.getInitialTime();
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        continuousOutputModel33.reset();
        boolean boolean38 = continuousOutputModel33.requiresDenseOutput();
        continuousOutputModel29.append(continuousOutputModel33);
        continuousOutputModel29.reset();
        continuousOutputModel21.append(continuousOutputModel29);
        continuousOutputModel0.append(continuousOutputModel21);
        boolean boolean43 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double45 = continuousOutputModel0.getInitialTime();
        boolean boolean46 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel47.reset();
        boolean boolean51 = continuousOutputModel47.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double53 = continuousOutputModel52.getFinalTime();
        double double54 = continuousOutputModel52.getInitialTime();
        boolean boolean55 = continuousOutputModel52.requiresDenseOutput();
        continuousOutputModel47.append(continuousOutputModel52);
        boolean boolean57 = continuousOutputModel52.requiresDenseOutput();
        double double58 = continuousOutputModel52.getFinalTime();
        continuousOutputModel52.reset();
        double double60 = continuousOutputModel52.getFinalTime();
        continuousOutputModel52.reset();
        double double62 = continuousOutputModel52.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel52);
        continuousOutputModel0.reset();
        double double65 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray67 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        double double9 = continuousOutputModel4.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        double double15 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel16);
        continuousOutputModel4.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double26 = continuousOutputModel25.getFinalTime();
        double double27 = continuousOutputModel25.getInitialTime();
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel25.reset();
        boolean boolean30 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel25.reset();
        double double33 = continuousOutputModel25.getInitialTime();
        continuousOutputModel25.reset();
        boolean boolean35 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel16.append(continuousOutputModel25);
        continuousOutputModel0.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double39 = continuousOutputModel38.getFinalTime();
        double double40 = continuousOutputModel38.getInitialTime();
        boolean boolean41 = continuousOutputModel38.requiresDenseOutput();
        double double42 = continuousOutputModel38.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean44 = continuousOutputModel43.requiresDenseOutput();
        boolean boolean45 = continuousOutputModel43.requiresDenseOutput();
        continuousOutputModel43.reset();
        boolean boolean47 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double49 = continuousOutputModel48.getFinalTime();
        double double50 = continuousOutputModel48.getInitialTime();
        boolean boolean51 = continuousOutputModel48.requiresDenseOutput();
        continuousOutputModel43.append(continuousOutputModel48);
        continuousOutputModel38.append(continuousOutputModel43);
        boolean boolean54 = continuousOutputModel43.requiresDenseOutput();
        double double55 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        continuousOutputModel0.append(continuousOutputModel43);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean59 = continuousOutputModel58.requiresDenseOutput();
        boolean boolean60 = continuousOutputModel58.requiresDenseOutput();
        double double61 = continuousOutputModel58.getFinalTime();
        continuousOutputModel58.reset();
        boolean boolean63 = continuousOutputModel58.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean65 = continuousOutputModel64.requiresDenseOutput();
        boolean boolean66 = continuousOutputModel64.requiresDenseOutput();
        continuousOutputModel64.reset();
        boolean boolean68 = continuousOutputModel64.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel69 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double70 = continuousOutputModel69.getFinalTime();
        double double71 = continuousOutputModel69.getInitialTime();
        boolean boolean72 = continuousOutputModel69.requiresDenseOutput();
        continuousOutputModel64.append(continuousOutputModel69);
        boolean boolean74 = continuousOutputModel64.requiresDenseOutput();
        boolean boolean75 = continuousOutputModel64.requiresDenseOutput();
        continuousOutputModel58.append(continuousOutputModel64);
        continuousOutputModel43.append(continuousOutputModel58);
        boolean boolean78 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel79 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double80 = continuousOutputModel79.getFinalTime();
        continuousOutputModel79.reset();
        continuousOutputModel79.reset();
        double double83 = continuousOutputModel79.getInitialTime();
        continuousOutputModel79.reset();
        continuousOutputModel43.append(continuousOutputModel79);
        java.lang.Class<?> wildcardClass86 = continuousOutputModel79.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        boolean boolean14 = continuousOutputModel10.requiresDenseOutput();
        double double15 = continuousOutputModel10.getFinalTime();
        boolean boolean16 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel10);
        continuousOutputModel0.reset();
        boolean boolean19 = continuousOutputModel0.requiresDenseOutput();
        double double20 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        boolean boolean27 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel24.reset();
        boolean boolean29 = continuousOutputModel24.requiresDenseOutput();
        boolean boolean30 = continuousOutputModel24.requiresDenseOutput();
        double double31 = continuousOutputModel24.getInitialTime();
        continuousOutputModel21.append(continuousOutputModel24);
        double double33 = continuousOutputModel21.getFinalTime();
        double double34 = continuousOutputModel21.getInitialTime();
        boolean boolean35 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel21);
        continuousOutputModel21.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel21.handleStep(stepInterpolator38, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        double double5 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean20 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        continuousOutputModel6.append(continuousOutputModel13);
        boolean boolean23 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        double double25 = continuousOutputModel6.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        double double28 = continuousOutputModel26.getInitialTime();
        boolean boolean29 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        boolean boolean33 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean35 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        double double38 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        continuousOutputModel6.append(continuousOutputModel30);
        double double41 = continuousOutputModel6.getInitialTime();
        continuousOutputModel6.reset();
        boolean boolean43 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel8.requiresDenseOutput();
        double double11 = continuousOutputModel8.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel8.append(continuousOutputModel12);
        continuousOutputModel7.append(continuousOutputModel12);
        double double16 = continuousOutputModel7.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel7.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double20 = continuousOutputModel19.getFinalTime();
        double double21 = continuousOutputModel19.getInitialTime();
        continuousOutputModel19.reset();
        double double23 = continuousOutputModel19.getInitialTime();
        boolean boolean24 = continuousOutputModel19.requiresDenseOutput();
        double double25 = continuousOutputModel19.getFinalTime();
        continuousOutputModel19.reset();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel19);
        boolean boolean29 = continuousOutputModel7.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        boolean boolean17 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double19 = continuousOutputModel18.getFinalTime();
        double double20 = continuousOutputModel18.getInitialTime();
        boolean boolean21 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel13.append(continuousOutputModel18);
        double double23 = continuousOutputModel18.getInitialTime();
        continuousOutputModel18.reset();
        boolean boolean25 = continuousOutputModel18.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.reset();
        continuousOutputModel26.reset();
        continuousOutputModel18.append(continuousOutputModel26);
        continuousOutputModel0.append(continuousOutputModel26);
        continuousOutputModel26.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getFinalTime();
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        java.io.IOException iOException8 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException8);
        java.lang.Object[] objArray11 = mathException10.getArguments();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", objArray11);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        double double19 = continuousOutputModel15.getInitialTime();
        java.io.IOException iOException22 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException22);
        java.io.IOException iOException27 = new java.io.IOException("hi!");
        java.io.IOException iOException28 = new java.io.IOException("", (java.lang.Throwable) iOException27);
        org.apache.commons.math.ode.DerivativeException derivativeException29 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException27);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getFinalTime();
        double double33 = continuousOutputModel31.getInitialTime();
        java.lang.Object[] objArray34 = new java.lang.Object[] { double19, mathException24, iOException27, false, continuousOutputModel31 };
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException44 = new org.apache.commons.math.ode.DerivativeException("", strArray43);
        java.io.IOException iOException48 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException49 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException48);
        java.lang.Object[] objArray51 = mathException50.getArguments();
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray43, (java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray34, (java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray11, (java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", objArray11);
        org.apache.commons.math.ode.DerivativeException derivativeException57 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException56);
        java.lang.Object[] objArray58 = mathException56.getArguments();
        java.io.IOException iOException62 = new java.io.IOException("hi!");
        java.io.IOException iOException63 = new java.io.IOException("", (java.lang.Throwable) iOException62);
        java.io.IOException iOException64 = new java.io.IOException((java.lang.Throwable) iOException63);
        java.io.IOException iOException69 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException70 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException69);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException69);
        java.lang.Object[] objArray72 = mathException71.getArguments();
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray72);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray72, (java.lang.Throwable) mathException75);
        iOException64.addSuppressed((java.lang.Throwable) mathException76);
        java.lang.String str78 = mathException76.getPattern();
        java.io.IOException iOException79 = new java.io.IOException("", (java.lang.Throwable) mathException76);
        org.apache.commons.math.ode.DerivativeException derivativeException80 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException76);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray58, (java.lang.Throwable) mathException76);
        java.io.IOException iOException82 = new java.io.IOException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException76);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str78, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel17);
        boolean boolean23 = continuousOutputModel9.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean25 = continuousOutputModel24.requiresDenseOutput();
        double double26 = continuousOutputModel24.getInitialTime();
        double double27 = continuousOutputModel24.getInitialTime();
        double double28 = continuousOutputModel24.getInitialTime();
        boolean boolean29 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel9.append(continuousOutputModel24);
        boolean boolean31 = continuousOutputModel24.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel24.handleStep(stepInterpolator32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        double double13 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double15 = continuousOutputModel14.getFinalTime();
        double double16 = continuousOutputModel14.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel14);
        double double18 = continuousOutputModel10.getInitialTime();
        double double19 = continuousOutputModel10.getFinalTime();
        continuousOutputModel10.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        boolean boolean23 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean25 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        boolean boolean29 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel21.append(continuousOutputModel26);
        continuousOutputModel26.reset();
        double double32 = continuousOutputModel26.getInitialTime();
        double double33 = continuousOutputModel26.getFinalTime();
        continuousOutputModel26.reset();
        boolean boolean35 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        double double38 = continuousOutputModel36.getInitialTime();
        boolean boolean39 = continuousOutputModel36.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel40.reset();
        boolean boolean45 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel36.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel40.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel49.reset();
        boolean boolean51 = continuousOutputModel49.requiresDenseOutput();
        continuousOutputModel40.append(continuousOutputModel49);
        continuousOutputModel26.append(continuousOutputModel40);
        continuousOutputModel10.append(continuousOutputModel26);
        boolean boolean55 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel26);
        java.lang.Class<?> wildcardClass57 = continuousOutputModel26.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel4.reset();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        double double9 = continuousOutputModel4.getInitialTime();
        continuousOutputModel4.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = continuousOutputModel4.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double4 = continuousOutputModel0.getInitialTime();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getFinalTime();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean10 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        continuousOutputModel9.reset();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = continuousOutputModel9.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean17 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator18, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean7 = continuousOutputModel6.requiresDenseOutput();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel6);
        double double11 = continuousOutputModel6.getFinalTime();
        boolean boolean12 = continuousOutputModel6.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double14 = continuousOutputModel13.getFinalTime();
        double double15 = continuousOutputModel13.getInitialTime();
        double double16 = continuousOutputModel13.getFinalTime();
        boolean boolean17 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel24);
        double double28 = continuousOutputModel20.getInitialTime();
        double double29 = continuousOutputModel20.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        continuousOutputModel30.reset();
        double double34 = continuousOutputModel30.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel30);
        double double36 = continuousOutputModel30.getInitialTime();
        double double37 = continuousOutputModel30.getFinalTime();
        boolean boolean38 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel13.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        continuousOutputModel6.append(continuousOutputModel30);
        double double42 = continuousOutputModel6.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean44 = continuousOutputModel43.requiresDenseOutput();
        double double45 = continuousOutputModel43.getInitialTime();
        boolean boolean46 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean48 = continuousOutputModel47.requiresDenseOutput();
        boolean boolean49 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel43.append(continuousOutputModel47);
        boolean boolean51 = continuousOutputModel43.requiresDenseOutput();
        double double52 = continuousOutputModel43.getFinalTime();
        double double53 = continuousOutputModel43.getInitialTime();
        continuousOutputModel6.append(continuousOutputModel43);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel6.handleStep(stepInterpolator55, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean13 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel11.append(continuousOutputModel16);
        continuousOutputModel16.reset();
        double double22 = continuousOutputModel16.getInitialTime();
        double double23 = continuousOutputModel16.getFinalTime();
        continuousOutputModel16.reset();
        boolean boolean25 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        double double28 = continuousOutputModel26.getInitialTime();
        boolean boolean29 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        boolean boolean33 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean35 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        continuousOutputModel30.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel39.reset();
        boolean boolean41 = continuousOutputModel39.requiresDenseOutput();
        continuousOutputModel30.append(continuousOutputModel39);
        continuousOutputModel16.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        continuousOutputModel0.append(continuousOutputModel30);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean47 = continuousOutputModel46.requiresDenseOutput();
        boolean boolean48 = continuousOutputModel46.requiresDenseOutput();
        double double49 = continuousOutputModel46.getFinalTime();
        continuousOutputModel46.reset();
        boolean boolean51 = continuousOutputModel46.requiresDenseOutput();
        boolean boolean52 = continuousOutputModel46.requiresDenseOutput();
        double double53 = continuousOutputModel46.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel46);
        // The following exception was thrown during execution in test generation
        try {
            double double55 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        double double17 = continuousOutputModel12.getFinalTime();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel5.reset();
        double double20 = continuousOutputModel5.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException13 = new org.apache.commons.math.ode.DerivativeException("", strArray12);
        java.io.IOException iOException17 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException18 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException17);
        java.lang.Object[] objArray20 = mathException19.getArguments();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray12, (java.lang.Throwable) mathException19);
        org.apache.commons.math.ode.DerivativeException derivativeException23 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException24 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: java.io.IOException: java.io.IOException: ", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException25 = new org.apache.commons.math.ode.DerivativeException("java.io.IOException", strArray12);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", strArray12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getFinalTime();
        double double31 = continuousOutputModel29.getInitialTime();
        boolean boolean32 = continuousOutputModel29.requiresDenseOutput();
        double double33 = continuousOutputModel29.getInitialTime();
        java.io.IOException iOException36 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException37 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException36);
        java.io.IOException iOException41 = new java.io.IOException("hi!");
        java.io.IOException iOException42 = new java.io.IOException("", (java.lang.Throwable) iOException41);
        org.apache.commons.math.ode.DerivativeException derivativeException43 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException41);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double46 = continuousOutputModel45.getFinalTime();
        double double47 = continuousOutputModel45.getInitialTime();
        java.lang.Object[] objArray48 = new java.lang.Object[] { double33, mathException38, iOException41, false, continuousOutputModel45 };
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException58 = new org.apache.commons.math.ode.DerivativeException("", strArray57);
        java.io.IOException iOException62 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException63 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException62);
        java.lang.Object[] objArray65 = mathException64.getArguments();
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException64);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray57, (java.lang.Throwable) mathException64);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray48, (java.lang.Throwable) mathException67);
        java.lang.String str69 = mathException68.getPattern();
        java.lang.String str70 = mathException68.getPattern();
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.ode.DerivativeException: java.io.IOException: java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException68);
        derivativeException26.addSuppressed((java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException26);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str69, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str70, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        double double15 = continuousOutputModel13.getInitialTime();
        double double16 = continuousOutputModel13.getFinalTime();
        boolean boolean17 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        double double19 = continuousOutputModel13.getFinalTime();
        double double20 = continuousOutputModel13.getFinalTime();
        continuousOutputModel13.reset();
        continuousOutputModel5.append(continuousOutputModel13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getFinalTime();
        double double25 = continuousOutputModel23.getInitialTime();
        boolean boolean26 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel23.reset();
        boolean boolean28 = continuousOutputModel23.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel23.requiresDenseOutput();
        double double30 = continuousOutputModel23.getInitialTime();
        double double31 = continuousOutputModel23.getFinalTime();
        continuousOutputModel13.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double34 = continuousOutputModel33.getFinalTime();
        double double35 = continuousOutputModel33.getInitialTime();
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        double double37 = continuousOutputModel33.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean39 = continuousOutputModel38.requiresDenseOutput();
        boolean boolean40 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel38.reset();
        boolean boolean42 = continuousOutputModel38.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double44 = continuousOutputModel43.getFinalTime();
        double double45 = continuousOutputModel43.getInitialTime();
        boolean boolean46 = continuousOutputModel43.requiresDenseOutput();
        continuousOutputModel38.append(continuousOutputModel43);
        continuousOutputModel33.append(continuousOutputModel38);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean50 = continuousOutputModel49.requiresDenseOutput();
        double double51 = continuousOutputModel49.getInitialTime();
        boolean boolean52 = continuousOutputModel49.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean54 = continuousOutputModel53.requiresDenseOutput();
        boolean boolean55 = continuousOutputModel53.requiresDenseOutput();
        continuousOutputModel49.append(continuousOutputModel53);
        continuousOutputModel38.append(continuousOutputModel49);
        double double58 = continuousOutputModel49.getFinalTime();
        continuousOutputModel23.append(continuousOutputModel49);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel23.handleStep(stepInterpolator60, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        continuousOutputModel6.reset();
        continuousOutputModel0.append(continuousOutputModel6);
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        double double11 = continuousOutputModel0.getInitialTime();
        double double12 = continuousOutputModel0.getInitialTime();
        double double13 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel8.requiresDenseOutput();
        double double11 = continuousOutputModel8.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel8.append(continuousOutputModel12);
        continuousOutputModel7.append(continuousOutputModel12);
        double double16 = continuousOutputModel7.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel7.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        boolean boolean27 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel19.append(continuousOutputModel24);
        boolean boolean29 = continuousOutputModel24.requiresDenseOutput();
        boolean boolean30 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean33 = continuousOutputModel32.requiresDenseOutput();
        boolean boolean34 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel32.reset();
        boolean boolean36 = continuousOutputModel32.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double38 = continuousOutputModel37.getFinalTime();
        double double39 = continuousOutputModel37.getInitialTime();
        boolean boolean40 = continuousOutputModel37.requiresDenseOutput();
        continuousOutputModel32.append(continuousOutputModel37);
        continuousOutputModel37.reset();
        double double43 = continuousOutputModel37.getInitialTime();
        double double44 = continuousOutputModel37.getFinalTime();
        continuousOutputModel37.reset();
        continuousOutputModel37.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel47.reset();
        continuousOutputModel47.reset();
        continuousOutputModel37.append(continuousOutputModel47);
        continuousOutputModel24.append(continuousOutputModel47);
        continuousOutputModel24.reset();
        continuousOutputModel24.reset();
        double double54 = continuousOutputModel24.getFinalTime();
        continuousOutputModel7.append(continuousOutputModel24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean57 = continuousOutputModel56.requiresDenseOutput();
        boolean boolean58 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel56.reset();
        continuousOutputModel56.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double62 = continuousOutputModel61.getFinalTime();
        double double63 = continuousOutputModel61.getInitialTime();
        boolean boolean64 = continuousOutputModel61.requiresDenseOutput();
        continuousOutputModel61.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean67 = continuousOutputModel66.requiresDenseOutput();
        double double68 = continuousOutputModel66.getInitialTime();
        continuousOutputModel61.append(continuousOutputModel66);
        continuousOutputModel56.append(continuousOutputModel66);
        boolean boolean71 = continuousOutputModel56.requiresDenseOutput();
        boolean boolean72 = continuousOutputModel56.requiresDenseOutput();
        double double73 = continuousOutputModel56.getFinalTime();
        boolean boolean74 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel7.append(continuousOutputModel56);
        continuousOutputModel7.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel7.handleStep(stepInterpolator77, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean5 = continuousOutputModel0.requiresDenseOutput();
        double double6 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        double double11 = continuousOutputModel7.getInitialTime();
        continuousOutputModel7.reset();
        boolean boolean13 = continuousOutputModel7.requiresDenseOutput();
        double double14 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean19 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean20 = continuousOutputModel18.requiresDenseOutput();
        double double21 = continuousOutputModel18.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel18.append(continuousOutputModel22);
        continuousOutputModel17.append(continuousOutputModel22);
        boolean boolean26 = continuousOutputModel22.requiresDenseOutput();
        double double27 = continuousOutputModel22.getInitialTime();
        continuousOutputModel22.reset();
        double double29 = continuousOutputModel22.getInitialTime();
        boolean boolean30 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel22);
        boolean boolean32 = continuousOutputModel0.requiresDenseOutput();
        double double33 = continuousOutputModel0.getInitialTime();
        boolean boolean34 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean35 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel36.reset();
        boolean boolean40 = continuousOutputModel36.requiresDenseOutput();
        double double41 = continuousOutputModel36.getFinalTime();
        boolean boolean42 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean43 = continuousOutputModel36.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean45 = continuousOutputModel44.requiresDenseOutput();
        double double46 = continuousOutputModel44.getInitialTime();
        boolean boolean47 = continuousOutputModel44.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double49 = continuousOutputModel48.getFinalTime();
        double double50 = continuousOutputModel48.getInitialTime();
        boolean boolean51 = continuousOutputModel48.requiresDenseOutput();
        continuousOutputModel48.reset();
        boolean boolean53 = continuousOutputModel48.requiresDenseOutput();
        continuousOutputModel44.append(continuousOutputModel48);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double56 = continuousOutputModel55.getFinalTime();
        double double57 = continuousOutputModel55.getInitialTime();
        boolean boolean58 = continuousOutputModel55.requiresDenseOutput();
        continuousOutputModel55.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean61 = continuousOutputModel60.requiresDenseOutput();
        double double62 = continuousOutputModel60.getInitialTime();
        continuousOutputModel55.append(continuousOutputModel60);
        continuousOutputModel44.append(continuousOutputModel55);
        double double65 = continuousOutputModel55.getFinalTime();
        continuousOutputModel36.append(continuousOutputModel55);
        continuousOutputModel55.reset();
        double double68 = continuousOutputModel55.getFinalTime();
        continuousOutputModel55.reset();
        continuousOutputModel0.append(continuousOutputModel55);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean6 = continuousOutputModel5.requiresDenseOutput();
        double double7 = continuousOutputModel5.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean11 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        boolean boolean13 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean14 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        continuousOutputModel8.reset();
        double double14 = continuousOutputModel8.getFinalTime();
        double double15 = continuousOutputModel8.getInitialTime();
        boolean boolean16 = continuousOutputModel8.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = continuousOutputModel8.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean13 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean16 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel17);
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        double double23 = continuousOutputModel17.getFinalTime();
        continuousOutputModel17.reset();
        continuousOutputModel5.append(continuousOutputModel17);
        double double26 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double28 = continuousOutputModel27.getFinalTime();
        double double29 = continuousOutputModel27.getInitialTime();
        double double30 = continuousOutputModel27.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getFinalTime();
        double double33 = continuousOutputModel31.getInitialTime();
        continuousOutputModel27.append(continuousOutputModel31);
        double double35 = continuousOutputModel27.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double37 = continuousOutputModel36.getFinalTime();
        double double38 = continuousOutputModel36.getInitialTime();
        boolean boolean39 = continuousOutputModel36.requiresDenseOutput();
        double double40 = continuousOutputModel36.getInitialTime();
        continuousOutputModel36.reset();
        boolean boolean42 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel27.append(continuousOutputModel36);
        double double44 = continuousOutputModel27.getInitialTime();
        continuousOutputModel27.reset();
        boolean boolean46 = continuousOutputModel27.requiresDenseOutput();
        double double47 = continuousOutputModel27.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel27);
        continuousOutputModel5.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean11 = continuousOutputModel10.requiresDenseOutput();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel0.append(continuousOutputModel10);
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double18 = continuousOutputModel0.getInitialTime();
        boolean boolean19 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean20 = continuousOutputModel0.requiresDenseOutput();
        double double21 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getFinalTime();
        double double25 = continuousOutputModel23.getInitialTime();
        continuousOutputModel23.reset();
        boolean boolean27 = continuousOutputModel23.requiresDenseOutput();
        double double28 = continuousOutputModel23.getFinalTime();
        double double29 = continuousOutputModel23.getFinalTime();
        boolean boolean30 = continuousOutputModel23.requiresDenseOutput();
        boolean boolean31 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel23);
        continuousOutputModel23.reset();
        double double34 = continuousOutputModel23.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("", strArray8);
        java.io.IOException iOException15 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException16 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException15);
        java.lang.Object[] objArray18 = mathException17.getArguments();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", objArray18);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        double double26 = continuousOutputModel22.getInitialTime();
        java.io.IOException iOException29 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException30 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException29);
        java.io.IOException iOException34 = new java.io.IOException("hi!");
        java.io.IOException iOException35 = new java.io.IOException("", (java.lang.Throwable) iOException34);
        org.apache.commons.math.ode.DerivativeException derivativeException36 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException34);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double39 = continuousOutputModel38.getFinalTime();
        double double40 = continuousOutputModel38.getInitialTime();
        java.lang.Object[] objArray41 = new java.lang.Object[] { double26, mathException31, iOException34, false, continuousOutputModel38 };
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException51 = new org.apache.commons.math.ode.DerivativeException("", strArray50);
        java.io.IOException iOException55 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException56 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException55);
        java.lang.Object[] objArray58 = mathException57.getArguments();
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray50, (java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray41, (java.lang.Throwable) mathException60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray18, (java.lang.Throwable) mathException61);
        derivativeException9.addSuppressed((java.lang.Throwable) mathException61);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) derivativeException9);
        java.lang.String str65 = mathException64.getPattern();
        java.lang.String str66 = mathException64.getPattern();
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException64);
        org.apache.commons.math.ode.DerivativeException derivativeException68 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException67);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str65, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str66, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        double double11 = continuousOutputModel0.getFinalTime();
        double double12 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean16 = continuousOutputModel15.requiresDenseOutput();
        boolean boolean17 = continuousOutputModel15.requiresDenseOutput();
        double double18 = continuousOutputModel15.getFinalTime();
        continuousOutputModel15.reset();
        boolean boolean20 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel15.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean23 = continuousOutputModel22.requiresDenseOutput();
        boolean boolean24 = continuousOutputModel22.requiresDenseOutput();
        double double25 = continuousOutputModel22.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel22.append(continuousOutputModel26);
        boolean boolean29 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        continuousOutputModel15.append(continuousOutputModel22);
        boolean boolean32 = continuousOutputModel15.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double34 = continuousOutputModel33.getFinalTime();
        double double35 = continuousOutputModel33.getInitialTime();
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        continuousOutputModel15.append(continuousOutputModel33);
        continuousOutputModel0.append(continuousOutputModel33);
        boolean boolean39 = continuousOutputModel33.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean41 = continuousOutputModel40.requiresDenseOutput();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double45 = continuousOutputModel44.getFinalTime();
        double double46 = continuousOutputModel44.getInitialTime();
        boolean boolean47 = continuousOutputModel44.requiresDenseOutput();
        continuousOutputModel44.reset();
        boolean boolean49 = continuousOutputModel44.requiresDenseOutput();
        continuousOutputModel40.append(continuousOutputModel44);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double52 = continuousOutputModel51.getFinalTime();
        double double53 = continuousOutputModel51.getInitialTime();
        boolean boolean54 = continuousOutputModel51.requiresDenseOutput();
        continuousOutputModel51.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean57 = continuousOutputModel56.requiresDenseOutput();
        double double58 = continuousOutputModel56.getInitialTime();
        continuousOutputModel51.append(continuousOutputModel56);
        continuousOutputModel40.append(continuousOutputModel51);
        boolean boolean61 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel62 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double63 = continuousOutputModel62.getFinalTime();
        double double64 = continuousOutputModel62.getInitialTime();
        double double65 = continuousOutputModel62.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double67 = continuousOutputModel66.getFinalTime();
        double double68 = continuousOutputModel66.getInitialTime();
        continuousOutputModel62.append(continuousOutputModel66);
        double double70 = continuousOutputModel62.getFinalTime();
        boolean boolean71 = continuousOutputModel62.requiresDenseOutput();
        boolean boolean72 = continuousOutputModel62.requiresDenseOutput();
        double double73 = continuousOutputModel62.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel62);
        continuousOutputModel62.reset();
        boolean boolean76 = continuousOutputModel62.requiresDenseOutput();
        continuousOutputModel62.reset();
        continuousOutputModel33.append(continuousOutputModel62);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel79 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean80 = continuousOutputModel79.requiresDenseOutput();
        boolean boolean81 = continuousOutputModel79.requiresDenseOutput();
        continuousOutputModel79.reset();
        boolean boolean83 = continuousOutputModel79.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel84 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double85 = continuousOutputModel84.getFinalTime();
        double double86 = continuousOutputModel84.getInitialTime();
        boolean boolean87 = continuousOutputModel84.requiresDenseOutput();
        continuousOutputModel79.append(continuousOutputModel84);
        continuousOutputModel84.reset();
        double double90 = continuousOutputModel84.getInitialTime();
        boolean boolean91 = continuousOutputModel84.requiresDenseOutput();
        continuousOutputModel84.reset();
        continuousOutputModel84.reset();
        continuousOutputModel62.append(continuousOutputModel84);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator95 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel84.handleStep(stepInterpolator95, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        java.io.IOException iOException5 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException5);
        java.lang.Object[] objArray8 = mathException7.getArguments();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", objArray8);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getFinalTime();
        double double14 = continuousOutputModel12.getInitialTime();
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        double double16 = continuousOutputModel12.getInitialTime();
        java.io.IOException iOException19 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException20 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException19);
        java.io.IOException iOException24 = new java.io.IOException("hi!");
        java.io.IOException iOException25 = new java.io.IOException("", (java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double29 = continuousOutputModel28.getFinalTime();
        double double30 = continuousOutputModel28.getInitialTime();
        java.lang.Object[] objArray31 = new java.lang.Object[] { double16, mathException21, iOException24, false, continuousOutputModel28 };
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "org.apache.commons.math.MathException: ", "hi!", "org.apache.commons.math.MathException: ", "", "" };
        org.apache.commons.math.ode.DerivativeException derivativeException41 = new org.apache.commons.math.ode.DerivativeException("", strArray40);
        java.io.IOException iOException45 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DerivativeException derivativeException46 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) iOException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) iOException45);
        java.lang.Object[] objArray48 = mathException47.getArguments();
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) strArray40, (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray31, (java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray8, (java.lang.Throwable) mathException51);
        java.io.IOException iOException53 = new java.io.IOException((java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException((java.lang.Throwable) iOException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException54);
        java.lang.String str56 = mathException55.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str56, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean14 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double9 = continuousOutputModel8.getFinalTime();
        double double10 = continuousOutputModel8.getInitialTime();
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        double double12 = continuousOutputModel8.getInitialTime();
        continuousOutputModel8.reset();
        boolean boolean14 = continuousOutputModel8.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel8);
        continuousOutputModel8.reset();
        double double17 = continuousOutputModel8.getInitialTime();
        double double18 = continuousOutputModel8.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        double double4 = continuousOutputModel0.getFinalTime();
        double double5 = continuousOutputModel0.getInitialTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double8 = continuousOutputModel7.getFinalTime();
        double double9 = continuousOutputModel7.getInitialTime();
        boolean boolean10 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel15.reset();
        boolean boolean20 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel11.append(continuousOutputModel15);
        continuousOutputModel7.append(continuousOutputModel11);
        double double23 = continuousOutputModel11.getInitialTime();
        continuousOutputModel11.reset();
        continuousOutputModel11.reset();
        continuousOutputModel0.append(continuousOutputModel11);
        double double27 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        double double11 = continuousOutputModel0.getFinalTime();
        double double12 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double15 = continuousOutputModel14.getFinalTime();
        double double16 = continuousOutputModel14.getInitialTime();
        boolean boolean17 = continuousOutputModel14.requiresDenseOutput();
        double double18 = continuousOutputModel14.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean20 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        boolean boolean23 = continuousOutputModel19.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        boolean boolean27 = continuousOutputModel24.requiresDenseOutput();
        continuousOutputModel19.append(continuousOutputModel24);
        continuousOutputModel14.append(continuousOutputModel19);
        boolean boolean30 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel19.reset();
        double double32 = continuousOutputModel19.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel19);
        double double34 = continuousOutputModel0.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = continuousOutputModel0.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getFinalTime();
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double10 = continuousOutputModel5.getInitialTime();
        continuousOutputModel5.reset();
        boolean boolean12 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.reset();
        continuousOutputModel13.reset();
        continuousOutputModel5.append(continuousOutputModel13);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getFinalTime();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        double double21 = continuousOutputModel17.getInitialTime();
        continuousOutputModel17.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean24 = continuousOutputModel23.requiresDenseOutput();
        double double25 = continuousOutputModel23.getInitialTime();
        boolean boolean26 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel23);
        boolean boolean28 = continuousOutputModel23.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel23);
        continuousOutputModel23.reset();
        boolean boolean31 = continuousOutputModel23.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel15.reset();
        boolean boolean20 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel11.append(continuousOutputModel15);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean28 = continuousOutputModel27.requiresDenseOutput();
        double double29 = continuousOutputModel27.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel27);
        continuousOutputModel11.append(continuousOutputModel22);
        boolean boolean32 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel11);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean36 = continuousOutputModel35.requiresDenseOutput();
        boolean boolean37 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel35.reset();
        continuousOutputModel35.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double41 = continuousOutputModel40.getFinalTime();
        double double42 = continuousOutputModel40.getInitialTime();
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel40.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean46 = continuousOutputModel45.requiresDenseOutput();
        double double47 = continuousOutputModel45.getInitialTime();
        continuousOutputModel40.append(continuousOutputModel45);
        continuousOutputModel35.append(continuousOutputModel45);
        boolean boolean50 = continuousOutputModel35.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double52 = continuousOutputModel51.getFinalTime();
        double double53 = continuousOutputModel51.getInitialTime();
        double double54 = continuousOutputModel51.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double56 = continuousOutputModel55.getFinalTime();
        double double57 = continuousOutputModel55.getInitialTime();
        continuousOutputModel51.append(continuousOutputModel55);
        double double59 = continuousOutputModel51.getInitialTime();
        double double60 = continuousOutputModel51.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double62 = continuousOutputModel61.getFinalTime();
        double double63 = continuousOutputModel61.getInitialTime();
        continuousOutputModel61.reset();
        double double65 = continuousOutputModel61.getInitialTime();
        continuousOutputModel51.append(continuousOutputModel61);
        continuousOutputModel35.append(continuousOutputModel51);
        continuousOutputModel35.reset();
        boolean boolean69 = continuousOutputModel35.requiresDenseOutput();
        double double70 = continuousOutputModel35.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel35);
        double double72 = continuousOutputModel0.getInitialTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        double double17 = continuousOutputModel0.getInitialTime();
        double double18 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator20, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean7 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean9 = continuousOutputModel8.requiresDenseOutput();
        double double10 = continuousOutputModel8.getInitialTime();
        double double11 = continuousOutputModel8.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel8);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        continuousOutputModel14.reset();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getFinalTime();
        double double22 = continuousOutputModel20.getInitialTime();
        double double23 = continuousOutputModel20.getFinalTime();
        boolean boolean24 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel14.append(continuousOutputModel20);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel26.reset();
        continuousOutputModel26.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getFinalTime();
        double double33 = continuousOutputModel31.getInitialTime();
        boolean boolean34 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel31.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        double double38 = continuousOutputModel36.getInitialTime();
        continuousOutputModel31.append(continuousOutputModel36);
        continuousOutputModel26.append(continuousOutputModel36);
        continuousOutputModel26.reset();
        boolean boolean42 = continuousOutputModel26.requiresDenseOutput();
        double double43 = continuousOutputModel26.getFinalTime();
        continuousOutputModel14.append(continuousOutputModel26);
        continuousOutputModel26.reset();
        double double46 = continuousOutputModel26.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel26);
        boolean boolean48 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean52 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getFinalTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean13 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        boolean boolean15 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double17 = continuousOutputModel16.getFinalTime();
        double double18 = continuousOutputModel16.getInitialTime();
        boolean boolean19 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel11.append(continuousOutputModel16);
        continuousOutputModel16.reset();
        double double22 = continuousOutputModel16.getInitialTime();
        double double23 = continuousOutputModel16.getFinalTime();
        continuousOutputModel16.reset();
        boolean boolean25 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        double double28 = continuousOutputModel26.getInitialTime();
        boolean boolean29 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double31 = continuousOutputModel30.getFinalTime();
        double double32 = continuousOutputModel30.getInitialTime();
        boolean boolean33 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        boolean boolean35 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        continuousOutputModel30.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel39.reset();
        boolean boolean41 = continuousOutputModel39.requiresDenseOutput();
        continuousOutputModel30.append(continuousOutputModel39);
        continuousOutputModel16.append(continuousOutputModel30);
        continuousOutputModel0.append(continuousOutputModel16);
        continuousOutputModel16.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean3 = continuousOutputModel2.requiresDenseOutput();
        double double4 = continuousOutputModel2.getInitialTime();
        boolean boolean5 = continuousOutputModel2.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        boolean boolean9 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel6.reset();
        boolean boolean11 = continuousOutputModel6.requiresDenseOutput();
        continuousOutputModel2.append(continuousOutputModel6);
        continuousOutputModel0.append(continuousOutputModel2);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean15 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel14.reset();
        boolean boolean18 = continuousOutputModel14.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel14);
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        double double22 = continuousOutputModel0.getInitialTime();
        double double23 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        double double26 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean28 = continuousOutputModel27.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel27.requiresDenseOutput();
        continuousOutputModel27.reset();
        boolean boolean31 = continuousOutputModel27.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double33 = continuousOutputModel32.getFinalTime();
        double double34 = continuousOutputModel32.getInitialTime();
        boolean boolean35 = continuousOutputModel32.requiresDenseOutput();
        continuousOutputModel27.append(continuousOutputModel32);
        boolean boolean37 = continuousOutputModel32.requiresDenseOutput();
        double double38 = continuousOutputModel32.getFinalTime();
        continuousOutputModel32.reset();
        double double40 = continuousOutputModel32.getInitialTime();
        double double41 = continuousOutputModel32.getFinalTime();
        boolean boolean42 = continuousOutputModel32.requiresDenseOutput();
        double double43 = continuousOutputModel32.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel32);
        double double45 = continuousOutputModel32.getFinalTime();
        boolean boolean46 = continuousOutputModel32.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel11.append(continuousOutputModel16);
        continuousOutputModel0.append(continuousOutputModel11);
        boolean boolean21 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getFinalTime();
        double double24 = continuousOutputModel22.getInitialTime();
        double double25 = continuousOutputModel22.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getFinalTime();
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel26);
        double double30 = continuousOutputModel22.getFinalTime();
        boolean boolean31 = continuousOutputModel22.requiresDenseOutput();
        boolean boolean32 = continuousOutputModel22.requiresDenseOutput();
        double double33 = continuousOutputModel22.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel22);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean36 = continuousOutputModel35.requiresDenseOutput();
        boolean boolean37 = continuousOutputModel35.requiresDenseOutput();
        continuousOutputModel35.reset();
        continuousOutputModel35.reset();
        boolean boolean40 = continuousOutputModel35.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double42 = continuousOutputModel41.getFinalTime();
        double double43 = continuousOutputModel41.getInitialTime();
        double double44 = continuousOutputModel41.getFinalTime();
        boolean boolean45 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel35.append(continuousOutputModel41);
        boolean boolean47 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel41);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean50 = continuousOutputModel49.requiresDenseOutput();
        double double51 = continuousOutputModel49.getInitialTime();
        double double52 = continuousOutputModel49.getFinalTime();
        boolean boolean53 = continuousOutputModel49.requiresDenseOutput();
        double double54 = continuousOutputModel49.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean57 = continuousOutputModel56.requiresDenseOutput();
        boolean boolean58 = continuousOutputModel56.requiresDenseOutput();
        double double59 = continuousOutputModel56.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean61 = continuousOutputModel60.requiresDenseOutput();
        continuousOutputModel56.append(continuousOutputModel60);
        continuousOutputModel55.append(continuousOutputModel60);
        boolean boolean64 = continuousOutputModel60.requiresDenseOutput();
        continuousOutputModel49.append(continuousOutputModel60);
        boolean boolean66 = continuousOutputModel60.requiresDenseOutput();
        continuousOutputModel41.append(continuousOutputModel60);
        boolean boolean68 = continuousOutputModel41.requiresDenseOutput();
        boolean boolean69 = continuousOutputModel41.requiresDenseOutput();
        boolean boolean70 = continuousOutputModel41.requiresDenseOutput();
        boolean boolean71 = continuousOutputModel41.requiresDenseOutput();
        boolean boolean72 = continuousOutputModel41.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getFinalTime();
        double double11 = continuousOutputModel9.getInitialTime();
        boolean boolean12 = continuousOutputModel9.requiresDenseOutput();
        double double13 = continuousOutputModel9.getInitialTime();
        continuousOutputModel9.reset();
        boolean boolean15 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        double double19 = continuousOutputModel17.getInitialTime();
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double22 = continuousOutputModel21.getFinalTime();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel21.reset();
        boolean boolean26 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel17.append(continuousOutputModel21);
        continuousOutputModel17.reset();
        continuousOutputModel9.append(continuousOutputModel17);
        boolean boolean30 = continuousOutputModel17.requiresDenseOutput();
        double double31 = continuousOutputModel17.getInitialTime();
        double double32 = continuousOutputModel17.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.handleStep(stepInterpolator33, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean5 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        continuousOutputModel0.reset();
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        double double13 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        double double8 = continuousOutputModel0.getInitialTime();
        double double9 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getFinalTime();
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        double double14 = continuousOutputModel10.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean17 = continuousOutputModel16.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        boolean boolean20 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean22 = continuousOutputModel21.requiresDenseOutput();
        double double23 = continuousOutputModel21.getInitialTime();
        boolean boolean24 = continuousOutputModel21.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean26 = continuousOutputModel25.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel21.append(continuousOutputModel25);
        continuousOutputModel16.append(continuousOutputModel25);
        continuousOutputModel10.append(continuousOutputModel25);
        boolean boolean31 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        double double33 = continuousOutputModel10.getInitialTime();
        double double34 = continuousOutputModel10.getInitialTime();
        boolean boolean35 = continuousOutputModel10.requiresDenseOutput();
        boolean boolean36 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel10.handleStep(stepInterpolator38, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean12 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean14 = continuousOutputModel13.requiresDenseOutput();
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        continuousOutputModel13.reset();
        boolean boolean17 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double19 = continuousOutputModel18.getFinalTime();
        double double20 = continuousOutputModel18.getInitialTime();
        boolean boolean21 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel13.append(continuousOutputModel18);
        continuousOutputModel18.reset();
        boolean boolean24 = continuousOutputModel18.requiresDenseOutput();
        boolean boolean25 = continuousOutputModel18.requiresDenseOutput();
        double double26 = continuousOutputModel18.getInitialTime();
        boolean boolean27 = continuousOutputModel18.requiresDenseOutput();
        continuousOutputModel18.reset();
        continuousOutputModel0.append(continuousOutputModel18);
        double double30 = continuousOutputModel0.getInitialTime();
        boolean boolean31 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean32 = continuousOutputModel0.requiresDenseOutput();
        double double33 = continuousOutputModel0.getInitialTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        double double3 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel4);
        boolean boolean8 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean12 = continuousOutputModel11.requiresDenseOutput();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel15.reset();
        boolean boolean20 = continuousOutputModel15.requiresDenseOutput();
        continuousOutputModel11.append(continuousOutputModel15);
        continuousOutputModel15.reset();
        continuousOutputModel15.reset();
        continuousOutputModel15.reset();
        continuousOutputModel15.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean27 = continuousOutputModel26.requiresDenseOutput();
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel30);
        continuousOutputModel26.reset();
        boolean boolean34 = continuousOutputModel26.requiresDenseOutput();
        boolean boolean35 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean37 = continuousOutputModel36.requiresDenseOutput();
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel36.reset();
        boolean boolean40 = continuousOutputModel36.requiresDenseOutput();
        double double41 = continuousOutputModel36.getFinalTime();
        boolean boolean42 = continuousOutputModel36.requiresDenseOutput();
        continuousOutputModel26.append(continuousOutputModel36);
        double double44 = continuousOutputModel36.getFinalTime();
        continuousOutputModel36.reset();
        continuousOutputModel15.append(continuousOutputModel36);
        continuousOutputModel0.append(continuousOutputModel36);
        continuousOutputModel0.reset();
        double double49 = continuousOutputModel0.getInitialTime();
        boolean boolean50 = continuousOutputModel0.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getFinalTime();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double5 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getFinalTime();
        double double8 = continuousOutputModel6.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel6);
        continuousOutputModel0.reset();
        double double11 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime(Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        double double2 = continuousOutputModel0.getInitialTime();
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double5 = continuousOutputModel4.getFinalTime();
        double double6 = continuousOutputModel4.getInitialTime();
        boolean boolean7 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel4.reset();
        boolean boolean9 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        double double14 = continuousOutputModel11.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double16 = continuousOutputModel15.getFinalTime();
        double double17 = continuousOutputModel15.getInitialTime();
        continuousOutputModel11.append(continuousOutputModel15);
        double double19 = continuousOutputModel11.getFinalTime();
        boolean boolean20 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean21 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean22 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean23 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel11);
        boolean boolean25 = continuousOutputModel11.requiresDenseOutput();
        continuousOutputModel11.reset();
        double double27 = continuousOutputModel11.getFinalTime();
        boolean boolean28 = continuousOutputModel11.requiresDenseOutput();
        boolean boolean29 = continuousOutputModel11.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray30 = continuousOutputModel11.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean1 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean2 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean4 = continuousOutputModel0.requiresDenseOutput();
        double double5 = continuousOutputModel0.getFinalTime();
        boolean boolean6 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean9 = continuousOutputModel0.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getFinalTime();
        double double13 = continuousOutputModel11.getInitialTime();
        boolean boolean14 = continuousOutputModel11.requiresDenseOutput();
        double double15 = continuousOutputModel11.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel11);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean18 = continuousOutputModel17.requiresDenseOutput();
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        double double21 = continuousOutputModel17.getInitialTime();
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        double double23 = continuousOutputModel17.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double25 = continuousOutputModel24.getFinalTime();
        double double26 = continuousOutputModel24.getInitialTime();
        boolean boolean27 = continuousOutputModel24.requiresDenseOutput();
        double double28 = continuousOutputModel24.getInitialTime();
        double double29 = continuousOutputModel24.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean31 = continuousOutputModel30.requiresDenseOutput();
        boolean boolean32 = continuousOutputModel30.requiresDenseOutput();
        double double33 = continuousOutputModel30.getFinalTime();
        continuousOutputModel30.reset();
        boolean boolean35 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel30.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean38 = continuousOutputModel37.requiresDenseOutput();
        boolean boolean39 = continuousOutputModel37.requiresDenseOutput();
        double double40 = continuousOutputModel37.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean42 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel37.append(continuousOutputModel41);
        boolean boolean44 = continuousOutputModel37.requiresDenseOutput();
        continuousOutputModel37.reset();
        continuousOutputModel30.append(continuousOutputModel37);
        boolean boolean47 = continuousOutputModel30.requiresDenseOutput();
        continuousOutputModel24.append(continuousOutputModel30);
        double double49 = continuousOutputModel30.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        boolean boolean51 = continuousOutputModel50.requiresDenseOutput();
        double double52 = continuousOutputModel50.getInitialTime();
        boolean boolean53 = continuousOutputModel50.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double55 = continuousOutputModel54.getFinalTime();
        double double56 = continuousOutputModel54.getInitialTime();
        boolean boolean57 = continuousOutputModel54.requiresDenseOutput();
        continuousOutputModel54.reset();
        boolean boolean59 = continuousOutputModel54.requiresDenseOutput();
        continuousOutputModel50.append(continuousOutputModel54);
        continuousOutputModel54.reset();
        double double62 = continuousOutputModel54.getInitialTime();
        continuousOutputModel54.reset();
        continuousOutputModel30.append(continuousOutputModel54);
        continuousOutputModel17.append(continuousOutputModel54);
        continuousOutputModel54.reset();
        continuousOutputModel0.append(continuousOutputModel54);
        double double68 = continuousOutputModel0.getFinalTime();
        double double69 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double71 = continuousOutputModel0.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }
}

