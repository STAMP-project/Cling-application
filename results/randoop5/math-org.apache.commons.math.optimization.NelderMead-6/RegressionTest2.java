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
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 1, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray11);
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
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '#', 100.0f };
        double[] doubleArray13 = new double[] { '#', 100.0f };
        double[] doubleArray16 = new double[] { '#', 100.0f };
        double[] doubleArray19 = new double[] { '#', 100.0f };
        double[] doubleArray22 = new double[] { '#', 100.0f };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray23, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 1.0d, (double) 0L, 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '#', 0.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10.0f, 10, 10, (short) 0, (short) 0 };
        double[] doubleArray19 = new double[] { 10.0f, 10, 10, (short) 0, (short) 0 };
        double[] doubleArray25 = new double[] { 10.0f, 10, 10, (short) 0, (short) 0 };
        double[] doubleArray31 = new double[] { 10.0f, 10, 10, (short) 0, (short) 0 };
        double[] doubleArray37 = new double[] { 10.0f, 10, 10, (short) 0, (short) 0 };
        double[] doubleArray43 = new double[] { 10.0f, 10, 10, (short) 0, (short) 0 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 10.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
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
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1), (double) 0L, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 100, 10.0d, (byte) 10 };
        double[] doubleArray17 = new double[] { 1.0f, (byte) 100, (-1), 100L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray11, doubleArray17, (int) ' ', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 100.0, -1.0, 100.0, 0.0]");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 1, (double) (byte) 1, (double) '#');
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
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (-1.0f), (double) (byte) 10, (double) 1L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 1, 10.0d, (double) 100L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, 10.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1L, (-1.0f), (-1), 100.0d };
        double[] doubleArray15 = new double[] { 10.0f, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, -1.0]");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), (double) 0, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1.0d, 1.0f, (byte) -1, 100.0f, 'a' };
        double[] doubleArray17 = new double[] { 100, 10L, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, -1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 10.0]");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10, 1.0d, (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (-1.0d), 1.0d, (double) 0.0f);
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1), (double) 0L, (double) (-1L));
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (short) 1, (double) (byte) 10, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), 1L, 10, 10.0f, 100 };
        double[] doubleArray16 = new double[] { 100, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, 10.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 1.0]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (-1), (double) 0.0f, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 0, (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray11 = new double[] { (-1.0d) };
        double[] doubleArray13 = new double[] { (-1.0d) };
        double[] doubleArray15 = new double[] { (-1.0d) };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray16);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0.0f, (short) -1, 100.0f };
        double[] doubleArray13 = new double[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, doubleArray13, (int) '#', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0]");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) -1, 'a' };
        double[] doubleArray13 = new double[] { ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) ' ', 0.0d, (double) (short) 0);
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 100, '#', (byte) 10 };
        double[] doubleArray13 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray11, doubleArray13, (int) (short) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), (byte) 0, (short) 1, 10.0d, (short) 0 };
        double[] doubleArray19 = new double[] { (-1.0d), (byte) 0, (short) 1, 10.0d, (short) 0 };
        double[] doubleArray25 = new double[] { (-1.0d), (byte) 0, (short) 1, 10.0d, (short) 0 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray26, 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 0.0f, (-1.0d), (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { 0.0f, (short) 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray12, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 0.0, 10.0]");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, 10.0d, (double) 'a');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (-1.0d), (double) 100L, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (-1L), (double) (short) 1, 0.0d);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1), (double) 0L, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, '4' };
        double[] doubleArray13 = new double[] { 100.0f, '4' };
        double[] doubleArray16 = new double[] { 100.0f, '4' };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray17, 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) ' ', (double) (-1L), (double) ' ');
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 100L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1L), 0.0d, 0.0d, (byte) 10, 100L, (byte) 1 };
        double[] doubleArray20 = new double[] { (short) 10, (byte) 10, 10L, 1L, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray14, doubleArray20, (int) (byte) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 0.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 10.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 0, (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0L, (byte) 1 };
        double[] doubleArray13 = new double[] { 0L, (byte) 1 };
        double[] doubleArray16 = new double[] { 0L, (byte) 1 };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray17, (int) (byte) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 1L, (double) 0, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 0, (-1), 1.0f };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray12, 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 100, 100.0f, (-1.0f), (short) -1, (-1.0d) };
        double[] doubleArray19 = new double[] { 0.0f, 10.0d, (byte) -1, (short) 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, -1.0, 1.0, 0.0]");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { (-1.0f), 0.0d, 100.0d, 0, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray15, (int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 100.0, 0.0, -1.0, 0.0]");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 0, 100 };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray10, doubleArray11, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) (-1L), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 0 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray9, doubleArray10, (int) (short) 0, (long) '#');
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0f, (byte) 10 };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray10, doubleArray11, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0.0d, 10.0f, 10.0f, (short) -1, (short) 100, (-1.0d) };
        double[] doubleArray21 = new double[] { 0.0d, 10.0f, 10.0f, (short) -1, (short) 100, (-1.0d) };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0, 10.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 10.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 1, '#' };
        double[] doubleArray13 = new double[] { (short) 1, '#' };
        double[] doubleArray16 = new double[] { (short) 1, '#' };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray17, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100, (double) '#', (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0f, (byte) -1, (short) -1 };
        double[] doubleArray15 = new double[] { 100.0f, (byte) -1, (short) -1 };
        double[] doubleArray19 = new double[] { 100.0f, (byte) -1, (short) -1 };
        double[] doubleArray23 = new double[] { 100.0f, (byte) -1, (short) -1 };
        double[] doubleArray27 = new double[] { 100.0f, (byte) -1, (short) -1 };
        double[] doubleArray31 = new double[] { 100.0f, (byte) -1, (short) -1 };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray32);
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 1, (double) (short) 1, (double) ' ');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) ' ', (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0L, (byte) 10, 10L, (byte) 0, (byte) 100 };
        double[] doubleArray19 = new double[] { 0L, (byte) 10, 10L, (byte) 0, (byte) 100 };
        double[] doubleArray25 = new double[] { 0L, (byte) 10, 10L, (byte) 0, (byte) 100 };
        double[] doubleArray31 = new double[] { 0L, (byte) 10, 10L, (byte) 0, (byte) 100 };
        double[] doubleArray37 = new double[] { 0L, (byte) 10, 10L, (byte) 0, (byte) 100 };
        double[] doubleArray43 = new double[] { 0L, (byte) 10, 10L, (byte) 0, (byte) 100 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray44, 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { ' ', ' ', 0.0d };
        double[] doubleArray16 = new double[] { '4', 1.0d, 1.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray11, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0f), 0L, (short) 1, (byte) 100, 10 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', (double) (byte) 1, (double) (byte) 1);
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
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { 10.0f, 10, '#', 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, 35.0, 1.0]");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) 1, 100.0d, (double) '4');
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) ' ', (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), (short) 100, ' ' };
        double[] doubleArray16 = new double[] { ' ', 1.0f, (short) 1, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray11, doubleArray16, (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 100, (double) 10.0f, (double) (short) 100);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1.0f, (-1L), (-1.0d), 0L, 10.0f, 100 };
        double[] doubleArray18 = new double[] { 10.0f, (-1.0f), 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, -1.0, 0.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 100.0]");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 0.0d, (double) (byte) 10, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1L, (-1L), '4', '#' };
        double[] doubleArray17 = new double[] { 1L, (-1L), '4', '#' };
        double[] doubleArray22 = new double[] { 1L, (-1L), '4', '#' };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0, 52.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, 10.0d, (double) (byte) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 10, (double) 1.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { ' ', 'a', ' ', 100, 100L, 100L };
        double[] doubleArray18 = new double[] { (byte) 10, (short) 10, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, 97.0, 32.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 10.0, -1.0]");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100, 0.0f, 0.0d, 1, 1L };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray13, doubleArray14, (int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 0.0, 0.0, 1.0, 1.0]");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { ' ' };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 0.0d, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1L), (-1L), (short) 100 };
        double[] doubleArray15 = new double[] { (-1L), (-1L), (short) 100 };
        double[] doubleArray19 = new double[] { (-1L), (-1L), (short) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 0, (double) (short) 0, (-1.0d));
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10L, (double) (-1L), (double) (short) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100, (double) '#', (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', (double) (byte) 1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) 1, 100.0d, (double) (short) 10);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { (-1.0f), (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray11, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0]");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), 1L, '4', '#', 'a' };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, 52.0, 35.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 0.0f, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 0 };
        double[] doubleArray16 = new double[] { (short) 100, (-1.0d), (short) -1, '#', 1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray9, doubleArray16, 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0, -1.0, 35.0, 1.0, 10.0]");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1L, 100.0f, 1.0f };
        double[] doubleArray13 = new double[] { (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray11, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0]");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { 100, 1.0d, 1L, 0L, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 1.0, 1.0, 0.0, 0.0]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0f), (byte) 0 };
        double[] doubleArray13 = new double[] { (-1.0f), (byte) 0 };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 100, (double) (byte) 0, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0d), (short) 1, (-1L), 10.0f, 1.0d, 10 };
        double[] doubleArray19 = new double[] { (short) -1, (byte) 10, (short) -1, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, -1.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, -1.0]");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { 10L, 1.0d, (byte) 1, 10L, (short) 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, doubleArray15, (int) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 1.0, 1.0, 10.0, 100.0, 10.0]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 10L, (double) 100, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 1, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100.0f, (-1), 1.0d, ' ' };
        double[] doubleArray17 = new double[] { 100.0f, (-1), 1.0d, ' ' };
        double[] doubleArray22 = new double[] { 100.0f, (-1), 1.0d, ' ' };
        double[] doubleArray27 = new double[] { 100.0f, (-1), 1.0d, ' ' };
        double[] doubleArray32 = new double[] { 100.0f, (-1), 1.0d, ' ' };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, -1.0, 1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 1, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0, (double) 1L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1, '4' };
        double[] doubleArray13 = new double[] { 1, '4' };
        double[] doubleArray16 = new double[] { 1, '4' };
        double[] doubleArray19 = new double[] { 1, '4' };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '4', (double) (byte) 0, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8, doubleArray9, (int) (byte) 0, (long) (byte) 0);
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
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
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, 100.0d, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray8, (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 1, (double) (short) 0, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { ' ', 0L, 10.0d, 'a', (byte) 1 };
        double[] doubleArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 0.0, 10.0, 97.0, 1.0]");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 1, 1.0f, (short) 1 };
        double[] doubleArray18 = new double[] { (short) -1, (byte) 0, 100.0f, (byte) 0, (-1), (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray11, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0, 100.0, 0.0, -1.0, 0.0]");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 1L, (double) 0, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), 0L, 1.0d, 10.0d, ' ' };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0, 1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 1, (double) 100.0f, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 10, (short) 0, (-1.0d), (byte) 10 };
        double[] doubleArray17 = new double[] { (short) 10, (short) 0, (-1.0d), (byte) 10 };
        double[] doubleArray22 = new double[] { (short) 10, (short) 0, (-1.0d), (byte) 10 };
        double[] doubleArray27 = new double[] { (short) 10, (short) 0, (-1.0d), (byte) 10 };
        double[] doubleArray32 = new double[] { (short) 10, (short) 0, (-1.0d), (byte) 10 };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair36 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray33, (int) ' ', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) (-1L), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 0, 10L };
        double[] doubleArray13 = new double[] { (byte) 0, 10L };
        double[] doubleArray16 = new double[] { (byte) 0, 10L };
        double[] doubleArray19 = new double[] { (byte) 0, 10L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 10.0d, (double) (short) 1, (double) 0.0f);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) '4', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) ' ', (double) (byte) -1, (double) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (byte) 1, (double) 10);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 1, (double) (byte) 1, (double) '#');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', (double) (byte) 1, (double) (byte) 1);
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
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 0, (double) (short) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (-1.0d), (double) '#', (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10 };
        double[] doubleArray11 = new double[] { 10 };
        double[] doubleArray13 = new double[] { 10 };
        double[] doubleArray15 = new double[] { 10 };
        double[] doubleArray17 = new double[] { 10 };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray18, (-1), (long) ' ');
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 0, (double) (short) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 1, (short) 100 };
        double[] doubleArray13 = new double[] { 10.0f, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray10, doubleArray13, (int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray12 = new double[] { 100, 'a', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray8, doubleArray12, (int) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 97.0, 0.0]");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 100 };
        double[] doubleArray14 = new double[] { 10.0d, 0L, ' ', (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray9, doubleArray14, (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 32.0, -1.0]");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100, (byte) -1, 1.0d, 10.0d };
        double[] doubleArray17 = new double[] { 100, (byte) -1, 1.0d, 10.0d };
        double[] doubleArray22 = new double[] { 100, (byte) -1, 1.0d, 10.0d };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 0, (double) (short) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0d, (short) -1, '#' };
        double[] doubleArray17 = new double[] { 100, 10.0d, (short) 1, (short) 1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, doubleArray17, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, 10.0d, (double) (short) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0d), 1.0f };
        double[] doubleArray13 = new double[] { (-1.0d), 1.0f };
        double[] doubleArray16 = new double[] { (-1.0d), 1.0f };
        double[] doubleArray19 = new double[] { (-1.0d), 1.0f };
        double[] doubleArray22 = new double[] { (-1.0d), 1.0f };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100.0f, (double) (short) 10, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { '4', (-1L), 0L, 0.0f, 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray15, (int) (byte) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, -1.0, 0.0, 0.0, 0.0, 10.0]");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10L, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, 0 };
        double[] doubleArray14 = new double[] { 1, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray10, doubleArray14, (int) (byte) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, -1.0]");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { 1, 10L, (short) 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 1.0, 0.0]");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 10, (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 1, 0.0d, (double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) '4', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray12 = new double[] { 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray9, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 1.0]");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (short) -1, 0.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), 10, (byte) 0, 1.0f, 0.0f };
        double[] doubleArray19 = new double[] { (short) 1, (byte) 0, 10L, 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray13, doubleArray19, (int) 'a', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 0.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 0.0, 10.0, 100.0, 100.0]");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, (double) 1.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 0L, (double) 0.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1.0d };
        double[] doubleArray15 = new double[] { 100L, 10.0f, (-1), ' ', 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, -1.0, 32.0, 10.0]");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0, (double) (short) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), (double) 0, (double) '4');
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) '#', (double) (short) 1, (double) 100);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10.0f, (double) 0L, (double) 10L);
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100.0d, '4', (-1.0d), 10, 1L };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 52.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (-1L), (byte) 10, (byte) 0, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 0.0, 10.0]");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (short) 100, 0.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray10 = new double[] { 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 100, 1.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100L, (byte) 0 };
        double[] doubleArray13 = new double[] { 100L, (byte) 0 };
        double[] doubleArray16 = new double[] { 100L, (byte) 0 };
        double[] doubleArray19 = new double[] { 100L, (byte) 0 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 1.0d, (double) 'a', (double) (byte) 0);
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
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 100, (short) 0, (-1L), (byte) 10, 10.0d, (short) 1 };
        double[] doubleArray21 = new double[] { (byte) 100, (short) 0, (-1L), (byte) 10, 10.0d, (short) 1 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0, -1.0, 10.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, -1.0, 10.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (short) 0, (double) (short) 1, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0d, (byte) 10, 0L };
        double[] doubleArray15 = new double[] { 100.0d, (byte) 10, 0L };
        double[] doubleArray19 = new double[] { 100.0d, (byte) 10, 0L };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 100, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 0.0f, (byte) 100, '4', 0.0d };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray12, doubleArray13, 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100, (double) '#', (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0d), 100 };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (-1.0d), (double) ' ', (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 'a', (byte) 100 };
        double[] doubleArray13 = new double[] { 'a', (byte) 100 };
        double[] doubleArray16 = new double[] { 'a', (byte) 100 };
        double[] doubleArray19 = new double[] { 'a', (byte) 100 };
        double[] doubleArray22 = new double[] { 'a', (byte) 100 };
        double[] doubleArray25 = new double[] { 'a', (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) '4', (double) (short) 100, (double) (byte) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100, 0, '#' };
        double[] doubleArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray11, doubleArray12, (-1), (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 35.0]");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) ' ', (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 1, (short) 1, (short) -1, 'a', 100L };
        double[] doubleArray16 = new double[] { 0L, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray13, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, -1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0]");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[] doubleArray16 = new double[] { 1L, 'a', 100.0d, '4', (-1L), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 97.0, 100.0, 52.0, -1.0, -1.0]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1), (double) '4', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1, (short) 0, (byte) -1, '4' };
        double[] doubleArray16 = new double[] { '4', 100L, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 100.0, 0.0]");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (short) 0, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { '4', 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray11, (int) 'a', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 10.0]");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 100, (double) 10.0f, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, 10.0d, (double) (short) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0f, (-1.0d) };
        double[] doubleArray13 = new double[] { 0.0f, (-1.0d) };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray14, (int) '4', (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[] doubleArray16 = new double[] { 0L, 0.0f, '#', 10.0f, 1.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 0.0, 35.0, 10.0, 1.0, -1.0]");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 100L, (double) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1, 'a' };
        double[] doubleArray13 = new double[] { 1, 'a' };
        double[] doubleArray16 = new double[] { 1, 'a' };
        double[] doubleArray19 = new double[] { 1, 'a' };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100.0d, 10.0d, (byte) 1, 100.0f };
        double[] doubleArray17 = new double[] { 100.0d, 10.0d, (byte) 1, 100.0f };
        double[] doubleArray22 = new double[] { 100.0d, 10.0d, (byte) 1, 100.0f };
        double[] doubleArray27 = new double[] { 100.0d, 10.0d, (byte) 1, 100.0f };
        double[] doubleArray32 = new double[] { 100.0d, 10.0d, (byte) 1, 100.0f };
        double[] doubleArray37 = new double[] { 100.0d, 10.0d, (byte) 1, 100.0f };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 10.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10, (double) (-1), (double) 10.0f);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100.0f, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 0, (double) '4', (double) (byte) -1);
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 100 };
        double[] doubleArray13 = new double[] { (byte) 100 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14);
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (short) 0, (double) (short) 1, (double) 0L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1), (double) 0L, (double) (-1L));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', (double) (byte) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 10L, (byte) 0, 0.0d, 100L };
        double[] doubleArray19 = new double[] { (byte) -1, 10, 10L, (-1.0f), 10L, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray12, doubleArray19, 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 10.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 10, (double) 'a', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10.0d, 1, 10, (short) 0, (-1.0d) };
        double[] doubleArray20 = new double[] { 10.0f, (-1L), 100.0f, 1, 0L, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray13, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 100.0, 1.0, 0.0, -1.0]");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (-1.0f), (double) 0L, 1.0d);
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (short) 10, (double) (byte) 10, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 100, 0, 10.0d };
        double[] doubleArray14 = new double[] { (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12, doubleArray14, 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0]");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { (byte) 1, (byte) -1, (short) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0, 10.0, 10.0]");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair5 = nelderMead0.minimize(costFunction1, (int) (short) 0, convergenceChecker3, randomVectorGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 1, (byte) 0, 100.0d };
        double[] doubleArray17 = new double[] { 10L, (byte) 100, (short) 100, (short) -1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray11, doubleArray17, (int) '#', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 100.0, -1.0, 100.0]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 1, (double) (short) 0, (double) (byte) 1);
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 100, 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 1 };
        double[] doubleArray16 = new double[] { 'a', (short) 1, 1, (short) 10, 10.0d, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 1.0, 1.0, 10.0, 10.0, 100.0]");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '#', (double) (byte) 1, (double) (byte) 1);
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
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1, (-1.0f), (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { '#', (byte) 0, 'a', 10L, (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12, doubleArray19, (int) (short) -1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 0.0, 97.0, 10.0, 10.0, -1.0]");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 1.0d, (double) 0L, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { '4', 100.0f, (-1.0f), 100.0f };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 100.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 10, (double) 1.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 100L, 'a', 100, (short) 1 };
        double[] doubleArray19 = new double[] { (byte) -1, 100L, 'a', 100, (short) 1 };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray20, (int) (short) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, 97.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 97.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1.0d };
        double[] doubleArray15 = new double[] { (short) 1, (-1), 1.0d, (-1.0f), 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray9, doubleArray15, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, 1.0, -1.0, 0.0]");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 10, (-1.0d), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { '4', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray8, doubleArray11, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, -1.0]");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1L) };
        double[] doubleArray11 = new double[] { (-1L) };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100, 10L, 0, (-1.0f), 1.0d };
        double[] doubleArray17 = new double[] { (short) -1, (byte) -1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 0.0]");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 0, (double) (short) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 1, (short) 0, 100.0d, (short) 100 };
        double[] doubleArray19 = new double[] { 10.0f, 10.0d, ' ', (-1L), 10.0f, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray12, doubleArray19, (int) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, 32.0, -1.0, 10.0, 1.0]");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 1, 100.0d, (double) '4');
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0f), (byte) 10 };
        double[] doubleArray13 = new double[] { (-1.0f), (byte) 10 };
        double[] doubleArray16 = new double[] { (-1.0f), (byte) 10 };
        double[] doubleArray19 = new double[] { (-1.0f), (byte) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray20);
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) '4', (double) (short) -1, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0d, 0.0d };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, (-1), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray13 = new double[] { 1.0f, (short) 1, (-1.0f), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, -1.0, -1.0]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1, (byte) 10, 'a', (-1.0f) };
        double[] doubleArray17 = new double[] { 1, (byte) 10, 'a', (-1.0f) };
        double[] doubleArray22 = new double[] { 1, (byte) 10, 'a', (-1.0f) };
        double[] doubleArray27 = new double[] { 1, (byte) 10, 'a', (-1.0f) };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray28, 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, 10.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 100.0d, (double) (byte) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) -1, 10, (byte) -1, 100.0d, 100 };
        double[] doubleArray19 = new double[] { (short) -1, 10, (byte) -1, 100.0d, 100 };
        double[] doubleArray25 = new double[] { (short) -1, 10, (byte) -1, 100.0d, 100 };
        double[] doubleArray31 = new double[] { (short) -1, 10, (byte) -1, 100.0d, 100 };
        double[] doubleArray37 = new double[] { (short) -1, 10, (byte) -1, 100.0d, 100 };
        double[][] doubleArray38 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray38, 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 10.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) (byte) 0, (double) 10L);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray14, (-1), (long) (byte) 1);
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0f), (-1.0f), (-1L), 10.0f, (byte) -1, (short) 10 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray14, doubleArray15, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 0, (double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8, (int) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1), (double) 100.0f, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray10);
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 'a', (double) 100.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 1L, (double) (byte) -1, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { (short) 0, 0.0d, (-1), (short) -1, '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, -1.0, -1.0, 52.0, 0.0]");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (-1.0d), (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), 10.0d, 10.0d };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray11, doubleArray12, (int) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 10, (double) 1.0f, (double) (byte) 0);
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) 1, (double) 100.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0.0f, (-1.0f), 10L };
        double[] doubleArray13 = new double[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray11, doubleArray13, 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0]");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) -1, (byte) 100, 100.0d };
        double[] doubleArray15 = new double[] { (byte) -1, (byte) 100, 100.0d };
        double[] doubleArray19 = new double[] { (byte) -1, (byte) 100, 100.0d };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray20, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0.0d, 10.0d, 0.0f, 10.0d, '4', 10.0d };
        double[] doubleArray21 = new double[] { 0.0d, 10.0d, 0.0f, 10.0d, '4', 10.0d };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray22, (int) (byte) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 10.0, 0.0, 10.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 10.0, 0.0, 10.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 10L, (double) (-1L), (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0d, 10 };
        double[] doubleArray13 = new double[] { 1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0]");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 1, (double) (short) 1, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, (byte) 10, (byte) 0, (byte) 100, 0.0f };
        double[] doubleArray19 = new double[] { 0.0f, (byte) 10, (byte) 0, (byte) 100, 0.0f };
        double[] doubleArray25 = new double[] { 0.0f, (byte) 10, (byte) 0, (byte) 100, 0.0f };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 10.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) 10, 1.0d, (double) (byte) 10);
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, (int) (short) 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (short) 1, (double) 100L);
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0L, (byte) -1 };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, -1.0]");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, 0.0f, (short) -1 };
        double[] doubleArray15 = new double[] { 10.0f, 0.0f, (short) -1 };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1, 1.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { ' ', 1 };
        double[] doubleArray16 = new double[] { ' ', 'a', ' ', 1.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray10, doubleArray16, (int) (byte) 1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 97.0, 32.0, 1.0, 100.0]");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10.0f, (double) 0L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 100, 10, (byte) 100, 'a', 10.0f, '#' };
        double[] doubleArray19 = new double[] { (-1L), 0, 'a', 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 10.0, 100.0, 97.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, 97.0, 100.0]");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
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
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 1, (double) 100L, (-1.0d));
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
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, (int) (byte) 10, (long) (byte) -1);
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10.0f, (double) ' ', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray11 = new double[] { 10L };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12);
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 1.0f, (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 100, (-1.0f), (short) 1 };
        double[] doubleArray16 = new double[] { '#', 100.0f, (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray11, doubleArray16, 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 100.0, 100.0, 35.0]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 0.0d, (double) (short) 100, 100.0d);
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
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 10L, (double) 100, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0.0d, 100.0d, 10.0f, (byte) 10, 0.0f, 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 10.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0, (-1.0d), (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray12 = new double[] { 1, (byte) 0, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 52.0]");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 0.0d, (double) 0, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { 0.0f, 0L, 100.0d, (byte) 100, 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, doubleArray14, (int) (byte) 0, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, 100.0, 10.0]");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 100, (double) (-1L), (double) 100);
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 0, (double) '4', (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, (int) '#', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100L, (double) 10, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 10, 0L };
        double[] doubleArray13 = new double[] { (byte) 0, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 1.0]");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 100, (-1.0f) };
        double[] doubleArray13 = new double[] { (short) 100, (-1.0f) };
        double[] doubleArray16 = new double[] { (short) 100, (-1.0f) };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray17, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 'a', 10.0f, '4', 10.0d };
        double[] doubleArray15 = new double[] { (-1), (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 10.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0]");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 1.0d, (double) (short) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0f };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray10, (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 10, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1L, (byte) 1, (byte) -1, 1.0d };
        double[] doubleArray17 = new double[] { 1L, (byte) 1, (byte) -1, 1.0d };
        double[] doubleArray22 = new double[] { 1L, (byte) 1, (byte) -1, 1.0d };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, (int) (byte) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100L };
        double[] doubleArray11 = new double[] { 100L };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray12);
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
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0, (-1.0d), (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 0, (double) 'a', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1.0d, (short) 1, (short) 0, (byte) 1, (byte) 0, (byte) 100 };
        double[] doubleArray20 = new double[] { (short) -1, 100, 'a', 1L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray14, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 0.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 97.0, 1.0, -1.0]");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 1.0f, 10.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray9, (int) (short) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1L), (-1.0f) };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray10, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0]");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) 10, 1.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 10, (byte) 0, (short) 1, 100.0f };
        double[] doubleArray17 = new double[] { 10, (byte) 0, (short) 1, 100.0f };
        double[] doubleArray22 = new double[] { 10, (byte) 0, (short) 1, 100.0f };
        double[] doubleArray27 = new double[] { 10, (byte) 0, (short) 1, 100.0f };
        double[] doubleArray32 = new double[] { 10, (byte) 0, (short) 1, 100.0f };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 0.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, 100, 1.0d, (short) 0 };
        double[] doubleArray19 = new double[] { (short) 0, 1L, (byte) -1, 1.0d, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray12, doubleArray19, (int) (short) 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 100.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, -1.0, 1.0, 1.0, 0.0]");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
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
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (-1.0f), (double) (short) 10, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1, ' ' };
        double[] doubleArray14 = new double[] { (short) 1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0]");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 0L, (double) 0.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (-1.0f), (double) 0L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, (int) (short) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 0, (double) 0, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray12);
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
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 10, (double) 'a', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (double) (short) -1, (double) 1.0f);
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
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '#', (double) '#', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10 };
        double[] doubleArray11 = new double[] { 10 };
        double[] doubleArray13 = new double[] { 10 };
        double[] doubleArray15 = new double[] { 10 };
        double[] doubleArray17 = new double[] { 10 };
        double[] doubleArray19 = new double[] { 10 };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 0.0d, (double) (short) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { ' ' };
        double[] doubleArray11 = new double[] { ' ' };
        double[] doubleArray13 = new double[] { ' ' };
        double[] doubleArray15 = new double[] { ' ' };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (byte) -1, (double) 10, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, 100.0d, 100.0d };
        double[] doubleArray14 = new double[] { '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 32.0]");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10L, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0L };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray9, doubleArray10);
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
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 10, 10.0d, (double) (short) 100);
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
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (-1L), (double) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, (double) 10L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) -1, (short) 0, 1, (byte) 1 };
        double[] doubleArray19 = new double[] { (short) 10, 1.0d, (-1.0f), (short) -1, 100.0d, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray12, doubleArray19, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, -1.0, -1.0, 100.0, 1.0]");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) ' ', (double) 100, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0d, (byte) 0, 100.0d };
        double[] doubleArray15 = new double[] { 1.0f, (short) -1, 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray11, doubleArray15, (-1), (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, 100.0]");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (-1.0d), 1.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray9, (int) (byte) -1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100.0f, (double) (short) 10, (-1.0d));
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
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { 'a', 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead0.minimize(costFunction1, (int) (short) 100, convergenceChecker3, doubleArray4, doubleArray7, (int) (short) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[97.0, 100.0]");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
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
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 10.0d, (double) ' ', 1.0d);
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
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 1, (double) (byte) 1, (double) '#');
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
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 10, (double) (short) 10, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) -1 };
        double[] doubleArray16 = new double[] { (-1), 0L, 10.0f, 100.0d, 1.0d, (-1L) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray9, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0, 10.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
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
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0f, (short) 100, 0 };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray11, doubleArray12, 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1L), (double) 1.0f, (double) 10L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10.0f, (double) ' ', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { '#', 100L, 10L, 0L };
        double[] doubleArray14 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray12, doubleArray14, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0]");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (short) 1, (double) 100L);
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
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 1, (byte) 100, (byte) 0, 0.0f, '#', (byte) -1 };
        double[] doubleArray16 = new double[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray14, doubleArray16, (int) '#', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0, 0.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (short) 100, 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1), 0.0d, (-1) };
        double[] doubleArray15 = new double[] { (-1), 0.0d, (-1) };
        double[] doubleArray19 = new double[] { (-1), 0.0d, (-1) };
        double[] doubleArray23 = new double[] { (-1), 0.0d, (-1) };
        double[] doubleArray27 = new double[] { (-1), 0.0d, (-1) };
        double[][] doubleArray28 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '4', 100.0d };
        double[] doubleArray13 = new double[] { '4', 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14, (int) (short) 100, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 0, (double) (short) 100, 100.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray11);
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
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '#', (double) '#', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), 10.0d, '#', (byte) 0, 100.0d };
        double[] doubleArray19 = new double[] { (-1.0d), 10.0d, '#', (byte) 0, 100.0d };
        double[] doubleArray25 = new double[] { (-1.0d), 10.0d, '#', (byte) 0, 100.0d };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 35.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '4', 'a', (short) 1, (-1.0f), 100.0d, 'a' };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray15, (int) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 97.0, 1.0, -1.0, 100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100, (double) '#', (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 'a', (-1L), (-1L), 1L, 'a', 100L };
        double[] doubleArray19 = new double[] { '#', 10L, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray14, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, -1.0, -1.0, 1.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 10.0, 1.0, -1.0]");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12, 100, 1L);
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
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
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
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 0.0d, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0L };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray10, (int) (byte) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 100, 1.0d, 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '#', (double) '#', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10, 10.0f, (-1.0f) };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 1.0f, (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0L, 0L, (-1.0d), 1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0L, 0L, (-1.0d), 1, (byte) 10 };
        double[] doubleArray25 = new double[] { 0L, 0L, (-1.0d), 1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0L, 0L, (-1.0d), 1, (byte) 10 };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 0.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 0.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 0.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 0.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10.0f, (byte) 1, (short) 100, 10L, 10 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray14, (int) (short) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray15 = new double[] { 1, (byte) 10, 10, 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray9, doubleArray15, (int) (byte) 100, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 10.0, 0.0, 1.0]");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 32.0]");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (byte) -1, (double) 10, (double) (-1L));
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, 10.0f };
        double[] doubleArray13 = new double[] { 0.0f, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray10, doubleArray13, (int) (short) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 10.0]");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0d, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 10, (double) (short) 10, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) -1, 100L };
        double[] doubleArray13 = new double[] { (byte) -1, 100L };
        double[] doubleArray16 = new double[] { (byte) -1, 100L };
        double[] doubleArray19 = new double[] { (byte) -1, 100L };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 0.0d, 100.0d, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, (short) 1 };
        double[] doubleArray14 = new double[] { 0.0d, 'a', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 97.0, 0.0]");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 0.0d, (double) (byte) 10, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100, (byte) 1, 0.0f, (short) 100, (short) 100 };
        double[] doubleArray19 = new double[] { 100, (byte) 1, 0.0f, (short) 100, (short) 100 };
        double[] doubleArray25 = new double[] { 100, (byte) 1, 0.0f, (short) 100, (short) 100 };
        double[] doubleArray31 = new double[] { 100, (byte) 1, 0.0f, (short) 100, (short) 100 };
        double[] doubleArray37 = new double[] { 100, (byte) 1, 0.0f, (short) 100, (short) 100 };
        double[] doubleArray43 = new double[] { 100, (byte) 1, 0.0f, (short) 100, (short) 100 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[100.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1.0d, (short) 1, 10.0d, (short) 10, (-1L), 10.0f };
        double[] doubleArray21 = new double[] { 1.0d, (short) 1, 10.0d, (short) 10, (-1L), 10.0f };
        double[] doubleArray28 = new double[] { 1.0d, (short) 1, 10.0d, (short) 10, (-1L), 10.0f };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray29, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 1.0, 10.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 10.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 1.0, 10.0, 10.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 0.0d, (double) 10L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, doubleArray9, 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) ' ', (double) 0L, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray8, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0]");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10, (short) -1 };
        double[] doubleArray13 = new double[] { 10, (short) -1 };
        double[] doubleArray16 = new double[] { 10, (short) -1 };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray17, (int) (byte) 100, (long) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 1.0f, (double) (short) 1, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (-1), (short) 10, (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray8, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 1.0, 1.0]");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { '4' };
        double[] doubleArray11 = new double[] { '4' };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray12, 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0f), (-1.0d), 1L, (short) 0, (byte) 100 };
        double[] doubleArray19 = new double[] { (-1.0f), (-1.0d), 1L, (short) 0, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100.0f, (double) (short) 10, (-1.0d));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) 10L, (double) (byte) 100);
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 1.0d, (double) (-1L), (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1.0d, (short) 10, (short) 10, (-1L), 0, (byte) 100 };
        double[] doubleArray21 = new double[] { 1.0d, (short) 10, (short) 10, (-1L), 0, (byte) 100 };
        double[] doubleArray28 = new double[] { 1.0d, (short) 10, (short) 10, (-1L), 0, (byte) 100 };
        double[] doubleArray35 = new double[] { 1.0d, (short) 10, (short) 10, (-1L), 0, (byte) 100 };
        double[] doubleArray42 = new double[] { 1.0d, (short) 10, (short) 10, (-1L), 0, (byte) 100 };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 10.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 10.0, 10.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 10.0, 10.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 10.0, 10.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 10.0, 10.0, -1.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 10, (double) 0, (double) (short) -1);
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
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100, (double) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 10 };
        double[] doubleArray11 = new double[] { (short) 10 };
        double[] doubleArray13 = new double[] { (short) 10 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray14, (int) '#', (-1L));
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
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '#', 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8, (int) (short) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 1, (double) 0.0f, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0d, 1.0d };
        double[] doubleArray13 = new double[] { (-1.0f), 10.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray10, doubleArray13, (int) 'a', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0]");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 10, (double) 0, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 0, (double) (short) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1L) };
        double[] doubleArray13 = new double[] { 1, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 35.0, -1.0]");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10.0f, (double) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 0, 1.0f, 1.0d, 1L };
        double[] doubleArray17 = new double[] { (byte) 0, 1.0f, 1.0d, 1L };
        double[] doubleArray22 = new double[] { (byte) 0, 1.0f, 1.0d, 1L };
        double[] doubleArray27 = new double[] { (byte) 0, 1.0f, 1.0d, 1L };
        double[] doubleArray32 = new double[] { (byte) 0, 1.0f, 1.0d, 1L };
        double[] doubleArray37 = new double[] { (byte) 0, 1.0f, 1.0d, 1L };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray38, 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (short) 100, 0.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '#', 10.0f, (short) 1, (byte) 0, 100.0d, 100.0d };
        double[] doubleArray21 = new double[] { '#', 10.0f, (short) 1, (byte) 0, 100.0d, 100.0d };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray22, (int) (byte) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 10.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 10.0, 1.0, 0.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (-1), 0.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 100L, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 10L, '4', 1L, 100.0f };
        double[] doubleArray15 = new double[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray13, doubleArray15, (int) (short) 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 52.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0]");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) -1, (double) (byte) 10, (double) (short) 10);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100, 100L, (short) 0, 1L, (byte) 10, (short) 1 };
        double[] doubleArray21 = new double[] { 100, 100L, (short) 0, 1L, (byte) 10, (short) 1 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 0.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 0.0, 1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (-1.0d), 100.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 1, 0.0f, (byte) 100, (byte) 100, 0, 'a' };
        double[] doubleArray21 = new double[] { (byte) 1, 0.0f, (byte) 100, (byte) 100, 0, 'a' };
        double[] doubleArray28 = new double[] { (byte) 1, 0.0f, (byte) 100, (byte) 100, 0, 'a' };
        double[] doubleArray35 = new double[] { (byte) 1, 0.0f, (byte) 100, (byte) 100, 0, 'a' };
        double[] doubleArray42 = new double[] { (byte) 1, 0.0f, (byte) 100, (byte) 100, 0, 'a' };
        double[] doubleArray49 = new double[] { (byte) 1, 0.0f, (byte) 100, (byte) 100, 0, 'a' };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 100.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0, 100.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0, 100.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 0.0, 100.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 0.0, 100.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 0.0, 100.0, 100.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { '#' };
        double[] doubleArray15 = new double[] { (byte) 100, (-1.0f), (short) 100, 10.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray9, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[35.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0, 100.0, 10.0, 100.0]");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (-1.0d), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 100, 1.0f };
        double[] doubleArray13 = new double[] { (byte) 100, 1.0f };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray14, (int) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 'a', (double) 100.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1L, 10.0d, 1 };
        double[] doubleArray15 = new double[] { 1L, 10.0d, 1 };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 1 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray20, 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10.0f, (double) (byte) 10, (double) 0.0f);
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
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 1, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray11);
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
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1), (double) 0L, (double) (-1L));
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
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) (short) 1, (double) (byte) 0, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 1, (byte) 10, ' ' };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray11, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 0, (double) 0, (double) ' ');
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) ' ', (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray12);
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
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100.0d, 100, (-1), 1L, (byte) 0, 1.0d };
        double[] doubleArray19 = new double[] { 100, (byte) 1, (-1.0d), 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14, doubleArray19, (int) (byte) 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, -1.0, 1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 1.0, -1.0, 1.0]");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0d), 10, 0.0f };
        double[] doubleArray17 = new double[] { (byte) 1, (-1.0d), 10, 0.0f };
        double[] doubleArray22 = new double[] { (byte) 1, (-1.0d), 10, 0.0f };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 0, (double) (byte) 1, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), 0.0d, 0.0d);
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
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray20);
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
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0f), 100.0f };
        double[] doubleArray13 = new double[] { (-1.0f), 100.0f };
        double[] doubleArray16 = new double[] { (-1.0f), 100.0f };
        double[] doubleArray19 = new double[] { (-1.0f), 100.0f };
        double[] doubleArray22 = new double[] { (-1.0f), 100.0f };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray23);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 1, (double) (byte) 1, (double) '#');
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
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100.0f, (double) ' ', (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 100, 0, 100.0d, (-1.0f), (byte) -1 };
        double[] doubleArray19 = new double[] { (byte) 100, 0, 100.0d, (-1.0f), (byte) -1 };
        double[] doubleArray25 = new double[] { (byte) 100, 0, 100.0d, (-1.0f), (byte) -1 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 0.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 0.0, 100.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (short) 10, (double) (byte) 10, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray11);
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
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 100.0d, (double) (-1), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (byte) 100, (byte) -1, ' ', (byte) 1 };
        double[] doubleArray19 = new double[] { (-1L), (byte) 100, (byte) -1, ' ', (byte) 1 };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray20, 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, -1.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, -1.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 1L, (double) 0, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, (-1), (-1.0d), 10L, 10 };
        double[] doubleArray19 = new double[] { (short) 10, (-1), (-1.0d), 10L, 10 };
        double[] doubleArray25 = new double[] { (short) 10, (-1), (-1.0d), 10L, 10 };
        double[] doubleArray31 = new double[] { (short) 10, (-1), (-1.0d), 10L, 10 };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray32, 1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 0, (double) 0, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 'a' };
        double[] doubleArray11 = new double[] { 'a' };
        double[] doubleArray13 = new double[] { 'a' };
        double[] doubleArray15 = new double[] { 'a' };
        double[] doubleArray17 = new double[] { 'a' };
        double[] doubleArray19 = new double[] { 'a' };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray20, 1, (long) (short) 1);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100, (double) (-1.0f), (double) (short) 1);
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
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
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
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, (double) '4', (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10, (byte) 1 };
        double[] doubleArray12 = new double[] { 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray10, doubleArray12, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) '#', (double) (short) 1, (double) 100);
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0.0f, (double) (byte) 0, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, doubleArray10, (int) (short) 10, 10L);
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
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (-1), (double) '#', (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) 1, (double) 100, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0.0f };
        double[] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray9, doubleArray10, (int) '4', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (short) -1, 0.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 'a', 0.0d, 0.0f, (-1.0f), (short) -1, 10.0f };
        double[] doubleArray17 = new double[] { (short) 0, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray14, doubleArray17, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 0.0, 0.0, -1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0]");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, 10.0d, (double) ' ', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray8, (int) (byte) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10.0f, 1.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 1, (double) 100L, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, 100.0d, 0L, 100.0d };
        double[] doubleArray16 = new double[] { '#', (byte) 10, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray12, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[35.0, 10.0, 0.0]");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (-1.0d), 10.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, (int) (byte) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1, ' ', (-1.0f), 1, 10 };
        double[] doubleArray19 = new double[] { 1, ' ', (-1.0f), 1, 10 };
        double[] doubleArray25 = new double[] { 1, ' ', (-1.0f), 1, 10 };
        double[] doubleArray31 = new double[] { 1, ' ', (-1.0f), 1, 10 };
        double[] doubleArray37 = new double[] { 1, ' ', (-1.0f), 1, 10 };
        double[] doubleArray43 = new double[] { 1, ' ', (-1.0f), 1, 10 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray44, (int) (byte) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 32.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { ' ', (short) 10, (short) -1, 0 };
        double[] doubleArray17 = new double[] { ' ', (short) 10, (short) -1, 0 };
        double[][] doubleArray18 = new double[][] { doubleArray12, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 10.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) 100L, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 10, 1L, (-1) };
        double[] doubleArray14 = new double[] { (-1.0d), (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray11, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0]");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100.0f, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0d), ' ', 0L, ' ', 100 };
        double[] doubleArray19 = new double[] { (-1.0d), ' ', 0L, ' ', 100 };
        double[] doubleArray25 = new double[] { (-1.0d), ' ', 0L, ' ', 100 };
        double[] doubleArray31 = new double[] { (-1.0d), ' ', 0L, ' ', 100 };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray32, (int) (byte) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 32.0, 0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 32.0, 0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 32.0, 0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 32.0, 0.0, 32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) 1, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 100.0d, (short) 100, 100.0f, (short) 100, 1L, 1L };
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray14, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, 100.0, 100.0, 1.0, 1.0]");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (-1.0d), (double) (byte) 10, (double) '#');
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) -1 };
        double[] doubleArray11 = new double[] { (short) -1 };
        double[] doubleArray13 = new double[] { (short) -1 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14, (int) (short) 1, (long) (short) -1);
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (-1.0d), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 10, 0.0d, (-1L), (short) 100, 10.0f, 0 };
        double[] doubleArray21 = new double[] { (short) 10, 0.0d, (-1L), (short) 100, 10.0f, 0 };
        double[] doubleArray28 = new double[] { (short) 10, 0.0d, (-1L), (short) 100, 10.0f, 0 };
        double[] doubleArray35 = new double[] { (short) 10, 0.0d, (-1L), (short) 100, 10.0f, 0 };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, -1.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0, -1.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 0.0, -1.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 0.0, -1.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 100L, (double) '#', (double) (-1));
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
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 0.0f, (-1.0d), (double) '4');
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
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 1.0d, (double) (short) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (-1.0d), 10.0d, '#', 10.0d };
        double[] doubleArray17 = new double[] { (-1.0d), 10.0d, '#', 10.0d };
        double[] doubleArray22 = new double[] { (-1.0d), 10.0d, '#', 10.0d };
        double[] doubleArray27 = new double[] { (-1.0d), 10.0d, '#', 10.0d };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray28, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 10.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 10.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 10.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0, (double) (short) 1, (double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 0.0d, (double) 0, (double) (short) -1);
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
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) '4', (double) (short) -1, (double) '4');
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
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1), (double) 100.0f, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', 0.0d, (double) (byte) -1);
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
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) (short) 1, (double) (byte) 0, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray11 = new double[] { 10L };
        double[] doubleArray13 = new double[] { 10L };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray14, (int) (short) 10, (long) (byte) 100);
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
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100L, 0.0d, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1), (short) 100, (short) -1, 10.0d, 'a' };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray13, doubleArray14, (int) (short) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, -1.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
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
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0, (-1.0d), (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) -1, (byte) 10, 0.0f, 'a' };
        double[] doubleArray17 = new double[] { (short) 10, 100.0f, 10.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 10.0, 0.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 10.0, 35.0]");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10L, (double) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (byte) 100, (double) (-1L), (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) -1, (double) (byte) 100, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) -1, ' ', (byte) 1, (byte) 100 };
        double[] doubleArray17 = new double[] { (short) -1, ' ', (byte) 1, (byte) 100 };
        double[] doubleArray22 = new double[] { (short) -1, ' ', (byte) 1, (byte) 100 };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray23, (int) (byte) -1, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 100, 1.0d, 0.0d);
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
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 100L, (double) (byte) 0, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100, (byte) 100, (byte) -1, 10.0d };
        double[] doubleArray15 = new double[] { 0.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0]");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 10, (double) 1.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10.0f, (double) ' ', (double) (-1));
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
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) 10, (double) (short) 0, (double) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100, (double) '#', (double) (short) -1);
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
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 1, 10.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
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
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) 10, 1.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 0, 0L, (byte) 10, 10.0f, ' ', 'a' };
        double[] doubleArray16 = new double[] { 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray14, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 10.0, 10.0, 32.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0]");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray10, 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0]");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 0, (double) 0, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) '4', (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8, doubleArray9, 10, (long) (short) 10);
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
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0f, 100, (short) 0 };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray12, (int) (byte) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1), (double) 100.0f, (double) 1L);
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
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (short) 0, (double) 100, 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) (byte) 0, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '#', (double) '#', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 0 };
        double[] doubleArray11 = new double[] { (short) 0 };
        double[] doubleArray13 = new double[] { (short) 0 };
        double[] doubleArray15 = new double[] { (short) 0 };
        double[] doubleArray17 = new double[] { (short) 0 };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray18);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 0, (double) 0, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 'a', (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100.0f, 10.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10, (int) (short) -1, (long) '#');
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
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) (-1.0f), (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1.0d, ' ', 0L, '#' };
        double[] doubleArray17 = new double[] { 1.0d, ' ', 0L, '#' };
        double[] doubleArray22 = new double[] { 1.0d, ' ', 0L, '#' };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 32.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 32.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 32.0, 0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) -1, (double) (byte) 10, (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 10, (double) 1.0f, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (-1L), 0, 0L, 1.0d };
        double[] doubleArray18 = new double[] { (byte) -1, 100, 0.0f, 100.0d, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray12, doubleArray18, (int) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 0.0, 100.0, -1.0]");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 1L, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 10, 0 };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0]");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) -1, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1L), 1, 1.0d, 100.0d, ' ', 10 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray14, doubleArray15, (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 1.0, 100.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) 1, 100.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { 0.0d, 1L, (-1.0f), ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray14, (int) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, -1.0, 32.0, 35.0]");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, (byte) -1 };
        double[] doubleArray13 = new double[] { 1.0d, (byte) -1 };
        double[] doubleArray16 = new double[] { 1.0d, (byte) -1 };
        double[] doubleArray19 = new double[] { 1.0d, (byte) -1 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray20, 1, (long) '#');
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
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 10, (double) 'a', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1L, 100L };
        double[] doubleArray13 = new double[] { 1L, 100L };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) '4', (double) ' ', (double) 10.0f);
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
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1L, 10.0d, 0L, (short) -1, 0L };
        double[] doubleArray19 = new double[] { 1L, 10.0d, 0L, (short) -1, 0L };
        double[] doubleArray25 = new double[] { 1L, 10.0d, 0L, (short) -1, 0L };
        double[] doubleArray31 = new double[] { 1L, 10.0d, 0L, (short) -1, 0L };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 10.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 0.0d, (double) 0, (double) (short) -1);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray18, (int) (byte) 10, (long) (-1));
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
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (byte) -1, (double) 10, (double) (-1L));
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
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', 0.0d, (double) (short) -1, 100.0d);
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
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (-1.0f), (double) (byte) 10, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, (-1.0f), (byte) 10, 100L };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) 0L, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1L, 0, 'a', (short) 0, 10L, (short) 0 };
        double[] doubleArray21 = new double[] { 1L, 0, 'a', (short) 0, 10L, (short) 0 };
        double[] doubleArray28 = new double[] { 1L, 0, 'a', (short) 0, 10L, (short) 0 };
        double[] doubleArray35 = new double[] { 1L, 0, 'a', (short) 0, 10L, (short) 0 };
        double[] doubleArray42 = new double[] { 1L, 0, 'a', (short) 0, 10L, (short) 0 };
        double[] doubleArray49 = new double[] { 1L, 0, 'a', (short) 0, 10L, (short) 0 };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 0.0, 97.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 0.0, 97.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 0.0, 97.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 0.0, 97.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 0.0, 97.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 0.0, 97.0, 0.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '#', (double) (byte) 10, 100.0d);
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 10, (double) (short) 10, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 100, 'a' };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray10, doubleArray11, (int) '4', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 10, (double) 0, (double) (short) -1);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray13);
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
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 100L, 0.0d, (double) (byte) 1);
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
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', 0.0d, 0.0d, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10, (byte) 100, (short) 10 };
        double[] doubleArray15 = new double[] { 10, (byte) 100, (short) 10 };
        double[] doubleArray19 = new double[] { 10, (byte) 100, (short) 10 };
        double[] doubleArray23 = new double[] { 10, (byte) 100, (short) 10 };
        double[] doubleArray27 = new double[] { 10, (byte) 100, (short) 10 };
        double[] doubleArray31 = new double[] { 10, (byte) 100, (short) 10 };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray32, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 1, (-1.0d), 10, (byte) -1, '#', (byte) -1 };
        double[] doubleArray15 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray14, doubleArray15, 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 10.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) ' ', (double) (short) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1) };
        double[] doubleArray13 = new double[] { 1.0f, (short) -1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray9, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, -1.0, 10.0]");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 100L, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 'a', 0L, 100L, (short) 1 };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray12, doubleArray13, (int) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[97.0, 0.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 100L, (double) (byte) -1, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 0 };
        double[] doubleArray14 = new double[] { (-1L), '4', 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray9, doubleArray14, (int) (short) 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 52.0, 100.0, 32.0]");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) 0L, (double) '#');
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { ' ', 1.0d, (-1L), (byte) 100, 10.0f };
        double[] doubleArray17 = new double[] { 'a', 'a', 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 1.0, -1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[97.0, 97.0, 10.0]");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 1, 0.0d, (double) (byte) 100);
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
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (-1.0d), (double) (byte) 10, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 100, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) '4', (double) (short) -1, (double) 0.0f);
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) (-1.0f), (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, (int) '#', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10L, (double) 10L, (double) (-1));
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, (byte) 0 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray11, (int) '#', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (-1L), (double) 0, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0f, 1.0f };
        double[] doubleArray17 = new double[] { (short) 10, 1, 1, (byte) 1, (byte) 10, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 1.0, 1.0, 1.0, 10.0, 0.0]");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 10.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray11 = new double[] { 0.0d, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray11, 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0]");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) 100, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 10, 10L };
        double[] doubleArray14 = new double[] { (byte) 100, 0L, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray10, doubleArray14, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0, -1.0]");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, doubleArray10);
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (-1.0f), (double) '4', (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) -1, (-1L) };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 0L, (double) 0.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '#', 10.0d };
        double[] doubleArray17 = new double[] { '4', 1.0d, 10.0f, 0L, 1L, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray10, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 1.0, 10.0, 0.0, 1.0, -1.0]");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (-1.0f), (double) (byte) 10, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) (-1L), (double) (-1));
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100, (double) 100, 0.0d);
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1.0f, (double) 'a', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, doubleArray10, 0, (long) ' ');
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 10, (double) 10L, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, doubleArray10);
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 0, (double) 0, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 0.0d, (-1L), (-1.0f), ' ' };
        double[] doubleArray15 = new double[] { 0.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray12, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, -1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0]");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 'a', (double) (-1), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0L };
        double[] doubleArray14 = new double[] { 'a', 100L, 1L, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray9, doubleArray14, (int) (short) 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 1.0, 0.0]");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) ' ', (double) 0L, (double) (-1));
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray13, (int) ' ', (long) (byte) -1);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 0, (double) '4', (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 100, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1.0f), 0, (byte) -1, (byte) -1, (byte) 10, (short) 1 };
        double[] doubleArray21 = new double[] { (-1.0f), 0, (byte) -1, (byte) -1, (byte) 10, (short) 1 };
        double[] doubleArray28 = new double[] { (-1.0f), 0, (byte) -1, (byte) -1, (byte) 10, (short) 1 };
        double[] doubleArray35 = new double[] { (-1.0f), 0, (byte) -1, (byte) -1, (byte) 10, (short) 1 };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, -1.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, -1.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, -1.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, -1.0, -1.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) '4', (double) (-1L), 0.0d);
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (byte) 1, (double) 100.0f, 10.0d);
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0d, 100, '4', (byte) 0, (short) 0 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray14, (int) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 52.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 1.0d, (double) (byte) 100, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1), '#' };
        double[] doubleArray13 = new double[] { (-1), '#' };
        double[] doubleArray16 = new double[] { (-1), '#' };
        double[] doubleArray19 = new double[] { (-1), '#' };
        double[] doubleArray22 = new double[] { (-1), '#' };
        double[] doubleArray25 = new double[] { (-1), '#' };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 100, (double) (-1L), (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0f, 0.0f };
        double[] doubleArray12 = new double[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray10, doubleArray12, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0]");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 100, (double) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1.0f, (short) -1, 10L };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray12, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (byte) 10, (double) 100, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0, (short) 0 };
        double[] doubleArray14 = new double[] { (-1), 1.0f, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray10, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 1.0, 0.0]");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 10, (double) (short) -1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100.0f, 100, (-1), 10, (-1.0d) };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray13, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10.0f, 100.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 100 };
        double[] doubleArray15 = new double[] { 100.0d, '#', (short) 100, 100, 0L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray9, doubleArray15, 100, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 35.0, 100.0, 100.0, 0.0]");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100, (byte) -1, (byte) 0 };
        double[] doubleArray15 = new double[] { 100, (byte) -1, (byte) 0 };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray16, (int) (short) 10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 'a', (double) (-1.0f), (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1L, 1.0f, 0 };
        double[] doubleArray15 = new double[] { 1L, 1.0f, 0 };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray16, (int) (byte) -1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100L, (double) 10.0f, (double) (short) 100);
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, (double) (byte) 0, (double) 100L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (-1.0f), (double) (byte) 10, (double) 1L);
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (short) 1, (double) 10, (double) (short) 1);
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, 0.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 100, (-1L), 0.0f, 0L };
        double[] doubleArray17 = new double[] { ' ', (byte) -1, (byte) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray12, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, -1.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, -1.0, 0.0, 100.0]");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) ' ', 100.0d);
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', (double) (short) 10, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0, 1.0f, 10.0f };
        double[] doubleArray15 = new double[] { 0, 1.0f, 10.0f };
        double[] doubleArray19 = new double[] { 0, 1.0f, 10.0f };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (-1L), (double) (byte) 10, (double) 10);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 1.0d, (double) (-1.0f), (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 100, 0, (-1L), 1.0d, (-1), 10.0f };
        double[] doubleArray18 = new double[] { 0.0d, (-1.0d), 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray14, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0, -1.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 0.0]");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) -1, (double) '#', (double) 1);
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 1L, (double) 1L, (double) ' ');
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (short) 10, (double) (short) 0, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 100.0d };
        double[] doubleArray13 = new double[] { 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, (int) (byte) 0, (long) (byte) 1);
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 0.0d, (double) 0, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0.0f, (short) 100 };
        double[] doubleArray13 = new double[] { 0.0f, (short) 100 };
        double[] doubleArray16 = new double[] { 0.0f, (short) 100 };
        double[] doubleArray19 = new double[] { 0.0f, (short) 100 };
        double[] doubleArray22 = new double[] { 0.0f, (short) 100 };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray23, (int) (short) 10, (long) ' ');
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
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100, (double) (-1.0f), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 100, (-1.0d) };
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray10, doubleArray11, 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, -1.0]");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1), (double) '#', (double) 10L);
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (byte) -1, (double) 10, (double) (-1L));
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
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, (double) (-1L), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 0L, 1L, 1.0f, 100 };
        double[] doubleArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray12, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0, 1.0, 100.0]");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, 10.0d, (double) 1.0f, (double) '#');
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
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 0, (double) 0, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 0, 0.0d, (byte) 10 };
        double[] doubleArray14 = new double[] { (short) 100, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray11, doubleArray14, 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, -1.0]");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) ' ', (double) (byte) -1, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 0 };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray9, doubleArray10);
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 100, (double) 0L, (double) (byte) 100);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 1.0d, (double) (byte) 100, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 10L, (double) 10L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (-1.0f), (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray15 = new double[] { (byte) 10, 10L, 10L, 1, (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 10.0, 10.0, 1.0, 100.0, 35.0]");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1), 100.0f, (short) 0 };
        double[] doubleArray14 = new double[] { (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray11, doubleArray14, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 32.0]");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 1, (double) (byte) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0.0f };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray9, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
    }
}

