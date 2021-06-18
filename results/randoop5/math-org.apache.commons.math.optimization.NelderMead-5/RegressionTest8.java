import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '4', (double) (byte) 0, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { '#', 100.0d, 100.0d };
        double[] doubleArray13 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0]");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10, 1.0d, (double) 10);
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, (double) 1.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10, (byte) 0, (byte) 10, 10L, 0.0f };
        double[] doubleArray17 = new double[] { 10L, 100.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray13, doubleArray17, (int) (byte) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 0.0]");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 1, (double) (short) 10, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 10.0f, (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray9);
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
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) '4', (double) (byte) 1, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0L, 100.0f, (-1), (-1), 1, 10L };
        double[] doubleArray16 = new double[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, -1.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0]");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 'a', (double) (-1L), 0.0d);
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
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100, (double) 1L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 1.0d, 100L, (-1.0f) };
        double[] doubleArray17 = new double[] { (byte) -1, 1.0d, 100L, (-1.0f) };
        double[] doubleArray22 = new double[] { (byte) -1, 1.0d, 100L, (-1.0f) };
        double[] doubleArray27 = new double[] { (byte) -1, 1.0d, 100L, (-1.0f) };
        double[] doubleArray32 = new double[] { (byte) -1, 1.0d, 100L, (-1.0f) };
        double[] doubleArray37 = new double[] { (byte) -1, 1.0d, 100L, (-1.0f) };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 100.0f, (double) (short) -1, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '4', 100 };
        double[] doubleArray13 = new double[] { '4', 100 };
        double[] doubleArray16 = new double[] { '4', 100 };
        double[] doubleArray19 = new double[] { '4', 100 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 1.0d, (double) (byte) 100, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { '4', (short) 0, '#', (-1.0d), 0.0d };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 0.0, 35.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 1, 100.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (-1L), 100L, (short) -1, '#' };
        double[] doubleArray17 = new double[] { (-1L), 100L, (short) -1, '#' };
        double[] doubleArray22 = new double[] { (-1L), 100L, (short) -1, '#' };
        double[] doubleArray27 = new double[] { (-1L), 100L, (short) -1, '#' };
        double[] doubleArray32 = new double[] { (-1L), 100L, (short) -1, '#' };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0d), (-1.0f), 0L };
        double[] doubleArray15 = new double[] { 1L, (short) 1, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, -1.0]");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) 0.0f, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (-1.0d), (byte) -1, 0L, 10.0d };
        double[] doubleArray19 = new double[] { (byte) 0, (byte) 10, (byte) -1, 10L, 0L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray12, doubleArray19, 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, -1.0, 10.0, 0.0, -1.0]");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100, (double) 0L, 100.0d);
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
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0.0f, (double) 100, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 0, (-1), 100.0d, (byte) -1, 'a', (byte) 10 };
        double[] doubleArray21 = new double[] { (short) 0, (-1), 100.0d, (byte) -1, 'a', (byte) 10 };
        double[] doubleArray28 = new double[] { (short) 0, (-1), 100.0d, (byte) -1, 'a', (byte) 10 };
        double[] doubleArray35 = new double[] { (short) 0, (-1), 100.0d, (byte) -1, 'a', (byte) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, 100.0, -1.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 100.0, -1.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, -1.0, 100.0, -1.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, -1.0, 100.0, -1.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10, (short) -1 };
        double[] doubleArray13 = new double[] { 10, (short) -1 };
        double[] doubleArray16 = new double[] { 10, (short) -1 };
        double[] doubleArray19 = new double[] { 10, (short) -1 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
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
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) -1, (double) 100L, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { ' ', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 0.0]");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (short) 1, (double) (byte) 10, (double) (short) 1);
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
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) -1, 'a' };
        double[] doubleArray13 = new double[] { (short) -1, 'a' };
        double[] doubleArray16 = new double[] { (short) -1, 'a' };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100.0f, (double) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) 0, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, (double) 10L, 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 10.0d, (double) ' ', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1L, 0L, (byte) -1, (byte) -1 };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 10.0f, (double) (short) -1, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) -1 };
        double[] doubleArray15 = new double[] { 1.0f, 0L, 'a', 0.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray9, doubleArray15, 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 0.0, 97.0, 0.0, 100.0]");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (short) 0, (double) (short) 1, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 1.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray8, doubleArray11, (int) (byte) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0]");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0, (double) (short) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 'a', 1.0d, (short) 100, ' ', 1L };
        double[] doubleArray20 = new double[] { 1L, 0L, (-1L), (-1), (byte) 100, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray13, doubleArray20, (int) (byte) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 1.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 0.0, -1.0, -1.0, 100.0, 52.0]");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 100.0d, (double) (-1.0f), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { '#', 0.0f, (byte) 100, (short) 100, 'a' };
        double[] doubleArray15 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray13, doubleArray15, (int) (short) 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 0.0, 100.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0]");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 0.0d, (double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1), (byte) 100 };
        double[] doubleArray13 = new double[] { (-1), (byte) 100 };
        double[] doubleArray16 = new double[] { (-1), (byte) 100 };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray17, 0, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (short) 0, (double) (-1), (double) 0L);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (byte) 0, (-1.0d), (double) (-1L));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 10.0f, (double) (short) -1, (double) 0L);
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
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray8 = new double[] { '#', ' ', (byte) 10, (short) 0 };
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead0.minimize(costFunction1, (int) (short) 100, convergenceChecker3, doubleArray9, (int) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[35.0, 32.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, 100.0d, (double) (short) 1, (double) 10L);
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
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 100, (double) 10L, (double) 100L);
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
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 0L, (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 10, (double) (byte) -1, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray14 = new double[] { (-1.0f), (byte) 0, (byte) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray9, doubleArray14, (int) '4', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 1.0, 1.0]");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 0, (double) (short) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray8, doubleArray9, (int) (byte) 100, (long) (byte) 10);
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (-1.0f), (double) (short) 100, (double) '#');
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
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0.0f, (double) (byte) 0, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 10, 10 };
        double[] doubleArray13 = new double[] { (short) 10, 10 };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14, (int) (byte) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) ' ', (double) (-1L), (double) 10.0f);
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
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (-1), (double) (-1.0f), (double) 0);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (-1.0d), (double) (byte) 10, (double) '#');
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
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (short) 1, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 'a', (double) (short) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 0, '#' };
        double[] doubleArray16 = new double[] { 100L, 0L, (-1L), (short) 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray10, doubleArray16, 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 0.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 0, (double) 100.0f, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 1L, (short) -1, '4', (byte) 100 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, -1.0, 52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray8, doubleArray9, (int) (byte) 10, 10L);
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
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 1.0d, (double) (byte) 1, (double) 100);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 10.0d, (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1.0d, 10, 'a', (-1L) };
        double[] doubleArray18 = new double[] { (byte) 1, 0.0d, (short) -1, 10L, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12, doubleArray18, (int) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 0.0, -1.0, 10.0, 0.0]");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (-1.0f), 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 0, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10L, ' ', 100.0f, (byte) 100, 0.0f };
        double[] doubleArray19 = new double[] { 10L, ' ', 100.0f, (byte) 100, 0.0f };
        double[] doubleArray25 = new double[] { 10L, ' ', 100.0f, (byte) 100, 0.0f };
        double[] doubleArray31 = new double[] { 10L, ' ', 100.0f, (byte) 100, 0.0f };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray32, 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 32.0, 100.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 32.0, 100.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 32.0, 100.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 32.0, 100.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (short) 10, 0.0d, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 100.0d, (double) (-1.0f), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1), 100L, (short) 1 };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), 0L, 10.0d, 0, 0L };
        double[] doubleArray19 = new double[] { (-1.0d), 0L, 10.0d, 0, 0L };
        double[] doubleArray25 = new double[] { (-1.0d), 0L, 10.0d, 0, 0L };
        double[] doubleArray31 = new double[] { (-1.0d), 0L, 10.0d, 0, 0L };
        double[] doubleArray37 = new double[] { (-1.0d), 0L, 10.0d, 0, 0L };
        double[] doubleArray43 = new double[] { (-1.0d), 0L, 10.0d, 0, 0L };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray44, (int) (short) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 10.0d, (double) (-1L), (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray14 = new double[] { '#', (short) 10, 10.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray9, doubleArray14, 100, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0, 10.0, 0.0]");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 100.0d, (double) (short) 1, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10 };
        double[] doubleArray14 = new double[] { (short) 100, 1.0d, 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray9, doubleArray14, 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 100.0, -1.0]");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '#', 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 1, 0L };
        double[] doubleArray15 = new double[] { 100L, 'a', (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray10, doubleArray15, 1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 97.0, 10.0, 100.0]");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 1L, 1.0f, (-1L), 1L, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, doubleArray14, (int) '4', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, -1.0, 1.0, 10.0]");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 1.0f, (double) (byte) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1L, 0, (short) 0, 'a', 'a', 0.0d };
        double[] doubleArray19 = new double[] { '4', 10L, 0.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 0.0, 97.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 10.0, 0.0, 35.0]");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (byte) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { '#', 100.0f, (byte) 100, 100.0f, ' ' };
        double[] doubleArray19 = new double[] { (byte) 1, (byte) 100, (short) -1, (-1), 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray13, doubleArray19, (int) ' ', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0, 100.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, -1.0, -1.0, 100.0]");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '#', (double) (short) 1, 0.0d);
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
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 10.0f, 1.0d, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0d, 0L };
        double[] doubleArray13 = new double[] { 100.0d, 0L };
        double[] doubleArray16 = new double[] { 100.0d, 0L };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray17, (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 10, 10L, (-1.0f), 100, 1.0d, (byte) 10 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray15, 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, -1.0, 100.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0, (double) (byte) 100, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 1 };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (byte) -1, (double) (byte) 10, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0d, (byte) 1 };
        double[] doubleArray13 = new double[] { 100.0d, (byte) 1 };
        double[] doubleArray16 = new double[] { 100.0d, (byte) 1 };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 1.0f, (double) (-1.0f), (-1.0d));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 1.0f, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 100, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10L, 0.0d, 10L };
        double[] doubleArray18 = new double[] { 0.0f, (byte) 1, 10L, 1, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray11, doubleArray18, (int) 'a', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 1.0, 10.0, 1.0, 10.0, 1.0]");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) '#', (double) (short) 0, 0.0d);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (short) 1, (double) (-1L), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 100.0f, (double) (byte) 100);
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
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) (short) 0, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 10, 10, 0, (byte) -1, 100, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray15, (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 0.0, -1.0, 100.0, -1.0]");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100.0f, 0.0d, (double) 'a');
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
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 1.0d, (double) (-1L), (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 10, 10.0d, 1 };
        double[] doubleArray14 = new double[] { (-1.0f), 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray11, doubleArray14, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0]");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 0, (double) (byte) 1, (double) (-1));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) ' ', (double) 0L, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0f, (byte) 100 };
        double[] doubleArray13 = new double[] { 0.0f, (byte) 100 };
        double[] doubleArray16 = new double[] { 0.0f, (byte) 100 };
        double[] doubleArray19 = new double[] { 0.0f, (byte) 100 };
        double[] doubleArray22 = new double[] { 0.0f, (byte) 100 };
        double[] doubleArray25 = new double[] { 0.0f, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray26, 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) 0, 10.0d);
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
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10.0f, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 100.0d, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1L, (double) 100, (double) 10.0f);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 1, (double) (short) -1, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 1 };
        double[] doubleArray12 = new double[] { (-1L), (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray9, doubleArray12, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0]");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0.0f, (double) (short) 0, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 1, 10.0d };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (byte) 10, (double) 0.0f, (double) 1L);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
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
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0L, (double) (byte) 0, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100.0d, '4', 'a', 100, 1L };
        double[] doubleArray16 = new double[] { (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray13, doubleArray16, (int) (byte) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 52.0, 97.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 0.0]");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 100.0f, (double) (byte) -1, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 10 };
        double[] doubleArray12 = new double[] { (-1.0d), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray9, doubleArray12, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0]");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '#', (double) (short) 1, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0]");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, 1.0d, (double) (short) 100, 0.0d);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 0L, (double) '4', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) -1, (double) 100L, (double) (short) 100);
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
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) -1, (double) '#', (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 0, 10.0f, (short) 10, (byte) 100, 10L, 100.0f };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray15, (int) 'a', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0, 10.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100.0f, (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1.0f), 0.0d, 0.0d);
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
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (byte) 0, (double) (short) 1, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1, (short) 0, 0, ' ', 10L, 100L };
        double[] doubleArray21 = new double[] { 1, (short) 0, 0, ' ', 10L, 100L };
        double[] doubleArray28 = new double[] { 1, (short) 0, 0, ' ', 10L, 100L };
        double[] doubleArray35 = new double[] { 1, (short) 0, 0, ' ', 10L, 100L };
        double[] doubleArray42 = new double[] { 1, (short) 0, 0, ' ', 10L, 100L };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray43, (int) (short) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 0.0, 32.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0, 0.0, 32.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0, 0.0, 32.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 0.0, 0.0, 32.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 0.0, 0.0, 32.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) 10.0f, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), 10, (byte) 10, 0.0d, (short) 100 };
        double[] doubleArray19 = new double[] { (-1L), 10, (byte) 10, 0.0d, (short) 100 };
        double[] doubleArray25 = new double[] { (-1L), 10, (byte) 10, 0.0d, (short) 100 };
        double[] doubleArray31 = new double[] { (-1L), 10, (byte) 10, 0.0d, (short) 100 };
        double[] doubleArray37 = new double[] { (-1L), 10, (byte) 10, 0.0d, (short) 100 };
        double[] doubleArray43 = new double[] { (-1L), 10, (byte) 10, 0.0d, (short) 100 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 0.0f, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 1, 0.0d };
        double[] doubleArray13 = new double[] { (short) 1, 0.0d };
        double[] doubleArray16 = new double[] { (short) 1, 0.0d };
        double[] doubleArray19 = new double[] { (short) 1, 0.0d };
        double[] doubleArray22 = new double[] { (short) 1, 0.0d };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 10, (double) (-1), (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, doubleArray9, (int) (short) 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 1L, (double) 0, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0d), 100.0f, ' ', 0, 1L, 10 };
        double[] doubleArray18 = new double[] { (-1L), '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 32.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 52.0, 35.0]");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, (double) 1.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1), 10, 1.0d, '4', 100L, '#' };
        double[] doubleArray18 = new double[] { 1.0f, '4', 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14, doubleArray18, 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 10.0, 1.0, 52.0, 100.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 52.0, 1.0]");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1L, (double) 1L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 0, ' ', 1.0d, (-1.0d), (-1) };
        double[] doubleArray19 = new double[] { (byte) 0, ' ', 1.0d, (-1.0d), (-1) };
        double[] doubleArray25 = new double[] { (byte) 0, ' ', 1.0d, (-1.0d), (-1) };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 32.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 32.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 32.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }
}

