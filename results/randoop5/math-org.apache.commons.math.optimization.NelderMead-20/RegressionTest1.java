import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 1, (double) 0.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1L, 0.0d, '#' };
        double[] doubleArray15 = new double[] { 1L, 0.0d, '#' };
        double[] doubleArray19 = new double[] { 1L, 0.0d, '#' };
        double[] doubleArray23 = new double[] { 1L, 0.0d, '#' };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray24, (int) (short) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, 100L, 10.0f };
        double[] doubleArray13 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray11, doubleArray13, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 100, (double) (-1L), (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1L, 1L, (short) 0, 100.0f, (byte) 0 };
        double[] doubleArray19 = new double[] { 1L, 1L, (short) 0, 100.0f, (byte) 0 };
        double[] doubleArray25 = new double[] { 1L, 1L, (short) 0, 100.0f, (byte) 0 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray26, (int) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0.0f, (short) -1, (short) -1, (byte) -1, 1L, (byte) 10 };
        double[] doubleArray21 = new double[] { 0.0f, (short) -1, (short) -1, (byte) -1, 1L, (byte) 10 };
        double[] doubleArray28 = new double[] { 0.0f, (short) -1, (short) -1, (byte) -1, 1L, (byte) 10 };
        double[] doubleArray35 = new double[] { 0.0f, (short) -1, (short) -1, (byte) -1, 1L, (byte) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, -1.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, -1.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, -1.0, -1.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, -1.0, -1.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 100, (short) 1, 100, (byte) 1, (short) 1 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, (int) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, 100.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1, 10.0d };
        double[] doubleArray13 = new double[] { 1, 10.0d };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, (int) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 1, (double) 100, (double) 100L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10L, (short) 10, 0, (byte) 0, (-1.0f) };
        double[] doubleArray19 = new double[] { 10L, (short) 10, 0, (byte) 0, (-1.0f) };
        double[] doubleArray25 = new double[] { 10L, (short) 10, 0, (byte) 0, (-1.0f) };
        double[] doubleArray31 = new double[] { 10L, (short) 10, 0, (byte) 0, (-1.0f) };
        double[] doubleArray37 = new double[] { 10L, (short) 10, 0, (byte) 0, (-1.0f) };
        double[] doubleArray43 = new double[] { 10L, (short) 10, 0, (byte) 0, (-1.0f) };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray44, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 10.0, 0.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1L, 10L, (short) 1, 10.0d, (-1.0f), (byte) 100 };
        double[] doubleArray21 = new double[] { 1L, 10L, (short) 1, 10.0d, (-1.0f), (byte) 100 };
        double[] doubleArray28 = new double[] { 1L, 10L, (short) 1, 10.0d, (-1.0f), (byte) 100 };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 1.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 1.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0, 1.0, 10.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 10.0d, (double) ' ', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[][] doubleArray13 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray13, (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100L, (double) 0, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 10, 100.0d, 0.0d, '#', 0L, 10.0f };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, doubleArray15, (int) ' ', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0, 0.0, 35.0, 0.0, 10.0]");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1L, (short) 10, (byte) 100, (byte) 1, 0.0f };
        double[] doubleArray19 = new double[] { 1L, (short) 10, (byte) 100, (byte) 1, 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 0.0d, (byte) 0, 1L, '#' };
        double[] doubleArray19 = new double[] { (-1L), 10.0f, 0.0f, 10.0f, 100L, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 0.0, 10.0, 100.0, 97.0]");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 1.0f, 10.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 0 };
        double[] doubleArray11 = new double[] { (byte) 0 };
        double[] doubleArray13 = new double[] { (byte) 0 };
        double[] doubleArray15 = new double[] { (byte) 0 };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray16, (int) (byte) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1), (double) 100.0f, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 1, (double) 0.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) ' ', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 'a', (double) 10L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 100, (short) 100, 10.0f };
        double[] doubleArray18 = new double[] { (-1.0f), '4', 1.0f, 100L, 10L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 52.0, 1.0, 100.0, 10.0, 0.0]");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) -1, (double) (byte) 100, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0d, 100L, 1.0d };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0d, 100 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray11, (int) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0d, (byte) -1, 1 };
        double[] doubleArray15 = new double[] { 'a', 0.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 0.0, 1.0]");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100L };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray12 = new double[] { 1.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray9, doubleArray12, (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0]");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { 1.0f, (byte) 100, 1.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray8, doubleArray13, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) ' ', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 10 };
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10, (double) (-1), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100L, (double) 0, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1, 1.0f, (byte) 10 };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray12, 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 0.0d, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 100 };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) ' ', (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0d), (byte) 0, (byte) -1, (short) 10, (byte) 10, 100 };
        double[] doubleArray16 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14, doubleArray16, (int) '#', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, -1.0, 10.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0]");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 100, 1, 100.0d };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray12, doubleArray13, (int) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0, 1.0, 100.0]");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) ' ', 0.0d, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1L, (short) 10, (byte) 10 };
        double[] doubleArray18 = new double[] { (short) 0, (short) -1, 1, 10.0d, (-1.0d), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 1.0, 10.0, -1.0, 0.0]");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0d, 100.0f };
        double[] doubleArray13 = new double[] { 10.0d, 100.0f };
        double[] doubleArray16 = new double[] { 10.0d, 100.0f };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray17, (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 1.0d, (double) 'a', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 0, 10L, 0.0f, ' ', 100.0f, (-1.0d) };
        double[] doubleArray21 = new double[] { (byte) 0, 10L, 0.0f, ' ', 100.0f, (-1.0d) };
        double[] doubleArray28 = new double[] { (byte) 0, 10L, 0.0f, ' ', 100.0f, (-1.0d) };
        double[] doubleArray35 = new double[] { (byte) 0, 10L, 0.0f, ' ', 100.0f, (-1.0d) };
        double[] doubleArray42 = new double[] { (byte) 0, 10L, 0.0f, ' ', 100.0f, (-1.0d) };
        double[] doubleArray49 = new double[] { (byte) 0, 10L, 0.0f, ' ', 100.0f, (-1.0d) };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray50, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0, 0.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 0.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 10.0, 0.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 10.0, 0.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 10.0, 0.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 10.0, 0.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1L), 100L, 1 };
        double[] doubleArray15 = new double[] { (-1L), 100L, 1 };
        double[] doubleArray19 = new double[] { (-1L), 100L, 1 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) -1 };
        double[] doubleArray11 = new double[] { (short) -1 };
        double[] doubleArray13 = new double[] { (short) -1 };
        double[] doubleArray15 = new double[] { (short) -1 };
        double[] doubleArray17 = new double[] { (short) -1 };
        double[] doubleArray19 = new double[] { (short) -1 };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { '4', ' ', (-1L) };
        double[] doubleArray14 = new double[] { '4', (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray11, doubleArray14, 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, -1.0]");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, (-1L), (short) 10, (byte) 10 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray13, (int) (byte) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100L, 1, 100.0d, 'a' };
        double[] doubleArray19 = new double[] { (short) 1, '#', (short) 10, '#', (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 35.0, 10.0, 35.0, 10.0, 97.0]");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 0, (double) 100, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 1.0d, (double) 'a', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 0, (double) 'a', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) -1 };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100.0f };
        double[] doubleArray15 = new double[] { 1.0d, (short) 1, 10.0f, 0.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10, (double) (-1), (double) 10.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) 100, 100.0f, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray12, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 52.0]");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1), (double) 100.0f, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 0, 1.0f, '4', 10, 1L, 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, 52.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 0, (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 10, (short) 1 };
        double[] doubleArray13 = new double[] { (byte) 10, (short) 1 };
        double[] doubleArray16 = new double[] { (byte) 10, (short) 1 };
        double[] doubleArray19 = new double[] { (byte) 10, (short) 1 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray20, (int) (short) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 0, (double) 0, (double) ' ');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (short) -1, (double) '#', (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) -1, 'a' };
        double[] doubleArray15 = new double[] { (byte) -1, '#', 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray10, doubleArray15, 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 35.0, 100.0, 10.0]");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) 10L, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) -1, 100.0f, 0, 100, (short) 1, (short) 100 };
        double[] doubleArray18 = new double[] { 'a', 1.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 0.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[97.0, 1.0, 1.0]");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 10.0d, (double) ' ', 1.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { '4', '4', (byte) 10 };
        double[] doubleArray15 = new double[] { 0.0d, (short) 1, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0, 1.0]");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1, (byte) 0, '#', (short) -1 };
        double[] doubleArray19 = new double[] { 10.0f, (-1.0d), 0.0d, 10L, ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray12, doubleArray19, (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 0.0, 10.0, 32.0, 10.0]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, 0.0d, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) 0L, (double) '#');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, 0.0d, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 'a', (short) 100, 10.0d, 0L, (-1L), (short) 0 };
        double[] doubleArray21 = new double[] { 'a', (short) 100, 10.0d, 0L, (-1L), (short) 0 };
        double[] doubleArray28 = new double[] { 'a', (short) 100, 10.0d, 0L, (-1L), (short) 0 };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 100.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, (byte) 1, '#', 1L, '#' };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 35.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100 };
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 'a' };
        double[] doubleArray11 = new double[] { 'a' };
        double[] doubleArray13 = new double[] { 'a' };
        double[] doubleArray15 = new double[] { 'a' };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, (int) (short) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 1 };
        double[] doubleArray13 = new double[] { 'a', 100.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray9, doubleArray13, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 1.0]");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0.0f, (double) (byte) 0, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (-1.0d), 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray8, doubleArray11, (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0]");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0f };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1L), (short) -1, (byte) 10, (-1.0d), (short) -1, (short) -1 };
        double[] doubleArray21 = new double[] { (-1L), (short) -1, (byte) 10, (-1.0d), (short) -1, (short) -1 };
        double[] doubleArray28 = new double[] { (-1L), (short) -1, (byte) 10, (-1.0d), (short) -1, (short) -1 };
        double[] doubleArray35 = new double[] { (-1L), (short) -1, (byte) 10, (-1.0d), (short) -1, (short) -1 };
        double[] doubleArray42 = new double[] { (-1L), (short) -1, (byte) 10, (-1.0d), (short) -1, (short) -1 };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray43, (int) (short) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 1, (double) 0.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 0, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 100.0f, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray11, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0]");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 1, (double) 100, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 0.0f, (-1.0d), (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, ' ', (-1L), (byte) -1, 100.0f };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 32.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0L, (byte) 1, 100.0d, (byte) 1, 10.0f };
        double[] doubleArray19 = new double[] { 0L, (byte) 1, 100.0d, (byte) 1, 10.0f };
        double[] doubleArray25 = new double[] { 0L, (byte) 1, 100.0d, (byte) 1, 10.0f };
        double[] doubleArray31 = new double[] { 0L, (byte) 1, 100.0d, (byte) 1, 10.0f };
        double[] doubleArray37 = new double[] { 0L, (byte) 1, 100.0d, (byte) 1, 10.0f };
        double[] doubleArray43 = new double[] { 0L, (byte) 1, 100.0d, (byte) 1, 10.0f };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray44, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 0, (double) 'a', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 35.0]");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1.0f, (double) '#', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, (int) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0d, (-1.0f) };
        double[] doubleArray13 = new double[] { 0.0d, (-1.0f) };
        double[] doubleArray16 = new double[] { 0.0d, (-1.0f) };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray17, (int) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 1.0d, (double) 'a', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 10.0d, (-1.0d), (-1.0d), 0.0d };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray13, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (short) -1, (double) '#', (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1.0f), 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1, 100.0f };
        double[] doubleArray13 = new double[] { 1, 100.0f };
        double[] doubleArray16 = new double[] { 1, 100.0f };
        double[] doubleArray19 = new double[] { 1, 100.0f };
        double[] doubleArray22 = new double[] { 1, 100.0f };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 0, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 0.0d, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 0, (double) 100, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, 1.0d, (byte) 0, (short) 0, '#', (-1) };
        double[] doubleArray17 = new double[] { '4', 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 0.0, 0.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 1.0]");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1.0f, (double) '#', (double) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 1.0f, 10.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, 10, '4' };
        double[] doubleArray15 = new double[] { (short) -1, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray11, doubleArray15, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0]");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { (short) -1, '4', 1, ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 52.0, 1.0, 32.0, 100.0]");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 0.0d, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1L, 10, ' ', 100.0d, (-1L) };
        double[] doubleArray19 = new double[] { 1L, 10, ' ', 100.0d, (-1L) };
        double[] doubleArray25 = new double[] { 1L, 10, ' ', 100.0d, (-1L) };
        double[] doubleArray31 = new double[] { 1L, 10, ' ', 100.0d, (-1L) };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, 0L, 10.0f, (byte) 0, 1L, 10L };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 10.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, 100.0d, (double) (-1.0f), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 0, 100.0f };
        double[] doubleArray16 = new double[] { 1.0f, (byte) -1, '4', 10L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray10, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0, 52.0, 10.0, -1.0]");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10.0f, (double) ' ', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray14, (int) '#', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100, 0.0d, (byte) 100 };
        double[] doubleArray15 = new double[] { 100, 0.0d, (byte) 100 };
        double[] doubleArray19 = new double[] { 100, 0.0d, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 100, (double) (-1L), (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0d), 100L, (byte) 1, 1.0f, 'a', ' ' };
        double[] doubleArray16 = new double[] { (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray14, doubleArray16, (int) (byte) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 1.0, 1.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10, (short) 1 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 10, (short) 100, (byte) 1, (byte) 100 };
        double[] doubleArray18 = new double[] { (byte) 10, 100, 10.0d, 'a', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 100.0, 10.0, 97.0, 97.0]");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0.0f, (double) (byte) 0, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) 10, 1.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray9, 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (short) -1, (double) '#', (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10, 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 1, (double) 0.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0f, '#', 10 };
        double[] doubleArray15 = new double[] { 1.0f, '#', 10 };
        double[] doubleArray19 = new double[] { 1.0f, '#', 10 };
        double[] doubleArray23 = new double[] { 1.0f, '#', 10 };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 0, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 100, (byte) 10, (short) 0, 'a', (byte) 1 };
        double[] doubleArray19 = new double[] { (short) 100, (byte) 10, (short) 0, 'a', (byte) 1 };
        double[] doubleArray25 = new double[] { (short) 100, (byte) 10, (short) 0, 'a', (byte) 1 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 0.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 0.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 10.0, 0.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', 100.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10, (double) (-1), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1 };
        double[] doubleArray16 = new double[] { (byte) -1, 10.0d, (-1.0f), 100.0d, (short) 0, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray9, doubleArray16, (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) ' ', (double) 0L, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray10, (int) (byte) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100.0f, 100L, ' ', (short) -1, (-1) };
        double[] doubleArray18 = new double[] { (short) -1, (short) 0, 100.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 32.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 100.0, 100.0]");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 1, 100L };
        double[] doubleArray13 = new double[] { (byte) 1, 100L };
        double[] doubleArray16 = new double[] { (byte) 1, 100L };
        double[] doubleArray19 = new double[] { (byte) 1, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, (int) '4', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1.0f), 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, (int) 'a', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0L, (byte) 1, 0, (byte) 10, (byte) 1, 'a' };
        double[] doubleArray17 = new double[] { (byte) 1, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray14, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, 0.0, 10.0, 1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { (short) 0, 0, (-1.0f), 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray8, doubleArray14, (int) (byte) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, -1.0, 0.0, 1.0]");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[] doubleArray11 = new double[] { (-1.0f) };
        double[] doubleArray13 = new double[] { (-1.0f) };
        double[] doubleArray15 = new double[] { (-1.0f) };
        double[] doubleArray17 = new double[] { (-1.0f) };
        double[] doubleArray19 = new double[] { (-1.0f) };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 10L, 0, (byte) 100, 10L, 100, (short) 10 };
        double[] doubleArray17 = new double[] { 1.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14, doubleArray17, (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0]");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 0, (double) '4', (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, (int) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0f, 1L, 100 };
        double[] doubleArray15 = new double[] { 0.0f, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0, -1.0]");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100, '4', (byte) 100, 0.0f, 'a', 10.0d };
        double[] doubleArray16 = new double[] { 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray14, doubleArray16, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 52.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0]");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 'a', (double) 10L, (double) 10L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[] doubleArray11 = new double[] { (-1.0f) };
        double[] doubleArray13 = new double[] { (-1.0f) };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14, (int) (byte) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 10.0d, (double) ' ', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] { '4', (byte) 10 };
        double[] doubleArray16 = new double[] { '4', (byte) 10 };
        double[] doubleArray19 = new double[] { '4', (byte) 10 };
        double[] doubleArray22 = new double[] { '4', (byte) 10 };
        double[] doubleArray25 = new double[] { '4', (byte) 10 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray26, 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 1, (byte) 0, 10, (-1), ' ', 0 };
        double[] doubleArray21 = new double[] { (short) 1, (byte) 0, 10, (-1), ' ', 0 };
        double[] doubleArray28 = new double[] { (short) 1, (byte) 0, 10, (-1), ' ', 0 };
        double[] doubleArray35 = new double[] { (short) 1, (byte) 0, 10, (-1), ' ', 0 };
        double[] doubleArray42 = new double[] { (short) 1, (byte) 0, 10, (-1), ' ', 0 };
        double[] doubleArray49 = new double[] { (short) 1, (byte) 0, 10, (-1), ' ', 0 };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray50, (int) (byte) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0, 10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0, 10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 0.0, 10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 0.0, 10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 0.0, 10.0, -1.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 'a', (double) 10L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1.0f, (byte) 100, (short) 0, 100.0f, 100.0d };
        double[] doubleArray19 = new double[] { 1.0f, (byte) 100, (short) 0, 100.0f, 100.0d };
        double[] doubleArray25 = new double[] { 1.0f, (byte) 100, (short) 0, 100.0f, 100.0d };
        double[] doubleArray31 = new double[] { 1.0f, (byte) 100, (short) 0, 100.0f, 100.0d };
        double[] doubleArray37 = new double[] { 1.0f, (byte) 100, (short) 0, 100.0f, 100.0d };
        double[] doubleArray43 = new double[] { 1.0f, (byte) 100, (short) 0, 100.0f, 100.0d };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray44, 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1L, 10L };
        double[] doubleArray14 = new double[] { '4', 10.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray10, doubleArray14, 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 10.0, 1.0]");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1.0f, (double) '#', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 1, 10.0d };
        double[] doubleArray13 = new double[] { (short) -1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray10, doubleArray13, (int) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 'a', (-1L), 100L, 'a', (byte) -1 };
        double[] doubleArray18 = new double[] { 0.0d, '#', 1, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray13, doubleArray18, (int) (byte) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, -1.0, 100.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 35.0, 1.0, 0.0]");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '#', 100L, 1L, 10.0d, 100.0d, (-1.0d) };
        double[] doubleArray21 = new double[] { '#', 100L, 1L, 10.0d, 100.0d, (-1.0d) };
        double[] doubleArray28 = new double[] { '#', 100L, 1L, 10.0d, 100.0d, (-1.0d) };
        double[] doubleArray35 = new double[] { '#', 100L, 1L, 10.0d, 100.0d, (-1.0d) };
        double[] doubleArray42 = new double[] { '#', 100L, 1L, 10.0d, 100.0d, (-1.0d) };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[35.0, 100.0, 1.0, 10.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray11, (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100L, 10.0d, 1.0d, 'a', ' ', (-1.0f) };
        double[] doubleArray18 = new double[] { '4', (-1L), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray14, doubleArray18, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 1.0, 97.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, -1.0, -1.0]");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 0L, (double) 0.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100L, 10.0d };
        double[] doubleArray13 = new double[] { 100L, 10.0d };
        double[] doubleArray16 = new double[] { 100L, 10.0d };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray8, doubleArray10, (int) '#', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0]");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10L, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (byte) 100, (double) (-1L), (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[][] doubleArray13 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) 100L, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { '4', (-1.0d), 100.0f, 0, (-1L) };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, -1.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (-1.0d), (double) 100L, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) -1, (byte) -1 };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray10, doubleArray11, 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0.0f, (double) (byte) 0, (double) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, 0L, (-1.0d), (-1.0d) };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray13, (int) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) (-1L), (double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, doubleArray10, 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0]");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), '4', '#' };
        double[] doubleArray15 = new double[] { (-1.0f), '4', '#' };
        double[] doubleArray19 = new double[] { (-1.0f), '4', '#' };
        double[] doubleArray23 = new double[] { (-1.0f), '4', '#' };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100.0f, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) -1, 0.0f, (-1.0f) };
        double[] doubleArray16 = new double[] { 'a', (short) -1, 0L, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, -1.0, 0.0, 100.0]");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 1, 1, 0L, 10.0d, 0, (byte) -1 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray14, doubleArray15, (int) '#', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100L };
        double[] doubleArray11 = new double[] { 100L };
        double[] doubleArray13 = new double[] { 100L };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1), 1.0d, 0.0f };
        double[] doubleArray15 = new double[] { (-1), 1.0d, 0.0f };
        double[] doubleArray19 = new double[] { (-1), 1.0d, 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0f, 100.0d };
        double[] doubleArray13 = new double[] { 10.0f, 100.0d };
        double[] doubleArray16 = new double[] { 10.0f, 100.0d };
        double[] doubleArray19 = new double[] { 10.0f, 100.0d };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10.0f, 1.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1L };
        double[] doubleArray11 = new double[] { 1L };
        double[] doubleArray13 = new double[] { 1L };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) ' ', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 100 };
        double[] doubleArray16 = new double[] { '#', 0L, 1.0f, 0.0f, 1.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray9, doubleArray16, (int) (byte) -1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 0.0, 1.0, 0.0, 1.0, -1.0]");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1, (byte) 100, (byte) 0, 'a', (short) 10 };
        double[] doubleArray20 = new double[] { (byte) 10, (byte) -1, 10.0d, 100, (-1.0d), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray13, doubleArray20, 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 10.0, 100.0, -1.0, -1.0]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 100.0d, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 10, 1.0d, 10L };
        double[] doubleArray15 = new double[] { (byte) 10, 1.0d, 10L };
        double[] doubleArray19 = new double[] { (byte) 10, 1.0d, 10L };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray20, (int) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 10, (double) 1.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray8, (int) (short) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1.0f, (double) '#', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0L };
        double[] doubleArray11 = new double[] { 0L };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray12, (int) (short) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, 10.0d, (double) 1.0f, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 0.0d, (double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 1, 0, 0.0f, 0.0d, 10.0f };
        double[] doubleArray20 = new double[] { (byte) 100, 10, 100.0d, 100, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13, doubleArray20, (int) (byte) 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, 0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 10.0, 100.0, 100.0, 97.0, 1.0]");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0L, 1.0f, 1.0d };
        double[] doubleArray15 = new double[] { 0L, 1.0f, 1.0d };
        double[] doubleArray19 = new double[] { 0L, 1.0f, 1.0d };
        double[] doubleArray23 = new double[] { 0L, 1.0f, 1.0d };
        double[] doubleArray27 = new double[] { 0L, 1.0f, 1.0d };
        double[] doubleArray31 = new double[] { 0L, 1.0f, 1.0d };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, 10.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0, (-1.0d), (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) 10L, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0d), '4' };
        double[] doubleArray13 = new double[] { (-1.0d), '4' };
        double[] doubleArray16 = new double[] { (-1.0d), '4' };
        double[] doubleArray19 = new double[] { (-1.0d), '4' };
        double[] doubleArray22 = new double[] { (-1.0d), '4' };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10.0f, 1.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 1, (byte) 1, (byte) 1, 0.0d, 'a' };
        double[] doubleArray19 = new double[] { (short) 1, (byte) 1, (byte) 1, 0.0d, 'a' };
        double[] doubleArray25 = new double[] { (short) 1, (byte) 1, (byte) 1, 0.0d, 'a' };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 1.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 1.0f, 10.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 100, 1 };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 1, (double) (short) 1, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, (-1), (-1.0d), (short) 0, 0L };
        double[] doubleArray15 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray13, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) ' ', (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 'a', (byte) 0 };
        double[] doubleArray12 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0]");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 1, (double) (short) 0, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 'a', (double) 10L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100 };
        double[] doubleArray11 = new double[] { 100 };
        double[] doubleArray13 = new double[] { 100 };
        double[] doubleArray15 = new double[] { 100 };
        double[] doubleArray17 = new double[] { 100 };
        double[] doubleArray19 = new double[] { 100 };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, (int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 0, (-1), (-1.0d), (-1L), 1 };
        double[] doubleArray19 = new double[] { (short) 0, (-1), (-1.0d), (-1L), 1 };
        double[] doubleArray25 = new double[] { (short) 0, (-1), (-1.0d), (-1L), 1 };
        double[] doubleArray31 = new double[] { (short) 0, (-1), (-1.0d), (-1L), 1 };
        double[] doubleArray37 = new double[] { (short) 0, (-1), (-1.0d), (-1L), 1 };
        double[][] doubleArray38 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray38, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, -1.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 'a', (byte) -1 };
        double[] doubleArray13 = new double[] { 'a', (byte) -1 };
        double[] doubleArray16 = new double[] { 'a', (byte) -1 };
        double[] doubleArray19 = new double[] { 'a', (byte) -1 };
        double[] doubleArray22 = new double[] { 'a', (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10, 10.0f, 100L };
        double[] doubleArray13 = new double[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray11, doubleArray13, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) 10L, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0d, 1L, 0.0f };
        double[] doubleArray15 = new double[] { 100.0d, 1L, 0.0f };
        double[] doubleArray19 = new double[] { 100.0d, 1L, 0.0f };
        double[] doubleArray23 = new double[] { 100.0d, 1L, 0.0f };
        double[] doubleArray27 = new double[] { 100.0d, 1L, 0.0f };
        double[][] doubleArray28 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray28, (int) '4', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) 1, (double) 100.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { '#' };
        double[] doubleArray11 = new double[] { '#' };
        double[] doubleArray13 = new double[] { '#' };
        double[] doubleArray15 = new double[] { '#' };
        double[] doubleArray17 = new double[] { '#' };
        double[] doubleArray19 = new double[] { '#' };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, (int) (short) -1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (byte) 1, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, (int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { (short) 100, (short) 1, (short) -1, (byte) 100, 1.0f, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray15, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 1.0, -1.0, 100.0, 1.0, 10.0]");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, (int) ' ', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { ' ', (-1), 100.0d, (-1.0d), (-1L), (byte) 0 };
        double[] doubleArray20 = new double[] { 0, (-1.0f), (byte) 1, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, doubleArray20, 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, -1.0, 100.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0, 1.0, 1.0, 35.0]");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 10, (double) 1.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10L, 1.0d, 1L };
        double[] doubleArray15 = new double[] { 1L, 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray11, doubleArray15, (int) (short) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 0.0]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 100, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100.0f, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100, (short) 100, ' ' };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray11, doubleArray12, (int) '#', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', 100.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 0, (byte) 10, 10.0f };
        double[] doubleArray15 = new double[] { (byte) 0, (byte) 10, 10.0f };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100, (double) (-1.0f), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, (int) (short) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1.0d };
        double[] doubleArray14 = new double[] { (byte) 1, '#', (-1L), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray9, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 35.0, -1.0, 0.0]");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { (byte) 0, '#', ' ', '#', 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray14, (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 35.0, 32.0, 35.0, 1.0]");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, 1.0f };
        double[] doubleArray13 = new double[] { (short) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray10, doubleArray13, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0]");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (-1.0d), 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1, 100.0d, 0.0f, 10.0d, ' ' };
        double[] doubleArray19 = new double[] { 1, 100.0d, 0.0f, 10.0d, ' ' };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray20, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 0.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 0.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '#', 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 1.0d, (double) 'a', (double) (byte) 0);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 0, (double) (byte) 1, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0d, 1.0f };
        double[] doubleArray13 = new double[] { 1.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray10, doubleArray13, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 1, (double) 100, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1L, 100L, (short) 100, 100.0d, 100L, 1.0d };
        double[] doubleArray21 = new double[] { 1L, 100L, (short) 100, 100.0d, 100L, 1.0d };
        double[] doubleArray28 = new double[] { 1L, 100L, (short) 100, 100.0d, 100L, 1.0d };
        double[] doubleArray35 = new double[] { 1L, 100L, (short) 100, 100.0d, 100L, 1.0d };
        double[] doubleArray42 = new double[] { 1L, 100L, (short) 100, 100.0d, 100L, 1.0d };
        double[] doubleArray49 = new double[] { 1L, 100L, (short) 100, 100.0d, 100L, 1.0d };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray50, (int) '4', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 100.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 100.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, 100.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, 100.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 100.0, 100.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 100.0, 100.0, 100.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100.0f, (byte) 100, (-1), (short) -1, 1L, (byte) 0 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14, doubleArray15, (int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, -1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', 100.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { '4' };
        double[] doubleArray15 = new double[] { (short) 0, 100L, 'a', 10.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 97.0, 10.0, -1.0]");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0, 100, 1, 1, 100.0f, (byte) 0 };
        double[] doubleArray20 = new double[] { 0L, (short) -1, (-1.0d), 1.0d, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 1.0, 1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, (double) 10L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100.0d, 100L, (-1.0d), (-1.0d), 0.0d, 100.0d };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, -1.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 'a', 10.0f, 0.0f, 0.0d };
        double[] doubleArray17 = new double[] { 'a', 10.0f, 0.0f, 0.0d };
        double[] doubleArray22 = new double[] { 'a', 10.0f, 0.0f, 0.0d };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1.0f };
        double[] doubleArray14 = new double[] { (byte) 100, (-1.0f), 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray9, doubleArray14, 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0, 1.0, 0.0]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, 10.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10L, (double) 10L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '#', (short) 100 };
        double[] doubleArray13 = new double[] { 10L, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray10, doubleArray13, (int) (short) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, (double) 10L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100.0d, (short) 1, (short) 10, 100.0f };
        double[] doubleArray17 = new double[] { 100.0d, (short) 1, (short) 10, 100.0f };
        double[] doubleArray22 = new double[] { 100.0d, (short) 1, (short) 10, 100.0f };
        double[] doubleArray27 = new double[] { 100.0d, (short) 1, (short) 10, 100.0f };
        double[] doubleArray32 = new double[] { 100.0d, (short) 1, (short) 10, 100.0f };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair36 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray33, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0, (byte) -1, 'a' };
        double[] doubleArray15 = new double[] { 0, (byte) -1, 'a' };
        double[] doubleArray19 = new double[] { 0, (byte) -1, 'a' };
        double[] doubleArray23 = new double[] { 0, (byte) -1, 'a' };
        double[] doubleArray27 = new double[] { 0, (byte) -1, 'a' };
        double[][] doubleArray28 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray28, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, 10.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, 1.0f };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray10, doubleArray11, (int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), 0.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) '4', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { (short) 10, (byte) 0, (byte) 10, 10L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray14, (int) (short) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 10.0, 10.0, 1.0]");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, 1L };
        double[] doubleArray14 = new double[] { (-1), (-1.0d), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray10, doubleArray14, (int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 0.0]");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100.0f, (byte) 10, 100L, 0.0d };
        double[] doubleArray19 = new double[] { (-1), 100.0f, 0.0f, (short) -1, (-1.0f), 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray12, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 0.0, -1.0, -1.0, 100.0]");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 10, (double) 1.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0L, 0.0d };
        double[] doubleArray15 = new double[] { (short) 10, 1, 100L, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray10, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 100.0, 100.0]");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) ' ', (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), (byte) -1, (short) -1 };
        double[] doubleArray13 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0]");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, 0, 100.0d, (short) 10, 'a' };
        double[] doubleArray19 = new double[] { (short) 10, 0, 100.0d, (short) 10, 'a' };
        double[] doubleArray25 = new double[] { (short) 10, 0, 100.0d, (short) 10, 'a' };
        double[] doubleArray31 = new double[] { (short) 10, 0, 100.0d, (short) 10, 'a' };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 100, (double) (-1L), (double) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, 100.0f, 1, 0 };
        double[] doubleArray15 = new double[] { 100.0f, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0]");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 'a', '4' };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray11, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100, (double) (-1.0f), (double) (short) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) ' ', (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0d), 10.0d, 0 };
        double[] doubleArray17 = new double[] { 100, (-1.0f), 10.0d, 0L, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray11, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 10.0, 0.0, 1.0]");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 0, (short) -1, 'a', 0, (short) -1 };
        double[] doubleArray16 = new double[] { 100L, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray13, doubleArray16, (int) '4', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, 97.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0]");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0.0d, (-1.0d), 1, '4', ' ', (short) 0 };
        double[] doubleArray17 = new double[] { ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14, doubleArray17, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, 1.0, 52.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 0.0]");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100L, (byte) -1, (short) -1 };
        double[] doubleArray15 = new double[] { 100L, (byte) -1, (short) -1 };
        double[] doubleArray19 = new double[] { 100L, (byte) -1, (short) -1 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 'a', (double) 10L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100.0d, '#', ' ', (short) 100, 1.0f };
        double[] doubleArray19 = new double[] { 0, 0.0d, 10.0f, 'a', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray13, doubleArray19, 1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 35.0, 32.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, 10.0, 97.0, 10.0]");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (short) -1, 0.0d, (double) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 0.0f, (-1.0d), (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0 };
        double[] doubleArray11 = new double[] { 0 };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) ' ', (double) 0L, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, 100L, '#' };
        double[] doubleArray15 = new double[] { 10.0f, 100L, '#' };
        double[] doubleArray19 = new double[] { 10.0f, 100L, '#' };
        double[] doubleArray23 = new double[] { 10.0f, 100L, '#' };
        double[] doubleArray27 = new double[] { 10.0f, 100L, '#' };
        double[] doubleArray31 = new double[] { 10.0f, 100L, '#' };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 1, (double) (short) 0, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1, (short) 10, 0.0f };
        double[] doubleArray15 = new double[] { '#', 1L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray11, doubleArray15, 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 1.0, 100.0]");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 100, '#' };
        double[] doubleArray12 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray10, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0]");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1.0f, (double) '#', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100L };
        double[] doubleArray11 = new double[] { 100L };
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray15 = new double[] { 100L };
        double[] doubleArray17 = new double[] { 100L };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray18, 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (short) 10, (double) (byte) 10, (double) 10.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) '4', (double) (short) -1, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) -1, 0.0f, (short) 0, 1, (short) 10, 0 };
        double[] doubleArray21 = new double[] { (short) -1, 0.0f, (short) 0, 1, (short) 10, 0 };
        double[] doubleArray28 = new double[] { (short) -1, 0.0f, (short) 0, 1, (short) 10, 0 };
        double[] doubleArray35 = new double[] { (short) -1, 0.0f, (short) 0, 1, (short) 10, 0 };
        double[] doubleArray42 = new double[] { (short) -1, 0.0f, (short) 0, 1, (short) 10, 0 };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray43, (int) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) (-1.0f), (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, '#', 10.0d, (short) 1 };
        double[] doubleArray17 = new double[] { (byte) 100, '#', 10.0d, (short) 1 };
        double[] doubleArray22 = new double[] { (byte) 100, '#', 10.0d, (short) 1 };
        double[] doubleArray27 = new double[] { (byte) 100, '#', 10.0d, (short) 1 };
        double[] doubleArray32 = new double[] { (byte) 100, '#', 10.0d, (short) 1 };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 35.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 35.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 35.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 35.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 35.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1.0f), 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 100, 1.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100.0f, 100.0f, (byte) 10, (short) -1 };
        double[] doubleArray17 = new double[] { 100.0f, 100.0f, (byte) 10, (short) -1 };
        double[] doubleArray22 = new double[] { 100.0f, 100.0f, (byte) 10, (short) -1 };
        double[] doubleArray27 = new double[] { 100.0f, 100.0f, (byte) 10, (short) -1 };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray28, 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (-1.0d), 1.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0d), '4', (short) 1, (short) 1, 1.0d, (byte) 1 };
        double[] doubleArray17 = new double[] { (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray14, doubleArray17, (int) (byte) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 52.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0]");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0, (-1.0d), (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0 };
        double[] doubleArray11 = new double[] { 0 };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray12, (int) 'a', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 1 };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray10, (int) ' ', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), (double) 0, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 100, 1.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0L, 0L };
        double[] doubleArray13 = new double[] { 0L, 0L };
        double[] doubleArray16 = new double[] { 0L, 0L };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray17, (int) (byte) 1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 10, 100, 1.0f };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) -1, (double) (byte) 100, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray8, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 100.0d, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, 10.0f, 1, (-1.0f), (byte) 1 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray14, (int) (byte) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 10, (-1.0d), (double) (short) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 1, 0L, (byte) 0 };
        double[] doubleArray17 = new double[] { 10, 10L, 10.0f, (byte) -1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, doubleArray17, (int) (short) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 100.0d, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100.0f, (-1.0d), 1.0f, '#' };
        double[] doubleArray15 = new double[] { '4', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray12, doubleArray15, (int) (byte) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 100.0]");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 0 };
        double[] doubleArray12 = new double[] { 10.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0]");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) -1, (double) (byte) 100, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair5 = nelderMead0.minimize(costFunction1, (int) '#', convergenceChecker3, randomVectorGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) -1, ' ' };
        double[] doubleArray15 = new double[] { (-1L), 10, 10L, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10, doubleArray15, (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, 10.0, 10.0]");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 10, (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray13 = new double[] { '#', (short) 100, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray9, doubleArray13, (int) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 10.0]");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[][] doubleArray13 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 0, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0f };
        double[] doubleArray11 = new double[] { 10.0f };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0f), 1.0d };
        double[] doubleArray17 = new double[] { (short) -1, 0.0d, 1.0f, '#', (byte) 100, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray10, doubleArray17, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 1.0, 35.0, 100.0, 100.0]");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 0, (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 'a', (double) 100.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, 100L, 10.0d, (byte) 100 };
        double[] doubleArray17 = new double[] { 0.0f, (-1.0d), 100, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 100.0, 0.0]");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0f), 10L };
        double[] doubleArray13 = new double[] { (-1.0f), 10L };
        double[] doubleArray16 = new double[] { (-1.0f), 10L };
        double[] doubleArray19 = new double[] { (-1.0f), 10L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray4, doubleArray5, doubleArray6 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair8 = nelderMead0.minimize(costFunction1, (int) (byte) 1, convergenceChecker3, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 0, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray9, doubleArray10, (int) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 1.0d, (double) (short) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1 };
        double[] doubleArray11 = new double[] { 1 };
        double[] doubleArray13 = new double[] { 1 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray14, 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, 10.0d, (double) (short) 100, (double) '#');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (byte) 100, (double) (-1L), (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { '#', '#', '#', '4' };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 35.0, 35.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (short) -1, 0.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10 };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { '#', (byte) 10, (-1L), '4' };
        double[] doubleArray17 = new double[] { '#', (byte) 10, (-1L), '4' };
        double[] doubleArray22 = new double[] { '#', (byte) 10, (-1L), '4' };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 10.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 1, 10.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, (-1), 0.0d, 0 };
        double[] doubleArray17 = new double[] { (byte) 1, (-1), 0.0d, 0 };
        double[][] doubleArray18 = new double[][] { doubleArray12, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray18, (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100.0f, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100, 100.0f, '#', (short) 100 };
        double[] doubleArray17 = new double[] { (-1.0d), (byte) 1, 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray12, doubleArray17, (int) (byte) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 10.0, -1.0]");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 10, (double) 1.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 0, 0L };
        double[] doubleArray13 = new double[] { (byte) 0, 0L };
        double[] doubleArray16 = new double[] { (byte) 0, 0L };
        double[] doubleArray19 = new double[] { (byte) 0, 0L };
        double[] doubleArray22 = new double[] { (byte) 0, 0L };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 10, 10.0d, (byte) 100, (-1.0f), 100.0d };
        double[] doubleArray19 = new double[] { (byte) 10, 10.0d, (byte) 100, (-1.0f), 100.0d };
        double[] doubleArray25 = new double[] { (byte) 10, 10.0d, (byte) 100, (-1.0f), 100.0d };
        double[] doubleArray31 = new double[] { (byte) 10, 10.0d, (byte) 100, (-1.0f), 100.0d };
        double[] doubleArray37 = new double[] { (byte) 10, 10.0d, (byte) 100, (-1.0f), 100.0d };
        double[] doubleArray43 = new double[] { (byte) 10, 10.0d, (byte) 100, (-1.0f), 100.0d };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray44, (int) (byte) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 10.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 10.0d, (-1.0f), (byte) -1, (byte) 1 };
        double[] doubleArray18 = new double[] { 0.0f, (byte) 10, 100.0f, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, -1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 10.0, 100.0, 100.0, 0.0]");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10.0f, 1.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 0, 0L, (-1.0d), ' ' };
        double[] doubleArray14 = new double[] { 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12, doubleArray14, (int) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0]");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, (double) 10L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) (-1.0f), (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) 1, (double) 100.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100, (double) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, 0.0d, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) 100L, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 100, (byte) 1, (-1L) };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) ' ', 0.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 0, 1.0d };
        double[] doubleArray16 = new double[] { 1, 100L, (byte) 100, 100.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray10, doubleArray16, (int) (byte) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 100.0, 100.0, 1.0]");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, (short) -1, (short) 100, (-1), 1 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray14, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, 100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1L, 0L, 0L, (-1L), '4' };
        double[] doubleArray19 = new double[] { (byte) 0, 10.0d, 10L, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, 0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 10.0, 32.0, 1.0]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 0, 'a', 10 };
        double[] doubleArray15 = new double[] { (short) 1, (short) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 1.0]");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) -1, (double) (byte) 100, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), (byte) 1, (short) 1 };
        double[] doubleArray15 = new double[] { (-1.0f), (byte) 1, (short) 1 };
        double[] doubleArray19 = new double[] { (-1.0f), (byte) 1, (short) 1 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray20, (int) 'a', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 0.0d, (double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 0, (double) '4', (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) '4', (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray12 = new double[] { 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, -1.0]");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (-1), (byte) 100, (byte) 10, 1 };
        double[] doubleArray17 = new double[] { (-1), (byte) 100, (byte) 10, 1 };
        double[] doubleArray22 = new double[] { (-1), (byte) 100, (byte) 10, 1 };
        double[] doubleArray27 = new double[] { (-1), (byte) 100, (byte) 10, 1 };
        double[] doubleArray32 = new double[] { (-1), (byte) 100, (byte) 10, 1 };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair36 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray33, (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (-1.0f), (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 'a', (short) 10, (byte) 10, (byte) 10 };
        double[] doubleArray17 = new double[] { 'a', 1.0d, 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 1.0, 100.0, -1.0]");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, (byte) 1, (byte) 0, 0L, 1L };
        double[] doubleArray19 = new double[] { (short) 10, (byte) 1, (byte) 0, 0L, 1L };
        double[] doubleArray25 = new double[] { (short) 10, (byte) 1, (byte) 0, 0L, 1L };
        double[] doubleArray31 = new double[] { (short) 10, (byte) 1, (byte) 0, 0L, 1L };
        double[] doubleArray37 = new double[] { (short) 10, (byte) 1, (byte) 0, 0L, 1L };
        double[] doubleArray43 = new double[] { (short) 10, (byte) 1, (byte) 0, 0L, 1L };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray44, (-1), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 1.0f, 10.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray8, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1L, 1L, 1L, (-1.0f), (short) 10, 10.0f };
        double[] doubleArray20 = new double[] { (-1L), 10, 0.0d, 0.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray14, doubleArray20, (int) (byte) 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 10.0, 0.0, 0.0, -1.0]");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10L, ' ', 1.0f };
        double[] doubleArray15 = new double[] { (-1.0f), (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray11, doubleArray15, (int) (byte) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 10.0]");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (-1L), (double) 10, (double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 'a', (double) 10L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { 100L, (byte) 10, 100, 'a', (byte) 0, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 100.0, 97.0, 0.0, 100.0]");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) (-1L), (double) ' ');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 1 };
        double[] doubleArray11 = new double[] { (short) 1 };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray12, (int) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (byte) 1, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) 1, (double) 100.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 10, (-1), 1.0f };
        double[] doubleArray15 = new double[] { 100L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0]");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (-1.0d), 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, 0L, (short) 100, (-1) };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 100.0, -1.0]");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { '#', 100, (byte) 1 };
        double[] doubleArray15 = new double[] { '#', 100, (byte) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray16, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1.0d };
        double[] doubleArray13 = new double[] { 0L, 100.0d, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray9, doubleArray13, (int) '#', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 100.0]");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, 100.0d, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 0 };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 0, (double) 'a', (double) (-1));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0.0d, ' ', (byte) 100 };
        double[] doubleArray15 = new double[] { 0.0d, ' ', (byte) 100 };
        double[] doubleArray19 = new double[] { 0.0d, ' ', (byte) 100 };
        double[] doubleArray23 = new double[] { 0.0d, ' ', (byte) 100 };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray24, (int) 'a', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 0L, (double) 0.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray11 = new double[] { (short) -1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0]");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 1.0f, (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, '4', 0.0d };
        double[] doubleArray15 = new double[] { 10.0f, '4', 0.0d };
        double[] doubleArray19 = new double[] { 10.0f, '4', 0.0d };
        double[] doubleArray23 = new double[] { 10.0f, '4', 0.0d };
        double[] doubleArray27 = new double[] { 10.0f, '4', 0.0d };
        double[] doubleArray31 = new double[] { 10.0f, '4', 0.0d };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray32, 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, 100L, 0, (byte) -1, 100.0f };
        double[] doubleArray16 = new double[] { 0L, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray13, doubleArray16, (int) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0]");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (-1), (double) (short) 0, (double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (-1.0d), 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10L, 100 };
        double[] doubleArray13 = new double[] { 10L, 100 };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, (int) (byte) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray16 = new double[] { '4', 10.0d, (byte) 10, (short) 1, 0.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray9, doubleArray16, (int) (short) 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 10.0, 10.0, 1.0, 0.0, -1.0]");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, 10.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) (-1.0f), (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10, 0.0f, 0.0d, '#', (byte) 10 };
        double[] doubleArray18 = new double[] { (byte) 0, (byte) -1, 1.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 0.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { 0, (short) 0, 0.0f, (short) 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 0.0, 10.0, 32.0]");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1L), 10.0f, (short) 0, 0L, ' ', (-1.0f) };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray14, doubleArray15, (int) (byte) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, 0.0, 0.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1), 0, 1L };
        double[] doubleArray13 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray11, doubleArray13, 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0]");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (-1.0d), 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, '#' };
        double[] doubleArray13 = new double[] { 1.0d, '#' };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, (int) (byte) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (-1), (double) (short) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) ' ', (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) (-1), (double) (-1.0f), (double) 10L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 100.0d, (double) (byte) 10, 1.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 'a', (double) 100.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1, 100.0d, (short) 10 };
        double[] doubleArray13 = new double[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (byte) 100, (double) (-1L), (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { 100, 'a', '4', (byte) 100, 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 97.0, 52.0, 100.0, 10.0]");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) -1 };
        double[] doubleArray11 = new double[] { (byte) -1 };
        double[] doubleArray13 = new double[] { (byte) -1 };
        double[] doubleArray15 = new double[] { (byte) -1 };
        double[] doubleArray17 = new double[] { (byte) -1 };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1L, (short) -1, 10.0f, 0.0d };
        double[] doubleArray16 = new double[] { 1, 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 100.0]");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, (double) 10L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0f, ' ', ' ' };
        double[] doubleArray15 = new double[] { 1.0f, ' ', ' ' };
        double[] doubleArray19 = new double[] { 1.0f, ' ', ' ' };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 1.0d, (double) 'a', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) (byte) 0, (double) 10L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) (-1.0f), (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { ' ', 1, (short) -1, (-1L), 0.0d };
        double[] doubleArray19 = new double[] { ' ', 1, (short) -1, (-1L), 0.0d };
        double[] doubleArray25 = new double[] { ' ', 1, (short) -1, (-1L), 0.0d };
        double[] doubleArray31 = new double[] { ' ', 1, (short) -1, (-1L), 0.0d };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 1.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 1.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 1.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 1.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 100L, (double) '#', (double) (-1));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (double) (short) -1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 1, (double) (short) 1, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, 100.0d, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (byte) 10, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0.0d, 10L, (-1), 10L, 10.0f, 1.0f };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0, -1.0, 10.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10, 1.0d, 0.0d };
        double[] doubleArray15 = new double[] { 1L, 1.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, doubleArray15, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, -1.0]");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1, 0L, 100.0f, (-1.0d) };
        double[] doubleArray17 = new double[] { 1, 0L, 100.0f, (-1.0d) };
        double[] doubleArray22 = new double[] { 1, 0L, 100.0f, (-1.0d) };
        double[] doubleArray27 = new double[] { 1, 0L, 100.0f, (-1.0d) };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 0, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0, 10, (byte) 0, 100.0d, (-1L) };
        double[] doubleArray19 = new double[] { 0, 10, (byte) 0, 100.0d, (-1L) };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray20, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100, (double) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) (short) 1, (double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 100.0d, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { 1.0d, 0.0f, 100.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray13, (-1), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, 100.0, 52.0]");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray11 = new double[] { 10L };
        double[] doubleArray13 = new double[] { 10L };
        double[] doubleArray15 = new double[] { 10L };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), (double) 0, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, 100.0d, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, (short) 10, 10.0f, 100.0f, (short) 100 };
        double[] doubleArray18 = new double[] { 10, 1.0d, (short) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 1.0, 0.0, 0.0]");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1), (double) 100.0f, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100L };
        double[] doubleArray11 = new double[] { 100L };
        double[] doubleArray13 = new double[] { 100L };
        double[] doubleArray15 = new double[] { 100L };
        double[] doubleArray17 = new double[] { 100L };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 'a', (short) 1, 0L, '#', (short) 1 };
        double[] doubleArray16 = new double[] { (short) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray13, doubleArray16, (int) '#', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 1.0, 0.0, 35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 52.0]");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 0, 1L, 1, (-1), 1.0d };
        double[] doubleArray17 = new double[] { 'a', 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray13, doubleArray17, (int) (byte) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 10.0, -1.0]");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray14, (int) (byte) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10.0f, (double) 0L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (short) -1, (double) '#', (double) (short) 0);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '4', (double) (byte) 0, (double) (-1));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (-1.0d), (double) 100L, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) -1, 100.0d, 1L };
        double[] doubleArray15 = new double[] { 10, (short) 10, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, -1.0]");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[] doubleArray12 = new double[] {};
        double[] doubleArray13 = new double[] {};
        double[][] doubleArray14 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11, doubleArray12, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14, (int) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 100, 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) -1, (short) 10, 10.0d, (-1.0f) };
        double[] doubleArray17 = new double[] { (short) -1, 1, 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray12, doubleArray17, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 100.0, 1.0]");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 10, 100.0f };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) ' ', 0.0d, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100.0f, (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0d, (-1.0f) };
        double[] doubleArray13 = new double[] { (short) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray10, doubleArray13, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray9, (int) '4', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (-1.0d), (double) 10L, (double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1), (double) 0L, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray8, (int) (short) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 1.0d, (double) 0L, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0f, (-1L) };
        double[] doubleArray13 = new double[] { 1.0f, (-1L) };
        double[] doubleArray16 = new double[] { 1.0f, (-1L) };
        double[] doubleArray19 = new double[] { 1.0f, (-1L) };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 100L, (double) 10L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0d, 0.0f, 100.0f };
        double[] doubleArray13 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, doubleArray13, (int) (short) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0]");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 0, 10L, '4', (byte) -1, 100 };
        double[] doubleArray18 = new double[] { 100.0d, (short) 1, (byte) 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray13, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 52.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 1.0, 100.0, 0.0]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, 1L };
        double[] doubleArray14 = new double[] { 1, 10.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray10, doubleArray14, (int) '#', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 0.0]");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 10, (double) 'a', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 0 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray9, doubleArray10, (int) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1.0f, (double) '#', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray10, (int) (short) 10, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0]");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100.0f, (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1), (short) 0, 100L, (byte) -1, 0L };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13, doubleArray14, (int) (byte) 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (double) (short) -1, (double) 1.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 100, 0.0d, (double) 0L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 1 };
        double[] doubleArray13 = new double[] { 10, 1.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 1.0]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, 0.0d, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 1, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { (-1.0f), ' ', 100.0d, 'a', (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8, doubleArray14, (int) (short) -1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 32.0, 100.0, 97.0, -1.0]");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 10, 1, (-1.0f), 1.0d, 0, 100 };
        double[] doubleArray21 = new double[] { (short) 10, 1, (-1.0f), 1.0d, 0, 100 };
        double[] doubleArray28 = new double[] { (short) 10, 1, (-1.0f), 1.0d, 0, 100 };
        double[] doubleArray35 = new double[] { (short) 10, 1, (-1.0f), 1.0d, 0, 100 };
        double[] doubleArray42 = new double[] { (short) 10, 1, (-1.0f), 1.0d, 0, 100 };
        double[] doubleArray49 = new double[] { (short) 10, 1, (-1.0f), 1.0d, 0, 100 };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10, (double) (-1), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray10, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 100, 100.0d, 0.0d, 0, 10.0f, (short) 1 };
        double[] doubleArray21 = new double[] { (-1.0f), 1L, ' ', (byte) 10, '#', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 0.0, 0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 1.0, 32.0, 10.0, 35.0, -1.0]");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (-1.0d), 1.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1) };
        double[] doubleArray11 = new double[] { (-1) };
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray15 = new double[] { (-1) };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, 10.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, (int) (short) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) 10.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '#', 100L };
        double[] doubleArray13 = new double[] { '#', 100L };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14, (int) (byte) 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 10, (double) 'a', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 0, (byte) -1, '#', 1.0f, ' ' };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, 35.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 100, 0.0d, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0, 100.0f, (short) 10, (-1.0f), 1.0f };
        double[] doubleArray19 = new double[] { 0, 100.0f, (short) 10, (-1.0f), 1.0f };
        double[] doubleArray25 = new double[] { 0, 100.0f, (short) 10, (-1.0f), 1.0f };
        double[] doubleArray31 = new double[] { 0, 100.0f, (short) 10, (-1.0f), 1.0f };
        double[] doubleArray37 = new double[] { 0, 100.0f, (short) 10, (-1.0f), 1.0f };
        double[][] doubleArray38 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 100.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 100.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 100.0, 10.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }
}

