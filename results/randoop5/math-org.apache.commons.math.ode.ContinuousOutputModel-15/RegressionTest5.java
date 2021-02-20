import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getInitialTime();
        continuousOutputModel1.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = continuousOutputModel1.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel14.append(continuousOutputModel15);
        boolean boolean17 = continuousOutputModel15.requiresDenseOutput();
        double double18 = continuousOutputModel15.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel19);
        double double21 = continuousOutputModel19.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel19);
        boolean boolean23 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean25 = continuousOutputModel12.requiresDenseOutput();
        double double26 = continuousOutputModel12.getFinalTime();
        double double27 = continuousOutputModel12.getInitialTime();
        double double28 = continuousOutputModel12.getFinalTime();
        continuousOutputModel7.append(continuousOutputModel12);
        double double30 = continuousOutputModel7.getFinalTime();
        boolean boolean31 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean32 = continuousOutputModel7.requiresDenseOutput();
        boolean boolean33 = continuousOutputModel7.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = continuousOutputModel7.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean8 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean9 = continuousOutputModel1.requiresDenseOutput();
        boolean boolean10 = continuousOutputModel1.requiresDenseOutput();
        continuousOutputModel1.reset();
        double double12 = continuousOutputModel1.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.setInterpolatedTime((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getInitialTime();
        double double4 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel6.append(continuousOutputModel10);
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        continuousOutputModel20.reset();
        continuousOutputModel20.reset();
        double double24 = continuousOutputModel20.getFinalTime();
        continuousOutputModel15.append(continuousOutputModel20);
        double double26 = continuousOutputModel15.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel15);
        continuousOutputModel10.reset();
        double double29 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean8 = continuousOutputModel1.requiresDenseOutput();
        double double9 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel10.append(continuousOutputModel11);
        continuousOutputModel11.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel14.append(continuousOutputModel15);
        continuousOutputModel11.append(continuousOutputModel15);
        continuousOutputModel15.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        boolean boolean26 = continuousOutputModel24.requiresDenseOutput();
        double double27 = continuousOutputModel24.getInitialTime();
        double double28 = continuousOutputModel24.getInitialTime();
        boolean boolean29 = continuousOutputModel24.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel30.append(continuousOutputModel31);
        continuousOutputModel31.reset();
        continuousOutputModel31.reset();
        continuousOutputModel24.append(continuousOutputModel31);
        continuousOutputModel24.reset();
        continuousOutputModel15.append(continuousOutputModel24);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel38.append(continuousOutputModel39);
        boolean boolean41 = continuousOutputModel38.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel42 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel42.append(continuousOutputModel43);
        continuousOutputModel43.reset();
        continuousOutputModel43.reset();
        double double47 = continuousOutputModel43.getFinalTime();
        continuousOutputModel38.append(continuousOutputModel43);
        continuousOutputModel38.reset();
        boolean boolean50 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel24.append(continuousOutputModel38);
        continuousOutputModel38.reset();
        boolean boolean53 = continuousOutputModel38.requiresDenseOutput();
        double double54 = continuousOutputModel38.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel55.append(continuousOutputModel56);
        boolean boolean58 = continuousOutputModel56.requiresDenseOutput();
        double double59 = continuousOutputModel56.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel61);
        boolean boolean63 = continuousOutputModel60.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel65 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel64.append(continuousOutputModel65);
        continuousOutputModel65.reset();
        continuousOutputModel65.reset();
        double double69 = continuousOutputModel65.getFinalTime();
        continuousOutputModel60.append(continuousOutputModel65);
        continuousOutputModel56.append(continuousOutputModel60);
        continuousOutputModel56.reset();
        continuousOutputModel56.reset();
        double double74 = continuousOutputModel56.getFinalTime();
        boolean boolean75 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel56.reset();
        continuousOutputModel56.reset();
        continuousOutputModel38.append(continuousOutputModel56);
        boolean boolean79 = continuousOutputModel38.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel38);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        continuousOutputModel5.append(continuousOutputModel12);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel24);
        continuousOutputModel5.append(continuousOutputModel17);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        continuousOutputModel30.append(continuousOutputModel34);
        double double37 = continuousOutputModel34.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel34);
        // The following exception was thrown during execution in test generation
        try {
            double double39 = continuousOutputModel34.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        boolean boolean19 = continuousOutputModel5.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getFinalTime();
        double double15 = continuousOutputModel0.getInitialTime();
        double double16 = continuousOutputModel0.getFinalTime();
        double double17 = continuousOutputModel0.getFinalTime();
        double double18 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        boolean boolean26 = continuousOutputModel24.requiresDenseOutput();
        double double27 = continuousOutputModel24.getInitialTime();
        double double28 = continuousOutputModel24.getInitialTime();
        boolean boolean29 = continuousOutputModel24.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel30.append(continuousOutputModel31);
        continuousOutputModel31.reset();
        continuousOutputModel31.reset();
        continuousOutputModel24.append(continuousOutputModel31);
        continuousOutputModel0.append(continuousOutputModel24);
        double double37 = continuousOutputModel24.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel38.append(continuousOutputModel39);
        boolean boolean41 = continuousOutputModel39.requiresDenseOutput();
        double double42 = continuousOutputModel39.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel39.append(continuousOutputModel43);
        boolean boolean45 = continuousOutputModel43.requiresDenseOutput();
        double double46 = continuousOutputModel43.getInitialTime();
        double double47 = continuousOutputModel43.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double49 = continuousOutputModel48.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel50.append(continuousOutputModel51);
        boolean boolean53 = continuousOutputModel51.requiresDenseOutput();
        double double54 = continuousOutputModel51.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel51.append(continuousOutputModel55);
        double double57 = continuousOutputModel55.getInitialTime();
        continuousOutputModel48.append(continuousOutputModel55);
        boolean boolean59 = continuousOutputModel55.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double61 = continuousOutputModel60.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel62 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel63 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel62.append(continuousOutputModel63);
        boolean boolean65 = continuousOutputModel63.requiresDenseOutput();
        double double66 = continuousOutputModel63.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel67 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel63.append(continuousOutputModel67);
        double double69 = continuousOutputModel67.getInitialTime();
        continuousOutputModel60.append(continuousOutputModel67);
        boolean boolean71 = continuousOutputModel60.requiresDenseOutput();
        continuousOutputModel60.reset();
        boolean boolean73 = continuousOutputModel60.requiresDenseOutput();
        double double74 = continuousOutputModel60.getFinalTime();
        double double75 = continuousOutputModel60.getInitialTime();
        double double76 = continuousOutputModel60.getFinalTime();
        continuousOutputModel55.append(continuousOutputModel60);
        continuousOutputModel60.reset();
        continuousOutputModel43.append(continuousOutputModel60);
        continuousOutputModel24.append(continuousOutputModel60);
        java.lang.Class<?> wildcardClass81 = continuousOutputModel24.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        double double9 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        double double19 = continuousOutputModel17.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel17);
        boolean boolean21 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel24.append(continuousOutputModel25);
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel29);
        double double31 = continuousOutputModel29.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel29);
        boolean boolean33 = continuousOutputModel22.requiresDenseOutput();
        continuousOutputModel22.reset();
        boolean boolean35 = continuousOutputModel22.requiresDenseOutput();
        double double36 = continuousOutputModel22.getFinalTime();
        double double37 = continuousOutputModel22.getInitialTime();
        double double38 = continuousOutputModel22.getFinalTime();
        continuousOutputModel17.append(continuousOutputModel22);
        double double40 = continuousOutputModel17.getFinalTime();
        double double41 = continuousOutputModel17.getFinalTime();
        continuousOutputModel5.append(continuousOutputModel17);
        double double43 = continuousOutputModel5.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel5);
        double double45 = continuousOutputModel5.getInitialTime();
        boolean boolean46 = continuousOutputModel5.requiresDenseOutput();
        double double47 = continuousOutputModel5.getInitialTime();
        double double48 = continuousOutputModel5.getFinalTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel10);
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        double double13 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel10.append(continuousOutputModel14);
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        double double17 = continuousOutputModel14.getInitialTime();
        double double18 = continuousOutputModel14.getInitialTime();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double21 = continuousOutputModel20.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel22.append(continuousOutputModel23);
        boolean boolean25 = continuousOutputModel23.requiresDenseOutput();
        double double26 = continuousOutputModel23.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel23.append(continuousOutputModel27);
        double double29 = continuousOutputModel27.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel27);
        continuousOutputModel14.append(continuousOutputModel20);
        double double32 = continuousOutputModel20.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel20);
        boolean boolean34 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean35 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean36 = continuousOutputModel5.requiresDenseOutput();
        double double37 = continuousOutputModel5.getFinalTime();
        double double38 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double40 = continuousOutputModel39.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel42 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel41.append(continuousOutputModel42);
        boolean boolean44 = continuousOutputModel42.requiresDenseOutput();
        double double45 = continuousOutputModel42.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel42.append(continuousOutputModel46);
        double double48 = continuousOutputModel46.getInitialTime();
        continuousOutputModel39.append(continuousOutputModel46);
        boolean boolean50 = continuousOutputModel39.requiresDenseOutput();
        continuousOutputModel39.reset();
        boolean boolean52 = continuousOutputModel39.requiresDenseOutput();
        double double53 = continuousOutputModel39.getFinalTime();
        double double54 = continuousOutputModel39.getInitialTime();
        double double55 = continuousOutputModel39.getFinalTime();
        boolean boolean56 = continuousOutputModel39.requiresDenseOutput();
        continuousOutputModel39.reset();
        double double58 = continuousOutputModel39.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel59 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel59.append(continuousOutputModel60);
        boolean boolean62 = continuousOutputModel60.requiresDenseOutput();
        double double63 = continuousOutputModel60.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel64);
        boolean boolean66 = continuousOutputModel64.requiresDenseOutput();
        double double67 = continuousOutputModel64.getInitialTime();
        double double68 = continuousOutputModel64.getInitialTime();
        boolean boolean69 = continuousOutputModel64.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel70 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel71 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel70.append(continuousOutputModel71);
        continuousOutputModel71.reset();
        continuousOutputModel71.reset();
        continuousOutputModel64.append(continuousOutputModel71);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel76 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double77 = continuousOutputModel76.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel78 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel79 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel78.append(continuousOutputModel79);
        boolean boolean81 = continuousOutputModel79.requiresDenseOutput();
        double double82 = continuousOutputModel79.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel83 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel79.append(continuousOutputModel83);
        double double85 = continuousOutputModel83.getInitialTime();
        continuousOutputModel76.append(continuousOutputModel83);
        continuousOutputModel64.append(continuousOutputModel76);
        continuousOutputModel64.reset();
        continuousOutputModel39.append(continuousOutputModel64);
        continuousOutputModel5.append(continuousOutputModel64);
        boolean boolean91 = continuousOutputModel5.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue(Double.isNaN(double85));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getInitialTime();
        double double20 = continuousOutputModel16.getInitialTime();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel24.append(continuousOutputModel25);
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel29);
        double double31 = continuousOutputModel29.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel29);
        continuousOutputModel16.append(continuousOutputModel22);
        continuousOutputModel16.reset();
        double double35 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel36.append(continuousOutputModel37);
        double double39 = continuousOutputModel36.getInitialTime();
        double double40 = continuousOutputModel36.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel36);
        continuousOutputModel5.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double44 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        double double46 = continuousOutputModel43.getInitialTime();
        double double47 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        continuousOutputModel16.append(continuousOutputModel43);
        continuousOutputModel16.reset();
        boolean boolean51 = continuousOutputModel16.requiresDenseOutput();
        continuousOutputModel16.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double53 = continuousOutputModel16.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        double double7 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel16);
        boolean boolean20 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean22 = continuousOutputModel9.requiresDenseOutput();
        double double23 = continuousOutputModel9.getFinalTime();
        double double24 = continuousOutputModel9.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel9);
        boolean boolean26 = continuousOutputModel9.requiresDenseOutput();
        double double27 = continuousOutputModel9.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel28.append(continuousOutputModel29);
        boolean boolean31 = continuousOutputModel29.requiresDenseOutput();
        double double32 = continuousOutputModel29.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel37.append(continuousOutputModel38);
        continuousOutputModel38.reset();
        continuousOutputModel38.reset();
        double double42 = continuousOutputModel38.getFinalTime();
        continuousOutputModel33.append(continuousOutputModel38);
        continuousOutputModel29.append(continuousOutputModel33);
        double double45 = continuousOutputModel29.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel29);
        double double47 = continuousOutputModel9.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel48.append(continuousOutputModel49);
        continuousOutputModel49.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel52 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel52.append(continuousOutputModel53);
        continuousOutputModel49.append(continuousOutputModel53);
        boolean boolean56 = continuousOutputModel49.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel57.append(continuousOutputModel58);
        boolean boolean60 = continuousOutputModel58.requiresDenseOutput();
        double double61 = continuousOutputModel58.getFinalTime();
        boolean boolean62 = continuousOutputModel58.requiresDenseOutput();
        continuousOutputModel58.reset();
        double double64 = continuousOutputModel58.getInitialTime();
        continuousOutputModel49.append(continuousOutputModel58);
        double double66 = continuousOutputModel58.getFinalTime();
        continuousOutputModel9.append(continuousOutputModel58);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getInitialTime();
        double double20 = continuousOutputModel16.getInitialTime();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel24.append(continuousOutputModel25);
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel29);
        double double31 = continuousOutputModel29.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel29);
        continuousOutputModel16.append(continuousOutputModel22);
        continuousOutputModel16.reset();
        double double35 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel36.append(continuousOutputModel37);
        double double39 = continuousOutputModel36.getInitialTime();
        double double40 = continuousOutputModel36.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel36);
        continuousOutputModel5.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double44 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        double double46 = continuousOutputModel43.getInitialTime();
        double double47 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        continuousOutputModel16.append(continuousOutputModel43);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel50.append(continuousOutputModel51);
        boolean boolean53 = continuousOutputModel51.requiresDenseOutput();
        double double54 = continuousOutputModel51.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel51.append(continuousOutputModel55);
        boolean boolean57 = continuousOutputModel55.requiresDenseOutput();
        boolean boolean58 = continuousOutputModel55.requiresDenseOutput();
        double double59 = continuousOutputModel55.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel55);
        boolean boolean61 = continuousOutputModel55.requiresDenseOutput();
        boolean boolean62 = continuousOutputModel55.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getInitialTime();
        double double21 = continuousOutputModel17.getInitialTime();
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel30);
        double double32 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel17.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        double double39 = continuousOutputModel36.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel45.reset();
        double double49 = continuousOutputModel45.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel45);
        continuousOutputModel36.append(continuousOutputModel40);
        continuousOutputModel36.reset();
        continuousOutputModel23.append(continuousOutputModel36);
        continuousOutputModel0.append(continuousOutputModel23);
        double double55 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel56.append(continuousOutputModel57);
        boolean boolean59 = continuousOutputModel56.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel61);
        continuousOutputModel61.reset();
        continuousOutputModel61.reset();
        double double65 = continuousOutputModel61.getFinalTime();
        continuousOutputModel56.append(continuousOutputModel61);
        boolean boolean67 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel56.reset();
        double double69 = continuousOutputModel56.getFinalTime();
        continuousOutputModel56.reset();
        double double71 = continuousOutputModel56.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel56);
        double double73 = continuousOutputModel56.getInitialTime();
        boolean boolean74 = continuousOutputModel56.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getInitialTime();
        double double21 = continuousOutputModel17.getInitialTime();
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel30);
        double double32 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel17.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        double double39 = continuousOutputModel36.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel45.reset();
        double double49 = continuousOutputModel45.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel45);
        continuousOutputModel36.append(continuousOutputModel40);
        continuousOutputModel36.reset();
        continuousOutputModel23.append(continuousOutputModel36);
        continuousOutputModel0.append(continuousOutputModel23);
        double double55 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel56.append(continuousOutputModel57);
        boolean boolean59 = continuousOutputModel56.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel61);
        continuousOutputModel61.reset();
        continuousOutputModel61.reset();
        double double65 = continuousOutputModel61.getFinalTime();
        continuousOutputModel56.append(continuousOutputModel61);
        boolean boolean67 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel56.reset();
        double double69 = continuousOutputModel56.getFinalTime();
        continuousOutputModel56.reset();
        double double71 = continuousOutputModel56.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel56);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double74 = continuousOutputModel73.getInitialTime();
        continuousOutputModel73.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel76 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel77 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel76.append(continuousOutputModel77);
        boolean boolean79 = continuousOutputModel77.requiresDenseOutput();
        double double80 = continuousOutputModel77.getFinalTime();
        boolean boolean81 = continuousOutputModel77.requiresDenseOutput();
        continuousOutputModel73.append(continuousOutputModel77);
        double double83 = continuousOutputModel77.getFinalTime();
        double double84 = continuousOutputModel77.getInitialTime();
        continuousOutputModel56.append(continuousOutputModel77);
        continuousOutputModel77.reset();
        // The following exception was thrown during execution in test generation
        try {
            double double87 = continuousOutputModel77.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        double double7 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel16);
        boolean boolean20 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean22 = continuousOutputModel9.requiresDenseOutput();
        double double23 = continuousOutputModel9.getFinalTime();
        double double24 = continuousOutputModel9.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel9);
        boolean boolean26 = continuousOutputModel9.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel9.requiresDenseOutput();
        double double28 = continuousOutputModel9.getFinalTime();
        boolean boolean29 = continuousOutputModel9.requiresDenseOutput();
        double double30 = continuousOutputModel9.getFinalTime();
        java.lang.Class<?> wildcardClass31 = continuousOutputModel9.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getInitialTime();
        double double20 = continuousOutputModel16.getInitialTime();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel24.append(continuousOutputModel25);
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel29);
        double double31 = continuousOutputModel29.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel29);
        continuousOutputModel16.append(continuousOutputModel22);
        continuousOutputModel16.reset();
        double double35 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel36.append(continuousOutputModel37);
        double double39 = continuousOutputModel36.getInitialTime();
        double double40 = continuousOutputModel36.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel36);
        continuousOutputModel5.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double44 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        double double46 = continuousOutputModel43.getInitialTime();
        double double47 = continuousOutputModel43.getInitialTime();
        continuousOutputModel43.reset();
        continuousOutputModel16.append(continuousOutputModel43);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel50.append(continuousOutputModel51);
        boolean boolean53 = continuousOutputModel51.requiresDenseOutput();
        double double54 = continuousOutputModel51.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel51.append(continuousOutputModel55);
        boolean boolean57 = continuousOutputModel55.requiresDenseOutput();
        boolean boolean58 = continuousOutputModel55.requiresDenseOutput();
        double double59 = continuousOutputModel55.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel55);
        boolean boolean61 = continuousOutputModel16.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        boolean boolean5 = continuousOutputModel1.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double7 = continuousOutputModel6.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel8.append(continuousOutputModel9);
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        double double12 = continuousOutputModel9.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel13);
        double double15 = continuousOutputModel13.getInitialTime();
        continuousOutputModel6.append(continuousOutputModel13);
        boolean boolean17 = continuousOutputModel6.requiresDenseOutput();
        double double18 = continuousOutputModel6.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel6);
        double double20 = continuousOutputModel1.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel21.append(continuousOutputModel22);
        boolean boolean24 = continuousOutputModel22.requiresDenseOutput();
        double double25 = continuousOutputModel22.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel22.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        continuousOutputModel26.reset();
        continuousOutputModel26.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel32.append(continuousOutputModel33);
        boolean boolean35 = continuousOutputModel33.requiresDenseOutput();
        double double36 = continuousOutputModel33.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel37);
        boolean boolean39 = continuousOutputModel37.requiresDenseOutput();
        double double40 = continuousOutputModel37.getInitialTime();
        double double41 = continuousOutputModel37.getInitialTime();
        boolean boolean42 = continuousOutputModel37.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double44 = continuousOutputModel43.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel45.append(continuousOutputModel46);
        boolean boolean48 = continuousOutputModel46.requiresDenseOutput();
        double double49 = continuousOutputModel46.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel46.append(continuousOutputModel50);
        double double52 = continuousOutputModel50.getInitialTime();
        continuousOutputModel43.append(continuousOutputModel50);
        continuousOutputModel37.append(continuousOutputModel43);
        continuousOutputModel37.reset();
        double double56 = continuousOutputModel37.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel57.append(continuousOutputModel58);
        double double60 = continuousOutputModel57.getInitialTime();
        double double61 = continuousOutputModel57.getInitialTime();
        continuousOutputModel37.append(continuousOutputModel57);
        continuousOutputModel26.append(continuousOutputModel37);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel65 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel64.append(continuousOutputModel65);
        boolean boolean67 = continuousOutputModel65.requiresDenseOutput();
        double double68 = continuousOutputModel65.getFinalTime();
        boolean boolean69 = continuousOutputModel65.requiresDenseOutput();
        continuousOutputModel65.reset();
        double double71 = continuousOutputModel65.getInitialTime();
        double double72 = continuousOutputModel65.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double74 = continuousOutputModel73.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel75 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel76 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel75.append(continuousOutputModel76);
        boolean boolean78 = continuousOutputModel76.requiresDenseOutput();
        double double79 = continuousOutputModel76.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel80 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel76.append(continuousOutputModel80);
        double double82 = continuousOutputModel80.getInitialTime();
        continuousOutputModel73.append(continuousOutputModel80);
        boolean boolean84 = continuousOutputModel73.requiresDenseOutput();
        continuousOutputModel73.reset();
        boolean boolean86 = continuousOutputModel73.requiresDenseOutput();
        double double87 = continuousOutputModel73.getFinalTime();
        double double88 = continuousOutputModel73.getInitialTime();
        double double89 = continuousOutputModel73.getFinalTime();
        double double90 = continuousOutputModel73.getFinalTime();
        continuousOutputModel65.append(continuousOutputModel73);
        double double92 = continuousOutputModel73.getInitialTime();
        continuousOutputModel26.append(continuousOutputModel73);
        continuousOutputModel1.append(continuousOutputModel26);
        double double95 = continuousOutputModel1.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.setInterpolatedTime((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertTrue(Double.isNaN(double92));
        org.junit.Assert.assertTrue(Double.isNaN(double95));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel10);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        double double14 = continuousOutputModel10.getFinalTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel1.append(continuousOutputModel5);
        double double17 = continuousOutputModel1.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel18.append(continuousOutputModel19);
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel22.append(continuousOutputModel23);
        continuousOutputModel19.append(continuousOutputModel23);
        boolean boolean26 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel19);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        boolean boolean32 = continuousOutputModel29.requiresDenseOutput();
        double double33 = continuousOutputModel29.getFinalTime();
        double double34 = continuousOutputModel29.getInitialTime();
        continuousOutputModel29.reset();
        double double36 = continuousOutputModel29.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel29);
        boolean boolean38 = continuousOutputModel1.requiresDenseOutput();
        double double39 = continuousOutputModel1.getFinalTime();
        double double40 = continuousOutputModel1.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.setInterpolatedTime((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getInitialTime();
        double double21 = continuousOutputModel17.getInitialTime();
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel30);
        double double32 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel17.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        double double39 = continuousOutputModel36.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel45.reset();
        double double49 = continuousOutputModel45.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel45);
        continuousOutputModel36.append(continuousOutputModel40);
        continuousOutputModel36.reset();
        continuousOutputModel23.append(continuousOutputModel36);
        continuousOutputModel0.append(continuousOutputModel23);
        double double55 = continuousOutputModel0.getInitialTime();
        java.lang.Class<?> wildcardClass56 = continuousOutputModel0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        double double9 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray15 = continuousOutputModel5.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double9 = continuousOutputModel5.getFinalTime();
        double double10 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        boolean boolean16 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel17.requiresDenseOutput();
        double double29 = continuousOutputModel17.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel17);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel31.append(continuousOutputModel32);
        double double34 = continuousOutputModel31.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        continuousOutputModel36.reset();
        continuousOutputModel36.reset();
        double double40 = continuousOutputModel36.getFinalTime();
        continuousOutputModel31.append(continuousOutputModel36);
        continuousOutputModel31.reset();
        continuousOutputModel17.append(continuousOutputModel31);
        continuousOutputModel5.append(continuousOutputModel17);
        continuousOutputModel17.reset();
        double double46 = continuousOutputModel17.getInitialTime();
        continuousOutputModel17.reset();
        double double48 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.handleStep(stepInterpolator49, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double4 = continuousOutputModel3.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel6.append(continuousOutputModel10);
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel3.append(continuousOutputModel10);
        boolean boolean14 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        boolean boolean16 = continuousOutputModel3.requiresDenseOutput();
        double double17 = continuousOutputModel3.getFinalTime();
        continuousOutputModel1.append(continuousOutputModel3);
        java.lang.Class<?> wildcardClass19 = continuousOutputModel3.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getInitialTime();
        double double20 = continuousOutputModel16.getInitialTime();
        boolean boolean21 = continuousOutputModel16.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double23 = continuousOutputModel22.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel24.append(continuousOutputModel25);
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel29);
        double double31 = continuousOutputModel29.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel29);
        continuousOutputModel16.append(continuousOutputModel22);
        continuousOutputModel16.reset();
        double double35 = continuousOutputModel16.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel36.append(continuousOutputModel37);
        double double39 = continuousOutputModel36.getInitialTime();
        double double40 = continuousOutputModel36.getInitialTime();
        continuousOutputModel16.append(continuousOutputModel36);
        continuousOutputModel5.append(continuousOutputModel16);
        double double43 = continuousOutputModel16.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        double double9 = continuousOutputModel5.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double13 = continuousOutputModel0.getInitialTime();
        double double14 = continuousOutputModel0.getInitialTime();
        double double15 = continuousOutputModel0.getFinalTime();
        double double16 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean30 = continuousOutputModel17.requiresDenseOutput();
        double double31 = continuousOutputModel17.getFinalTime();
        double double32 = continuousOutputModel17.getInitialTime();
        double double33 = continuousOutputModel17.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel34.append(continuousOutputModel35);
        boolean boolean37 = continuousOutputModel34.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel38.append(continuousOutputModel39);
        continuousOutputModel39.reset();
        continuousOutputModel39.reset();
        double double43 = continuousOutputModel39.getFinalTime();
        continuousOutputModel34.append(continuousOutputModel39);
        continuousOutputModel34.reset();
        double double46 = continuousOutputModel34.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel34);
        continuousOutputModel34.reset();
        continuousOutputModel34.reset();
        continuousOutputModel0.append(continuousOutputModel34);
        double double51 = continuousOutputModel0.getInitialTime();
        double double52 = continuousOutputModel0.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double4 = continuousOutputModel3.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel6.append(continuousOutputModel10);
        double double12 = continuousOutputModel10.getInitialTime();
        continuousOutputModel3.append(continuousOutputModel10);
        boolean boolean14 = continuousOutputModel3.requiresDenseOutput();
        continuousOutputModel3.reset();
        boolean boolean16 = continuousOutputModel3.requiresDenseOutput();
        double double17 = continuousOutputModel3.getFinalTime();
        continuousOutputModel1.append(continuousOutputModel3);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        continuousOutputModel20.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel23.append(continuousOutputModel24);
        continuousOutputModel20.append(continuousOutputModel24);
        continuousOutputModel24.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel28.append(continuousOutputModel29);
        boolean boolean31 = continuousOutputModel29.requiresDenseOutput();
        double double32 = continuousOutputModel29.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel33);
        boolean boolean35 = continuousOutputModel33.requiresDenseOutput();
        double double36 = continuousOutputModel33.getInitialTime();
        double double37 = continuousOutputModel33.getInitialTime();
        boolean boolean38 = continuousOutputModel33.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel39.append(continuousOutputModel40);
        continuousOutputModel40.reset();
        continuousOutputModel40.reset();
        continuousOutputModel33.append(continuousOutputModel40);
        continuousOutputModel33.reset();
        continuousOutputModel24.append(continuousOutputModel33);
        boolean boolean47 = continuousOutputModel24.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel48.append(continuousOutputModel49);
        boolean boolean51 = continuousOutputModel49.requiresDenseOutput();
        double double52 = continuousOutputModel49.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel49.append(continuousOutputModel53);
        boolean boolean55 = continuousOutputModel53.requiresDenseOutput();
        double double56 = continuousOutputModel53.getInitialTime();
        double double57 = continuousOutputModel53.getInitialTime();
        boolean boolean58 = continuousOutputModel53.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel59 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel59.append(continuousOutputModel60);
        boolean boolean62 = continuousOutputModel60.requiresDenseOutput();
        double double63 = continuousOutputModel60.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel64);
        boolean boolean66 = continuousOutputModel64.requiresDenseOutput();
        double double67 = continuousOutputModel64.getInitialTime();
        double double68 = continuousOutputModel64.getInitialTime();
        boolean boolean69 = continuousOutputModel64.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel70 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double71 = continuousOutputModel70.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel72 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel72.append(continuousOutputModel73);
        boolean boolean75 = continuousOutputModel73.requiresDenseOutput();
        double double76 = continuousOutputModel73.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel77 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel73.append(continuousOutputModel77);
        double double79 = continuousOutputModel77.getInitialTime();
        continuousOutputModel70.append(continuousOutputModel77);
        continuousOutputModel64.append(continuousOutputModel70);
        continuousOutputModel64.reset();
        double double83 = continuousOutputModel64.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel84 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel85 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel84.append(continuousOutputModel85);
        double double87 = continuousOutputModel84.getInitialTime();
        double double88 = continuousOutputModel84.getInitialTime();
        continuousOutputModel64.append(continuousOutputModel84);
        continuousOutputModel53.append(continuousOutputModel64);
        continuousOutputModel24.append(continuousOutputModel64);
        continuousOutputModel1.append(continuousOutputModel24);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator94 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.handleStep(stepInterpolator94, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        double double3 = continuousOutputModel0.getInitialTime();
        double double4 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel6.requiresDenseOutput();
        double double9 = continuousOutputModel6.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel6.append(continuousOutputModel10);
        double double12 = continuousOutputModel10.getInitialTime();
        boolean boolean13 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel10);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel15.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        continuousOutputModel20.reset();
        continuousOutputModel20.reset();
        double double24 = continuousOutputModel20.getFinalTime();
        continuousOutputModel15.append(continuousOutputModel20);
        double double26 = continuousOutputModel15.getInitialTime();
        continuousOutputModel10.append(continuousOutputModel15);
        double double28 = continuousOutputModel15.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        boolean boolean32 = continuousOutputModel30.requiresDenseOutput();
        double double33 = continuousOutputModel30.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel30.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel34.requiresDenseOutput();
        double double37 = continuousOutputModel34.getInitialTime();
        double double38 = continuousOutputModel34.getInitialTime();
        boolean boolean39 = continuousOutputModel34.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel41.requiresDenseOutput();
        double double44 = continuousOutputModel41.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel41.append(continuousOutputModel45);
        boolean boolean47 = continuousOutputModel45.requiresDenseOutput();
        double double48 = continuousOutputModel45.getInitialTime();
        double double49 = continuousOutputModel45.getInitialTime();
        boolean boolean50 = continuousOutputModel45.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double52 = continuousOutputModel51.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel53.append(continuousOutputModel54);
        boolean boolean56 = continuousOutputModel54.requiresDenseOutput();
        double double57 = continuousOutputModel54.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel54.append(continuousOutputModel58);
        double double60 = continuousOutputModel58.getInitialTime();
        continuousOutputModel51.append(continuousOutputModel58);
        continuousOutputModel45.append(continuousOutputModel51);
        continuousOutputModel45.reset();
        double double64 = continuousOutputModel45.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel65 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel65.append(continuousOutputModel66);
        double double68 = continuousOutputModel65.getInitialTime();
        double double69 = continuousOutputModel65.getInitialTime();
        continuousOutputModel45.append(continuousOutputModel65);
        continuousOutputModel34.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel15.append(continuousOutputModel45);
        java.lang.Class<?> wildcardClass74 = continuousOutputModel15.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getInitialTime();
        double double21 = continuousOutputModel17.getInitialTime();
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel30);
        double double32 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel17.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        double double39 = continuousOutputModel36.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel45.reset();
        double double49 = continuousOutputModel45.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel45);
        continuousOutputModel36.append(continuousOutputModel40);
        continuousOutputModel36.reset();
        continuousOutputModel23.append(continuousOutputModel36);
        continuousOutputModel0.append(continuousOutputModel23);
        double double55 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel56.append(continuousOutputModel57);
        boolean boolean59 = continuousOutputModel56.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel61);
        continuousOutputModel61.reset();
        continuousOutputModel61.reset();
        double double65 = continuousOutputModel61.getFinalTime();
        continuousOutputModel56.append(continuousOutputModel61);
        boolean boolean67 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel56.reset();
        double double69 = continuousOutputModel56.getFinalTime();
        continuousOutputModel56.reset();
        double double71 = continuousOutputModel56.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel56);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double74 = continuousOutputModel73.getInitialTime();
        continuousOutputModel73.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel76 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel77 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel76.append(continuousOutputModel77);
        boolean boolean79 = continuousOutputModel77.requiresDenseOutput();
        double double80 = continuousOutputModel77.getFinalTime();
        boolean boolean81 = continuousOutputModel77.requiresDenseOutput();
        continuousOutputModel73.append(continuousOutputModel77);
        double double83 = continuousOutputModel77.getFinalTime();
        double double84 = continuousOutputModel77.getInitialTime();
        continuousOutputModel56.append(continuousOutputModel77);
        double double86 = continuousOutputModel77.getInitialTime();
        continuousOutputModel77.reset();
        double double88 = continuousOutputModel77.getFinalTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double80));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double83));
        org.junit.Assert.assertTrue(Double.isNaN(double84));
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel14.append(continuousOutputModel15);
        boolean boolean17 = continuousOutputModel15.requiresDenseOutput();
        double double18 = continuousOutputModel15.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel19);
        double double21 = continuousOutputModel19.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel19);
        boolean boolean23 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean25 = continuousOutputModel12.requiresDenseOutput();
        double double26 = continuousOutputModel12.getFinalTime();
        double double27 = continuousOutputModel12.getInitialTime();
        double double28 = continuousOutputModel12.getFinalTime();
        continuousOutputModel7.append(continuousOutputModel12);
        continuousOutputModel12.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel31.append(continuousOutputModel32);
        continuousOutputModel32.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        continuousOutputModel32.append(continuousOutputModel36);
        boolean boolean39 = continuousOutputModel32.requiresDenseOutput();
        double double40 = continuousOutputModel32.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel32);
        continuousOutputModel32.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        double double12 = continuousOutputModel0.getFinalTime();
        double double13 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel14.append(continuousOutputModel15);
        boolean boolean17 = continuousOutputModel14.requiresDenseOutput();
        double double18 = continuousOutputModel14.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double20 = continuousOutputModel19.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel21.append(continuousOutputModel22);
        boolean boolean24 = continuousOutputModel22.requiresDenseOutput();
        double double25 = continuousOutputModel22.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel22.append(continuousOutputModel26);
        double double28 = continuousOutputModel26.getInitialTime();
        continuousOutputModel19.append(continuousOutputModel26);
        boolean boolean30 = continuousOutputModel26.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel34.requiresDenseOutput();
        double double37 = continuousOutputModel34.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel34.append(continuousOutputModel38);
        double double40 = continuousOutputModel38.getInitialTime();
        continuousOutputModel31.append(continuousOutputModel38);
        boolean boolean42 = continuousOutputModel31.requiresDenseOutput();
        continuousOutputModel31.reset();
        boolean boolean44 = continuousOutputModel31.requiresDenseOutput();
        double double45 = continuousOutputModel31.getFinalTime();
        double double46 = continuousOutputModel31.getInitialTime();
        double double47 = continuousOutputModel31.getFinalTime();
        continuousOutputModel26.append(continuousOutputModel31);
        double double49 = continuousOutputModel26.getFinalTime();
        double double50 = continuousOutputModel26.getFinalTime();
        continuousOutputModel14.append(continuousOutputModel26);
        boolean boolean52 = continuousOutputModel14.requiresDenseOutput();
        double double53 = continuousOutputModel14.getInitialTime();
        double double54 = continuousOutputModel14.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel14);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel14.handleStep(stepInterpolator56, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        double double12 = continuousOutputModel0.getInitialTime();
        double double13 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean8 = continuousOutputModel1.requiresDenseOutput();
        double double9 = continuousOutputModel1.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray10 = continuousOutputModel1.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean8 = continuousOutputModel1.requiresDenseOutput();
        double double9 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        double double13 = continuousOutputModel10.getInitialTime();
        double double14 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel16.append(continuousOutputModel20);
        double double22 = continuousOutputModel20.getInitialTime();
        boolean boolean23 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel20);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        continuousOutputModel30.reset();
        double double34 = continuousOutputModel30.getFinalTime();
        continuousOutputModel25.append(continuousOutputModel30);
        double double36 = continuousOutputModel25.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel25);
        double double38 = continuousOutputModel20.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel20);
        double double40 = continuousOutputModel20.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel20.handleStep(stepInterpolator41, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        java.lang.Class<?> wildcardClass4 = continuousOutputModel1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel4);
        boolean boolean6 = continuousOutputModel4.requiresDenseOutput();
        double double7 = continuousOutputModel4.getFinalTime();
        boolean boolean8 = continuousOutputModel4.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel4);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel4.setInterpolatedTime(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        double double7 = continuousOutputModel5.getInitialTime();
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        double double9 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel16.append(continuousOutputModel17);
        continuousOutputModel17.reset();
        continuousOutputModel17.reset();
        double double21 = continuousOutputModel17.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel17);
        boolean boolean23 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel24.append(continuousOutputModel25);
        continuousOutputModel25.reset();
        continuousOutputModel25.reset();
        boolean boolean29 = continuousOutputModel25.requiresDenseOutput();
        continuousOutputModel12.append(continuousOutputModel25);
        continuousOutputModel10.append(continuousOutputModel25);
        continuousOutputModel10.reset();
        boolean boolean33 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel5.append(continuousOutputModel10);
        boolean boolean35 = continuousOutputModel5.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel8.append(continuousOutputModel9);
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        double double12 = continuousOutputModel9.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel14);
        boolean boolean16 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel17.append(continuousOutputModel18);
        continuousOutputModel18.reset();
        continuousOutputModel18.reset();
        double double22 = continuousOutputModel18.getFinalTime();
        continuousOutputModel13.append(continuousOutputModel18);
        continuousOutputModel9.append(continuousOutputModel13);
        double double25 = continuousOutputModel9.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel9);
        boolean boolean27 = continuousOutputModel9.requiresDenseOutput();
        double double28 = continuousOutputModel9.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel9.handleStep(stepInterpolator29, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel8.append(continuousOutputModel9);
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getFinalTime();
        continuousOutputModel17.reset();
        continuousOutputModel8.append(continuousOutputModel17);
        continuousOutputModel8.reset();
        continuousOutputModel1.append(continuousOutputModel8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        double double7 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel16);
        boolean boolean20 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean22 = continuousOutputModel9.requiresDenseOutput();
        double double23 = continuousOutputModel9.getFinalTime();
        double double24 = continuousOutputModel9.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel9);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel27);
        continuousOutputModel27.reset();
        continuousOutputModel27.reset();
        double double31 = continuousOutputModel27.getFinalTime();
        continuousOutputModel27.reset();
        double double33 = continuousOutputModel27.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel34.append(continuousOutputModel35);
        boolean boolean37 = continuousOutputModel34.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel38.append(continuousOutputModel39);
        continuousOutputModel39.reset();
        continuousOutputModel39.reset();
        double double43 = continuousOutputModel39.getFinalTime();
        continuousOutputModel34.append(continuousOutputModel39);
        boolean boolean45 = continuousOutputModel34.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel46.append(continuousOutputModel47);
        continuousOutputModel47.reset();
        continuousOutputModel47.reset();
        boolean boolean51 = continuousOutputModel47.requiresDenseOutput();
        continuousOutputModel34.append(continuousOutputModel47);
        double double53 = continuousOutputModel47.getInitialTime();
        continuousOutputModel27.append(continuousOutputModel47);
        continuousOutputModel9.append(continuousOutputModel47);
        boolean boolean56 = continuousOutputModel47.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double58 = continuousOutputModel57.getInitialTime();
        continuousOutputModel57.reset();
        double double60 = continuousOutputModel57.getInitialTime();
        double double61 = continuousOutputModel57.getFinalTime();
        double double62 = continuousOutputModel57.getInitialTime();
        continuousOutputModel47.append(continuousOutputModel57);
        continuousOutputModel57.reset();
        double double65 = continuousOutputModel57.getInitialTime();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double12 = continuousOutputModel11.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel14);
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        double double17 = continuousOutputModel14.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel14.append(continuousOutputModel18);
        double double20 = continuousOutputModel18.getInitialTime();
        continuousOutputModel11.append(continuousOutputModel18);
        continuousOutputModel5.append(continuousOutputModel11);
        continuousOutputModel5.reset();
        double double24 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        double double28 = continuousOutputModel25.getInitialTime();
        double double29 = continuousOutputModel25.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel25);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel34.requiresDenseOutput();
        double double37 = continuousOutputModel34.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel34.append(continuousOutputModel38);
        double double40 = continuousOutputModel38.getInitialTime();
        continuousOutputModel31.append(continuousOutputModel38);
        continuousOutputModel31.reset();
        double double43 = continuousOutputModel31.getFinalTime();
        continuousOutputModel5.append(continuousOutputModel31);
        double double45 = continuousOutputModel31.getInitialTime();
        double double46 = continuousOutputModel31.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean8 = continuousOutputModel1.requiresDenseOutput();
        double double9 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        continuousOutputModel5.append(continuousOutputModel12);
        boolean boolean17 = continuousOutputModel12.requiresDenseOutput();
        boolean boolean18 = continuousOutputModel12.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray19 = continuousOutputModel12.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        double double9 = continuousOutputModel5.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel5);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double13 = continuousOutputModel0.getFinalTime();
        double double14 = continuousOutputModel0.getFinalTime();
        double double15 = continuousOutputModel0.getInitialTime();
        double double16 = continuousOutputModel0.getInitialTime();
        boolean boolean17 = continuousOutputModel0.requiresDenseOutput();
        double double18 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = continuousOutputModel0.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel13.append(continuousOutputModel17);
        boolean boolean19 = continuousOutputModel17.requiresDenseOutput();
        double double20 = continuousOutputModel17.getInitialTime();
        double double21 = continuousOutputModel17.getInitialTime();
        boolean boolean22 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double24 = continuousOutputModel23.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel30);
        double double32 = continuousOutputModel30.getInitialTime();
        continuousOutputModel23.append(continuousOutputModel30);
        continuousOutputModel17.append(continuousOutputModel23);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        boolean boolean38 = continuousOutputModel36.requiresDenseOutput();
        double double39 = continuousOutputModel36.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel45.reset();
        double double49 = continuousOutputModel45.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel45);
        continuousOutputModel36.append(continuousOutputModel40);
        continuousOutputModel36.reset();
        continuousOutputModel23.append(continuousOutputModel36);
        continuousOutputModel0.append(continuousOutputModel23);
        double double55 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel56 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel56.append(continuousOutputModel57);
        boolean boolean59 = continuousOutputModel56.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel60 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel61 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel60.append(continuousOutputModel61);
        continuousOutputModel61.reset();
        continuousOutputModel61.reset();
        double double65 = continuousOutputModel61.getFinalTime();
        continuousOutputModel56.append(continuousOutputModel61);
        boolean boolean67 = continuousOutputModel56.requiresDenseOutput();
        continuousOutputModel56.reset();
        double double69 = continuousOutputModel56.getFinalTime();
        continuousOutputModel56.reset();
        double double71 = continuousOutputModel56.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel56);
        continuousOutputModel56.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        continuousOutputModel16.reset();
        double double19 = continuousOutputModel16.getInitialTime();
        continuousOutputModel16.reset();
        continuousOutputModel0.append(continuousOutputModel16);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel22.append(continuousOutputModel23);
        boolean boolean25 = continuousOutputModel22.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel27 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel26.append(continuousOutputModel27);
        continuousOutputModel27.reset();
        continuousOutputModel27.reset();
        double double31 = continuousOutputModel27.getFinalTime();
        continuousOutputModel22.append(continuousOutputModel27);
        continuousOutputModel22.reset();
        boolean boolean34 = continuousOutputModel22.requiresDenseOutput();
        double double35 = continuousOutputModel22.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel36.append(continuousOutputModel37);
        boolean boolean39 = continuousOutputModel37.requiresDenseOutput();
        double double40 = continuousOutputModel37.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel37.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel41.requiresDenseOutput();
        double double44 = continuousOutputModel41.getInitialTime();
        double double45 = continuousOutputModel41.getInitialTime();
        boolean boolean46 = continuousOutputModel41.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double48 = continuousOutputModel47.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel49.append(continuousOutputModel50);
        boolean boolean52 = continuousOutputModel50.requiresDenseOutput();
        double double53 = continuousOutputModel50.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel50.append(continuousOutputModel54);
        double double56 = continuousOutputModel54.getInitialTime();
        continuousOutputModel47.append(continuousOutputModel54);
        continuousOutputModel41.append(continuousOutputModel54);
        double double59 = continuousOutputModel54.getInitialTime();
        continuousOutputModel22.append(continuousOutputModel54);
        continuousOutputModel0.append(continuousOutputModel54);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel63 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel63.append(continuousOutputModel64);
        boolean boolean66 = continuousOutputModel64.requiresDenseOutput();
        double double67 = continuousOutputModel64.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel68 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel64.append(continuousOutputModel68);
        boolean boolean70 = continuousOutputModel68.requiresDenseOutput();
        double double71 = continuousOutputModel68.getFinalTime();
        continuousOutputModel68.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel73 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel74 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel73.append(continuousOutputModel74);
        boolean boolean76 = continuousOutputModel74.requiresDenseOutput();
        double double77 = continuousOutputModel74.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel78 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel74.append(continuousOutputModel78);
        boolean boolean80 = continuousOutputModel78.requiresDenseOutput();
        double double81 = continuousOutputModel78.getInitialTime();
        double double82 = continuousOutputModel78.getInitialTime();
        boolean boolean83 = continuousOutputModel78.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel84 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel85 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel84.append(continuousOutputModel85);
        continuousOutputModel85.reset();
        continuousOutputModel85.reset();
        continuousOutputModel78.append(continuousOutputModel85);
        continuousOutputModel68.append(continuousOutputModel78);
        continuousOutputModel0.append(continuousOutputModel68);
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel68.setInterpolatedTime(100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        double double7 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double10 = continuousOutputModel9.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel16);
        double double18 = continuousOutputModel16.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel16);
        boolean boolean20 = continuousOutputModel9.requiresDenseOutput();
        continuousOutputModel9.reset();
        boolean boolean22 = continuousOutputModel9.requiresDenseOutput();
        double double23 = continuousOutputModel9.getFinalTime();
        double double24 = continuousOutputModel9.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel9);
        boolean boolean26 = continuousOutputModel9.requiresDenseOutput();
        double double27 = continuousOutputModel9.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel28.append(continuousOutputModel29);
        boolean boolean31 = continuousOutputModel29.requiresDenseOutput();
        double double32 = continuousOutputModel29.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel37 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel37.append(continuousOutputModel38);
        continuousOutputModel38.reset();
        continuousOutputModel38.reset();
        double double42 = continuousOutputModel38.getFinalTime();
        continuousOutputModel33.append(continuousOutputModel38);
        continuousOutputModel29.append(continuousOutputModel33);
        double double45 = continuousOutputModel29.getInitialTime();
        continuousOutputModel9.append(continuousOutputModel29);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel47.append(continuousOutputModel48);
        boolean boolean50 = continuousOutputModel47.requiresDenseOutput();
        double double51 = continuousOutputModel47.getFinalTime();
        continuousOutputModel29.append(continuousOutputModel47);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel29.handleStep(stepInterpolator53, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel7.append(continuousOutputModel8);
        boolean boolean10 = continuousOutputModel8.requiresDenseOutput();
        double double11 = continuousOutputModel8.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel8.append(continuousOutputModel12);
        double double14 = continuousOutputModel12.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel12);
        boolean boolean16 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean30 = continuousOutputModel17.requiresDenseOutput();
        double double31 = continuousOutputModel17.getFinalTime();
        double double32 = continuousOutputModel17.getInitialTime();
        double double33 = continuousOutputModel17.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel17);
        double double35 = continuousOutputModel12.getFinalTime();
        double double36 = continuousOutputModel12.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel12);
        double double38 = continuousOutputModel0.getFinalTime();
        boolean boolean39 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel40.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        continuousOutputModel45.reset();
        continuousOutputModel45.reset();
        double double49 = continuousOutputModel45.getFinalTime();
        continuousOutputModel40.append(continuousOutputModel45);
        boolean boolean51 = continuousOutputModel40.requiresDenseOutput();
        continuousOutputModel40.reset();
        double double53 = continuousOutputModel40.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel10);
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        double double13 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel10.append(continuousOutputModel14);
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        double double17 = continuousOutputModel14.getInitialTime();
        double double18 = continuousOutputModel14.getInitialTime();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel21);
        continuousOutputModel21.reset();
        continuousOutputModel21.reset();
        continuousOutputModel14.append(continuousOutputModel21);
        continuousOutputModel14.reset();
        continuousOutputModel5.append(continuousOutputModel14);
        boolean boolean28 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        boolean boolean32 = continuousOutputModel30.requiresDenseOutput();
        double double33 = continuousOutputModel30.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel30.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel34.requiresDenseOutput();
        double double37 = continuousOutputModel34.getInitialTime();
        double double38 = continuousOutputModel34.getInitialTime();
        boolean boolean39 = continuousOutputModel34.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel41.requiresDenseOutput();
        double double44 = continuousOutputModel41.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel41.append(continuousOutputModel45);
        boolean boolean47 = continuousOutputModel45.requiresDenseOutput();
        double double48 = continuousOutputModel45.getInitialTime();
        double double49 = continuousOutputModel45.getInitialTime();
        boolean boolean50 = continuousOutputModel45.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel51 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double52 = continuousOutputModel51.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel53.append(continuousOutputModel54);
        boolean boolean56 = continuousOutputModel54.requiresDenseOutput();
        double double57 = continuousOutputModel54.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel54.append(continuousOutputModel58);
        double double60 = continuousOutputModel58.getInitialTime();
        continuousOutputModel51.append(continuousOutputModel58);
        continuousOutputModel45.append(continuousOutputModel51);
        continuousOutputModel45.reset();
        double double64 = continuousOutputModel45.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel65 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel66 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel65.append(continuousOutputModel66);
        double double68 = continuousOutputModel65.getInitialTime();
        double double69 = continuousOutputModel65.getInitialTime();
        continuousOutputModel45.append(continuousOutputModel65);
        continuousOutputModel34.append(continuousOutputModel45);
        continuousOutputModel5.append(continuousOutputModel45);
        double double73 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel5.handleStep(stepInterpolator74, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        continuousOutputModel5.append(continuousOutputModel12);
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        java.lang.Class<?> wildcardClass19 = continuousOutputModel5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        boolean boolean5 = continuousOutputModel1.requiresDenseOutput();
        continuousOutputModel1.reset();
        double double7 = continuousOutputModel1.getInitialTime();
        double double8 = continuousOutputModel1.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel10);
        boolean boolean12 = continuousOutputModel10.requiresDenseOutput();
        double double13 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel10.append(continuousOutputModel14);
        boolean boolean16 = continuousOutputModel14.requiresDenseOutput();
        double double17 = continuousOutputModel14.getInitialTime();
        double double18 = continuousOutputModel14.getInitialTime();
        boolean boolean19 = continuousOutputModel14.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel21);
        boolean boolean23 = continuousOutputModel21.requiresDenseOutput();
        double double24 = continuousOutputModel21.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel21.append(continuousOutputModel25);
        boolean boolean27 = continuousOutputModel25.requiresDenseOutput();
        double double28 = continuousOutputModel25.getInitialTime();
        double double29 = continuousOutputModel25.getInitialTime();
        boolean boolean30 = continuousOutputModel25.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double32 = continuousOutputModel31.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel34.requiresDenseOutput();
        double double37 = continuousOutputModel34.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel34.append(continuousOutputModel38);
        double double40 = continuousOutputModel38.getInitialTime();
        continuousOutputModel31.append(continuousOutputModel38);
        continuousOutputModel25.append(continuousOutputModel31);
        continuousOutputModel25.reset();
        double double44 = continuousOutputModel25.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel46 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel45.append(continuousOutputModel46);
        double double48 = continuousOutputModel45.getInitialTime();
        double double49 = continuousOutputModel45.getInitialTime();
        continuousOutputModel25.append(continuousOutputModel45);
        continuousOutputModel14.append(continuousOutputModel25);
        double double52 = continuousOutputModel14.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel53.append(continuousOutputModel54);
        boolean boolean56 = continuousOutputModel54.requiresDenseOutput();
        double double57 = continuousOutputModel54.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel54.append(continuousOutputModel58);
        continuousOutputModel54.reset();
        double double61 = continuousOutputModel54.getInitialTime();
        continuousOutputModel14.append(continuousOutputModel54);
        continuousOutputModel1.append(continuousOutputModel54);
        double double64 = continuousOutputModel1.getFinalTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.setInterpolatedTime((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        double double7 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel8.append(continuousOutputModel9);
        boolean boolean11 = continuousOutputModel8.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        continuousOutputModel13.reset();
        continuousOutputModel13.reset();
        double double17 = continuousOutputModel13.getFinalTime();
        continuousOutputModel8.append(continuousOutputModel13);
        boolean boolean19 = continuousOutputModel8.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel21);
        continuousOutputModel21.reset();
        continuousOutputModel21.reset();
        boolean boolean25 = continuousOutputModel21.requiresDenseOutput();
        continuousOutputModel8.append(continuousOutputModel21);
        double double27 = continuousOutputModel21.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel21);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        continuousOutputModel30.append(continuousOutputModel34);
        continuousOutputModel34.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel38.append(continuousOutputModel39);
        boolean boolean41 = continuousOutputModel39.requiresDenseOutput();
        double double42 = continuousOutputModel39.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel39.append(continuousOutputModel43);
        boolean boolean45 = continuousOutputModel43.requiresDenseOutput();
        double double46 = continuousOutputModel43.getInitialTime();
        double double47 = continuousOutputModel43.getInitialTime();
        boolean boolean48 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel49.append(continuousOutputModel50);
        continuousOutputModel50.reset();
        continuousOutputModel50.reset();
        continuousOutputModel43.append(continuousOutputModel50);
        continuousOutputModel43.reset();
        continuousOutputModel34.append(continuousOutputModel43);
        continuousOutputModel34.reset();
        double double58 = continuousOutputModel34.getInitialTime();
        boolean boolean59 = continuousOutputModel34.requiresDenseOutput();
        double double60 = continuousOutputModel34.getInitialTime();
        continuousOutputModel21.append(continuousOutputModel34);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        double double9 = continuousOutputModel5.getFinalTime();
        double double10 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        boolean boolean14 = continuousOutputModel12.requiresDenseOutput();
        double double15 = continuousOutputModel12.getFinalTime();
        boolean boolean16 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel17.requiresDenseOutput();
        double double29 = continuousOutputModel17.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel17);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel31 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel31.append(continuousOutputModel32);
        double double34 = continuousOutputModel31.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel35 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel36 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel35.append(continuousOutputModel36);
        continuousOutputModel36.reset();
        continuousOutputModel36.reset();
        double double40 = continuousOutputModel36.getFinalTime();
        continuousOutputModel31.append(continuousOutputModel36);
        continuousOutputModel31.reset();
        continuousOutputModel17.append(continuousOutputModel31);
        continuousOutputModel5.append(continuousOutputModel17);
        continuousOutputModel17.reset();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel17.setInterpolatedTime((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getFinalTime();
        boolean boolean9 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel5.reset();
        double double11 = continuousOutputModel5.getFinalTime();
        boolean boolean12 = continuousOutputModel5.requiresDenseOutput();
        continuousOutputModel0.append(continuousOutputModel5);
        double double14 = continuousOutputModel5.getInitialTime();
        java.lang.Class<?> wildcardClass15 = continuousOutputModel5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getFinalTime();
        double double15 = continuousOutputModel0.getInitialTime();
        double double16 = continuousOutputModel0.getFinalTime();
        boolean boolean17 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean8 = continuousOutputModel1.requiresDenseOutput();
        double double9 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double11 = continuousOutputModel10.getInitialTime();
        continuousOutputModel10.reset();
        double double13 = continuousOutputModel10.getInitialTime();
        double double14 = continuousOutputModel10.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel16.append(continuousOutputModel20);
        double double22 = continuousOutputModel20.getInitialTime();
        boolean boolean23 = continuousOutputModel20.requiresDenseOutput();
        continuousOutputModel10.append(continuousOutputModel20);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel25.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel30 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel30);
        continuousOutputModel30.reset();
        continuousOutputModel30.reset();
        double double34 = continuousOutputModel30.getFinalTime();
        continuousOutputModel25.append(continuousOutputModel30);
        double double36 = continuousOutputModel25.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel25);
        double double38 = continuousOutputModel20.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel20);
        boolean boolean40 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel42 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel41.append(continuousOutputModel42);
        boolean boolean44 = continuousOutputModel42.requiresDenseOutput();
        double double45 = continuousOutputModel42.getFinalTime();
        boolean boolean46 = continuousOutputModel42.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double48 = continuousOutputModel47.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel49.append(continuousOutputModel50);
        boolean boolean52 = continuousOutputModel50.requiresDenseOutput();
        double double53 = continuousOutputModel50.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel50.append(continuousOutputModel54);
        double double56 = continuousOutputModel54.getInitialTime();
        continuousOutputModel47.append(continuousOutputModel54);
        boolean boolean58 = continuousOutputModel47.requiresDenseOutput();
        double double59 = continuousOutputModel47.getInitialTime();
        continuousOutputModel42.append(continuousOutputModel47);
        boolean boolean61 = continuousOutputModel47.requiresDenseOutput();
        double double62 = continuousOutputModel47.getInitialTime();
        continuousOutputModel20.append(continuousOutputModel47);
        // The following exception was thrown during execution in test generation
        try {
            double double64 = continuousOutputModel20.getInterpolatedTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double14 = continuousOutputModel13.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel16.append(continuousOutputModel20);
        double double22 = continuousOutputModel20.getInitialTime();
        continuousOutputModel13.append(continuousOutputModel20);
        boolean boolean24 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel25.append(continuousOutputModel26);
        boolean boolean28 = continuousOutputModel26.requiresDenseOutput();
        double double29 = continuousOutputModel26.getFinalTime();
        boolean boolean30 = continuousOutputModel26.requiresDenseOutput();
        continuousOutputModel26.reset();
        continuousOutputModel13.append(continuousOutputModel26);
        continuousOutputModel0.append(continuousOutputModel13);
        boolean boolean34 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        double double36 = continuousOutputModel0.getInitialTime();
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.setInterpolatedTime((double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getFinalTime();
        double double15 = continuousOutputModel0.getInitialTime();
        double double16 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel17.append(continuousOutputModel18);
        boolean boolean20 = continuousOutputModel17.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel21.append(continuousOutputModel22);
        continuousOutputModel22.reset();
        continuousOutputModel22.reset();
        double double26 = continuousOutputModel22.getFinalTime();
        continuousOutputModel17.append(continuousOutputModel22);
        continuousOutputModel17.reset();
        double double29 = continuousOutputModel17.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel17);
        boolean boolean31 = continuousOutputModel17.requiresDenseOutput();
        double double32 = continuousOutputModel17.getInitialTime();
        double double33 = continuousOutputModel17.getInitialTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel9);
        boolean boolean11 = continuousOutputModel9.requiresDenseOutput();
        double double12 = continuousOutputModel9.getFinalTime();
        continuousOutputModel9.reset();
        continuousOutputModel0.append(continuousOutputModel9);
        continuousOutputModel9.reset();
        double double16 = continuousOutputModel9.getFinalTime();
        double double17 = continuousOutputModel9.getFinalTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        double double4 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double6 = continuousOutputModel5.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel8 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel7.append(continuousOutputModel8);
        boolean boolean10 = continuousOutputModel8.requiresDenseOutput();
        double double11 = continuousOutputModel8.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel8.append(continuousOutputModel12);
        double double14 = continuousOutputModel12.getInitialTime();
        continuousOutputModel5.append(continuousOutputModel12);
        boolean boolean16 = continuousOutputModel12.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double18 = continuousOutputModel17.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel19.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel24 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel24);
        double double26 = continuousOutputModel24.getInitialTime();
        continuousOutputModel17.append(continuousOutputModel24);
        boolean boolean28 = continuousOutputModel17.requiresDenseOutput();
        continuousOutputModel17.reset();
        boolean boolean30 = continuousOutputModel17.requiresDenseOutput();
        double double31 = continuousOutputModel17.getFinalTime();
        double double32 = continuousOutputModel17.getInitialTime();
        double double33 = continuousOutputModel17.getFinalTime();
        continuousOutputModel12.append(continuousOutputModel17);
        double double35 = continuousOutputModel12.getFinalTime();
        double double36 = continuousOutputModel12.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel12);
        double double38 = continuousOutputModel0.getFinalTime();
        boolean boolean39 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel40 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel41 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel40.append(continuousOutputModel41);
        boolean boolean43 = continuousOutputModel41.requiresDenseOutput();
        double double44 = continuousOutputModel41.getFinalTime();
        boolean boolean45 = continuousOutputModel41.requiresDenseOutput();
        continuousOutputModel41.reset();
        continuousOutputModel41.reset();
        double double48 = continuousOutputModel41.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel50 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel49.append(continuousOutputModel50);
        continuousOutputModel50.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel53 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel54 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel53.append(continuousOutputModel54);
        continuousOutputModel50.append(continuousOutputModel54);
        boolean boolean57 = continuousOutputModel54.requiresDenseOutput();
        continuousOutputModel41.append(continuousOutputModel54);
        continuousOutputModel0.append(continuousOutputModel41);
        continuousOutputModel0.reset();
        double double61 = continuousOutputModel0.getFinalTime();
        boolean boolean62 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel63 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel64 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel63.append(continuousOutputModel64);
        boolean boolean66 = continuousOutputModel64.requiresDenseOutput();
        double double67 = continuousOutputModel64.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel68 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel64.append(continuousOutputModel68);
        boolean boolean70 = continuousOutputModel68.requiresDenseOutput();
        double double71 = continuousOutputModel68.getInitialTime();
        double double72 = continuousOutputModel68.getInitialTime();
        boolean boolean73 = continuousOutputModel68.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel74 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel75 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel74.append(continuousOutputModel75);
        continuousOutputModel75.reset();
        continuousOutputModel75.reset();
        continuousOutputModel68.append(continuousOutputModel75);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel80 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double81 = continuousOutputModel80.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel82 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel83 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel82.append(continuousOutputModel83);
        boolean boolean85 = continuousOutputModel83.requiresDenseOutput();
        double double86 = continuousOutputModel83.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel87 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel83.append(continuousOutputModel87);
        double double89 = continuousOutputModel87.getInitialTime();
        continuousOutputModel80.append(continuousOutputModel87);
        continuousOutputModel68.append(continuousOutputModel80);
        continuousOutputModel0.append(continuousOutputModel68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double86));
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel7.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double13 = continuousOutputModel12.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel14 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel14.append(continuousOutputModel15);
        boolean boolean17 = continuousOutputModel15.requiresDenseOutput();
        double double18 = continuousOutputModel15.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel19);
        double double21 = continuousOutputModel19.getInitialTime();
        continuousOutputModel12.append(continuousOutputModel19);
        boolean boolean23 = continuousOutputModel12.requiresDenseOutput();
        continuousOutputModel12.reset();
        boolean boolean25 = continuousOutputModel12.requiresDenseOutput();
        double double26 = continuousOutputModel12.getFinalTime();
        double double27 = continuousOutputModel12.getInitialTime();
        double double28 = continuousOutputModel12.getFinalTime();
        continuousOutputModel7.append(continuousOutputModel12);
        double double30 = continuousOutputModel7.getFinalTime();
        double double31 = continuousOutputModel7.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel32 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel32.append(continuousOutputModel33);
        double double35 = continuousOutputModel33.getFinalTime();
        boolean boolean36 = continuousOutputModel33.requiresDenseOutput();
        double double37 = continuousOutputModel33.getInitialTime();
        continuousOutputModel7.append(continuousOutputModel33);
        continuousOutputModel33.reset();
        continuousOutputModel33.reset();
        boolean boolean41 = continuousOutputModel33.requiresDenseOutput();
        double double42 = continuousOutputModel33.getFinalTime();
        double double43 = continuousOutputModel33.getInitialTime();
        double double44 = continuousOutputModel33.getInitialTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel1.append(continuousOutputModel5);
        boolean boolean7 = continuousOutputModel5.requiresDenseOutput();
        double double8 = continuousOutputModel5.getInitialTime();
        double double9 = continuousOutputModel5.getInitialTime();
        boolean boolean10 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel11 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel11.append(continuousOutputModel12);
        continuousOutputModel12.reset();
        continuousOutputModel12.reset();
        continuousOutputModel5.append(continuousOutputModel12);
        boolean boolean17 = continuousOutputModel12.requiresDenseOutput();
        double double18 = continuousOutputModel12.getInitialTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel4 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel4.append(continuousOutputModel5);
        continuousOutputModel5.reset();
        continuousOutputModel5.reset();
        double double9 = continuousOutputModel5.getFinalTime();
        continuousOutputModel0.append(continuousOutputModel5);
        continuousOutputModel0.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel12 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel13 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel12.append(continuousOutputModel13);
        boolean boolean15 = continuousOutputModel13.requiresDenseOutput();
        double double16 = continuousOutputModel13.getFinalTime();
        boolean boolean17 = continuousOutputModel13.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double19 = continuousOutputModel18.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel21 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel20.append(continuousOutputModel21);
        boolean boolean23 = continuousOutputModel21.requiresDenseOutput();
        double double24 = continuousOutputModel21.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel25 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel21.append(continuousOutputModel25);
        double double27 = continuousOutputModel25.getInitialTime();
        continuousOutputModel18.append(continuousOutputModel25);
        boolean boolean29 = continuousOutputModel18.requiresDenseOutput();
        double double30 = continuousOutputModel18.getInitialTime();
        continuousOutputModel13.append(continuousOutputModel18);
        continuousOutputModel0.append(continuousOutputModel18);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel34 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel33.append(continuousOutputModel34);
        boolean boolean36 = continuousOutputModel34.requiresDenseOutput();
        double double37 = continuousOutputModel34.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel34.append(continuousOutputModel38);
        boolean boolean40 = continuousOutputModel38.requiresDenseOutput();
        double double41 = continuousOutputModel38.getInitialTime();
        double double42 = continuousOutputModel38.getInitialTime();
        boolean boolean43 = continuousOutputModel38.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel45 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel44.append(continuousOutputModel45);
        boolean boolean47 = continuousOutputModel45.requiresDenseOutput();
        double double48 = continuousOutputModel45.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel49 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel45.append(continuousOutputModel49);
        boolean boolean51 = continuousOutputModel49.requiresDenseOutput();
        double double52 = continuousOutputModel49.getInitialTime();
        double double53 = continuousOutputModel49.getInitialTime();
        boolean boolean54 = continuousOutputModel49.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel55 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double56 = continuousOutputModel55.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel57 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel58 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel57.append(continuousOutputModel58);
        boolean boolean60 = continuousOutputModel58.requiresDenseOutput();
        double double61 = continuousOutputModel58.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel62 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel58.append(continuousOutputModel62);
        double double64 = continuousOutputModel62.getInitialTime();
        continuousOutputModel55.append(continuousOutputModel62);
        continuousOutputModel49.append(continuousOutputModel55);
        continuousOutputModel49.reset();
        double double68 = continuousOutputModel49.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel69 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel70 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel69.append(continuousOutputModel70);
        double double72 = continuousOutputModel69.getInitialTime();
        double double73 = continuousOutputModel69.getInitialTime();
        continuousOutputModel49.append(continuousOutputModel69);
        continuousOutputModel38.append(continuousOutputModel49);
        continuousOutputModel49.reset();
        continuousOutputModel49.reset();
        double double78 = continuousOutputModel49.getInitialTime();
        continuousOutputModel18.append(continuousOutputModel49);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        continuousOutputModel0.reset();
        boolean boolean15 = continuousOutputModel0.requiresDenseOutput();
        double double16 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        boolean boolean5 = continuousOutputModel1.requiresDenseOutput();
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double8 = continuousOutputModel1.getInitialTime();
        continuousOutputModel1.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel1.handleStep(stepInterpolator10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        boolean boolean3 = continuousOutputModel1.requiresDenseOutput();
        double double4 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel5 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel6 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel5.append(continuousOutputModel6);
        boolean boolean8 = continuousOutputModel5.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel10);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        double double14 = continuousOutputModel10.getFinalTime();
        continuousOutputModel5.append(continuousOutputModel10);
        continuousOutputModel1.append(continuousOutputModel5);
        double double17 = continuousOutputModel1.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel19 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel18.append(continuousOutputModel19);
        continuousOutputModel19.reset();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel22 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel23 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel22.append(continuousOutputModel23);
        continuousOutputModel19.append(continuousOutputModel23);
        boolean boolean26 = continuousOutputModel19.requiresDenseOutput();
        boolean boolean27 = continuousOutputModel19.requiresDenseOutput();
        continuousOutputModel1.append(continuousOutputModel19);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double30 = continuousOutputModel29.getInitialTime();
        continuousOutputModel29.reset();
        double double32 = continuousOutputModel29.getInitialTime();
        continuousOutputModel1.append(continuousOutputModel29);
        boolean boolean34 = continuousOutputModel29.requiresDenseOutput();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray35 = continuousOutputModel29.getInterpolatedState();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double1 = continuousOutputModel0.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel2 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel3 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel2.append(continuousOutputModel3);
        boolean boolean5 = continuousOutputModel3.requiresDenseOutput();
        double double6 = continuousOutputModel3.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel7 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel3.append(continuousOutputModel7);
        double double9 = continuousOutputModel7.getInitialTime();
        continuousOutputModel0.append(continuousOutputModel7);
        boolean boolean11 = continuousOutputModel0.requiresDenseOutput();
        continuousOutputModel0.reset();
        boolean boolean13 = continuousOutputModel0.requiresDenseOutput();
        double double14 = continuousOutputModel0.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel15 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel16 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel15.append(continuousOutputModel16);
        boolean boolean18 = continuousOutputModel16.requiresDenseOutput();
        double double19 = continuousOutputModel16.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel20 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel16.append(continuousOutputModel20);
        boolean boolean22 = continuousOutputModel20.requiresDenseOutput();
        double double23 = continuousOutputModel20.getInitialTime();
        double double24 = continuousOutputModel20.getInitialTime();
        boolean boolean25 = continuousOutputModel20.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel26 = new org.apache.commons.math.ode.ContinuousOutputModel();
        double double27 = continuousOutputModel26.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel28 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel29 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel28.append(continuousOutputModel29);
        boolean boolean31 = continuousOutputModel29.requiresDenseOutput();
        double double32 = continuousOutputModel29.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel33 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel29.append(continuousOutputModel33);
        double double35 = continuousOutputModel33.getInitialTime();
        continuousOutputModel26.append(continuousOutputModel33);
        continuousOutputModel20.append(continuousOutputModel26);
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel38 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel39 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel38.append(continuousOutputModel39);
        boolean boolean41 = continuousOutputModel39.requiresDenseOutput();
        double double42 = continuousOutputModel39.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel43 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel44 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel43.append(continuousOutputModel44);
        boolean boolean46 = continuousOutputModel43.requiresDenseOutput();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel47 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel48 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel47.append(continuousOutputModel48);
        continuousOutputModel48.reset();
        continuousOutputModel48.reset();
        double double52 = continuousOutputModel48.getFinalTime();
        continuousOutputModel43.append(continuousOutputModel48);
        continuousOutputModel39.append(continuousOutputModel43);
        continuousOutputModel39.reset();
        continuousOutputModel26.append(continuousOutputModel39);
        continuousOutputModel0.append(continuousOutputModel26);
        boolean boolean58 = continuousOutputModel0.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator59 = null;
        // The following exception was thrown during execution in test generation
        try {
            continuousOutputModel0.handleStep(stepInterpolator59, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel0 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel1 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel0.append(continuousOutputModel1);
        continuousOutputModel1.reset();
        continuousOutputModel1.reset();
        double double5 = continuousOutputModel1.getFinalTime();
        continuousOutputModel1.reset();
        boolean boolean7 = continuousOutputModel1.requiresDenseOutput();
        double double8 = continuousOutputModel1.getFinalTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel9 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel10 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel9.append(continuousOutputModel10);
        continuousOutputModel10.reset();
        continuousOutputModel10.reset();
        boolean boolean14 = continuousOutputModel10.requiresDenseOutput();
        continuousOutputModel10.reset();
        double double16 = continuousOutputModel10.getInitialTime();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel17 = new org.apache.commons.math.ode.ContinuousOutputModel();
        org.apache.commons.math.ode.ContinuousOutputModel continuousOutputModel18 = new org.apache.commons.math.ode.ContinuousOutputModel();
        continuousOutputModel17.append(continuousOutputModel18);
        continuousOutputModel10.append(continuousOutputModel18);
        continuousOutputModel1.append(continuousOutputModel18);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }
}

