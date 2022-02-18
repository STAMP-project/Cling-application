import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str11, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException5, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", objArray9);
        java.lang.Class<?> wildcardClass12 = costException11.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.Class<?> wildcardClass10 = objArray8.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray14 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            convergenceException9.addSuppressed(throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13, 1, (long) '#');
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray22 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray16, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 1, (-1), 10.0d, 10 };
        double[] doubleArray17 = new double[] { (short) 1, (-1), 10.0d, 10 };
        double[] doubleArray22 = new double[] { (short) 1, (-1), 10.0d, 10 };
        double[] doubleArray27 = new double[] { (short) 1, (-1), 10.0d, 10 };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray28, (int) (byte) 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray21 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray13, doubleArray24, (-1), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 10.0d);
        double[] doubleArray17 = pointCostPair16.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        java.lang.Class<?> wildcardClass9 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray22 = new double[] { '#', 0, ' ', (byte) 100, (byte) 1, (-1.0f) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray13, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 0.0, 32.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair6 = nelderMead0.minimize(costFunction1, (int) (byte) 1, convergenceChecker3, randomVectorGenerator4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        java.lang.Class<?> wildcardClass11 = convergenceException9.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("", objArray6);
        java.lang.Class<?> wildcardClass9 = convergenceException8.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        double[] doubleArray8 = pointCostPair7.getPoint();
        java.lang.Class<?> wildcardClass9 = pointCostPair7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[] doubleArray19 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[] doubleArray25 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[] doubleArray31 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[] doubleArray37 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[] doubleArray43 = new double[] { (byte) -1, 10, 100L, (byte) 10, (short) -1 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray44, (int) (short) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) -1, (short) 0 };
        double[] doubleArray13 = new double[] { (byte) -1, (short) 0 };
        double[] doubleArray16 = new double[] { (byte) -1, (short) 0 };
        double[] doubleArray19 = new double[] { (byte) -1, (short) 0 };
        double[] doubleArray22 = new double[] { (byte) -1, (short) 0 };
        double[] doubleArray25 = new double[] { (byte) -1, (short) 0 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray26, (int) (short) 0, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.String str1 = notPositiveDefiniteMatrixException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str1, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.String str5 = notPositiveDefiniteMatrixException1.getPattern();
        java.lang.Class<?> wildcardClass6 = notPositiveDefiniteMatrixException1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not positive definite matrix" + "'", str5, "not positive definite matrix");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair6 = nelderMead0.minimize(costFunction1, (int) 'a', convergenceChecker3, randomVectorGenerator4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", objArray10);
        java.lang.Class<?> wildcardClass13 = costException12.getClass();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("hi!", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { wildcardClass13, 'a', (-1.0f), "not positive definite matrix", costException25 };
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", objArray27);
        java.lang.String str29 = convergenceException28.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str29, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 0, 1, 0.0f, (byte) -1 };
        double[] doubleArray17 = new double[] { (short) 0, 1, 0.0f, (byte) -1 };
        double[] doubleArray22 = new double[] { (short) 0, 1, 0.0f, (byte) -1 };
        double[] doubleArray27 = new double[] { (short) 0, 1, 0.0f, (byte) -1 };
        double[] doubleArray32 = new double[] { (short) 0, 1, 0.0f, (byte) -1 };
        double[] doubleArray37 = new double[] { (short) 0, 1, 0.0f, (byte) -1 };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray38, (int) ' ', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray19 = new double[] { 10.0f, 10.0f, (short) -1 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray13, doubleArray19, 10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0, -1.0]");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair5 = nelderMead0.minimize(costFunction1, (int) '4', convergenceChecker3, randomVectorGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException(throwable0);
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException1);
        java.lang.String str3 = convergenceException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.ConvergenceException" + "'", str3, "org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0, (-1L), 0.0d, (-1.0d), (byte) 0, (-1L) };
        double[] doubleArray21 = new double[] { 0, (-1L), 0.0d, (-1.0d), (byte) 0, (-1L) };
        double[] doubleArray28 = new double[] { 0, (-1L), 0.0d, (-1.0d), (byte) 0, (-1L) };
        double[] doubleArray35 = new double[] { 0, (-1L), 0.0d, (-1.0d), (byte) 0, (-1L) };
        double[] doubleArray42 = new double[] { 0, (-1L), 0.0d, (-1.0d), (byte) 0, (-1L) };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, -1.0, 0.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 0.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, -1.0, 0.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, -1.0, 0.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, -1.0, 0.0, -1.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray9 = new double[] { 0, 1L, (short) 10, 0, 1 };
        double[] doubleArray15 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 10.0d);
        double[] doubleArray18 = pointCostPair17.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead0.minimize(costFunction1, (int) (byte) 1, convergenceChecker3, doubleArray9, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0, 10.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 100);
        double[] doubleArray23 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray13, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException8);
        java.lang.Object[] objArray10 = costException8.getArguments();
        java.lang.Class<?> wildcardClass11 = objArray10.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.String str8 = costException7.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str8, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        double double8 = pointCostPair7.getCost();
        java.lang.Class<?> wildcardClass9 = pointCostPair7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException4);
        java.lang.Class<?> wildcardClass6 = costException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException5, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("hi!", objArray17);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException(throwable19);
        java.lang.String str21 = convergenceException20.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray17, (java.lang.Throwable) convergenceException20);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray9, (java.lang.Throwable) convergenceException20);
        java.lang.String str24 = convergenceException23.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str24, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        java.lang.Throwable[] throwableArray7 = costException6.getSuppressed();
        java.lang.String str8 = costException6.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str8, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.String str4 = notPositiveDefiniteMatrixException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str4, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray9 = new double[] { (-1L), (-1), (-1.0f), 1L, 0 };
        double[] doubleArray15 = new double[] { (-1L), (-1), (-1.0f), 1L, 0 };
        double[] doubleArray21 = new double[] { (-1L), (-1), (-1.0f), 1L, 0 };
        double[][] doubleArray22 = new double[][] { doubleArray9, doubleArray15, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead0.minimize(costFunction1, (int) (byte) 0, convergenceChecker3, doubleArray22, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 100, (short) 0, 10.0d, (-1L), 1L, 10.0d };
        double[] doubleArray21 = new double[] { (byte) 100, (short) 0, 10.0d, (-1L), 1L, 10.0d };
        double[] doubleArray28 = new double[] { (byte) 100, (short) 0, 10.0d, (-1L), 1L, 10.0d };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray29, (int) '4', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0, 10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, 10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 0.0, 10.0, -1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray6 = new double[] { 1, (-1) };
        double[] doubleArray9 = new double[] { 1, (-1) };
        double[] doubleArray12 = new double[] { 1, (-1) };
        double[] doubleArray15 = new double[] { 1, (-1) };
        double[][] doubleArray16 = new double[][] { doubleArray6, doubleArray9, doubleArray12, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead0.minimize(costFunction1, (int) (byte) -1, convergenceChecker3, doubleArray16, 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException10);
        java.lang.String str12 = costException11.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.optimization.CostException: not positive definite matrix" + "'", str12, "org.apache.commons.math.optimization.CostException: not positive definite matrix");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("", objArray6);
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        convergenceException8.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException8);
        java.lang.Class<?> wildcardClass16 = convergenceException8.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 100);
        double[] doubleArray19 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray13, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray13, 100, 0L);
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
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
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100L, (short) 0, (short) 10 };
        double[] doubleArray15 = new double[] { 100L, (short) 0, (short) 10 };
        double[] doubleArray19 = new double[] { 100L, (short) 0, (short) 10 };
        double[] doubleArray23 = new double[] { 100L, (short) 0, (short) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double double17 = pointCostPair15.getCost();
        double double18 = pointCostPair15.getCost();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray26 = new double[] { '#', 0, ' ', (byte) 100, (byte) 1, (-1.0f) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray19, doubleArray26, (int) (short) 1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[35.0, 0.0, 32.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 10, 1.0f, (-1.0f), 'a', (byte) 0 };
        double[] doubleArray19 = new double[] { (byte) 10, 1.0f, (-1.0f), 'a', (byte) 0 };
        double[] doubleArray25 = new double[] { (byte) 10, 1.0f, (-1.0f), 'a', (byte) 0 };
        double[] doubleArray31 = new double[] { (byte) 10, 1.0f, (-1.0f), 'a', (byte) 0 };
        double[] doubleArray37 = new double[] { (byte) 10, 1.0f, (-1.0f), 'a', (byte) 0 };
        double[][] doubleArray38 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, -1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, -1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0, -1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 1.0, -1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 1.0, -1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '4', 0L };
        double[] doubleArray13 = new double[] { '4', 0L };
        double[] doubleArray16 = new double[] { '4', 0L };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException10);
        java.lang.Throwable[] throwableArray12 = costException10.getSuppressed();
        java.lang.String str13 = costException10.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.optimization.CostException: not positive definite matrix" + "'", str13, "org.apache.commons.math.optimization.CostException: not positive definite matrix");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair5 = nelderMead0.minimize(costFunction1, 1, convergenceChecker3, randomVectorGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray9 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, (double) (short) 0);
        double[] doubleArray19 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 10.0d);
        double[] doubleArray22 = pointCostPair21.getPoint();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray25 = pointCostPair21.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead0.minimize(costFunction1, (int) (byte) 10, convergenceChecker3, doubleArray9, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '#', 0, ' ', (byte) 100, (byte) 1, (-1.0f) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 10.0d);
        double[] doubleArray22 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        double double25 = pointCostPair24.getCost();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray27 = pointCostPair24.getPoint();
        double[] doubleArray28 = pointCostPair24.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 0.0, 32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException2 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException1.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        org.apache.commons.math.optimization.CostException costException4 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        java.lang.String str6 = notPositiveDefiniteMatrixException2.getPattern();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException7 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray8 = new java.lang.Object[] { notPositiveDefiniteMatrixException2, notPositiveDefiniteMatrixException7 };
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray8, throwable9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException10);
        java.lang.String str12 = convergenceException10.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "not positive definite matrix" + "'", str6, "not positive definite matrix");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix, org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix, org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str12, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { '#', '4', ' ', (short) 1 };
        double[] doubleArray17 = new double[] { '#', '4', ' ', (short) 1 };
        double[] doubleArray22 = new double[] { '#', '4', ' ', (short) 1 };
        double[] doubleArray27 = new double[] { '#', '4', ' ', (short) 1 };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 52.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[35.0, 52.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[35.0, 52.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[35.0, 52.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, (byte) -1, 10, 0L, 100 };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray14, (int) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair5 = nelderMead0.minimize(costFunction1, (int) 'a', convergenceChecker3, randomVectorGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, 100.0d, 0L, 10.0f, 10.0f };
        double[] doubleArray19 = new double[] { (short) 10, 100.0d, 0L, 10.0f, 10.0f };
        double[] doubleArray25 = new double[] { (short) 10, 100.0d, 0L, 10.0f, 10.0f };
        double[] doubleArray31 = new double[] { (short) 10, 100.0d, 0L, 10.0f, 10.0f };
        double[] doubleArray37 = new double[] { (short) 10, 100.0d, 0L, 10.0f, 10.0f };
        double[][] doubleArray38 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray38, 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0, 0.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair6 = nelderMead0.minimize(costFunction1, (int) (short) 0, convergenceChecker3, randomVectorGenerator4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException8);
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            convergenceException9.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 100);
        double[] doubleArray23 = pointCostPair22.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray13, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1.0d };
        double[] doubleArray11 = new double[] { 1.0d };
        double[] doubleArray13 = new double[] { 1.0d };
        double[] doubleArray15 = new double[] { 1.0d };
        double[] doubleArray17 = new double[] { 1.0d };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray18);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair6 = nelderMead0.minimize(costFunction1, (int) (short) 10, convergenceChecker3, randomVectorGenerator4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray10);
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
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
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
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        java.lang.Object[] objArray10 = costException9.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException9);
        java.lang.Class<?> wildcardClass12 = costException9.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray9, (int) ' ', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray14);
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
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable[] throwableArray3 = convergenceException2.getSuppressed();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("hi!", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException12);
        java.lang.Object[] objArray14 = costException12.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) costException12);
        java.lang.Class<?> wildcardClass16 = costException12.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
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
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        java.lang.Object[] objArray10 = costException9.getArguments();
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", objArray10);
        java.lang.String str12 = costException11.getPattern();
        java.lang.String str13 = costException11.getPattern();
        java.lang.Class<?> wildcardClass14 = costException11.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str12, "org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str13, "org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { '#', 0, ' ', (byte) 100, (byte) 1, (-1.0f) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray15, (int) (short) 0, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[35.0, 0.0, 32.0, 100.0, 1.0, -1.0]");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (-1), 0, 0.0f, 0.0d, 100.0d, (short) 10 };
        double[] doubleArray21 = new double[] { (-1), 0, 0.0f, 0.0d, 100.0d, (short) 10 };
        double[] doubleArray28 = new double[] { (-1), 0, 0.0f, 0.0d, 100.0d, (short) 10 };
        double[] doubleArray35 = new double[] { (-1), 0, 0.0f, 0.0d, 100.0d, (short) 10 };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0, 0.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0, 0.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0, 0.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0, 0.0, 0.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
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
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '#', 0, ' ', (byte) 100, (byte) 1, (-1.0f) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 10.0d);
        double[] doubleArray22 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        double[] doubleArray25 = pointCostPair24.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray14, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 0.0, 32.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
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
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        double[] doubleArray20 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 10.0d);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray14, doubleArray24, (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray10, (int) (short) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, 0.0d);
        double[] doubleArray18 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray8, doubleArray23, (int) '4', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Throwable[] throwableArray14 = notPositiveDefiniteMatrixException10.getSuppressed();
        convergenceException8.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.String str16 = convergenceException8.toString();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: " + "'", str16, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray18, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray8 = new double[] { 1.0d, 0.0f, (short) 100, 0 };
        double[] doubleArray13 = new double[] { 1.0d, 0.0f, (short) 100, 0 };
        double[] doubleArray18 = new double[] { 1.0d, 0.0f, (short) 100, 0 };
        double[] doubleArray23 = new double[] { 1.0d, 0.0f, (short) 100, 0 };
        double[][] doubleArray24 = new double[][] { doubleArray8, doubleArray13, doubleArray18, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead0.minimize(costFunction1, (int) (short) 100, convergenceChecker3, doubleArray24, 10, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, 0.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        java.lang.Throwable[] throwableArray7 = costException6.getSuppressed();
        java.lang.String str8 = costException6.getPattern();
        java.lang.Class<?> wildcardClass9 = costException6.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair6 = nelderMead0.minimize(costFunction1, 0, convergenceChecker3, randomVectorGenerator4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray10);
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
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray11, (-1), 0L);
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
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray5 = new double[] { 10L };
        double[] doubleArray7 = new double[] { 10L };
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray11 = new double[] { 10L };
        double[] doubleArray13 = new double[] { 10L };
        double[][] doubleArray14 = new double[][] { doubleArray5, doubleArray7, doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead0.minimize(costFunction1, 0, convergenceChecker3, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0L, (-1), '4', (byte) 10, '#' };
        double[] doubleArray19 = new double[] { 0L, (-1), '4', (byte) 10, '#' };
        double[] doubleArray25 = new double[] { 0L, (-1), '4', (byte) 10, '#' };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, 52.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, 52.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 52.0, 10.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray29 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 10.0d);
        double[] doubleArray32 = pointCostPair31.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray23, doubleArray32, 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair4 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) 100);
        double[] doubleArray5 = pointCostPair4.getPoint();
        double[] doubleArray6 = pointCostPair4.getPoint();
        double double7 = pointCostPair4.getCost();
        java.lang.Class<?> wildcardClass8 = pointCostPair4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable[] throwableArray3 = convergenceException2.getSuppressed();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("hi!", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException12);
        java.lang.Object[] objArray14 = costException12.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) costException12);
        java.lang.String str16 = costException12.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str16, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 'a', 1.0f, (-1) };
        double[] doubleArray15 = new double[] { 'a', 1.0f, (-1) };
        double[] doubleArray19 = new double[] { 'a', 1.0f, (-1) };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray20, 0, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Throwable[] throwableArray14 = notPositiveDefiniteMatrixException10.getSuppressed();
        convergenceException8.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Class<?> wildcardClass16 = notPositiveDefiniteMatrixException10.getClass();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable[] throwableArray3 = convergenceException2.getSuppressed();
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("hi!", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException12);
        java.lang.Object[] objArray14 = costException12.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray3, (java.lang.Throwable) costException12);
        java.lang.String str16 = convergenceException15.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException" + "'", str16, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        java.lang.Object[] objArray10 = costException8.getArguments();
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException(throwable16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException17, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray21);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", objArray21);
        java.lang.Class<?> wildcardClass24 = costException23.getClass();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException("hi!", objArray34);
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException36);
        java.lang.Object[] objArray38 = new java.lang.Object[] { wildcardClass24, 'a', (-1.0f), "not positive definite matrix", costException36 };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", objArray38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException39);
        costException8.addSuppressed((java.lang.Throwable) convergenceException40);
        java.lang.Object[] objArray42 = convergenceException40.getArguments();
        java.lang.Class<?> wildcardClass43 = objArray42.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
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
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Class<?> wildcardClass4 = convergenceException3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray9 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, 10.0d);
        double[] doubleArray12 = pointCostPair11.getPoint();
        double[] doubleArray18 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        double[] doubleArray21 = pointCostPair20.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead0.minimize(costFunction1, (int) (short) 0, convergenceChecker3, doubleArray12, doubleArray21, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException5, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("hi!", objArray17);
        java.lang.Throwable throwable19 = null;
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException(throwable19);
        java.lang.String str21 = convergenceException20.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray17, (java.lang.Throwable) convergenceException20);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray9, (java.lang.Throwable) convergenceException20);
        java.lang.String str24 = convergenceException20.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ConvergenceException" + "'", str24, "org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray19 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 10.0d);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13, doubleArray23, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray15 = convergenceException14.getArguments();
        java.lang.String str16 = convergenceException14.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str16, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray18 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray8, doubleArray18, (int) (short) 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException8);
        java.lang.Object[] objArray10 = convergenceException9.getArguments();
        java.lang.String str11 = convergenceException9.getPattern();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str11, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
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
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray14);
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
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
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
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 10, 0.0f, 10, (byte) 10, (short) 0 };
        double[] doubleArray19 = new double[] { (byte) 10, 0.0f, 10, (byte) 10, (short) 0 };
        double[] doubleArray25 = new double[] { (byte) 10, 0.0f, 10, (byte) 10, (short) 0 };
        double[] doubleArray31 = new double[] { (byte) 10, 0.0f, 10, (byte) 10, (short) 0 };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray32, (int) 'a', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 0.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 0.0, 10.0, 10.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, 'a', '#', (short) 1, 10.0d };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14, (int) (short) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 97.0, 35.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException2 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException1.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        org.apache.commons.math.optimization.CostException costException4 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        java.lang.String str6 = notPositiveDefiniteMatrixException2.getPattern();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException7 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray8 = new java.lang.Object[] { notPositiveDefiniteMatrixException2, notPositiveDefiniteMatrixException7 };
        java.lang.Throwable throwable9 = null;
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray8, throwable9);
        java.lang.Class<?> wildcardClass11 = objArray8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "not positive definite matrix" + "'", str6, "not positive definite matrix");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix, org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix, org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("hi!", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray10);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray10);
        java.lang.Object[] objArray16 = convergenceException15.getArguments();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException17 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("hi!", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray24);
        notPositiveDefiniteMatrixException17.addSuppressed((java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: not positive definite matrix", objArray16, (java.lang.Throwable) convergenceException26);
        java.lang.String str29 = convergenceException28.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str29, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.apache.commons.math.ConvergenceException convergenceException0 = new org.apache.commons.math.ConvergenceException();
        java.lang.String str1 = convergenceException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "org.apache.commons.math.ConvergenceException: Convergence failed" + "'", str1, "org.apache.commons.math.ConvergenceException: Convergence failed");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10L, (-1), 0L, (-1), 1.0d };
        double[] doubleArray19 = new double[] { 10L, (-1), 0L, (-1), 1.0d };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray20, (int) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 0.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) -1, 1.0d, 0.0f };
        double[] doubleArray17 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 10.0d);
        double[] doubleArray20 = pointCostPair19.getPoint();
        double[] doubleArray21 = pointCostPair19.getPoint();
        double[] doubleArray22 = pointCostPair19.getPoint();
        double[] doubleArray23 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray11, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
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
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray24 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        double double27 = pointCostPair26.getCost();
        double[] doubleArray28 = pointCostPair26.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray18, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
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
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
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
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 0, 1.0f, (-1L), 10.0d };
        double[] doubleArray19 = new double[] { (byte) 10, (byte) 0, 1.0f, (-1L), 10.0d };
        double[] doubleArray25 = new double[] { (byte) 10, (byte) 0, 1.0f, (-1L), 10.0d };
        double[] doubleArray31 = new double[] { (byte) 10, (byte) 0, 1.0f, (-1L), 10.0d };
        double[] doubleArray37 = new double[] { (byte) 10, (byte) 0, 1.0f, (-1L), 10.0d };
        double[] doubleArray43 = new double[] { (byte) 10, (byte) 0, 1.0f, (-1L), 10.0d };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray44, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 0.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 0.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 0.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 0.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, 0.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.Throwable[] throwableArray8 = costException6.getSuppressed();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Object[] objArray12 = notPositiveDefiniteMatrixException10.getArguments();
        costException6.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Class<?> wildcardClass14 = costException6.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray29 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 10.0d);
        double[] doubleArray32 = pointCostPair31.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray23, doubleArray32, 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException0);
        java.lang.Class<?> wildcardClass4 = notPositiveDefiniteMatrixException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, 100 };
        double[] doubleArray13 = new double[] { 100.0f, 100 };
        double[] doubleArray16 = new double[] { 100.0f, 100 };
        double[] doubleArray19 = new double[] { 100.0f, 100 };
        double[] doubleArray22 = new double[] { 100.0f, 100 };
        double[] doubleArray25 = new double[] { 100.0f, 100 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray26, 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 100);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray30 = pointCostPair28.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray23, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        double[] doubleArray20 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 10.0d);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double[] doubleArray25 = pointCostPair22.getPoint();
        double[] doubleArray26 = pointCostPair22.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray14, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray10);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException(throwable14);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException(throwable16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException17);
        convergenceException15.addSuppressed((java.lang.Throwable) convergenceException17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", objArray10, (java.lang.Throwable) convergenceException15);
        java.lang.Class<?> wildcardClass22 = convergenceException15.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException12);
        java.lang.Object[] objArray14 = convergenceException12.getArguments();
        java.lang.String str15 = convergenceException12.getPattern();
        java.lang.Class<?> wildcardClass16 = convergenceException12.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (short) 10 };
        double[] doubleArray11 = new double[] { (short) 10 };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray12, (int) ' ', (long) (byte) 10);
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
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
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
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray6 = new double[] { 0L, 1L };
        double[] doubleArray9 = new double[] { 0L, 1L };
        double[] doubleArray12 = new double[] { 0L, 1L };
        double[][] doubleArray13 = new double[][] { doubleArray6, doubleArray9, doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead0.minimize(costFunction1, (int) (short) 10, convergenceChecker3, doubleArray13, (int) '4', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 1L, 100L, 0L };
        double[] doubleArray15 = new double[] { 1L, 100L, 0L };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray16, (int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 10, (-1.0d), '#', 10.0f, 100L, '4' };
        double[] doubleArray21 = new double[] { (short) 10, (-1.0d), '#', 10.0f, 100L, '4' };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, -1.0, 35.0, 10.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, -1.0, 35.0, 10.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException8);
        java.lang.Object[] objArray10 = costException8.getArguments();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("hi!", objArray18);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray18);
        java.lang.Object[] objArray21 = costException20.getArguments();
        org.apache.commons.math.optimization.CostException costException22 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", objArray21);
        java.lang.String str23 = costException22.getPattern();
        costException8.addSuppressed((java.lang.Throwable) costException22);
        java.lang.Class<?> wildcardClass25 = costException22.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str23, "org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 0L, (byte) 1, 10.0f, 100.0f };
        double[] doubleArray17 = new double[] { 0L, (byte) 1, 10.0f, 100.0f };
        double[] doubleArray22 = new double[] { 0L, (byte) 1, 10.0f, 100.0f };
        double[] doubleArray27 = new double[] { 0L, (byte) 1, 10.0f, 100.0f };
        double[][] doubleArray28 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray28, (int) (byte) 0, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 1.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) '4');
        double[] doubleArray23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, doubleArray23, 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 0, 100, 1, 100, (short) 100, 100L };
        double[] doubleArray21 = new double[] { (byte) 0, 100, 1, 100, (short) 100, 100L };
        double[] doubleArray28 = new double[] { (byte) 0, 100, 1, 100, (short) 100, 100L };
        double[] doubleArray35 = new double[] { (byte) 0, 100, 1, 100, (short) 100, 100L };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray36, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 1.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 100.0, 1.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 1.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 100.0, 1.0, 100.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { ' ', 100 };
        double[] doubleArray13 = new double[] { ' ', 100 };
        double[] doubleArray16 = new double[] { ' ', 100 };
        double[] doubleArray19 = new double[] { ' ', 100 };
        double[] doubleArray22 = new double[] { ' ', 100 };
        double[] doubleArray25 = new double[] { ' ', 100 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        double[] doubleArray22 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray27 = pointCostPair24.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        double[] doubleArray8 = pointCostPair7.getPoint();
        double[] doubleArray9 = pointCostPair7.getPoint();
        double[] doubleArray10 = pointCostPair7.getPoint();
        double[] doubleArray11 = pointCostPair7.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray11, (double) 100.0f);
        double double14 = pointCostPair13.getCost();
        double double15 = pointCostPair13.getCost();
        java.lang.Class<?> wildcardClass16 = pointCostPair13.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException(throwable6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException7, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", objArray11);
        java.lang.Class<?> wildcardClass14 = costException13.getClass();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("hi!", objArray24);
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { wildcardClass14, 'a', (-1.0f), "not positive definite matrix", costException26 };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException30);
        java.lang.Object[] objArray32 = convergenceException30.getArguments();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException("hi!", objArray39);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray39);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException41);
        java.lang.Object[] objArray43 = costException41.getArguments();
        java.lang.Throwable throwable49 = null;
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException(throwable49);
        java.lang.Object[] objArray54 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException50, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("", objArray54);
        org.apache.commons.math.optimization.CostException costException56 = new org.apache.commons.math.optimization.CostException("", objArray54);
        java.lang.Class<?> wildcardClass57 = costException56.getClass();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException68 = new org.apache.commons.math.optimization.CostException("hi!", objArray67);
        org.apache.commons.math.optimization.CostException costException69 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException68);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException69);
        java.lang.Object[] objArray71 = new java.lang.Object[] { wildcardClass57, 'a', (-1.0f), "not positive definite matrix", costException69 };
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("hi!", objArray71);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException72);
        costException41.addSuppressed((java.lang.Throwable) convergenceException73);
        java.lang.Throwable throwable75 = null;
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException(throwable75);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException76);
        org.apache.commons.math.optimization.CostException costException78 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException77);
        convergenceException73.addSuppressed((java.lang.Throwable) costException78);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray32, (java.lang.Throwable) convergenceException73);
        java.lang.String str81 = convergenceException73.toString();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str81, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", objArray10);
        java.lang.Class<?> wildcardClass13 = costException12.getClass();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("hi!", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { wildcardClass13, 'a', (-1.0f), "not positive definite matrix", costException25 };
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", objArray27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException28);
        java.lang.String str30 = convergenceException29.getPattern();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        double[] doubleArray20 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 10.0d);
        double[] doubleArray27 = pointCostPair26.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray14, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair6 = nelderMead0.minimize(costFunction1, (-1), convergenceChecker3, randomVectorGenerator4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray7);
        java.lang.Class<?> wildcardClass11 = objArray7.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = pointCostPair15.getPoint();
        double[] doubleArray21 = pointCostPair15.getPoint();
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray21, doubleArray22, (int) (short) 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray17 = new double[] { 10.0f, 10.0f, (short) -1 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair20 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray13, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 10.0, -1.0]");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 100);
        double[] doubleArray23 = pointCostPair22.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray17, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException0);
        java.lang.String str4 = notPositiveDefiniteMatrixException0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str4, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray20 = pointCostPair19.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray30 = pointCostPair28.getPoint();
        double[] doubleArray31 = pointCostPair28.getPoint();
        double[] doubleArray32 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray20, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
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
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray12 = costException11.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException11);
        java.lang.Object[] objArray14 = costException11.getArguments();
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException", objArray14);
        java.lang.Class<?> wildcardClass17 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        java.lang.Object[] objArray7 = costException6.getArguments();
        java.lang.Throwable[] throwableArray8 = costException6.getSuppressed();
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.String str10 = costException6.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str10, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (-1), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray24 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 0);
        double double29 = pointCostPair28.getCost();
        double double30 = pointCostPair28.getCost();
        double[] doubleArray31 = pointCostPair28.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray18, doubleArray31, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
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
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        java.lang.Object[] objArray10 = costException9.getArguments();
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", objArray10);
        java.lang.String str12 = costException11.getPattern();
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        java.lang.String str14 = costException11.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str12, "org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!" + "'", str14, "org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray18 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (short) 0);
        double double23 = pointCostPair22.getCost();
        double double24 = pointCostPair22.getCost();
        double[] doubleArray25 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, doubleArray25, (int) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Class<?> wildcardClass3 = notPositiveDefiniteMatrixException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair4 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, 0.0d);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
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
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray25 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        double[] doubleArray30 = pointCostPair27.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1) };
        double[] doubleArray11 = new double[] { (-1) };
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray15 = new double[] { (-1) };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray16);
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
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
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
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray30 = pointCostPair28.getPoint();
        double[] doubleArray31 = pointCostPair28.getPoint();
        double[] doubleArray32 = pointCostPair28.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, doubleArray32, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, 10.0f };
        double[] doubleArray13 = new double[] { 1.0d, 10.0f };
        double[] doubleArray16 = new double[] { 1.0d, 10.0f };
        double[] doubleArray19 = new double[] { 1.0d, 10.0f };
        double[] doubleArray22 = new double[] { 1.0d, 10.0f };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray23, (int) (short) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        java.lang.Throwable[] throwableArray8 = costException7.getSuppressed();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("hi!", objArray15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray15);
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException17);
        java.lang.Object[] objArray19 = costException17.getArguments();
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException(throwable25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException26, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("", objArray30);
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException("", objArray30);
        java.lang.Class<?> wildcardClass33 = costException32.getClass();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException44 = new org.apache.commons.math.optimization.CostException("hi!", objArray43);
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException45);
        java.lang.Object[] objArray47 = new java.lang.Object[] { wildcardClass33, 'a', (-1.0f), "not positive definite matrix", costException45 };
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!", objArray47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException48);
        costException17.addSuppressed((java.lang.Throwable) convergenceException49);
        java.lang.Throwable throwable51 = null;
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException(throwable51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException52);
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException53);
        convergenceException49.addSuppressed((java.lang.Throwable) costException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException49);
        java.lang.Object[] objArray57 = convergenceException56.getArguments();
        java.lang.Class<?> wildcardClass58 = objArray57.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray13);
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        java.lang.Class<?> wildcardClass11 = costException10.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.optimization.CostException costException1 = new org.apache.commons.math.optimization.CostException(throwable0);
        java.lang.String str2 = costException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.optimization.CostException" + "'", str2, "org.apache.commons.math.optimization.CostException");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray24 = new double[] { 100, '#', 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray19, doubleArray24, (int) (short) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[100.0, 35.0, 10.0, 1.0]");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Throwable) costException9);
        java.lang.String str12 = convergenceException11.toString();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException" + "'", str12, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException2 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException1.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException2);
        java.lang.Object[] objArray4 = notPositiveDefiniteMatrixException2.getArguments();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("hi!", objArray14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", objArray14);
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", objArray4, (java.lang.Throwable) convergenceException19);
        java.lang.String str21 = convergenceException19.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str21, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0f) };
        double[] doubleArray11 = new double[] { (-1.0f) };
        double[] doubleArray13 = new double[] { (-1.0f) };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray14, 1, (long) 10);
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
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Class<?> wildcardClass4 = notPositiveDefiniteMatrixException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
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
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, (double) 100);
        double[] doubleArray14 = pointCostPair13.getPoint();
        double[] doubleArray15 = pointCostPair13.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, doubleArray15, (int) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        java.lang.String str10 = costException9.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.optimization.CostException: not positive definite matrix" + "'", str10, "org.apache.commons.math.optimization.CostException: not positive definite matrix");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100);
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray26 = pointCostPair24.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray19, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray12 = costException11.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException14);
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        java.lang.Class<?> wildcardClass17 = convergenceException15.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        java.lang.String str10 = convergenceException7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: " + "'", str10, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException7);
        java.lang.Throwable[] throwableArray9 = costException7.getSuppressed();
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException(throwable10);
        java.lang.String str12 = convergenceException11.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        java.lang.String str14 = convergenceException13.getPattern();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.apache.commons.math.optimization.CostException: not positive definite matrix" + "'", str14, "org.apache.commons.math.optimization.CostException: not positive definite matrix");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (short) -1);
        double[] doubleArray25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20, doubleArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException(throwable6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException7, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", objArray11);
        java.lang.Class<?> wildcardClass14 = costException13.getClass();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("hi!", objArray24);
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { wildcardClass14, 'a', (-1.0f), "not positive definite matrix", costException26 };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException30);
        java.lang.Object[] objArray32 = convergenceException30.getArguments();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException("hi!", objArray39);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray39);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException41);
        java.lang.Object[] objArray43 = costException41.getArguments();
        java.lang.Throwable throwable49 = null;
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException(throwable49);
        java.lang.Object[] objArray54 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException50, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("", objArray54);
        org.apache.commons.math.optimization.CostException costException56 = new org.apache.commons.math.optimization.CostException("", objArray54);
        java.lang.Class<?> wildcardClass57 = costException56.getClass();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException68 = new org.apache.commons.math.optimization.CostException("hi!", objArray67);
        org.apache.commons.math.optimization.CostException costException69 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException68);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException69);
        java.lang.Object[] objArray71 = new java.lang.Object[] { wildcardClass57, 'a', (-1.0f), "not positive definite matrix", costException69 };
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("hi!", objArray71);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException72);
        costException41.addSuppressed((java.lang.Throwable) convergenceException73);
        java.lang.Throwable throwable75 = null;
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException(throwable75);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException76);
        org.apache.commons.math.optimization.CostException costException78 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException77);
        convergenceException73.addSuppressed((java.lang.Throwable) costException78);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray32, (java.lang.Throwable) convergenceException73);
        java.lang.String str81 = convergenceException80.toString();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!" + "'", str81, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray19, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        double[] doubleArray16 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, 10.0d);
        double[] doubleArray19 = pointCostPair18.getPoint();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double[] doubleArray22 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 100.0f);
        double double25 = pointCostPair24.getCost();
        double[] doubleArray26 = pointCostPair24.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray8, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException8);
        java.lang.String str10 = convergenceException9.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str10, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray10);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException(throwable14);
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException(throwable16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException17);
        convergenceException15.addSuppressed((java.lang.Throwable) convergenceException17);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", objArray10, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.optimization.CostException costException22 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException15);
        java.lang.String str23 = costException22.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.optimization.CostException" + "'", str23, "org.apache.commons.math.optimization.CostException");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray2 = notPositiveDefiniteMatrixException1.getArguments();
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", objArray2);
        org.apache.commons.math.optimization.CostException costException4 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException3);
        java.lang.Class<?> wildcardClass5 = costException3.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 10, 1.0f, 10.0f, 0.0d, 0.0f };
        double[] doubleArray19 = new double[] { (byte) 10, 1.0f, 10.0f, 0.0d, 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray20, (int) (byte) 1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 10.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (-1), (double) (-1));
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
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 0.0d);
        double[] doubleArray20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray17, doubleArray20, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, 0.0d);
        double[] doubleArray18 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double[] doubleArray24 = pointCostPair20.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8, doubleArray24, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0.0d };
        double[] doubleArray11 = new double[] { 0.0d };
        double[] doubleArray13 = new double[] { 0.0d };
        double[] doubleArray15 = new double[] { 0.0d };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray16);
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
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
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
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
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
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100, (short) 10, 100, (byte) 10 };
        double[] doubleArray17 = new double[] { 100, (short) 10, 100, (byte) 10 };
        double[] doubleArray22 = new double[] { 100, (short) 10, 100, (byte) 10 };
        double[] doubleArray27 = new double[] { 100, (short) 10, 100, (byte) 10 };
        double[] doubleArray32 = new double[] { 100, (short) 10, 100, (byte) 10 };
        double[] doubleArray37 = new double[] { 100, (short) 10, 100, (byte) 10 };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray38, (int) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 10.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, (int) (short) 100, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
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
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (byte) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 10.0f, (byte) 100, (short) 10, (short) 10 };
        double[] doubleArray17 = new double[] { 10.0f, (byte) 100, (short) 10, (short) 10 };
        double[] doubleArray22 = new double[] { 10.0f, (byte) 100, (short) 10, (short) 10 };
        double[] doubleArray27 = new double[] { 10.0f, (byte) 100, (short) 10, (short) 10 };
        double[] doubleArray32 = new double[] { 10.0f, (byte) 100, (short) 10, (short) 10 };
        double[] doubleArray37 = new double[] { 10.0f, (byte) 100, (short) 10, (short) 10 };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray38, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[10.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 100.0, 10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("hi!", objArray8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray8);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException10);
        java.lang.Object[] objArray12 = costException10.getArguments();
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException(throwable18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException19, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("", objArray23);
        java.lang.Class<?> wildcardClass26 = costException25.getClass();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException37 = new org.apache.commons.math.optimization.CostException("hi!", objArray36);
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException38);
        java.lang.Object[] objArray40 = new java.lang.Object[] { wildcardClass26, 'a', (-1.0f), "not positive definite matrix", costException38 };
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!", objArray40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException41);
        costException10.addSuppressed((java.lang.Throwable) convergenceException42);
        java.lang.Object[] objArray44 = costException10.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("", objArray44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray44);
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException46);
        java.lang.String str48 = convergenceException46.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str48, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0.0d };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray10, (int) (byte) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray17, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 1 };
        double[] doubleArray11 = new double[] { (byte) 1 };
        double[] doubleArray13 = new double[] { (byte) 1 };
        double[] doubleArray15 = new double[] { (byte) 1 };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray16, (int) (short) 10, 0L);
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
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, (byte) -1, '4', 0.0f, (short) 10 };
        double[] doubleArray19 = new double[] { (short) 10, (byte) -1, '4', 0.0f, (short) 10 };
        double[] doubleArray25 = new double[] { (short) 10, (byte) -1, '4', 0.0f, (short) 10 };
        double[] doubleArray31 = new double[] { (short) 10, (byte) -1, '4', 0.0f, (short) 10 };
        double[] doubleArray37 = new double[] { (short) 10, (byte) -1, '4', 0.0f, (short) 10 };
        double[] doubleArray43 = new double[] { (short) 10, (byte) -1, '4', 0.0f, (short) 10 };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray44, (int) (byte) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0, 52.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, -1.0, 52.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, -1.0, 52.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0, 52.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, -1.0, 52.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[10.0, -1.0, 52.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        java.lang.Throwable[] throwableArray10 = costException8.getSuppressed();
        java.lang.Throwable[] throwableArray11 = costException8.getSuppressed();
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Object[]) throwableArray11);
        java.lang.Class<?> wildcardClass14 = throwableArray11.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException(throwable2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException3);
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException7 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray8 = notPositiveDefiniteMatrixException7.getArguments();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.String str14 = notPositiveDefiniteMatrixException10.getPattern();
        java.lang.Throwable[] throwableArray15 = notPositiveDefiniteMatrixException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray8, (java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException(throwable20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException21, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray25);
        java.lang.String str27 = convergenceException26.getPattern();
        java.lang.String str28 = convergenceException26.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException26);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException29);
        java.lang.Object[] objArray31 = convergenceException29.getArguments();
        notPositiveDefiniteMatrixException10.addSuppressed((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ");
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ");
        convergenceException35.addSuppressed((java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException35);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException35);
        java.lang.String str41 = convergenceException35.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not positive definite matrix" + "'", str14, "not positive definite matrix");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: " + "'", str41, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 100, (-1.0d), (double) 10);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray14);
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
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (byte) -1);
        double[] doubleArray25 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray13, doubleArray25, (int) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("hi!", objArray8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray8);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException10);
        java.lang.Object[] objArray12 = costException10.getArguments();
        java.lang.Throwable throwable18 = null;
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException(throwable18);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException19, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("", objArray23);
        java.lang.Class<?> wildcardClass26 = costException25.getClass();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException37 = new org.apache.commons.math.optimization.CostException("hi!", objArray36);
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException38);
        java.lang.Object[] objArray40 = new java.lang.Object[] { wildcardClass26, 'a', (-1.0f), "not positive definite matrix", costException38 };
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!", objArray40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException41);
        costException10.addSuppressed((java.lang.Throwable) convergenceException42);
        java.lang.Object[] objArray44 = costException10.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("", objArray44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray44);
        java.lang.Throwable throwable47 = null;
        // The following exception was thrown during execution in test generation
        try {
            convergenceException46.addSuppressed(throwable47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, -1, 10, 0.0]");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        java.lang.String str13 = convergenceException9.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str13, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 0.0d);
        double[] doubleArray25 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        double[] doubleArray28 = pointCostPair27.getPoint();
        double double29 = pointCostPair27.getCost();
        double[] doubleArray30 = pointCostPair27.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray17, doubleArray30, (int) (short) 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
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
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (short) -1);
        double[] doubleArray30 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 10.0d);
        double[] doubleArray33 = pointCostPair32.getPoint();
        double[] doubleArray34 = pointCostPair32.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray20, doubleArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Class<?> wildcardClass5 = convergenceException4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.Throwable throwable6 = null;
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException(throwable6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException7, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", objArray11);
        java.lang.Class<?> wildcardClass14 = costException13.getClass();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("hi!", objArray24);
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException26);
        java.lang.Object[] objArray28 = new java.lang.Object[] { wildcardClass14, 'a', (-1.0f), "not positive definite matrix", costException26 };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException30);
        java.lang.Object[] objArray32 = convergenceException30.getArguments();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException("hi!", objArray39);
        java.lang.Throwable[] throwableArray41 = costException40.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray41);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", objArray32, (java.lang.Throwable) convergenceException42);
        java.lang.Class<?> wildcardClass44 = convergenceException42.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException9);
        java.lang.Object[] objArray11 = costException9.getArguments();
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException(throwable13);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException(throwable15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException16);
        convergenceException14.addSuppressed((java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", objArray11, (java.lang.Throwable) convergenceException20);
        java.lang.String str22 = convergenceException21.getPattern();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.ConvergenceException" + "'", str22, "org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        java.lang.Object[] objArray10 = costException9.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException9);
        java.lang.Object[] objArray12 = convergenceException11.getArguments();
        java.lang.Class<?> wildcardClass13 = convergenceException11.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 10, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray21 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray13, doubleArray21, (-1), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 100.0d, (double) (byte) 100, (double) 100.0f);
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
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 10, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 100.0f };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
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
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
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
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        double[] doubleArray8 = pointCostPair7.getPoint();
        double[] doubleArray9 = pointCostPair7.getPoint();
        double[] doubleArray10 = pointCostPair7.getPoint();
        double[] doubleArray11 = pointCostPair7.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray11, (double) 100.0f);
        double double14 = pointCostPair13.getCost();
        double double15 = pointCostPair13.getCost();
        double[] doubleArray16 = pointCostPair13.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 'a');
        java.lang.Class<?> wildcardClass19 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0d, (byte) 0 };
        double[] doubleArray13 = new double[] { 100.0d, (byte) 0 };
        double[] doubleArray16 = new double[] { 100.0d, (byte) 0 };
        double[] doubleArray19 = new double[] { 100.0d, (byte) 0 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray20, (int) (short) 100, 0L);
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
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        double[] doubleArray8 = pointCostPair7.getPoint();
        double double9 = pointCostPair7.getCost();
        double double10 = pointCostPair7.getCost();
        double[] doubleArray11 = pointCostPair7.getPoint();
        java.lang.Class<?> wildcardClass12 = pointCostPair7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 100, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100L, (short) 1 };
        double[] doubleArray13 = new double[] { 100L, (short) 1 };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14);
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
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        java.lang.String str12 = convergenceException11.getPattern();
        java.lang.String str13 = convergenceException11.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException11);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException14);
        java.lang.String str16 = costException15.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Throwable) costException15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) convergenceException17);
        java.lang.Class<?> wildcardClass19 = convergenceException18.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1L, 10.0f, 10.0f, 1L, (short) 10 };
        double[] doubleArray19 = new double[] { 1L, 10.0f, 10.0f, 1L, (short) 10 };
        double[] doubleArray25 = new double[] { 1L, 10.0f, 10.0f, 1L, (short) 10 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray26, (int) (short) -1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 10.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 10.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 10.0, 10.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0f, (-1.0d), (short) 10 };
        double[] doubleArray15 = new double[] { 100.0f, (-1.0d), (short) 10 };
        double[] doubleArray19 = new double[] { 100.0f, (-1.0d), (short) 10 };
        double[] doubleArray23 = new double[] { 100.0f, (-1.0d), (short) 10 };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray24, 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (-1L), 1.0d, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (-1L), (short) 0, (short) -1, (byte) 10 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray13, (int) (byte) -1, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 100, (-1.0d), (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray25 = pointCostPair21.getPoint();
        double[] doubleArray31 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 10.0d);
        double[] doubleArray34 = pointCostPair33.getPoint();
        double double35 = pointCostPair33.getCost();
        double[] doubleArray36 = pointCostPair33.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray25, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
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
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0 };
        double[] doubleArray11 = new double[] { 0 };
        double[] doubleArray13 = new double[] { 0 };
        double[] doubleArray15 = new double[] { 0 };
        double[] doubleArray17 = new double[] { 0 };
        double[] doubleArray19 = new double[] { 0 };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray20, 10, (long) (byte) 0);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 10, (double) ' ', 0.0d);
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
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (short) 100, (double) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 10L);
        double[] doubleArray20 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 10.0d);
        double[] doubleArray23 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray8, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 100, 0L, 0L, (byte) 0, (-1), (byte) 0 };
        double[] doubleArray21 = new double[] { (byte) 100, 0L, 0L, (byte) 0, (-1), (byte) 0 };
        double[] doubleArray28 = new double[] { (byte) 100, 0L, 0L, (byte) 0, (-1), (byte) 0 };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 0.0, 0.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 0.0, 0.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 0.0, 0.0, 0.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray12 = costException11.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException14);
        java.lang.String str16 = convergenceException14.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str16, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.Class<?> wildcardClass8 = costException7.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
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
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 1.0d);
        double[] doubleArray29 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (short) 0);
        double double34 = pointCostPair33.getCost();
        double double35 = pointCostPair33.getCost();
        double[] doubleArray36 = pointCostPair33.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) '4');
        double[] doubleArray39 = pointCostPair38.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair42 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray19, doubleArray39, (int) (byte) 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        java.lang.Object[] objArray8 = costException7.getArguments();
        java.lang.Throwable[] throwableArray9 = costException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Object[]) throwableArray9);
        java.lang.Class<?> wildcardClass11 = convergenceException10.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 1, (double) 10.0f, (double) 10.0f);
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
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 0, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = pointCostPair15.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double double29 = pointCostPair28.getCost();
        double[] doubleArray30 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray20, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", objArray10);
        java.lang.Class<?> wildcardClass13 = costException12.getClass();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("hi!", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { wildcardClass13, 'a', (-1.0f), "not positive definite matrix", costException25 };
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", objArray27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException28);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException29);
        java.lang.Object[] objArray31 = convergenceException29.getArguments();
        java.lang.String str32 = convergenceException29.toString();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str32, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        double[] doubleArray9 = new double[] { 10L, 100.0f, 1, 100.0f, 10L };
        double[] doubleArray15 = new double[] { 10L, 100.0f, 1, 100.0f, 10L };
        double[] doubleArray21 = new double[] { 10L, 100.0f, 1, 100.0f, 10L };
        double[] doubleArray27 = new double[] { 10L, 100.0f, 1, 100.0f, 10L };
        double[][] doubleArray28 = new double[][] { doubleArray9, doubleArray15, doubleArray21, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead0.minimize(costFunction1, (int) (byte) 0, convergenceChecker3, doubleArray28, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 100.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 100.0, 1.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 100, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray24 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14, doubleArray24, (int) (byte) -1, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 'a');
        double double27 = pointCostPair26.getCost();
        double[] doubleArray28 = pointCostPair26.getPoint();
        double[] doubleArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray28, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException5, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray9);
        java.lang.Class<?> wildcardClass12 = objArray9.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10L, (double) 100L);
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
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 100.0d, (double) (byte) 100, (double) 100.0f);
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
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (-1), (double) (-1));
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
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (short) 100, (double) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100L, 100L, (byte) 100, 0, (short) -1 };
        double[] doubleArray19 = new double[] { 100L, 100L, (byte) 100, 0, (short) -1 };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 100.0, 0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray18 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("hi!", objArray17);
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray17);
        java.lang.Object[] objArray20 = costException19.getArguments();
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray20);
        convergenceException9.addSuppressed((java.lang.Throwable) costException21);
        java.lang.Class<?> wildcardClass23 = convergenceException9.getClass();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1), 0L };
        double[] doubleArray13 = new double[] { (-1), 0L };
        double[] doubleArray16 = new double[] { (-1), 0L };
        double[] doubleArray19 = new double[] { (-1), 0L };
        double[] doubleArray22 = new double[] { (-1), 0L };
        double[] doubleArray25 = new double[] { (-1), 0L };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray26, 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) -1, (double) (byte) 100, (double) ' ');
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
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair2 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair4 = new org.apache.commons.math.optimization.PointCostPair(doubleArray0, (double) 100);
        double[] doubleArray5 = pointCostPair4.getPoint();
        double[] doubleArray6 = pointCostPair4.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        java.lang.Class<?> wildcardClass11 = pointCostPair10.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = pointCostPair15.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray30 = pointCostPair28.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray20, doubleArray30, (int) (byte) 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
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
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (-1), (double) (-1));
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
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
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
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) '4');
        double[] doubleArray23 = pointCostPair22.getPoint();
        double[] doubleArray29 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 10.0d);
        double[] doubleArray32 = pointCostPair31.getPoint();
        double[] doubleArray33 = pointCostPair31.getPoint();
        double[] doubleArray34 = pointCostPair31.getPoint();
        double[] doubleArray35 = pointCostPair31.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray23, doubleArray35, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 1L };
        double[] doubleArray11 = new double[] { 1L };
        double[] doubleArray13 = new double[] { 1L };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray14, 100, (long) (byte) -1);
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
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.getPattern();
        java.lang.String str12 = convergenceException9.getPattern();
        java.lang.String str13 = convergenceException9.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str13, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.String str9 = costException6.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str9, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Object[] objArray3 = notPositiveDefiniteMatrixException1.getArguments();
        java.lang.String str4 = notPositiveDefiniteMatrixException1.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str4, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1L), '#' };
        double[] doubleArray13 = new double[] { (-1L), '#' };
        double[] doubleArray16 = new double[] { (-1L), '#' };
        double[] doubleArray19 = new double[] { (-1L), '#' };
        double[] doubleArray22 = new double[] { (-1L), '#' };
        double[] doubleArray25 = new double[] { (-1L), '#' };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray26, (int) ' ', (long) '#');
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
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 0 };
        double[] doubleArray11 = new double[] { (byte) 0 };
        double[] doubleArray13 = new double[] { (byte) 0 };
        double[] doubleArray15 = new double[] { (byte) 0 };
        double[] doubleArray17 = new double[] { (byte) 0 };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray18);
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
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (-1));
        double[] doubleArray32 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray24, doubleArray32, (int) ' ', (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) '4', (double) 100L, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { '4' };
        double[] doubleArray11 = new double[] { '4' };
        double[] doubleArray13 = new double[] { '4' };
        double[] doubleArray15 = new double[] { '4' };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) 10, 10.0d, (-1), (short) -1, (-1L) };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0, -1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        java.lang.Object[] objArray10 = costException9.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException9);
        java.lang.Object[] objArray12 = convergenceException11.getArguments();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("hi!", objArray19);
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray19);
        convergenceException11.addSuppressed((java.lang.Throwable) costException21);
        java.lang.Class<?> wildcardClass23 = costException21.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 1, (double) 10.0f, (double) 10.0f);
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
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '#', (byte) 0, 0L, (byte) 100, 10.0f, 'a' };
        double[] doubleArray21 = new double[] { '#', (byte) 0, 0L, (byte) 100, 10.0f, 'a' };
        double[] doubleArray28 = new double[] { '#', (byte) 0, 0L, (byte) 100, 10.0f, 'a' };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 0.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 0.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 0.0, 0.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException(throwable2);
        java.lang.Throwable[] throwableArray4 = convergenceException3.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray4, (java.lang.Throwable) convergenceException5);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray4);
        java.lang.Throwable throwable14 = null;
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException(throwable14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException15, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", objArray19);
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("", objArray19);
        java.lang.Class<?> wildcardClass22 = costException21.getClass();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException("hi!", objArray32);
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException34);
        java.lang.Object[] objArray36 = new java.lang.Object[] { wildcardClass22, 'a', (-1.0f), "not positive definite matrix", costException34 };
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", objArray36);
        java.lang.Object[] objArray38 = convergenceException37.getArguments();
        java.lang.Object[] objArray49 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("hi!", objArray49);
        org.apache.commons.math.optimization.CostException costException51 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", objArray49);
        org.apache.commons.math.optimization.CostException costException53 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray49);
        java.lang.Object[] objArray55 = convergenceException54.getArguments();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException56 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray63 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException64 = new org.apache.commons.math.optimization.CostException("hi!", objArray63);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("", objArray63);
        notPositiveDefiniteMatrixException56.addSuppressed((java.lang.Throwable) convergenceException65);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: not positive definite matrix", objArray55, (java.lang.Throwable) convergenceException65);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray38, (java.lang.Throwable) convergenceException67);
        costException7.addSuppressed((java.lang.Throwable) convergenceException68);
        java.lang.Throwable throwable70 = null;
        // The following exception was thrown during execution in test generation
        try {
            convergenceException68.addSuppressed(throwable70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[10, -1, 10, 0.0]");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        java.lang.Throwable[] throwableArray7 = costException6.getSuppressed();
        java.lang.Object[] objArray8 = costException6.getArguments();
        java.lang.String str9 = costException6.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str9, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) -1, 1.0f, 0, 10L };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray30 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 10.0d);
        double[] doubleArray33 = pointCostPair32.getPoint();
        double[] doubleArray34 = pointCostPair32.getPoint();
        double[] doubleArray35 = pointCostPair32.getPoint();
        double[] doubleArray36 = pointCostPair32.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 100.0f);
        double double39 = pointCostPair38.getCost();
        double double40 = pointCostPair38.getCost();
        double[] doubleArray41 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray24, doubleArray41, (int) ' ', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (-1), (double) (byte) -1, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 'a', (byte) 10, 1L, 10, 100, '4' };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray15, (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 10.0, 1.0, 10.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) '4', (double) 100L, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
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
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 0, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0 };
        double[] doubleArray11 = new double[] { 0 };
        double[] doubleArray13 = new double[] { 0 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray14, (int) '4', (long) 1);
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
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double double19 = pointCostPair15.getCost();
        double double20 = pointCostPair15.getCost();
        double[] doubleArray21 = pointCostPair15.getPoint();
        double[] doubleArray27 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 10.0d);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray31 = pointCostPair29.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray21, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException8);
        java.lang.Object[] objArray10 = costException8.getArguments();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("hi!", objArray18);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray18);
        java.lang.Object[] objArray21 = costException20.getArguments();
        org.apache.commons.math.optimization.CostException costException22 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", objArray21);
        java.lang.String str23 = costException22.getPattern();
        costException8.addSuppressed((java.lang.Throwable) costException22);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        java.lang.String str26 = costException25.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str23, "org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str26, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair9 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, (double) (short) 0);
        double double10 = pointCostPair9.getCost();
        double double11 = pointCostPair9.getCost();
        double[] doubleArray12 = pointCostPair9.getPoint();
        double double13 = pointCostPair9.getCost();
        double double14 = pointCostPair9.getCost();
        double[] doubleArray15 = pointCostPair9.getPoint();
        java.lang.Class<?> wildcardClass16 = pointCostPair9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        java.lang.Object[] objArray7 = costException6.getArguments();
        java.lang.Throwable[] throwableArray8 = costException6.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        double[] doubleArray5 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair7 = new org.apache.commons.math.optimization.PointCostPair(doubleArray5, 10.0d);
        double double8 = pointCostPair7.getCost();
        double[] doubleArray9 = pointCostPair7.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, (double) (short) 1);
        java.lang.Class<?> wildcardClass14 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1, (-1.0d), 1L, 1.0d, 52.0d, 52.0d };
        double[] doubleArray21 = new double[] { 1, (-1.0d), 1L, 1.0d, 52.0d, 52.0d };
        double[] doubleArray28 = new double[] { 1, (-1.0d), 1L, 1.0d, 52.0d, 52.0d };
        double[] doubleArray35 = new double[] { 1, (-1.0d), 1L, 1.0d, 52.0d, 52.0d };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 1.0, 1.0, 52.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, 1.0, 1.0, 52.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, -1.0, 1.0, 1.0, 52.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, -1.0, 1.0, 1.0, 52.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        java.lang.Class<?> wildcardClass11 = convergenceException9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("hi!", objArray5);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.Throwable[] throwableArray8 = costException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = costException6.getSuppressed();
        java.lang.String str10 = costException6.toString();
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str10, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
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
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
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
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException9);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Throwable) costException9);
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("hi!", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray23);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray23);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray23);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray23);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", objArray23);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException("hi!", objArray35);
        java.lang.Object[] objArray37 = costException36.getArguments();
        java.lang.Throwable[] throwableArray38 = costException36.getSuppressed();
        org.apache.commons.math.optimization.CostException costException39 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException36);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray23, (java.lang.Throwable) costException39);
        costException9.addSuppressed((java.lang.Throwable) convergenceException40);
        java.lang.Class<?> wildcardClass42 = convergenceException40.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("not positive definite matrix");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) convergenceException2);
        java.lang.Object[] objArray4 = convergenceException2.getArguments();
        java.lang.Class<?> wildcardClass5 = objArray4.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (-1L), 1.0d, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray12);
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
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("", objArray9);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray9);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray9);
        java.lang.String str15 = convergenceException14.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str15, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) '4');
        double[] doubleArray28 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 10.0d);
        double[] doubleArray31 = pointCostPair30.getPoint();
        double double32 = pointCostPair30.getCost();
        double[] doubleArray33 = pointCostPair30.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray20, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        java.lang.Class<?> wildcardClass6 = convergenceException5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 10, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, (int) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (-1L), 1.0d, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray20 = pointCostPair19.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double[] doubleArray29 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray20, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("hi!", objArray8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray8);
        java.lang.Object[] objArray11 = costException10.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!", objArray11);
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray11, throwable13);
        java.lang.String str15 = convergenceException14.getPattern();
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("hi!", objArray24);
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray24);
        java.lang.Object[] objArray27 = costException26.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", objArray27);
        java.lang.Throwable throwable29 = null;
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray27, throwable29);
        convergenceException14.addSuppressed((java.lang.Throwable) convergenceException30);
        java.lang.String str32 = convergenceException14.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str15, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str32, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) (-1.0f), (double) (byte) 1);
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
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 1, 1.0d, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray12);
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
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) (-1.0f), (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 'a', 52.0d, (short) -1, 10.0f };
        double[] doubleArray19 = new double[] { (byte) -1, 'a', 52.0d, (short) -1, 10.0f };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray20, (int) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 97.0, 52.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 97.0, 52.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.Throwable throwable5 = null;
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException(throwable5);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException6, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", objArray10);
        java.lang.Class<?> wildcardClass13 = costException12.getClass();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("hi!", objArray23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException25);
        java.lang.Object[] objArray27 = new java.lang.Object[] { wildcardClass13, 'a', (-1.0f), "not positive definite matrix", costException25 };
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", objArray27);
        java.lang.String str29 = convergenceException28.getPattern();
        java.lang.Object[] objArray30 = convergenceException28.getArguments();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 100);
        double[] doubleArray23 = pointCostPair22.getPoint();
        double[] doubleArray24 = pointCostPair22.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray17, doubleArray24, (int) '4', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) -1, (double) (short) 1, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 'a');
        double double27 = pointCostPair26.getCost();
        double[] doubleArray28 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) 0L);
        double[] doubleArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray28, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (byte) 1, (double) (byte) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 100, (double) 1.0f, 0.0d);
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
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) costException9);
        java.lang.Class<?> wildcardClass11 = costException9.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray21 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray25 = pointCostPair23.getPoint();
        double[] doubleArray26 = pointCostPair23.getPoint();
        double[] doubleArray27 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray13, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException(throwable2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException3);
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException7 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray8 = notPositiveDefiniteMatrixException7.getArguments();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.String str14 = notPositiveDefiniteMatrixException10.getPattern();
        java.lang.Throwable[] throwableArray15 = notPositiveDefiniteMatrixException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray8, (java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.Throwable throwable20 = null;
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException(throwable20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException21, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", objArray25);
        java.lang.String str27 = convergenceException26.getPattern();
        java.lang.String str28 = convergenceException26.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException26);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException29);
        java.lang.Object[] objArray31 = convergenceException29.getArguments();
        notPositiveDefiniteMatrixException10.addSuppressed((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ");
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ");
        convergenceException35.addSuppressed((java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException35);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException35);
        java.lang.Object[] objArray41 = convergenceException40.getArguments();
        java.lang.Class<?> wildcardClass42 = convergenceException40.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "not positive definite matrix" + "'", str14, "not positive definite matrix");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray20 = pointCostPair19.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double[] doubleArray33 = pointCostPair32.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray20, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
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
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("hi!", objArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray7);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException9);
        java.lang.Object[] objArray11 = costException9.getArguments();
        java.lang.Throwable throwable17 = null;
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException(throwable17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException18, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", objArray22);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("", objArray22);
        java.lang.Class<?> wildcardClass25 = costException24.getClass();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException("hi!", objArray35);
        org.apache.commons.math.optimization.CostException costException37 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException37);
        java.lang.Object[] objArray39 = new java.lang.Object[] { wildcardClass25, 'a', (-1.0f), "not positive definite matrix", costException37 };
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!", objArray39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException40);
        costException9.addSuppressed((java.lang.Throwable) convergenceException41);
        java.lang.Object[] objArray43 = costException9.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray43);
        java.lang.Class<?> wildcardClass45 = objArray43.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double double18 = pointCostPair17.getCost();
        double double19 = pointCostPair17.getCost();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) '4');
        double[] doubleArray23 = pointCostPair22.getPoint();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 0.0d);
        double[] doubleArray30 = pointCostPair29.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray24, doubleArray30, (int) ' ', (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException4);
        java.lang.String str6 = convergenceException4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str6, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.String str1 = notPositiveDefiniteMatrixException0.getPattern();
        java.lang.String str2 = notPositiveDefiniteMatrixException0.getPattern();
        java.lang.String str3 = notPositiveDefiniteMatrixException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "not positive definite matrix" + "'", str1, "not positive definite matrix");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "not positive definite matrix" + "'", str2, "not positive definite matrix");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str3, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray12 = costException11.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException11);
        java.lang.Throwable[] throwableArray14 = costException11.getSuppressed();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("hi!", objArray22);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException23);
        java.lang.Throwable[] throwableArray25 = costException23.getSuppressed();
        java.lang.Throwable throwable26 = null;
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException(throwable26);
        java.lang.String str28 = convergenceException27.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) convergenceException27);
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException(throwable33);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException34, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("", objArray38);
        java.lang.String str40 = convergenceException39.getPattern();
        java.lang.String str41 = convergenceException39.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException39);
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException42);
        java.lang.Object[] objArray44 = convergenceException42.getArguments();
        java.lang.String str45 = convergenceException42.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) convergenceException47);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (short) 0, (double) (byte) 100);
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
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 10, (double) ' ', 0.0d);
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
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray25 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        double[] doubleArray28 = pointCostPair27.getPoint();
        double[] doubleArray29 = pointCostPair27.getPoint();
        double[] doubleArray30 = pointCostPair27.getPoint();
        double[] doubleArray31 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) 100.0f);
        double double34 = pointCostPair33.getCost();
        double double35 = pointCostPair33.getCost();
        double[] doubleArray36 = pointCostPair33.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray13, doubleArray36, (int) ' ', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double double17 = pointCostPair15.getCost();
        double double18 = pointCostPair15.getCost();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 0.0d);
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray19, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 10L);
        double[] doubleArray34 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 10.0d);
        double[] doubleArray37 = pointCostPair36.getPoint();
        double[] doubleArray38 = pointCostPair36.getPoint();
        double[] doubleArray39 = pointCostPair36.getPoint();
        double[] doubleArray40 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 100.0f);
        double double43 = pointCostPair42.getCost();
        double double44 = pointCostPair42.getCost();
        double[] doubleArray45 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray24, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (-1), (-1.0d), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 100, (double) (-1.0f), (double) (byte) 100);
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
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) (-1.0f), (double) (byte) 1);
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
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException(throwable0);
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException(throwable2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException3);
        convergenceException1.addSuppressed((java.lang.Throwable) convergenceException3);
        java.lang.Object[] objArray6 = convergenceException1.getArguments();
        java.lang.Class<?> wildcardClass7 = objArray6.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 100, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (byte) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray25 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray18, doubleArray25, (int) 'a', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.getPattern();
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException(throwable13);
        java.lang.Throwable throwable15 = null;
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException(throwable15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException16);
        convergenceException14.addSuppressed((java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException19);
        convergenceException9.addSuppressed((java.lang.Throwable) convergenceException20);
        java.lang.String str22 = convergenceException20.toString();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: " + "'", str22, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 100.0f, (double) 1, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 100L, (byte) 1, (-1.0f), '#' };
        double[] doubleArray17 = new double[] { 100L, (byte) 1, (-1.0f), '#' };
        double[] doubleArray22 = new double[] { 100L, (byte) 1, (-1.0f), '#' };
        double[] doubleArray27 = new double[] { 100L, (byte) 1, (-1.0f), '#' };
        double[] doubleArray32 = new double[] { 100L, (byte) 1, (-1.0f), '#' };
        double[] doubleArray37 = new double[] { 100L, (byte) 1, (-1.0f), '#' };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray38, 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 1.0, -1.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 100, 10.0d, (double) 0L);
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
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 100 };
        double[][] doubleArray10 = new double[][] { doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (byte) -1, ' ', 'a', '4', '4' };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray14, 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 32.0, 97.0, 52.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10L, (double) 100L);
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
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0, (short) 10, (short) 1 };
        double[] doubleArray15 = new double[] { 0, (short) 10, (short) 1 };
        double[] doubleArray19 = new double[] { 0, (short) 10, (short) 1 };
        double[] doubleArray23 = new double[] { 0, (short) 10, (short) 1 };
        double[] doubleArray27 = new double[] { 0, (short) 10, (short) 1 };
        double[][] doubleArray28 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException(throwable0);
        org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException(throwable0);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException2);
        java.lang.String str4 = costException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.optimization.CostException" + "'", str4, "org.apache.commons.math.optimization.CostException");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException(throwable0);
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException2);
        java.lang.String str4 = costException3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.optimization.CostException" + "'", str4, "org.apache.commons.math.optimization.CostException");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("hi!", objArray17);
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray17);
        java.lang.Object[] objArray20 = costException19.getArguments();
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray20);
        convergenceException9.addSuppressed((java.lang.Throwable) costException21);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException9);
        java.lang.String str24 = convergenceException9.toString();
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: " + "'", str24, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray12 = costException11.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException14);
        java.lang.String str16 = convergenceException15.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str16, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 1, (double) 10.0f, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = pointCostPair15.getPoint();
        double[] doubleArray26 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 10.0d);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray30 = pointCostPair28.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray20, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10L, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1, (short) -1, (short) -1, 10, ' ', 0 };
        double[] doubleArray21 = new double[] { 1, (short) -1, (short) -1, 10, ' ', 0 };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, -1.0, 10.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, -1.0, 10.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 1.0f, (double) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 0, '#', 97.0d, 0.0d, 1.0f, 10.0d };
        double[] doubleArray21 = new double[] { (short) 0, '#', 97.0d, 0.0d, 1.0f, 10.0d };
        double[] doubleArray28 = new double[] { (short) 0, '#', 97.0d, 0.0d, 1.0f, 10.0d };
        double[] doubleArray35 = new double[] { (short) 0, '#', 97.0d, 0.0d, 1.0f, 10.0d };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 35.0, 97.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 35.0, 97.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 35.0, 97.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 35.0, 97.0, 0.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
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
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray6);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException8);
        java.lang.Object[] objArray10 = costException8.getArguments();
        java.lang.Throwable throwable16 = null;
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException(throwable16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException17, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray21);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", objArray21);
        java.lang.Class<?> wildcardClass24 = costException23.getClass();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException("hi!", objArray34);
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException36);
        java.lang.Object[] objArray38 = new java.lang.Object[] { wildcardClass24, 'a', (-1.0f), "not positive definite matrix", costException36 };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", objArray38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException39);
        costException8.addSuppressed((java.lang.Throwable) convergenceException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException8);
        java.lang.String str43 = costException8.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[class org.apache.commons.math.optimization.CostException, a, -1.0, not positive definite matrix, org.apache.commons.math.optimization.CostException: hi!]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "org.apache.commons.math.optimization.CostException: not positive definite matrix" + "'", str43, "org.apache.commons.math.optimization.CostException: not positive definite matrix");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
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
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 'a');
        double double27 = pointCostPair26.getCost();
        double[] doubleArray28 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) 0L);
        double[] doubleArray36 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 10.0d);
        double[] doubleArray39 = pointCostPair38.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair40 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray28, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("not positive definite matrix");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) convergenceException2);
        java.lang.Object[] objArray4 = convergenceException2.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException2);
        java.lang.String str6 = convergenceException5.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.ConvergenceException: not positive definite matrix" + "'", str6, "org.apache.commons.math.ConvergenceException: not positive definite matrix");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 0, (double) (short) 1, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 'a');
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray33 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 10.0d);
        double double36 = pointCostPair35.getCost();
        double[] doubleArray37 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair42 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray27, doubleArray37, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.apache.commons.math.optimization.NelderMead nelderMead0 = new org.apache.commons.math.optimization.NelderMead();
        org.apache.commons.math.optimization.CostFunction costFunction1 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker3 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair5 = nelderMead0.minimize(costFunction1, (int) (byte) 1, convergenceChecker3, randomVectorGenerator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException12);
        java.lang.Object[] objArray14 = convergenceException12.getArguments();
        java.lang.Class<?> wildcardClass15 = objArray14.getClass();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray25 = pointCostPair21.getPoint();
        double[] doubleArray31 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray25, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1, (double) (-1L), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double double13 = pointCostPair12.getCost();
        double[] doubleArray14 = pointCostPair12.getPoint();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        double[] doubleArray20 = pointCostPair19.getPoint();
        double[] doubleArray21 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException16);
        java.lang.Object[] objArray18 = convergenceException16.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Throwable) convergenceException16);
        java.lang.String str20 = convergenceException19.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Convergence failed" + "'", str20, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: Convergence failed");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) '4', (double) '4', (double) (short) 1);
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
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 0, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0f, ' ', 1 };
        double[] doubleArray15 = new double[] { 10.0f, ' ', 1 };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 100.0f, (double) 1, (double) 10L);
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
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, 0.0d);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 100);
        double[] doubleArray18 = pointCostPair17.getPoint();
        double[] doubleArray19 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8, doubleArray19, (int) (short) 10, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (-1), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray19 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray13, doubleArray19, (int) '#', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray25 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray19, doubleArray25, (int) (byte) -1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Object[] objArray3 = notPositiveDefiniteMatrixException1.getArguments();
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("hi!", objArray11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException13);
        java.lang.Object[] objArray15 = costException13.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", objArray15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException16);
        notPositiveDefiniteMatrixException1.addSuppressed((java.lang.Throwable) costException17);
        java.lang.String str19 = notPositiveDefiniteMatrixException1.toString();
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str19, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Throwable[] throwableArray5 = notPositiveDefiniteMatrixException1.getSuppressed();
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException6);
        java.lang.Throwable[] throwableArray8 = costException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 100, (-1.0d), (double) 10);
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
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 100, 100, (short) -1, (byte) -1, 100, 100.0d };
        double[] doubleArray21 = new double[] { (byte) 100, 100, (short) -1, (byte) -1, 100, 100.0d };
        double[] doubleArray28 = new double[] { (byte) 100, 100, (short) -1, (byte) -1, 100, 100.0d };
        double[] doubleArray35 = new double[] { (byte) 100, 100, (short) -1, (byte) -1, 100, 100.0d };
        double[] doubleArray42 = new double[] { (byte) 100, 100, (short) -1, (byte) -1, 100, 100.0d };
        double[][] doubleArray43 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[100.0, 100.0, -1.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, -1.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, -1.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 100.0, -1.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[100.0, 100.0, -1.0, -1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        java.lang.Object[] objArray8 = costException7.getArguments();
        java.lang.Throwable[] throwableArray9 = costException7.getSuppressed();
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException7);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) costException7);
        java.lang.Class<?> wildcardClass12 = convergenceException11.getClass();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (-1.0d), (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray24 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray18, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray14 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 10.0d);
        double[] doubleArray17 = pointCostPair16.getPoint();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100.0f);
        double double23 = pointCostPair22.getCost();
        double double24 = pointCostPair22.getCost();
        double[] doubleArray25 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 'a');
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, doubleArray29, (int) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 97.0d + "'", double28 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100.0f, (double) (byte) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        double double20 = pointCostPair19.getCost();
        double[] doubleArray21 = pointCostPair19.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair22 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("hi!", objArray10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray10);
        java.lang.Object[] objArray13 = costException12.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!", objArray13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", objArray13);
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("hi!", objArray22);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray22);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException24);
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException24);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray13, (java.lang.Throwable) costException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException27);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException29);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, 10, 0.0]");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) -1, (double) (byte) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 10, (short) 100, 0.0d, (short) -1, 10.0d };
        double[] doubleArray19 = new double[] { (short) 10, (short) 100, 0.0d, (short) -1, 10.0d };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (short) 0, (double) 10L, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', 0.0d, 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 0, (short) 1, '4' };
        double[] doubleArray15 = new double[] { (byte) 0, (short) 1, '4' };
        double[] doubleArray19 = new double[] { (byte) 0, (short) 1, '4' };
        double[] doubleArray23 = new double[] { (byte) 0, (short) 1, '4' };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray24, 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, 0.0d, (double) 0L, (double) ' ');
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
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (byte) 1, (double) (byte) 1);
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
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        java.lang.Object[] objArray8 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException4, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("", objArray8);
        java.lang.String str10 = convergenceException9.getPattern();
        java.lang.String str11 = convergenceException9.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        java.lang.String str13 = convergenceException12.getPattern();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 1.0f, (double) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray24 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray28 = pointCostPair26.getPoint();
        double[] doubleArray29 = pointCostPair26.getPoint();
        double[] doubleArray30 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) 100.0f);
        double double33 = pointCostPair32.getCost();
        double double34 = pointCostPair32.getCost();
        double[] doubleArray35 = pointCostPair32.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair40 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray14, doubleArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException(throwable2);
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable4);
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException5);
        convergenceException3.addSuppressed((java.lang.Throwable) convergenceException5);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException3);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException9);
        java.lang.Object[] objArray11 = convergenceException10.getArguments();
        java.lang.Throwable throwable13 = null;
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException(throwable13);
        java.lang.Throwable[] throwableArray15 = convergenceException14.getSuppressed();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("hi!", objArray22);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException24);
        java.lang.Object[] objArray26 = costException24.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) costException24);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray11, (java.lang.Throwable) costException24);
        java.lang.Class<?> wildcardClass29 = convergenceException28.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
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
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 100, (double) 1.0f, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double[] doubleArray27 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 10.0d);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray31 = pointCostPair29.getPoint();
        double[] doubleArray32 = pointCostPair29.getPoint();
        double[] doubleArray33 = pointCostPair29.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) 100.0f);
        double double36 = pointCostPair35.getCost();
        double double37 = pointCostPair35.getCost();
        double[] doubleArray38 = pointCostPair35.getPoint();
        double[] doubleArray39 = pointCostPair35.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair42 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray19, doubleArray39, (-1), (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray11, 1, (long) (short) 1);
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
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 0, (double) (byte) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray11, 10, (long) (byte) 0);
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
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.Object[] objArray11 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("hi!", objArray11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray11);
        java.lang.Object[] objArray14 = costException13.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException16);
        java.lang.Throwable[] throwableArray18 = convergenceException17.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray18);
        java.lang.Class<?> wildcardClass21 = throwableArray18.getClass();
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', 0.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        double[] doubleArray20 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 1);
        double[] doubleArray23 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray20, doubleArray23, (int) ' ', (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray10);
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
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 10, (double) ' ', 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray25 = pointCostPair21.getPoint();
        double[] doubleArray31 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 10.0d);
        double double34 = pointCostPair33.getCost();
        double[] doubleArray35 = pointCostPair33.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair43 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray25, doubleArray40, (int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) costException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException16);
        java.lang.Object[] objArray18 = convergenceException16.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", (java.lang.Throwable) convergenceException16);
        java.lang.String str20 = convergenceException16.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ConvergenceException: hi!" + "'", str20, "org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (-1), (-1.0d), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (-1), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double double19 = pointCostPair15.getCost();
        double double20 = pointCostPair15.getCost();
        double[] doubleArray21 = pointCostPair15.getPoint();
        double[] doubleArray27 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 10.0d);
        double double30 = pointCostPair29.getCost();
        double[] doubleArray31 = pointCostPair29.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray21, doubleArray31, (int) (byte) 10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) ' ', (double) (short) 0, 0.0d);
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
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("hi!", objArray14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray14);
        java.lang.Object[] objArray17 = costException16.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Throwable) convergenceException19);
        java.lang.Throwable[] throwableArray21 = convergenceException20.getSuppressed();
        notPositiveDefiniteMatrixException1.addSuppressed((java.lang.Throwable) convergenceException20);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.String str24 = notPositiveDefiniteMatrixException1.toString();
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str24, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) (short) -1, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        double[] doubleArray22 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray27 = pointCostPair24.getPoint();
        double[] doubleArray28 = pointCostPair24.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14, doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 0.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double double25 = pointCostPair23.getCost();
        double[] doubleArray26 = pointCostPair23.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray14, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        java.lang.Object[] objArray10 = convergenceException9.getArguments();
        java.lang.Class<?> wildcardClass11 = convergenceException9.getClass();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 100L, (double) ' ', (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) ' ');
        double[] doubleArray25 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        double[] doubleArray28 = pointCostPair27.getPoint();
        double[] doubleArray29 = pointCostPair27.getPoint();
        double[] doubleArray30 = pointCostPair27.getPoint();
        double[] doubleArray31 = pointCostPair27.getPoint();
        double[] doubleArray32 = pointCostPair27.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray13, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 1.0f, (double) '4');
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
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (double) (short) -1, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray24 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray28 = pointCostPair26.getPoint();
        double[] doubleArray29 = pointCostPair26.getPoint();
        double[] doubleArray30 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray18, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 100L, (double) ' ', (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double double16 = pointCostPair15.getCost();
        double[] doubleArray17 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (short) 1);
        double[] doubleArray22 = pointCostPair21.getPoint();
        double[] doubleArray28 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 10.0d);
        double[] doubleArray31 = pointCostPair30.getPoint();
        double[] doubleArray32 = pointCostPair30.getPoint();
        double[] doubleArray33 = pointCostPair30.getPoint();
        double[] doubleArray34 = pointCostPair30.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) 100.0f);
        double double37 = pointCostPair36.getCost();
        double double38 = pointCostPair36.getCost();
        double[] doubleArray39 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) 'a');
        double double42 = pointCostPair41.getCost();
        double[] doubleArray43 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray22, doubleArray43, 1, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 97.0d + "'", double42 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("hi!", objArray9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray9);
        java.lang.Object[] objArray12 = costException11.getArguments();
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: not positive definite matrix", objArray12);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray12);
        java.lang.String str16 = convergenceException15.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str16, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (short) 100, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1, (byte) 10, 1L, (short) -1, (-1L), 0.0d };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 100);
        double[] doubleArray22 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 10.0d);
        double double25 = pointCostPair24.getCost();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray27 = pointCostPair24.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray14, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 10.0, 1.0, -1.0, -1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (-1.0d), (double) (byte) 0, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) ' ');
        double[] doubleArray27 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 10.0d);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray31 = pointCostPair29.getPoint();
        double[] doubleArray32 = pointCostPair29.getPoint();
        double[] doubleArray33 = pointCostPair29.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) 100.0f);
        double double36 = pointCostPair35.getCost();
        double double37 = pointCostPair35.getCost();
        double[] doubleArray38 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair43 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray19, doubleArray38, (int) (short) 100, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (-1.0d), (double) (byte) 100, 0.0d);
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
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 0L, (double) (short) 10, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.Throwable throwable4 = null;
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException(throwable4);
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, 0.0f, convergenceException5, (byte) 0, (byte) 1, 100.0f };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("", objArray9);
        java.lang.String str11 = convergenceException10.getPattern();
        java.lang.String str12 = convergenceException10.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException10);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException13);
        java.lang.Object[] objArray15 = convergenceException13.getArguments();
        java.lang.Throwable[] throwableArray16 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Throwable) convergenceException13);
        java.lang.Class<?> wildcardClass18 = convergenceException17.getClass();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 0.0, org.apache.commons.math.ConvergenceException, 0, 1, 100.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.Throwable throwable0 = null;
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException(throwable0);
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException1);
        java.lang.String str3 = convergenceException1.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException1);
        java.lang.String str5 = convergenceException4.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.apache.commons.math.ConvergenceException" + "'", str5, "org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException0 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException0.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.String str5 = notPositiveDefiniteMatrixException1.getPattern();
        java.lang.Throwable[] throwableArray6 = notPositiveDefiniteMatrixException1.getSuppressed();
        java.lang.String str7 = notPositiveDefiniteMatrixException1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "not positive definite matrix" + "'", str5, "not positive definite matrix");
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str7, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, 0.0d, (double) 0L, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray12);
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
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
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
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 10L, (double) '4', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (-1.0d), (double) (byte) 100, 0.0d);
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
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (short) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 100, (double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 'a');
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        double[] doubleArray33 = pointCostPair32.getPoint();
        double double34 = pointCostPair32.getCost();
        double[] doubleArray35 = pointCostPair32.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray27, doubleArray35, 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 100L, (double) ' ', (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 100);
        double[] doubleArray23 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 10.0d);
        double[] doubleArray26 = pointCostPair25.getPoint();
        double[] doubleArray27 = pointCostPair25.getPoint();
        double[] doubleArray28 = pointCostPair25.getPoint();
        double[] doubleArray29 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair36 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray13, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10L, (double) 0L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0f, (short) 1 };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray11, 0, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException(throwable1);
        java.lang.Throwable throwable3 = null;
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException(throwable3);
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        convergenceException2.addSuppressed((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException7);
        java.lang.Object[] objArray10 = convergenceException9.getArguments();
        java.lang.String str11 = convergenceException9.getPattern();
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str11, "org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 100);
        double[] doubleArray32 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 10.0d);
        double[] doubleArray35 = pointCostPair34.getPoint();
        double[] doubleArray36 = pointCostPair34.getPoint();
        double[] doubleArray37 = pointCostPair34.getPoint();
        double[] doubleArray38 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 100.0f);
        double double41 = pointCostPair40.getCost();
        double double42 = pointCostPair40.getCost();
        double[] doubleArray43 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray24, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 100.0f, (double) 1, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10.0f, (byte) 100, 10L, (byte) 100, 1 };
        double[] doubleArray19 = new double[] { 10.0f, (byte) 100, 10L, (byte) 100, 1 };
        double[] doubleArray25 = new double[] { 10.0f, (byte) 100, 10L, (byte) 100, 1 };
        double[] doubleArray31 = new double[] { 10.0f, (byte) 100, 10L, (byte) 100, 1 };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 100.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 100.0, 10.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10L, (-1L), 10, 0.0d };
        org.apache.commons.math.optimization.CostException costException7 = new org.apache.commons.math.optimization.CostException("hi!", objArray6);
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("", objArray6);
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException9 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException10 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        notPositiveDefiniteMatrixException9.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        convergenceException8.addSuppressed((java.lang.Throwable) notPositiveDefiniteMatrixException10);
        java.lang.String str15 = notPositiveDefiniteMatrixException10.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, -1, 10, 0.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str15, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 1.0f, (double) (byte) 100, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 10.0d, (short) 1, (short) 10, 1.0f, (byte) 10, (-1.0d) };
        double[] doubleArray21 = new double[] { 10.0d, (short) 1, (short) 10, 1.0f, (byte) 10, (-1.0d) };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray22, (int) (byte) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0, 10.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 1.0, 10.0, 1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 100.0d, (double) (byte) 100, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) 0, 'a', 10L, 100.0d, 0.0f };
        double[] doubleArray19 = new double[] { (short) 0, 'a', 10L, 100.0d, 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray20, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 97.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 97.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 10.0f, (double) 100L, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 0, 1.0f, (-1.0d), (-1), 100.0f, (-1.0d) };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, -1.0, -1.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException("hi!", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) '4', (double) 100L, (double) 0L);
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
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.Object[] objArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.CostException costException2 = new org.apache.commons.math.optimization.CostException("", objArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) 'a', (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        double double22 = pointCostPair21.getCost();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 100);
        double[] doubleArray32 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 10.0d);
        double[] doubleArray35 = pointCostPair34.getPoint();
        double[] doubleArray36 = pointCostPair34.getPoint();
        double[] doubleArray37 = pointCostPair34.getPoint();
        double[] doubleArray38 = pointCostPair34.getPoint();
        double[] doubleArray39 = pointCostPair34.getPoint();
        double[] doubleArray40 = pointCostPair34.getPoint();
        double[] doubleArray41 = pointCostPair34.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair42 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray24, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) (short) 1, (double) 10.0f, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1L), (short) -1, (short) 100, 0, 1.0f };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 10.0d);
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 100);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray13, doubleArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 1, 1.0d, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1.0f, 0L, (short) 0, ' ' };
        double[] doubleArray17 = new double[] { 1.0f, 0L, (short) 0, ' ' };
        double[] doubleArray22 = new double[] { 1.0f, 0L, (short) 0, ' ' };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 0.0, 0.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }
}

