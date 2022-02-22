import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 0, 100.0d, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (short) -1);
        double double20 = pointCostPair19.getCost();
        double double21 = pointCostPair19.getCost();
        double[] doubleArray22 = pointCostPair19.getPoint();
        double[] doubleArray29 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 0.0d);
        double double32 = pointCostPair31.getCost();
        double[] doubleArray33 = pointCostPair31.getPoint();
        double[] doubleArray34 = pointCostPair31.getPoint();
        double[] doubleArray35 = pointCostPair31.getPoint();
        double double36 = pointCostPair31.getCost();
        double[] doubleArray37 = pointCostPair31.getPoint();
        double[] doubleArray38 = pointCostPair31.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 100.0d);
        double[] doubleArray43 = pointCostPair42.getPoint();
        double[] doubleArray44 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray22, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) 10L, (double) 0.0f, (double) (short) 10);
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
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 1, (double) (-1.0f), (double) (-1.0f));
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
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 0L, (double) (byte) -1, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 32.0d, (short) 1, 0.0f, 35.0d, (short) 0 };
        double[] doubleArray19 = new double[] { 32.0d, (short) 1, 0.0f, 35.0d, (short) 0 };
        double[] doubleArray25 = new double[] { 32.0d, (short) 1, 0.0f, 35.0d, (short) 0 };
        double[] doubleArray31 = new double[] { 32.0d, (short) 1, 0.0f, 35.0d, (short) 0 };
        double[] doubleArray37 = new double[] { 32.0d, (short) 1, 0.0f, 35.0d, (short) 0 };
        double[][] doubleArray38 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 1.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 1.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 1.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 1.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[32.0, 1.0, 0.0, 35.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 1.0f, (double) (byte) 100, (double) (byte) -1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) 0, 0.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 0, 0.0f };
        double[] doubleArray13 = new double[] { (short) 0, 0.0f };
        double[] doubleArray16 = new double[] { (short) 0, 0.0f };
        double[] doubleArray19 = new double[] { (short) 0, 0.0f };
        double[] doubleArray22 = new double[] { (short) 0, 0.0f };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray23, (int) (short) 0, (long) (byte) 10);
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
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) '#', 52.0d, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (short) 0);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray28 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        double double31 = pointCostPair30.getCost();
        double[] doubleArray32 = pointCostPair30.getPoint();
        double[] doubleArray33 = pointCostPair30.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (short) 1);
        double[] doubleArray36 = pointCostPair35.getPoint();
        double[] doubleArray37 = pointCostPair35.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray21, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 0L, 97.0d, 32.0d);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 0.0d, 35.0d, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 100.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 97.0d);
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair55 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray21, doubleArray40, 100, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (byte) 0, (double) ' ', (double) 100);
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
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (byte) 0, (double) (short) 10, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, 1.0d, (double) ' ', (double) ' ');
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, 35.0d, (double) ' ', (double) (byte) 100);
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
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (-1L), 100.0d, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 0, 10.0d, 97.0d, 10L };
        double[] doubleArray17 = new double[] { (byte) 0, 10.0d, 97.0d, 10L };
        double[][] doubleArray18 = new double[][] { doubleArray12, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray18, (int) '4', (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 10.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) (short) -1, 100.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 0.0d);
        double double20 = pointCostPair19.getCost();
        double[] doubleArray21 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 100.0f);
        double double24 = pointCostPair23.getCost();
        double[] doubleArray25 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        double[] doubleArray30 = pointCostPair27.getPoint();
        double[] doubleArray31 = pointCostPair27.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair32 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray8, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (short) 10, (double) 'a', (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 1, (-1L), (-1.0d), ' ' };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, 97.0d, (double) 0, 0.0d);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) '#');
        double[] doubleArray25 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 0.0d);
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 10L);
        double double32 = pointCostPair31.getCost();
        double[] doubleArray33 = pointCostPair31.getPoint();
        double double34 = pointCostPair31.getCost();
        double[] doubleArray35 = pointCostPair31.getPoint();
        double double36 = pointCostPair31.getCost();
        double[] doubleArray37 = pointCostPair31.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray12, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) '4', (double) (byte) 10, (double) 100.0f);
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
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 10, (double) (-1), (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 'a', (short) 1 };
        double[] doubleArray13 = new double[] { 'a', (short) 1 };
        double[] doubleArray16 = new double[] { 'a', (short) 1 };
        double[] doubleArray19 = new double[] { 'a', (short) 1 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray20, (int) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10.0f, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0, '4', '4', 32.0d, (short) 10 };
        double[] doubleArray19 = new double[] { 0, '4', '4', 32.0d, (short) 10 };
        double[] doubleArray25 = new double[] { 0, '4', '4', 32.0d, (short) 10 };
        double[] doubleArray31 = new double[] { 0, '4', '4', 32.0d, (short) 10 };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 52.0, 52.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 52.0, 52.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 52.0, 52.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 52.0, 52.0, 32.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 0, (double) (-1.0f), (double) 1);
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, 52.0d, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (-1.0d));
        double double26 = pointCostPair25.getCost();
        double[] doubleArray27 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) ' ');
        double double30 = pointCostPair29.getCost();
        double[] doubleArray31 = pointCostPair29.getPoint();
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) 10);
        double[] doubleArray43 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 10);
        double double46 = pointCostPair45.getCost();
        double[] doubleArray47 = pointCostPair45.getPoint();
        double double48 = pointCostPair45.getCost();
        double[] doubleArray49 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray31, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', 97.0d, (double) (byte) -1, (double) ' ');
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
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) '#', (double) ' ', (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 1.0d, (double) 1, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10, 100.0f };
        double[] doubleArray13 = new double[] { 10, 100.0f };
        double[] doubleArray16 = new double[] { 10, 100.0f };
        double[] doubleArray19 = new double[] { 10, 100.0f };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray20, (int) (byte) 1, (long) (byte) 100);
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
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (-1.0f), (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        double[] doubleArray21 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (-1L));
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) 1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) 100);
        double[] doubleArray46 = pointCostPair45.getPoint();
        double[] doubleArray47 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray21, doubleArray47, (int) '4', 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 10.0d, (double) 'a', 0.0d);
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, 35.0d, (double) '4', (double) 0L);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 0L, (double) 10L, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1.0f, 1.0d, (short) 1, 0L, 1.0f };
        double[][] doubleArray14 = new double[][] { doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) -1, (double) 10L, (double) ' ');
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (-1.0d), (double) 10L, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100L);
        double[] doubleArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray20, doubleArray27, 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (-1.0f), (double) 1.0f, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) -1);
        double double11 = pointCostPair10.getCost();
        double[] doubleArray12 = pointCostPair10.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) 10.0f);
        double[] doubleArray15 = pointCostPair14.getPoint();
        double[] doubleArray22 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) 1);
        double[] doubleArray29 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 1L);
        double double32 = pointCostPair31.getCost();
        double[] doubleArray33 = pointCostPair31.getPoint();
        double double34 = pointCostPair31.getCost();
        double[] doubleArray35 = pointCostPair31.getPoint();
        double[] doubleArray36 = pointCostPair31.getPoint();
        double[] doubleArray37 = pointCostPair31.getPoint();
        double[] doubleArray38 = pointCostPair31.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray15, doubleArray38, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1), (double) (-1.0f), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100, 35.0d, 97.0d, (byte) -1, 100 };
        double[] doubleArray19 = new double[] { 100, 35.0d, 97.0d, (byte) -1, 100 };
        double[] doubleArray25 = new double[] { 100, 35.0d, 97.0d, (byte) -1, 100 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray26, (int) (short) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 35.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 35.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 35.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, 10.0d, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (-1.0d));
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) ' ');
        double[] doubleArray27 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 0L);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        double double42 = pointCostPair41.getCost();
        double double43 = pointCostPair41.getCost();
        double[] doubleArray44 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (-1.0d));
        org.apache.commons.math.optimization.PointCostPair pointCostPair54 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair56 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair57 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray30, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) '#', 100.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0d, (short) 10 };
        double[] doubleArray13 = new double[] { 100.0d, (short) 10 };
        double[] doubleArray16 = new double[] { 100.0d, (short) 10 };
        double[] doubleArray19 = new double[] { 100.0d, (short) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 10, (double) (short) -1, (double) 0L);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '4', (double) 10.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 0L, (short) 1, (byte) 0, (short) 100, 10.0d, (short) 1 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 1.0, 0.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100L, (-1.0d), (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0 };
        double[] doubleArray11 = new double[] { 0 };
        double[] doubleArray13 = new double[] { 0 };
        double[] doubleArray15 = new double[] { 0 };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray16, (int) 'a', (long) ' ');
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
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 100, 10.0d, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0L, (byte) 0, 10L };
        double[] doubleArray15 = new double[] { 0L, (byte) 0, 10L };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray16, (int) (short) -1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1L), (double) 100L, (double) 10.0f);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) '#', (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        double double20 = pointCostPair19.getCost();
        double[] doubleArray21 = pointCostPair19.getPoint();
        double double22 = pointCostPair19.getCost();
        double[] doubleArray23 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) ' ');
        double[] doubleArray26 = pointCostPair25.getPoint();
        double[] doubleArray27 = pointCostPair25.getPoint();
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (byte) -1);
        double[] doubleArray41 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) 0);
        double[] doubleArray44 = pointCostPair43.getPoint();
        double[] doubleArray45 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (-1.0f));
        double double48 = pointCostPair47.getCost();
        double[] doubleArray49 = pointCostPair47.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray27, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 10, (double) 100, 35.0d);
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 35.0d, 0.0d, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, 0.0f, (byte) 1, 1.0d };
        double[] doubleArray17 = new double[] { (byte) 100, 0.0f, (byte) 1, 1.0d };
        double[] doubleArray22 = new double[] { (byte) 100, 0.0f, (byte) 1, 1.0d };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) ' ', 10.0d, 35.0d);
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
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 35.0d, (double) (byte) 10, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray10);
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
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 1, (double) '#', (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double double26 = pointCostPair25.getCost();
        double[] doubleArray27 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (-1));
        double[] doubleArray30 = pointCostPair29.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) 100);
        double[] doubleArray39 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair54 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray30, doubleArray39, (int) (short) 0, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) (byte) 10, (double) ' ', (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (short) 1);
        double[] doubleArray32 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (short) 1);
        double[] doubleArray35 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray23, doubleArray35, (int) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 1, (double) 1, (double) 1.0f);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 100, (double) (byte) -1, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 10L);
        double[] doubleArray23 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (-1.0f));
        double double26 = pointCostPair25.getCost();
        double[] doubleArray27 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 10.0f);
        double[] doubleArray34 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (-1.0d));
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 52.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 0.0d);
        double[] doubleArray46 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray27, doubleArray46, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 100.0f, (double) 100, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 0.0d);
        double double25 = pointCostPair24.getCost();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray27 = pointCostPair24.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 10.0f);
        double[] doubleArray34 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (-1.0d));
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) -1);
        double double42 = pointCostPair41.getCost();
        double double43 = pointCostPair41.getCost();
        double[] doubleArray44 = pointCostPair41.getPoint();
        double double45 = pointCostPair41.getCost();
        double[] doubleArray46 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (byte) 100);
        double[] doubleArray49 = pointCostPair48.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray27, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', 52.0d, 0.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100.0f);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double double25 = pointCostPair22.getCost();
        double[] doubleArray26 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) (byte) 0);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (short) 1);
        double[] doubleArray44 = pointCostPair43.getPoint();
        double double45 = pointCostPair43.getCost();
        double[] doubleArray46 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray26, doubleArray46, (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, 52.0d, 35.0d, 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 0.0d);
        double[] doubleArray34 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (-1.0d));
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 10.0d);
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) '4');
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, 97.0d);
        double double48 = pointCostPair47.getCost();
        double[] doubleArray49 = pointCostPair47.getPoint();
        double[] doubleArray50 = pointCostPair47.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray21, doubleArray50, (int) (byte) -1, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 97.0d + "'", double48 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) ' ', 100.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 0.0f, (-1.0d), (byte) 1, 100.0d, 1L };
        double[] doubleArray19 = new double[] { 0.0f, (-1.0d), (byte) 1, 100.0d, 1L };
        double[] doubleArray25 = new double[] { 0.0f, (-1.0d), (byte) 1, 100.0d, 1L };
        double[] doubleArray31 = new double[] { 0.0f, (-1.0d), (byte) 1, 100.0d, 1L };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, -1.0, 1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 32.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (-1), (double) (short) 10, 10.0d);
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
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) '4', (double) (byte) 1, 97.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 52.0d, 32.0d };
        double[] doubleArray13 = new double[] { 52.0d, 32.0d };
        double[] doubleArray16 = new double[] { 52.0d, 32.0d };
        double[] doubleArray19 = new double[] { 52.0d, 32.0d };
        double[] doubleArray22 = new double[] { 52.0d, 32.0d };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray23, 0, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, 52.0d, (double) 10L, (double) (-1.0f));
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
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 0, (double) (byte) 1, (-1.0d));
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
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (byte) 10, (double) 100L, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1.0d, '4', 0, 10.0f, 1L, 1L };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 52.0, 0.0, 10.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 'a', 1.0d, (double) 100L);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, 32.0d, (double) '#', 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 1, (-1), (short) 1, 97.0d, 100, '4' };
        double[] doubleArray21 = new double[] { (short) 1, (-1), (short) 1, 97.0d, 100, '4' };
        double[][] doubleArray22 = new double[][] { doubleArray14, doubleArray21 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray22, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, -1.0, 1.0, 97.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, -1.0, 1.0, 97.0, 100.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (byte) 0, (double) (byte) -1, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        double double21 = pointCostPair16.getCost();
        double double22 = pointCostPair16.getCost();
        double[] doubleArray23 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (short) 100);
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        double double37 = pointCostPair36.getCost();
        double[] doubleArray38 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 10L);
        double double41 = pointCostPair40.getCost();
        double[] doubleArray42 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (-1.0d));
        double double45 = pointCostPair44.getCost();
        double double46 = pointCostPair44.getCost();
        double[] doubleArray47 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray23, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (byte) 10, (double) (short) 10, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        double double25 = pointCostPair20.getCost();
        double double26 = pointCostPair20.getCost();
        double[] doubleArray27 = pointCostPair20.getPoint();
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (byte) 1);
        double double41 = pointCostPair40.getCost();
        double[] doubleArray42 = pointCostPair40.getPoint();
        double[] doubleArray43 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (-1.0d));
        double double46 = pointCostPair45.getCost();
        double double47 = pointCostPair45.getCost();
        double double48 = pointCostPair45.getCost();
        double[] doubleArray49 = pointCostPair45.getPoint();
        double double50 = pointCostPair45.getCost();
        double[] doubleArray51 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray27, doubleArray51, (-1), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 10.0d, (double) (byte) -1, (double) 1.0f);
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
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (-1), (-1.0d), (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 10L);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (-1.0d));
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray27 = pointCostPair24.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 100.0d);
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) -1);
        double[] doubleArray45 = pointCostPair44.getPoint();
        double[] doubleArray46 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray27, doubleArray46, (int) 'a', 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) 10L, 0.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray25 = pointCostPair23.getPoint();
        double[] doubleArray26 = pointCostPair23.getPoint();
        double[] doubleArray27 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 10.0d);
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (short) 1);
        double[] doubleArray43 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 0);
        double[] doubleArray48 = pointCostPair47.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair54 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair57 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray27, doubleArray48, 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 0L, 1.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double[] doubleArray28 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (short) 1);
        double double35 = pointCostPair34.getCost();
        double[] doubleArray36 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray21, doubleArray36, (int) (byte) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, 0.0d, (double) (short) 1, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, randomVectorGenerator8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', 100.0d, 0.0d, (double) 100L);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (byte) 0, (double) (byte) 1, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (-1L), (double) 1, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 0L);
        double[] doubleArray30 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (byte) -1);
        double[] doubleArray37 = pointCostPair36.getPoint();
        double[] doubleArray38 = pointCostPair36.getPoint();
        double double39 = pointCostPair36.getCost();
        double[] doubleArray40 = pointCostPair36.getPoint();
        double double41 = pointCostPair36.getCost();
        double[] doubleArray42 = pointCostPair36.getPoint();
        double[] doubleArray43 = pointCostPair36.getPoint();
        double[] doubleArray44 = pointCostPair36.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray19, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (byte) 10, (double) 100L, (double) (byte) -1);
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
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10.0f, 0.0d, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) ' ');
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray25 = pointCostPair23.getPoint();
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 1);
        double double37 = pointCostPair36.getCost();
        double[] doubleArray38 = pointCostPair36.getPoint();
        double[] doubleArray39 = pointCostPair36.getPoint();
        double double40 = pointCostPair36.getCost();
        double[] doubleArray41 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, 97.0d);
        double[] doubleArray44 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray25, doubleArray44, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, (double) '4', (double) (short) 10);
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
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) '#', 35.0d, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (byte) 1, (-1) };
        double[] doubleArray13 = new double[] { (byte) 1, (-1) };
        double[] doubleArray16 = new double[] { (byte) 1, (-1) };
        double[] doubleArray19 = new double[] { (byte) 1, (-1) };
        double[] doubleArray22 = new double[] { (byte) 1, (-1) };
        double[] doubleArray25 = new double[] { (byte) 1, (-1) };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray26);
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 0L, (double) 0L, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 100.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 0);
        double[] doubleArray41 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (byte) 10);
        double double46 = pointCostPair45.getCost();
        double[] doubleArray47 = pointCostPair45.getPoint();
        double[] doubleArray48 = pointCostPair45.getPoint();
        double[] doubleArray49 = pointCostPair45.getPoint();
        double[] doubleArray50 = pointCostPair45.getPoint();
        double[] doubleArray51 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair54 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray24, doubleArray51, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (byte) 0, 0.0d, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 10L);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) 100);
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) -1);
        double double45 = pointCostPair44.getCost();
        double double46 = pointCostPair44.getCost();
        double[] doubleArray47 = pointCostPair44.getPoint();
        double[] doubleArray48 = pointCostPair44.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray25, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) 100, (double) (short) 100, 35.0d);
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
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 1.0d, 10.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double[] doubleArray24 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 0.0f);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 1);
        double double41 = pointCostPair40.getCost();
        double[] doubleArray42 = pointCostPair40.getPoint();
        double double43 = pointCostPair40.getCost();
        double[] doubleArray44 = pointCostPair40.getPoint();
        double[] doubleArray45 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, 97.0d);
        double[] doubleArray48 = pointCostPair47.getPoint();
        double double49 = pointCostPair47.getCost();
        double[] doubleArray50 = pointCostPair47.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray29, doubleArray50, (int) (short) 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 97.0d + "'", double49 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (-1.0f), 32.0d, (double) (byte) 100);
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
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (-1L), (double) '4', 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (-1.0f), 10L, 10L, 100L, 100 };
        double[] doubleArray19 = new double[] { (-1.0f), 10L, 10L, 100L, 100 };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 10.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 10, (double) 1, (-1.0d));
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
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 0.0d, (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (-1.0d), 35.0d);
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, 100.0d, 0.0d, 100.0d);
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
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 0L, (double) (-1.0f), (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 52.0d);
        double[] doubleArray30 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (short) 1);
        double[] doubleArray37 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 1L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray17, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) 1L, (double) 10, (double) 'a');
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
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 'a', (double) (byte) 100, (double) (-1L));
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1L), (double) 100, (double) (short) 1);
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
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 100, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray10, (int) '4', (long) 1);
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
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 0, (double) 0.0f, (double) 100);
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (byte) -1, (double) (short) 0, (double) 100.0f);
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (-1.0d), (double) (byte) 10, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 10.0d);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) (byte) -1);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray30, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, (double) 10, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 10, 1, (short) 10, '4', (byte) 1, 10.0d };
        double[] doubleArray21 = new double[] { (byte) 10, 1, (short) 10, '4', (byte) 1, 10.0d };
        double[] doubleArray28 = new double[] { (byte) 10, 1, (short) 10, '4', (byte) 1, 10.0d };
        double[] doubleArray35 = new double[] { (byte) 10, 1, (short) 10, '4', (byte) 1, 10.0d };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray36, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 1.0, 10.0, 52.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 1.0, 10.0, 52.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 1.0, 10.0, 52.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 1.0, 10.0, 52.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1.0f), (double) (short) 0, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair9 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) '#', 0.0d, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 0.0f);
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 1);
        double[] doubleArray41 = pointCostPair40.getPoint();
        double[] doubleArray42 = pointCostPair40.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray29, doubleArray42, (int) 'a', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (short) 10, (double) (-1.0f), (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) (byte) 0, (double) (short) 100, (double) (byte) 0);
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
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 100L, (double) '4', (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (short) 1);
        double double38 = pointCostPair37.getCost();
        double[] doubleArray39 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (-1));
        double double42 = pointCostPair41.getCost();
        double double43 = pointCostPair41.getCost();
        double[] doubleArray44 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray14, doubleArray44, (-1), (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 0L, 1.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 35.0d);
        double[] doubleArray28 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (short) -1);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        double[] doubleArray43 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 10L);
        double double48 = pointCostPair47.getCost();
        double[] doubleArray49 = pointCostPair47.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray28, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) '#', (double) (short) 1, (double) (byte) 1);
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
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 1.0d, 10.0d, (double) (short) 10);
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
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) 10.0f, (double) 100, (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double double22 = pointCostPair18.getCost();
        double[] doubleArray23 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 35.0d);
        double[] doubleArray26 = pointCostPair25.getPoint();
        double[] doubleArray27 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (-1L));
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        double[] doubleArray41 = pointCostPair38.getPoint();
        double[] doubleArray42 = pointCostPair38.getPoint();
        double[] doubleArray43 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 1.0d);
        double[] doubleArray46 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (byte) -1);
        double[] doubleArray51 = pointCostPair50.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray27, doubleArray51, (int) (byte) 1, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (-1.0f), (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 10, (double) 1.0f, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 97.0d);
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 10.0f);
        double[] doubleArray43 = pointCostPair42.getPoint();
        double[] doubleArray44 = pointCostPair42.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray22, doubleArray44, (int) (short) 100, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (short) 100, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double double21 = pointCostPair18.getCost();
        double[] doubleArray22 = pointCostPair18.getPoint();
        double[] doubleArray23 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 97.0d);
        double[] doubleArray26 = pointCostPair25.getPoint();
        double double27 = pointCostPair25.getCost();
        double[] doubleArray28 = pointCostPair25.getPoint();
        double[] doubleArray29 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (-1));
        double[] doubleArray36 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (short) 1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) '4');
        double[] doubleArray46 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray29, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 97.0d + "'", double27 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 35.0d, (double) 1.0f, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double[] doubleArray19 = pointCostPair18.getPoint();
        double[] doubleArray20 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 'a');
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray26 = pointCostPair24.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) 100.0f);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) -1);
        double[] doubleArray44 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair54 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, 100.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair56 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair59 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray26, doubleArray44, (int) 'a', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 0L, (double) 1, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 0.0d);
        double double18 = pointCostPair17.getCost();
        double[] doubleArray19 = pointCostPair17.getPoint();
        double[] doubleArray20 = pointCostPair17.getPoint();
        double[] doubleArray21 = pointCostPair17.getPoint();
        double[] doubleArray22 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray22, (int) '#', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) (byte) -1, (double) (short) 100, (double) 0L);
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
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (-1L), (double) (short) 1, (double) 10L);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) (short) -1, (double) (byte) -1, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1), 0.0f };
        double[] doubleArray13 = new double[] { (-1), 0.0f };
        double[] doubleArray16 = new double[] { (-1), 0.0f };
        double[] doubleArray19 = new double[] { (-1), 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray20);
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
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (-1), (double) 100.0f, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double[] doubleArray30 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (short) 1);
        double[] doubleArray37 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 100);
        double[] doubleArray40 = pointCostPair39.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair43 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray23, doubleArray40, (int) (byte) 0, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (byte) 100, (double) (byte) -1, 0.0d);
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
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (short) 100, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, (int) (short) 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 'a', (double) (short) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0.0f, 10L, (byte) -1 };
        double[] doubleArray15 = new double[] { 0.0f, 10L, (byte) -1 };
        double[] doubleArray19 = new double[] { 0.0f, 10L, (byte) -1 };
        double[] doubleArray23 = new double[] { 0.0f, 10L, (byte) -1 };
        double[] doubleArray27 = new double[] { 0.0f, 10L, (byte) -1 };
        double[] doubleArray31 = new double[] { 0.0f, 10L, (byte) -1 };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) (short) 100, 97.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 100.0f, 100.0d, (-1L) };
        double[] doubleArray19 = new double[] { 10.0d, (byte) 1, 100.0f, 100.0d, (-1L) };
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 100.0f, 100.0d, (-1L) };
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 100.0f, 100.0d, (-1L) };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray32, (int) 'a', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[10.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) ' ', (double) (-1.0f), 52.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0d, 100 };
        double[] doubleArray13 = new double[] { 100.0d, 100 };
        double[] doubleArray16 = new double[] { 100.0d, 100 };
        double[] doubleArray19 = new double[] { 100.0d, 100 };
        double[] doubleArray22 = new double[] { 100.0d, 100 };
        double[] doubleArray25 = new double[] { 100.0d, 100 };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray26, (int) (short) 1, (long) '4');
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
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (byte) 10, (double) (-1.0f), (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 1.0f, (double) (byte) -1, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) -1, (short) 10, 100.0f, 100L, 10.0f };
        double[] doubleArray19 = new double[] { (short) -1, (short) 10, 100.0f, 100L, 10.0f };
        double[] doubleArray25 = new double[] { (short) -1, (short) 10, 100.0f, 100L, 10.0f };
        double[] doubleArray31 = new double[] { (short) -1, (short) 10, 100.0f, 100L, 10.0f };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray32, (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 10.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 10.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 10.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (-1.0f), (double) (byte) 10, (double) 0L);
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
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 10, (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, 97.0d, (double) (short) 10, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (-1.0d), 0.0d, (double) 'a');
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
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), 1.0d, (double) ' ', (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, randomVectorGenerator8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 1L, 32.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[][] doubleArray11 = new double[][] { doubleArray8, doubleArray9, doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray11, (int) 'a', (long) (byte) 1);
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
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', (double) (short) -1, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (byte) 0, (double) (short) 10, (double) (-1L));
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (short) -1, (double) 1.0f, 97.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), 10, (-1L) };
        double[] doubleArray15 = new double[] { (-1.0f), 10, (-1L) };
        double[] doubleArray19 = new double[] { (-1.0f), 10, (-1L) };
        double[] doubleArray23 = new double[] { (-1.0f), 10, (-1L) };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100.0f, 10.0d, (double) 10);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10.0f, 1.0d, 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 97.0d, (-1), 100.0d, (-1.0f), (-1), 97.0d };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, -1.0, 100.0, -1.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0.0f, (double) '#', (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 0L };
        double[] doubleArray11 = new double[] { 0L };
        double[] doubleArray13 = new double[] { 0L };
        double[] doubleArray15 = new double[] { 0L };
        double[][] doubleArray16 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray16, (int) (short) 100, (long) (byte) 1);
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
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 10, (double) 100, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1.0f, 1L, 97.0d, 35.0d, '#' };
        double[] doubleArray19 = new double[] { 1.0f, 1L, 97.0d, 35.0d, '#' };
        double[] doubleArray25 = new double[] { 1.0f, 1L, 97.0d, 35.0d, '#' };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 1.0, 97.0, 35.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 97.0, 35.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 1.0, 97.0, 35.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) 100.0f, (-1.0d), (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { '4', 'a', 1.0d };
        double[] doubleArray15 = new double[] { '4', 'a', 1.0d };
        double[] doubleArray19 = new double[] { '4', 'a', 1.0d };
        double[] doubleArray23 = new double[] { '4', 'a', 1.0d };
        double[] doubleArray27 = new double[] { '4', 'a', 1.0d };
        double[] doubleArray31 = new double[] { '4', 'a', 1.0d };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray32, (int) (short) 10, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[52.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 97.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 0, (double) 1L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 100, 97.0d, (double) (-1L));
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 1.0f, 100.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) 1.0f, (double) '4', (double) '#');
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
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 100.0f, (double) 10L, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0.0f, 32.0d, 1 };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray12, (int) (short) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (short) 10, (double) (byte) 1, (double) (short) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 'a', 10 };
        double[] doubleArray13 = new double[] { 'a', 10 };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 10.0d, (double) 100.0f, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 10L, 0L, 10L, 100L, 0, 0L };
        double[] doubleArray21 = new double[] { 10L, 0L, 10L, 100L, 0, 0L };
        double[] doubleArray28 = new double[] { 10L, 0L, 10L, 100L, 0, 0L };
        double[] doubleArray35 = new double[] { 10L, 0L, 10L, 100L, 0, 0L };
        double[] doubleArray42 = new double[] { 10L, 0L, 10L, 100L, 0, 0L };
        double[] doubleArray49 = new double[] { 10L, 0L, 10L, 100L, 0, 0L };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 0.0, 10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 0.0, 10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 0.0, 10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 0.0, 10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 0.0, 10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[10.0, 0.0, 10.0, 100.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 1L, (double) (short) 10, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double double22 = pointCostPair18.getCost();
        double[] doubleArray23 = pointCostPair18.getPoint();
        double[] doubleArray24 = pointCostPair18.getPoint();
        double[] doubleArray25 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (-1));
        double[] doubleArray28 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (byte) 100);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) 1);
        double[] doubleArray44 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (byte) 1);
        double double47 = pointCostPair46.getCost();
        double[] doubleArray48 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair55 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray28, doubleArray48, 100, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 10, 52.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, (-1), (byte) 0, 1.0d };
        double[] doubleArray17 = new double[] { (byte) -1, (-1), (byte) 0, 1.0d };
        double[] doubleArray22 = new double[] { (byte) -1, (-1), (byte) 0, 1.0d };
        double[] doubleArray27 = new double[] { (byte) -1, (-1), (byte) 0, 1.0d };
        double[] doubleArray32 = new double[] { (byte) -1, (-1), (byte) 0, 1.0d };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair36 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray33, (int) (short) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 100L, (double) 1L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) '#');
        double[] doubleArray23 = pointCostPair22.getPoint();
        double double24 = pointCostPair22.getCost();
        double[] doubleArray25 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) '#');
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 10.0f);
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (short) 1);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 100);
        double[] doubleArray48 = pointCostPair47.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair54 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair56 = new org.apache.commons.math.optimization.PointCostPair(doubleArray48, (double) (byte) 1);
        double[] doubleArray57 = pointCostPair56.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair58 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray29, doubleArray57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), (double) (-1.0f), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double[] doubleArray22 = pointCostPair18.getPoint();
        double double23 = pointCostPair18.getCost();
        double double24 = pointCostPair18.getCost();
        double[] doubleArray25 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (-1.0d));
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 0.0f);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair34 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray30, doubleArray31, (int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 0.0d, (double) (-1.0f), (double) 1L);
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) 1L, (double) (byte) 0, 52.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { ' ', (short) 100, ' ', 97.0d };
        double[] doubleArray17 = new double[] { ' ', (short) 100, ' ', 97.0d };
        double[] doubleArray22 = new double[] { ' ', (short) 100, ' ', 97.0d };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray23, (int) (byte) 100, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[32.0, 100.0, 32.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[32.0, 100.0, 32.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[32.0, 100.0, 32.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 35.0d, 1.0d, 0.0d);
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
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) '4', (double) 10, (double) (short) 1);
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
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 10.0f, 1.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (short) 10, 100.0f, (-1.0f), (short) 1, (-1L), (-1.0f) };
        double[] doubleArray21 = new double[] { (short) 10, 100.0f, (-1.0f), (short) 1, (-1L), (-1.0f) };
        double[] doubleArray28 = new double[] { (short) 10, 100.0f, (-1.0f), (short) 1, (-1L), (-1.0f) };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 100.0, -1.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0, -1.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[10.0, 100.0, -1.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (-1.0d), 35.0d, (double) (-1.0f));
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 1, 0.0d, (double) 0L);
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1.0f), 32.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 10L);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (short) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (-1.0f));
        double double29 = pointCostPair28.getCost();
        double[] doubleArray30 = pointCostPair28.getPoint();
        double[] doubleArray35 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (short) 1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 100L);
        double[] doubleArray45 = pointCostPair44.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray30, doubleArray45, (int) (byte) 10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, 32.0d, (double) (-1L), (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 0.0f);
        double[] doubleArray23 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (-1.0f));
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) 10);
        double[] doubleArray39 = pointCostPair38.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair40 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray23, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, 97.0d, (double) (byte) 100, (double) (short) -1);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (short) 1, (double) 100.0f, (double) 10L);
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
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 100.0f, (double) 10, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 100.0d);
        double[] doubleArray20 = pointCostPair19.getPoint();
        double[] doubleArray21 = pointCostPair19.getPoint();
        double[] doubleArray28 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) 1);
        double[] doubleArray33 = pointCostPair32.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 100.0d);
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair43 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray21, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) (-1), (double) (short) 100, (double) (short) 0);
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
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, 0.0d, (double) 1L);
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
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) 0L, 10.0d, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 100.0d, 100, 97.0d, (-1.0f), 100.0d };
        double[] doubleArray19 = new double[] { 100.0d, 100, 97.0d, (-1.0f), 100.0d };
        double[] doubleArray25 = new double[] { 100.0d, 100, 97.0d, (-1.0f), 100.0d };
        double[] doubleArray31 = new double[] { 100.0d, 100, 97.0d, (-1.0f), 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 100.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[100.0, 100.0, 97.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), (double) (short) -1, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[] doubleArray10 = new double[] {};
        double[] doubleArray11 = new double[] {};
        double[][] doubleArray12 = new double[][] { doubleArray8, doubleArray9, doubleArray10, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray12, (int) (short) -1, (long) (byte) -1);
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
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (short) 10, (double) (-1), 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 0.0d);
        double[] doubleArray26 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) 'a');
        double[] doubleArray33 = pointCostPair32.getPoint();
        double[] doubleArray34 = pointCostPair32.getPoint();
        double[] doubleArray35 = pointCostPair32.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray17, doubleArray35, 100, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, 0.0d, (double) (byte) -1, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (-1), (-1.0d), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 0, 'a', (-1), (short) 10 };
        double[] doubleArray17 = new double[] { (byte) 0, 'a', (-1), (short) 10 };
        double[] doubleArray22 = new double[] { (byte) 0, 'a', (-1), (short) 10 };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray23, (int) '4', 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 97.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 97.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 97.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) -1, 0.0d, 100.0d);
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0L, (double) (short) 10, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        double[] doubleArray23 = pointCostPair22.getPoint();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double[] doubleArray25 = pointCostPair22.getPoint();
        double[] doubleArray26 = pointCostPair22.getPoint();
        double double27 = pointCostPair22.getCost();
        double[] doubleArray28 = pointCostPair22.getPoint();
        double[] doubleArray35 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (byte) -1);
        double double42 = pointCostPair41.getCost();
        double double43 = pointCostPair41.getCost();
        double[] doubleArray44 = pointCostPair41.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray28, doubleArray44, 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (-1L), (double) 'a', (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, 100.0d, (double) (short) -1, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (-1.0f), (byte) 1 };
        double[] doubleArray13 = new double[] { (-1.0f), (byte) 1 };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, 0.0d, (double) (-1.0f), (double) 100);
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
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 100, (double) 'a', (double) (short) 0);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray13);
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
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 1L, (double) '#', 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0f, (short) 10 };
        double[] doubleArray13 = new double[] { 10.0f, (short) 10 };
        double[] doubleArray16 = new double[] { 10.0f, (short) 10 };
        double[] doubleArray19 = new double[] { 10.0f, (short) 10 };
        double[] doubleArray22 = new double[] { 10.0f, (short) 10 };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, 0.0d, 97.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 32.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double double25 = pointCostPair23.getCost();
        double[] doubleArray26 = pointCostPair23.getPoint();
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) '#');
        double[] doubleArray42 = pointCostPair41.getPoint();
        double[] doubleArray43 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray26, doubleArray43, (-1), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 10, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 0, (double) (byte) -1, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (byte) 100, (double) ' ', 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray11 = new double[] { 10.0d };
        double[] doubleArray13 = new double[] { 10.0d };
        double[] doubleArray15 = new double[] { 10.0d };
        double[] doubleArray17 = new double[] { 10.0d };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray18, (int) (short) -1, (long) 10);
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
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (-1), (double) (byte) 10, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 0, 'a', 100.0d, 10 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray13, (int) (short) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 97.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test20177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20177");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) (byte) 1, (double) 1);
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
    public void test20178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20178");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (byte) -1, (double) (byte) 100, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 97.0d, (byte) 0, 0L };
        double[] doubleArray15 = new double[] { 97.0d, (byte) 0, 0L };
        double[] doubleArray19 = new double[] { 97.0d, (byte) 0, 0L };
        double[] doubleArray23 = new double[] { 97.0d, (byte) 0, 0L };
        double[] doubleArray27 = new double[] { 97.0d, (byte) 0, 0L };
        double[] doubleArray31 = new double[] { 97.0d, (byte) 0, 0L };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 0.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20179");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 0.0f, (double) (-1.0f), (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 0.0d, (byte) -1, '4' };
        double[] doubleArray15 = new double[] { 0.0d, (byte) -1, '4' };
        double[] doubleArray19 = new double[] { 0.0d, (byte) -1, '4' };
        double[] doubleArray23 = new double[] { 0.0d, (byte) -1, '4' };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray24, (int) (byte) -1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, -1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test20180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20180");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100L, (double) 1L, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 0.0d);
        double double29 = pointCostPair28.getCost();
        double[] doubleArray30 = pointCostPair28.getPoint();
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        double double42 = pointCostPair41.getCost();
        double double43 = pointCostPair41.getCost();
        double double44 = pointCostPair41.getCost();
        double[] doubleArray45 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray30, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20181");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 0, (double) 10, (double) 10);
    }

    @Test
    public void test20182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20182");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 0, (double) 1.0f, (double) (short) 100);
    }

    @Test
    public void test20183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20183");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, 97.0d, (double) (byte) -1, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 0.0d);
        double[] doubleArray27 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 1);
        double double30 = pointCostPair29.getCost();
        double[] doubleArray31 = pointCostPair29.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (short) 1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) 100);
        double double42 = pointCostPair41.getCost();
        double[] doubleArray43 = pointCostPair41.getPoint();
        double[] doubleArray44 = pointCostPair41.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray31, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20184");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (-1.0f), (double) (-1), (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 10);
        double double32 = pointCostPair31.getCost();
        double[] doubleArray33 = pointCostPair31.getPoint();
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 1);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 10.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair54 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray33, doubleArray45, (int) (short) 0, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20185");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 1, (double) 1L, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 100);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 0.0d);
        double[] doubleArray39 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) 1);
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 0.0f);
        double[] doubleArray51 = pointCostPair50.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) 10L);
        double double54 = pointCostPair53.getCost();
        double[] doubleArray55 = pointCostPair53.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair57 = new org.apache.commons.math.optimization.PointCostPair(doubleArray55, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair59 = new org.apache.commons.math.optimization.PointCostPair(doubleArray55, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair61 = new org.apache.commons.math.optimization.PointCostPair(doubleArray55, (double) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair62 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray24, doubleArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20186");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 0.0f, 97.0d, (double) (byte) 100);
    }

    @Test
    public void test20187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20187");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100L, (double) (short) 10, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (-1.0d) };
        double[] doubleArray11 = new double[] { (-1.0d) };
        double[][] doubleArray12 = new double[][] { doubleArray9, doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray12, 0, (long) (short) 10);
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
    public void test20188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20188");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, 35.0d, (double) (short) 10, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) 0, 0L, (byte) 100, (short) 100, ' ', 1L };
        double[] doubleArray21 = new double[] { (byte) 0, 0L, (byte) 100, (short) 100, ' ', 1L };
        double[] doubleArray28 = new double[] { (byte) 0, 0L, (byte) 100, (short) 100, ' ', 1L };
        double[] doubleArray35 = new double[] { (byte) 0, 0L, (byte) 100, (short) 100, ' ', 1L };
        double[] doubleArray42 = new double[] { (byte) 0, 0L, (byte) 100, (short) 100, ' ', 1L };
        double[] doubleArray49 = new double[] { (byte) 0, 0L, (byte) 100, (short) 100, ' ', 1L };
        double[][] doubleArray50 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35, doubleArray42, doubleArray49 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray50, 1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 0.0, 100.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 0.0, 100.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 0.0, 100.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 0.0, 100.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 0.0, 100.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 0.0, 100.0, 100.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
    }

    @Test
    public void test20189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20189");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1.0f, (double) 'a', (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 1.0f, 100, 'a', 32.0d, 32.0d };
        double[] doubleArray19 = new double[] { 1.0f, 100, 'a', 32.0d, 32.0d };
        double[] doubleArray25 = new double[] { 1.0f, 100, 'a', 32.0d, 32.0d };
        double[] doubleArray31 = new double[] { 1.0f, 100, 'a', 32.0d, 32.0d };
        double[] doubleArray37 = new double[] { 1.0f, 100, 'a', 32.0d, 32.0d };
        double[] doubleArray43 = new double[] { 1.0f, 100, 'a', 32.0d, 32.0d };
        double[][] doubleArray44 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31, doubleArray37, doubleArray43 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray44, (int) (byte) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[1.0, 100.0, 97.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 100.0, 97.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[1.0, 100.0, 97.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 100.0, 97.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 100.0, 97.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 100.0, 97.0, 32.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
    }

    @Test
    public void test20190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20190");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, 52.0d, 97.0d, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20191");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 0L, (double) 'a', (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) -1);
        double double39 = pointCostPair38.getCost();
        double double40 = pointCostPair38.getCost();
        double[] doubleArray41 = pointCostPair38.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair42 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray15, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20192");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 10, (double) 0, (double) (short) 100);
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
    public void test20193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20193");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1, (double) (byte) 1, (double) ' ');
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
    public void test20194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20194");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, 52.0d, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double[] doubleArray22 = pointCostPair18.getPoint();
        double double23 = pointCostPair18.getCost();
        double double24 = pointCostPair18.getCost();
        double[] doubleArray25 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 0.0f);
        double[] doubleArray32 = pointCostPair31.getPoint();
        double[] doubleArray33 = pointCostPair31.getPoint();
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 1);
        double[] doubleArray47 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair58 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray33, doubleArray47, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20195");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (-1.0d), (double) 0.0f, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { '4', 52.0d, 100L, (byte) -1 };
        double[] doubleArray17 = new double[] { '4', 52.0d, 100L, (byte) -1 };
        double[][] doubleArray18 = new double[][] { doubleArray12, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 52.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 52.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test20196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20196");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1, (double) (byte) 1, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { '#', (-1.0f), (byte) -1, 32.0d, 35.0d, (byte) 100 };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray15, (int) (short) -1, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, -1.0, -1.0, 32.0, 35.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test20197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20197");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) 0.0f, 52.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 100.0f);
        double[] doubleArray27 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, 0.0d);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double double31 = pointCostPair29.getCost();
        double[] doubleArray32 = pointCostPair29.getPoint();
        double[] doubleArray37 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray32, doubleArray40, (int) 'a', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20198");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 100, (double) 100L, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, randomVectorGenerator8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20199");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) 1.0f, (double) '#', 0.0d);
    }

    @Test
    public void test20200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20200");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10.0f, (double) 10L, (double) (byte) -1);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray14);
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
    public void test20201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20201");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) 'a', (double) (short) -1, (double) (-1));
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
    public void test20202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20202");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (byte) 10, (double) 1L, (-1.0d));
    }

    @Test
    public void test20203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20203");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 35.0d, (double) 10L, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { '#', 'a', 32.0d, 'a', (-1) };
        double[] doubleArray19 = new double[] { '#', 'a', 32.0d, 'a', (-1) };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray20, (int) 'a', (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[35.0, 97.0, 32.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[35.0, 97.0, 32.0, 97.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test20204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20204");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (short) 10, (double) (-1), 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '#');
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (byte) -1);
        double[] doubleArray26 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) 10.0f);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray34 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        double[] doubleArray37 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray29, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20205");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), 35.0d, (double) 0.0f, 97.0d);
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
    public void test20206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20206");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 97.0d, 0.0d, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 10);
        double[] doubleArray27 = pointCostPair26.getPoint();
        double double28 = pointCostPair26.getCost();
        double[] doubleArray29 = pointCostPair26.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (byte) -1);
        double[] doubleArray43 = pointCostPair42.getPoint();
        double double44 = pointCostPair42.getCost();
        double double45 = pointCostPair42.getCost();
        double[] doubleArray46 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair54 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair55 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray29, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20207");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (byte) 0, (double) 1L, 97.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 10L);
        double[] doubleArray22 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) -1);
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (byte) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        double[] doubleArray41 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) 1);
        double[] doubleArray46 = pointCostPair45.getPoint();
        double[] doubleArray47 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray22, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20208");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 97.0d, (double) '#', 97.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        double[] doubleArray23 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100L);
        double[] doubleArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray23, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20209");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 0, (double) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 10);
        double[] doubleArray22 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (short) 10);
        double[] doubleArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray22, doubleArray27, 1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20210");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1L), (double) ' ', (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        double double36 = pointCostPair35.getCost();
        double[] doubleArray37 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (short) -1);
        double[] doubleArray42 = pointCostPair41.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray24, doubleArray42, (int) (short) 100, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20211");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) ' ', (double) '4', (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        double[] doubleArray21 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 1.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) '#');
        double[] doubleArray37 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        double double41 = pointCostPair39.getCost();
        double double42 = pointCostPair39.getCost();
        double[] doubleArray43 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (-1));
        double[] doubleArray46 = pointCostPair45.getPoint();
        double[] doubleArray47 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray24, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20212");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 10.0f, (double) (byte) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) 1);
        double double24 = pointCostPair23.getCost();
        double[] doubleArray25 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 1);
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 'a');
        double[] doubleArray47 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 1);
        double[] doubleArray54 = pointCostPair53.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair55 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray25, doubleArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20213");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, 10.0d, 52.0d, 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0f, (short) 10, 0.0f };
        double[] doubleArray15 = new double[] { 100.0f, (short) 10, 0.0f };
        double[] doubleArray19 = new double[] { 100.0f, (short) 10, 0.0f };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray20);
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
    public void test20214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20214");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 100, (double) 1, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1L, 100 };
        double[] doubleArray13 = new double[] { 1L, 100 };
        double[] doubleArray16 = new double[] { 1L, 100 };
        double[] doubleArray19 = new double[] { 1L, 100 };
        double[] doubleArray22 = new double[] { 1L, 100 };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray23);
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
    public void test20215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20215");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 1, (double) (byte) 1, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (short) 10, 100L, 52.0d, 10 };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray13, (int) 'a', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 100.0, 52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test20216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20216");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 1, 100.0d, 32.0d);
    }

    @Test
    public void test20217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20217");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, 0.0d, 10.0d, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) (-1.0f));
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        double double35 = pointCostPair34.getCost();
        double[] doubleArray36 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 10L);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 1);
        double double43 = pointCostPair42.getCost();
        double[] doubleArray44 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (-1.0f));
        double[] doubleArray47 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray23, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20218");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 35.0d, (double) 10, (double) 1);
    }

    @Test
    public void test20219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20219");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (short) 0, (double) 10L, 0.0d);
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
    public void test20220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20220");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 10.0d, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (-1L));
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (short) 10);
        double[] doubleArray45 = pointCostPair44.getPoint();
        double[] doubleArray46 = pointCostPair44.getPoint();
        double[] doubleArray47 = pointCostPair44.getPoint();
        double[] doubleArray48 = pointCostPair44.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray19, doubleArray48, (int) (short) 0, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20221");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0.0f, 52.0d, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 10.0d);
        double double20 = pointCostPair19.getCost();
        double[] doubleArray21 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 1);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 10);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (byte) -1);
        double[] doubleArray43 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 0L);
        double[] doubleArray46 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray29, doubleArray46, 0, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20222");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 0.0d, 52.0d, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 1);
        double[] doubleArray18 = pointCostPair17.getPoint();
        double[] doubleArray25 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (byte) -1);
        double[] doubleArray32 = pointCostPair31.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 10.0d);
        double[] doubleArray35 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        double double40 = pointCostPair39.getCost();
        double[] doubleArray41 = pointCostPair39.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair42 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray18, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20223");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) 1.0f, (double) (short) 10, 1.0d);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray20, (int) (byte) 10, (long) 'a');
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
    public void test20224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20224");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 1.0d, (double) 'a', (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 10L);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (short) 1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        double double39 = pointCostPair37.getCost();
        double double40 = pointCostPair37.getCost();
        double double41 = pointCostPair37.getCost();
        double[] doubleArray42 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (-1.0d));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray24, doubleArray42, (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20225");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 10.0d, (double) 1, (double) 100);
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
    public void test20226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20226");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 0, (-1.0d), (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (short) -1);
        double double27 = pointCostPair26.getCost();
        double double28 = pointCostPair26.getCost();
        double[] doubleArray29 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 10.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (byte) -1);
        double[] doubleArray44 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (short) 1);
        double[] doubleArray51 = pointCostPair50.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) 1L);
        double double56 = pointCostPair55.getCost();
        double double57 = pointCostPair55.getCost();
        double[] doubleArray58 = pointCostPair55.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair60 = new org.apache.commons.math.optimization.PointCostPair(doubleArray58, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair62 = new org.apache.commons.math.optimization.PointCostPair(doubleArray58, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair63 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray29, doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20227");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, 0.0d, (double) (-1L), (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10.0d };
        double[] doubleArray11 = new double[] { 10.0d };
        double[] doubleArray13 = new double[] { 10.0d };
        double[] doubleArray15 = new double[] { 10.0d };
        double[] doubleArray17 = new double[] { 10.0d };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray18, (int) (byte) 1, (long) 'a');
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
    public void test20228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20228");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '#', (double) (short) -1, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10L };
        double[] doubleArray11 = new double[] { 10L };
        double[] doubleArray13 = new double[] { 10L };
        double[] doubleArray15 = new double[] { 10L };
        double[] doubleArray17 = new double[] { 10L };
        double[] doubleArray19 = new double[] { 10L };
        double[][] doubleArray20 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair21 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray20);
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
    public void test20229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20229");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 52.0d, (double) 10, (double) 100);
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
    public void test20230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20230");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1, (double) 1, (-1.0d));
    }

    @Test
    public void test20231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20231");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) (-1L), (double) ' ', (double) '#');
    }

    @Test
    public void test20232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20232");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) (short) 1, (double) '#', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray8, (int) (byte) -1, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20233");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 1, (double) (-1), (double) (short) 100);
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
    public void test20234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20234");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 100.0d, 0.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0L, (byte) 0 };
        double[] doubleArray13 = new double[] { 0L, (byte) 0 };
        double[] doubleArray16 = new double[] { 0L, (byte) 0 };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray17);
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
    public void test20235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20235");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (short) 1, 1.0d, (double) (byte) 1);
    }

    @Test
    public void test20236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20236");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 32.0d, 10.0d, 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, (int) (short) 100, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test20237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20237");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) (short) 1, (double) (-1L));
    }

    @Test
    public void test20238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20238");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 'a', (double) 0, (double) ' ');
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
    public void test20239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20239");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (short) 100, (double) 10L, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        double double25 = pointCostPair20.getCost();
        double[] doubleArray26 = pointCostPair20.getPoint();
        double[] doubleArray27 = pointCostPair20.getPoint();
        double[] doubleArray28 = pointCostPair20.getPoint();
        double[] doubleArray35 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (-1.0f));
        double double40 = pointCostPair39.getCost();
        double double41 = pointCostPair39.getCost();
        double[] doubleArray42 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray28, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20240");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 0.0d, (double) (byte) -1, (double) 0L);
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
    public void test20241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20241");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (-1), 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 0, '#', 1.0d };
        double[][] doubleArray12 = new double[][] { doubleArray11 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 35.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
    }

    @Test
    public void test20242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20242");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 0L, (double) ' ', (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray10, (int) (byte) 100, (long) (short) 0);
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
    public void test20243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20243");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) -1, (double) 1.0f, 10.0d);
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
    public void test20244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20244");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) (-1L), (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (byte) 0, 10.0f, 1.0d };
        double[] doubleArray15 = new double[] { (byte) 0, 10.0f, 1.0d };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray16, (int) (short) 1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test20245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20245");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, 0.0d, (double) (byte) 1, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        double double20 = pointCostPair19.getCost();
        double[] doubleArray21 = pointCostPair19.getPoint();
        double double22 = pointCostPair19.getCost();
        double[] doubleArray23 = pointCostPair19.getPoint();
        double[] doubleArray28 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (short) 1);
        double double31 = pointCostPair30.getCost();
        double double32 = pointCostPair30.getCost();
        double double33 = pointCostPair30.getCost();
        double[] doubleArray34 = pointCostPair30.getPoint();
        double[] doubleArray35 = pointCostPair30.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair40 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray23, doubleArray35, 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20246");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 'a', (double) 'a', 97.0d);
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
    public void test20247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20247");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '4', 0.0d, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        double double16 = pointCostPair14.getCost();
        double double17 = pointCostPair14.getCost();
        double[] doubleArray18 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (-1));
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) -1);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        double[] doubleArray34 = pointCostPair33.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) 100);
        double[] doubleArray46 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray24, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20248");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 'a', (double) (short) 1, 32.0d);
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
    public void test20249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20249");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) (short) -1, 52.0d, (double) 1L);
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
    public void test20250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20250");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, 52.0d, 10.0d, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        double[] doubleArray25 = pointCostPair20.getPoint();
        double[] doubleArray26 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) (short) 100);
        double[] doubleArray43 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (byte) -1);
        double[] doubleArray50 = pointCostPair49.getPoint();
        double[] doubleArray51 = pointCostPair49.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray26, doubleArray51, (int) (byte) 1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20251");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 100L, (double) 1, (double) (byte) -1);
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
    public void test20252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20252");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (-1L), (double) 1, (double) (short) 100);
    }

    @Test
    public void test20253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20253");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, 97.0d, (double) (short) 10, 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 0.0d);
        double double20 = pointCostPair19.getCost();
        double double21 = pointCostPair19.getCost();
        double double22 = pointCostPair19.getCost();
        double[] doubleArray23 = pointCostPair19.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20254");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 0, 32.0d, (double) (-1));
    }

    @Test
    public void test20255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20255");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) (-1.0f), (double) (byte) 0, 97.0d);
    }

    @Test
    public void test20256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20256");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 10, (double) '4', (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20257");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (byte) -1, (double) 0.0f);
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
    public void test20258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20258");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) (short) 0, (double) (short) 1, (double) 1);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20259");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (-1.0d), (double) 10, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1.0d, 0L, (-1L), 100L };
        double[] doubleArray17 = new double[] { 1.0d, 0L, (-1L), 100L };
        double[][] doubleArray18 = new double[][] { doubleArray12, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 0.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test20260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20260");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, 52.0d, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 0L);
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (byte) 1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1L));
        double[] doubleArray41 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (byte) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) 10);
        double[] doubleArray46 = pointCostPair45.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20261");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (-1.0d), (double) 0L, (double) (-1.0f));
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
    public void test20262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20262");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) 10, (double) 100.0f, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray15 = new double[] { (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray19 = new double[] { (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray23 = new double[] { (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray27 = new double[] { (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray31 = new double[] { (short) -1, (-1.0d), (short) -1 };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray32, (int) (short) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20263");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) 0, (double) 1L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100.0f);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (-1.0f));
        double double29 = pointCostPair28.getCost();
        double double30 = pointCostPair28.getCost();
        double[] doubleArray31 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (short) 1);
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 1);
        double[] doubleArray47 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) (-1L));
        double[] doubleArray50 = pointCostPair49.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray50, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair55 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray31, doubleArray50, (int) '4', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20264");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, 0.0d, (double) '#', (double) 1.0f);
    }

    @Test
    public void test20265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20265");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, (double) (-1.0f), (double) 1.0f, (double) (short) 10);
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
    public void test20266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20266");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, 0.0d, (-1.0d), 0.0d);
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
    public void test20267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20267");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0, (double) (short) 100, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1L), 32.0d, (-1.0f) };
        double[] doubleArray15 = new double[] { (-1L), 32.0d, (-1.0f) };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray16, (int) '4', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 32.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test20268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20268");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (byte) -1, (double) 0.0f);
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
    public void test20269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20269");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (short) 1, (double) 100, 52.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10 };
        double[] doubleArray11 = new double[] { 10 };
        double[] doubleArray13 = new double[] { 10 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray14, (int) (short) 100, (long) (short) -1);
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
    public void test20270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20270");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 100L, (double) (-1.0f), (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 1.0d);
        double[] doubleArray28 = pointCostPair27.getPoint();
        double[] doubleArray35 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        double double38 = pointCostPair37.getCost();
        double[] doubleArray39 = pointCostPair37.getPoint();
        double[] doubleArray40 = pointCostPair37.getPoint();
        double[] doubleArray41 = pointCostPair37.getPoint();
        double[] doubleArray42 = pointCostPair37.getPoint();
        double[] doubleArray43 = pointCostPair37.getPoint();
        double[] doubleArray44 = pointCostPair37.getPoint();
        double[] doubleArray45 = pointCostPair37.getPoint();
        double[] doubleArray46 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray28, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20271");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) 10, (double) (short) 0, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray28 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 1.0d);
        double double35 = pointCostPair34.getCost();
        double[] doubleArray36 = pointCostPair34.getPoint();
        double[] doubleArray37 = pointCostPair34.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray21, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20272");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (short) 100, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test20273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20273");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) '4', 52.0d, (double) 0.0f);
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
    public void test20274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20274");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (-1L), (double) 'a', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 100.0d);
        double[] doubleArray28 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 97.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 97.0d);
        double[] doubleArray37 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 32.0d);
        double[] doubleArray49 = pointCostPair48.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) 10.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair54 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray28, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20275");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (byte) 10, (double) 10.0f, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray20 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) (byte) -1);
        double[] doubleArray27 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 0);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray31 = pointCostPair29.getPoint();
        double[] doubleArray32 = pointCostPair29.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray13, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20276");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '4', 100.0d, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 52.0d);
        double[] doubleArray27 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (short) -1);
        double[] doubleArray34 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (-1.0d));
        double[] doubleArray39 = pointCostPair38.getPoint();
        double[] doubleArray40 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (short) 100);
        double[] doubleArray43 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 'a');
        double[] doubleArray46 = pointCostPair45.getPoint();
        double[] doubleArray47 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray27, doubleArray47, (int) ' ', (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20277");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) 100L, (double) (short) 0, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double double21 = pointCostPair18.getCost();
        double double22 = pointCostPair18.getCost();
        double[] doubleArray23 = pointCostPair18.getPoint();
        double[] doubleArray24 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (byte) 1);
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        double double41 = pointCostPair39.getCost();
        double[] doubleArray42 = pointCostPair39.getPoint();
        double[] doubleArray43 = pointCostPair39.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray24, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20278");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) (short) 100, (double) 100.0f, 35.0d);
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
    public void test20279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20279");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 0.0d, (double) ' ', (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double[] doubleArray24 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 1);
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray27, doubleArray34, (int) (short) 10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20280");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 10, (double) 0L, (double) (-1.0f), 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 32.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (-1L));
        double[] doubleArray29 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (byte) 10);
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) '#');
        double[] doubleArray47 = pointCostPair46.getPoint();
        double double48 = pointCostPair46.getCost();
        double[] doubleArray49 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) 10);
        double double54 = pointCostPair53.getCost();
        double double55 = pointCostPair53.getCost();
        double[] doubleArray56 = pointCostPair53.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair58 = new org.apache.commons.math.optimization.PointCostPair(doubleArray56, 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair61 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray29, doubleArray56, (int) '#', (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 35.0d + "'", double48 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20281");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 1L, (double) 0, (double) 1);
    }

    @Test
    public void test20282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20282");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 32.0d, 0.0d, 100.0d);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray14);
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
    public void test20283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20283");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) 10.0f, (double) 10L, (double) (byte) 0);
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
    public void test20284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20284");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, 52.0d, (double) '4', (double) (byte) -1);
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
    public void test20285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20285");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 100L, (double) 100L, (double) (-1));
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
    public void test20286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20286");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 0, (double) 100L, (double) (-1));
    }

    @Test
    public void test20287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20287");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) (short) 0, (double) (-1), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 32.0d, (short) 1, 10, 97.0d, (byte) 10 };
        double[] doubleArray19 = new double[] { 32.0d, (short) 1, 10, 97.0d, (byte) 10 };
        double[] doubleArray25 = new double[] { 32.0d, (short) 1, 10, 97.0d, (byte) 10 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 1.0, 10.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 1.0, 10.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 1.0, 10.0, 97.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20288");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', 10.0d, (double) 1L, (double) (short) 100);
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
    public void test20289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20289");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) 'a', (double) ' ', (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, (int) (short) 10, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test20290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20290");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0, 100.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray8, (int) (short) 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20291");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) 0, 1.0d, (double) (byte) -1);
    }

    @Test
    public void test20292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20292");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (byte) 1, (double) ' ', (double) (short) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20293");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) (short) 1, 35.0d, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 1L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (-1L));
        double[] doubleArray36 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (short) 1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 1.0d);
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray19, doubleArray42, (int) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20294");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 1.0f, (double) (byte) 10, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (byte) 10);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        double[] doubleArray41 = pointCostPair38.getPoint();
        double[] doubleArray42 = pointCostPair38.getPoint();
        double double43 = pointCostPair38.getCost();
        double double44 = pointCostPair38.getCost();
        double double45 = pointCostPair38.getCost();
        double[] doubleArray46 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray29, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20295");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) ' ', (double) 100, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 10);
        double[] doubleArray22 = pointCostPair21.getPoint();
        double double23 = pointCostPair21.getCost();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        double[] doubleArray36 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (byte) 10);
        double[] doubleArray39 = pointCostPair38.getPoint();
        double double40 = pointCostPair38.getCost();
        double[] doubleArray41 = pointCostPair38.getPoint();
        double[] doubleArray42 = pointCostPair38.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair43 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray24, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20296");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 100.0d, (double) 10.0f, (double) '#');
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
    public void test20297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20297");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 0L, (double) 'a', (double) (-1L));
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
    public void test20298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20298");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 10, (double) 10.0f, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 35.0d, 100.0d, (short) 10, (byte) 100, 0L, (short) 1 };
        double[] doubleArray21 = new double[] { 35.0d, 100.0d, (short) 10, (byte) 100, 0L, (short) 1 };
        double[] doubleArray28 = new double[] { 35.0d, 100.0d, (short) 10, (byte) 100, 0L, (short) 1 };
        double[] doubleArray35 = new double[] { 35.0d, 100.0d, (short) 10, (byte) 100, 0L, (short) 1 };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair37 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[35.0, 100.0, 10.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[35.0, 100.0, 10.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[35.0, 100.0, 10.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[35.0, 100.0, 10.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test20299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20299");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) (-1L), (double) 1.0f, (double) 0);
    }

    @Test
    public void test20300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20300");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 1, (double) (short) 1, (double) (-1));
    }

    @Test
    public void test20301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20301");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) (short) 100, (double) 100.0f, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double double25 = pointCostPair23.getCost();
        double double26 = pointCostPair23.getCost();
        double[] doubleArray27 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 10);
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 100);
        double double43 = pointCostPair42.getCost();
        double double44 = pointCostPair42.getCost();
        double double45 = pointCostPair42.getCost();
        double[] doubleArray46 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray27, doubleArray46, 0, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20302");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 52.0d, (double) (short) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (short) 1, (-1.0d), 32.0d };
        double[] doubleArray15 = new double[] { (short) 1, (-1.0d), 32.0d };
        double[] doubleArray19 = new double[] { (short) 1, (-1.0d), 32.0d };
        double[] doubleArray23 = new double[] { (short) 1, (-1.0d), 32.0d };
        double[] doubleArray27 = new double[] { (short) 1, (-1.0d), 32.0d };
        double[] doubleArray31 = new double[] { (short) 1, (-1.0d), 32.0d };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20303");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 'a', (double) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, randomVectorGenerator8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20304");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) '#', (double) 1.0f, (double) (short) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 1, (-1.0f), '#', (-1L) };
        double[] doubleArray17 = new double[] { 1, (-1.0f), '#', (-1L) };
        double[] doubleArray22 = new double[] { 1, (-1.0f), '#', (-1L) };
        double[] doubleArray27 = new double[] { 1, (-1.0f), '#', (-1L) };
        double[] doubleArray32 = new double[] { 1, (-1.0f), '#', (-1L) };
        double[] doubleArray37 = new double[] { 1, (-1.0f), '#', (-1L) };
        double[][] doubleArray38 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32, doubleArray37 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[1.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, -1.0, 35.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
    }

    @Test
    public void test20305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20305");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 'a', 1.0d, (double) 1.0f);
    }

    @Test
    public void test20306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20306");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) (short) -1, (double) (short) 1, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        double[] doubleArray20 = pointCostPair16.getPoint();
        double[] doubleArray21 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 1.0d);
        double double24 = pointCostPair23.getCost();
        double[] doubleArray25 = pointCostPair23.getPoint();
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 1);
        double[] doubleArray37 = pointCostPair36.getPoint();
        double[] doubleArray38 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1));
        double[] doubleArray43 = pointCostPair42.getPoint();
        double[] doubleArray44 = pointCostPair42.getPoint();
        double[] doubleArray45 = pointCostPair42.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray25, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20307");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 1.0d, 10.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 1);
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) 1);
        double double36 = pointCostPair35.getCost();
        double[] doubleArray37 = pointCostPair35.getPoint();
        double[] doubleArray38 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1));
        double[] doubleArray41 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (-1.0d));
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray22, doubleArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20308");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 0, (double) (byte) 0, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 100, (short) 0, (-1L), ' ' };
        double[] doubleArray17 = new double[] { (byte) 100, (short) 0, (-1L), ' ' };
        double[] doubleArray22 = new double[] { (byte) 100, (short) 0, (-1L), ' ' };
        double[] doubleArray27 = new double[] { (byte) 100, (short) 0, (-1L), ' ' };
        double[] doubleArray32 = new double[] { (byte) 100, (short) 0, (-1L), ' ' };
        double[][] doubleArray33 = new double[][] { doubleArray12, doubleArray17, doubleArray22, doubleArray27, doubleArray32 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair36 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray33, (int) 'a', (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[100.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[100.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[100.0, 0.0, -1.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test20309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20309");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) 100L, (double) 10, (-1.0d));
    }

    @Test
    public void test20310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20310");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) '#', (double) 100, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { (-1.0f), 100L, 1.0f };
        double[] doubleArray15 = new double[] { (-1.0f), 100L, 1.0f };
        double[] doubleArray19 = new double[] { (-1.0f), 100L, 1.0f };
        double[] doubleArray23 = new double[] { (-1.0f), 100L, 1.0f };
        double[] doubleArray27 = new double[] { (-1.0f), 100L, 1.0f };
        double[] doubleArray31 = new double[] { (-1.0f), 100L, 1.0f };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray32);
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20311");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, 100.0d, (double) (short) 1, (double) (short) -1);
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
    public void test20312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20312");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (-1.0d), (double) (byte) 1, (double) 1.0f);
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
    public void test20313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20313");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, 1.0d, (double) '4', 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 97.0d, (byte) 10, 1.0d, 'a', 0 };
        double[] doubleArray19 = new double[] { 97.0d, (byte) 10, 1.0d, 'a', 0 };
        double[] doubleArray25 = new double[] { 97.0d, (byte) 10, 1.0d, 'a', 0 };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray26, (int) (byte) 1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 10.0, 1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 10.0, 1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 10.0, 1.0, 97.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20314");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) (short) 1, 32.0d, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray8, (int) ' ', (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test20315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20315");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (-1.0f), (double) 0L);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13);
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
    public void test20316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20316");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 1, (double) 100, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20317");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) ' ', (double) (byte) 100, 35.0d);
    }

    @Test
    public void test20318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20318");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1.0f), (double) (byte) 100, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { ' ', (byte) -1, 100L };
        double[] doubleArray15 = new double[] { ' ', (byte) -1, 100L };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test20319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20319");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, 10.0d, (double) 100L, (double) (byte) -1);
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
    public void test20320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20320");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 35.0d, (double) 1.0f, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 1);
        double[] doubleArray29 = pointCostPair28.getPoint();
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (-1.0f));
        double double41 = pointCostPair40.getCost();
        double double42 = pointCostPair40.getCost();
        double double43 = pointCostPair40.getCost();
        double[] doubleArray44 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) '4');
        double[] doubleArray51 = pointCostPair50.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair52 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray29, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20321");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, 1.0d, 97.0d, (double) '4');
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
    public void test20322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20322");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (short) -1, (double) 1, (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double[] doubleArray17 = pointCostPair16.getPoint();
        double[] doubleArray18 = pointCostPair16.getPoint();
        double[] doubleArray19 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 10.0d);
        double[] doubleArray22 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 10.0f);
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray26 = pointCostPair24.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (-1.0d));
        double[] doubleArray36 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair41 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray26, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20323");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0, 0.0d, 100.0d);
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
    public void test20324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20324");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 10, 32.0d, (double) (short) 0);
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
    public void test20325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20325");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 35.0d, 1.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray8, (int) (short) 1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test20326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20326");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) (-1.0f), (double) (-1.0f), (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 52.0d, 35.0d, 10 };
        double[] doubleArray15 = new double[] { 52.0d, 35.0d, 10 };
        double[][] doubleArray16 = new double[][] { doubleArray11, doubleArray15 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray16, (int) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[52.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[52.0, 35.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test20327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20327");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (-1.0d), (double) (-1.0f), (double) 10L);
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
    public void test20328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20328");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 100L, (double) '4', (double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20329");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), 1.0d, (double) ' ', (double) (-1.0f));
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
    public void test20330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20330");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, 100.0d, (double) ' ', (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double double25 = pointCostPair23.getCost();
        double double26 = pointCostPair23.getCost();
        double[] doubleArray27 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 1.0f);
        double[] doubleArray34 = pointCostPair33.getPoint();
        double[] doubleArray35 = pointCostPair33.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (byte) 1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        double[] doubleArray45 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) '#');
        double[] doubleArray54 = pointCostPair53.getPoint();
        double[] doubleArray55 = pointCostPair53.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair57 = new org.apache.commons.math.optimization.PointCostPair(doubleArray55, (double) (byte) 0);
        double[] doubleArray58 = pointCostPair57.getPoint();
        double[] doubleArray59 = pointCostPair57.getPoint();
        double[] doubleArray60 = pointCostPair57.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair63 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray38, doubleArray60, (int) (byte) 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20331");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 100.0f, (double) (short) 10, (double) (short) -1);
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
    public void test20332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20332");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (byte) 0, (double) (byte) 10, (double) (byte) 1);
    }

    @Test
    public void test20333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20333");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 0.0d, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test20334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20334");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (byte) -1, (-1.0d), (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 97.0d, 0.0d, 100.0f };
        double[] doubleArray15 = new double[] { 97.0d, 0.0d, 100.0f };
        double[] doubleArray19 = new double[] { 97.0d, 0.0d, 100.0f };
        double[] doubleArray23 = new double[] { 97.0d, 0.0d, 100.0f };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test20335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20335");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, (double) (byte) 0, 0.0d, (double) 100.0f);
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
    public void test20336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20336");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) (short) 100, 0.0d, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double double22 = pointCostPair18.getCost();
        double[] doubleArray23 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, 35.0d);
        double[] doubleArray26 = pointCostPair25.getPoint();
        double[] doubleArray27 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (-1L));
        double[] doubleArray36 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 0.0d);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        double[] doubleArray41 = pointCostPair38.getPoint();
        double[] doubleArray42 = pointCostPair38.getPoint();
        double[] doubleArray43 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 1.0d);
        double[] doubleArray46 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray27, doubleArray46, 10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20337");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (-1.0f), (double) (short) 0, (double) 100.0f);
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
    public void test20338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20338");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, 52.0d, (double) (short) 0, 52.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) ' ');
        double double24 = pointCostPair23.getCost();
        double double25 = pointCostPair23.getCost();
        double[] doubleArray26 = pointCostPair23.getPoint();
        double[] doubleArray27 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) '#');
        double[] doubleArray34 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        double[] doubleArray37 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 10.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 97.0d);
        double[] doubleArray44 = pointCostPair43.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray27, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20339");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) (-1.0f), (double) 'a', (-1.0d));
    }

    @Test
    public void test20340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20340");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10L, (double) (byte) -1, 32.0d);
    }

    @Test
    public void test20341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20341");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), (double) 1.0f, (double) (-1.0f), 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 1);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (byte) -1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 0);
        double[] doubleArray41 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, 0.0d);
        double double44 = pointCostPair43.getCost();
        double[] doubleArray45 = pointCostPair43.getPoint();
        double[] doubleArray46 = pointCostPair43.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray24, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20342");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) (byte) 100, (double) (short) 10, (double) 1.0f);
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
    public void test20343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20343");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, 10.0d, 32.0d, (double) ' ');
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20344");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) 100, (double) 0, (double) '4');
    }

    @Test
    public void test20345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20345");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) 100.0f, (double) (-1.0f), (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { '4', 100 };
        double[] doubleArray13 = new double[] { '4', 100 };
        double[] doubleArray16 = new double[] { '4', 100 };
        double[] doubleArray19 = new double[] { '4', 100 };
        double[] doubleArray22 = new double[] { '4', 100 };
        double[][] doubleArray23 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair26 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray23, (int) ' ', (long) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20346");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 0.0d, (double) (byte) 10, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '#');
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 1.0f);
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (short) 1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        double double40 = pointCostPair38.getCost();
        double double41 = pointCostPair38.getCost();
        double[] doubleArray42 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray23, doubleArray42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20347");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) (-1L), (double) '4', 32.0d);
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
    public void test20348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20348");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) (-1L), (double) (-1.0f), 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        double double20 = pointCostPair19.getCost();
        double double21 = pointCostPair19.getCost();
        double[] doubleArray22 = pointCostPair19.getPoint();
        double double23 = pointCostPair19.getCost();
        double[] doubleArray24 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (-1.0f));
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (-1.0f));
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 'a');
        double double45 = pointCostPair44.getCost();
        double[] doubleArray46 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray24, doubleArray46, 10, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 97.0d + "'", double45 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20349");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) '4', (double) (byte) 100, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 1L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (-1));
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray32 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (-1.0d));
        double[] doubleArray37 = pointCostPair36.getPoint();
        double[] doubleArray38 = pointCostPair36.getPoint();
        double[] doubleArray39 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 10.0d);
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 10.0f);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray27, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20350");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 100, (double) 10.0f, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 10);
        double[] doubleArray31 = pointCostPair30.getPoint();
        double[] doubleArray32 = pointCostPair30.getPoint();
        double[] doubleArray39 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 0.0d);
        double double42 = pointCostPair41.getCost();
        double[] doubleArray43 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 52.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray32, doubleArray43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20351");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', 0.0d, (double) (short) 1, 52.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 100.0f, (-1) };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test20352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20352");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 10L, (double) 100L, 1.0d);
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
    public void test20353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20353");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 10, (double) 10, (double) (byte) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 1);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double[] doubleArray22 = pointCostPair18.getPoint();
        double double23 = pointCostPair18.getCost();
        double[] doubleArray24 = pointCostPair18.getPoint();
        double[] doubleArray25 = pointCostPair18.getPoint();
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        double double37 = pointCostPair36.getCost();
        double double38 = pointCostPair36.getCost();
        double double39 = pointCostPair36.getCost();
        double[] doubleArray40 = pointCostPair36.getPoint();
        double[] doubleArray41 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, 97.0d);
        double[] doubleArray44 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray25, doubleArray44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20354");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) 0L, (double) 0.0f, 35.0d);
    }

    @Test
    public void test20355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20355");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10L, (double) (short) 0, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) ' ');
        double[] doubleArray17 = pointCostPair16.getPoint();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 0.0d);
        double[] doubleArray25 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray18, doubleArray25);
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
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20356");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (short) -1, (double) 0, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 0.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 0L);
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        double double36 = pointCostPair35.getCost();
        double[] doubleArray37 = pointCostPair35.getPoint();
        double[] doubleArray38 = pointCostPair35.getPoint();
        double[] doubleArray39 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray24, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20357");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, 97.0d, 100.0d, (double) '#');
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
    public void test20358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20358");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (-1.0f), (double) 0, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 'a');
        double double24 = pointCostPair23.getCost();
        double double25 = pointCostPair23.getCost();
        double[] doubleArray26 = pointCostPair23.getPoint();
        double[] doubleArray27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair28 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray26, doubleArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 97.0d + "'", double25 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20359");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) 1L, (double) 'a', (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100L, 0.0f, 100.0d };
        double[] doubleArray15 = new double[] { 100L, 0.0f, 100.0d };
        double[] doubleArray19 = new double[] { 100L, 0.0f, 100.0d };
        double[] doubleArray23 = new double[] { 100L, 0.0f, 100.0d };
        double[] doubleArray27 = new double[] { 100L, 0.0f, 100.0d };
        double[][] doubleArray28 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray28);
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
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test20360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20360");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', 97.0d, (double) 100, (-1.0d));
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
    public void test20361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20361");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1, (double) 1L, 1.0d);
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
    public void test20362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20362");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (byte) -1, (double) (byte) 10, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 0, (byte) 10, 1.0d, (byte) -1 };
        double[] doubleArray17 = new double[] { 0, (byte) 10, 1.0d, (byte) -1 };
        double[][] doubleArray18 = new double[][] { doubleArray12, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 10.0, 1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
    }

    @Test
    public void test20363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20363");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (short) 1, (double) (byte) 100, 0.0d);
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
    public void test20364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20364");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) (short) 0, (double) (short) 100, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        double[] doubleArray19 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 10);
        double double22 = pointCostPair21.getCost();
        double[] doubleArray23 = pointCostPair21.getPoint();
        double[] doubleArray24 = pointCostPair21.getPoint();
        double[] doubleArray25 = pointCostPair21.getPoint();
        double[] doubleArray30 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (-1.0d));
        double[] doubleArray35 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 10.0d);
        double double38 = pointCostPair37.getCost();
        double[] doubleArray39 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray25, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20365");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) 10L, (double) 10, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100.0f);
        double double23 = pointCostPair22.getCost();
        double[] doubleArray24 = pointCostPair22.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 10.0d);
        double double27 = pointCostPair26.getCost();
        double[] doubleArray28 = pointCostPair26.getPoint();
        double[] doubleArray29 = pointCostPair26.getPoint();
        double[] doubleArray30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair31 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray29, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20366");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (-1), 1.0d, (double) '4');
    }

    @Test
    public void test20367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20367");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, 10.0d, (double) 10.0f, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 0);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) 'a');
        double[] doubleArray29 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) 10);
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (short) 1);
        double[] doubleArray47 = pointCostPair46.getPoint();
        double double48 = pointCostPair46.getCost();
        double double49 = pointCostPair46.getCost();
        double[] doubleArray50 = pointCostPair46.getPoint();
        double[] doubleArray51 = pointCostPair46.getPoint();
        double[] doubleArray52 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair54 = new org.apache.commons.math.optimization.PointCostPair(doubleArray52, (double) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair56 = new org.apache.commons.math.optimization.PointCostPair(doubleArray52, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair58 = new org.apache.commons.math.optimization.PointCostPair(doubleArray52, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair60 = new org.apache.commons.math.optimization.PointCostPair(doubleArray52, (double) 10.0f);
        double[] doubleArray61 = pointCostPair60.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair62 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray29, doubleArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20368");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 10.0f, 32.0d, (double) (short) 10);
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
    public void test20369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20369");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) '4', (double) (-1L), (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double double24 = pointCostPair20.getCost();
        double[] doubleArray25 = pointCostPair20.getPoint();
        double[] doubleArray26 = pointCostPair20.getPoint();
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        double double36 = pointCostPair35.getCost();
        double[] doubleArray37 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) 0);
        double double42 = pointCostPair41.getCost();
        double[] doubleArray43 = pointCostPair41.getPoint();
        double double44 = pointCostPair41.getCost();
        double[] doubleArray45 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (-1.0d));
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair50 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray26, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20370");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 1.0f, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test20371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20371");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), 32.0d, (double) (short) 1, (double) 10L);
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
    public void test20372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20372");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) ' ', (double) 0L, 0.0d);
    }

    @Test
    public void test20373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20373");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 100, (double) (byte) 100, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, randomVectorGenerator8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20374");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 'a', (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (short) 1);
        double[] doubleArray20 = pointCostPair19.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 0.0d);
        double[] doubleArray25 = pointCostPair24.getPoint();
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) 1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray39, (double) ' ');
        double[] doubleArray42 = pointCostPair41.getPoint();
        double[] doubleArray43 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (short) 100);
        double[] doubleArray50 = pointCostPair49.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray50, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair53 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray25, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20375");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 100.0f, (double) 100, (double) (short) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 1.0d);
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, 0.0d);
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) -1);
        double[] doubleArray47 = pointCostPair46.getPoint();
        double double48 = pointCostPair46.getCost();
        double[] doubleArray49 = pointCostPair46.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair57 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair59 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair61 = new org.apache.commons.math.optimization.PointCostPair(doubleArray49, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair62 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray29, doubleArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20376");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) 0.0f, (double) (short) 100, (double) 100);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 0.0d);
        double double30 = pointCostPair29.getCost();
        double[] doubleArray31 = pointCostPair29.getPoint();
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) 1);
        double double45 = pointCostPair44.getCost();
        double[] doubleArray46 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray31, doubleArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20377");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) (-1.0f), (double) ' ', (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, randomVectorGenerator8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20378");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 1L, (double) (byte) 10, 1.0d);
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
    public void test20379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20379");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 10, 10.0d, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 1.0f, 100, (short) 0, 1L, ' ', '#' };
        double[] doubleArray21 = new double[] { 1.0f, 100, (short) 0, 1L, ' ', '#' };
        double[] doubleArray28 = new double[] { 1.0f, 100, (short) 0, 1L, ' ', '#' };
        double[] doubleArray35 = new double[] { 1.0f, 100, (short) 0, 1L, ' ', '#' };
        double[][] doubleArray36 = new double[][] { doubleArray14, doubleArray21, doubleArray28, doubleArray35 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray36, 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0, 100.0, 0.0, 1.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 100.0, 0.0, 1.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0, 100.0, 0.0, 1.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 100.0, 0.0, 1.0, 32.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
    }

    @Test
    public void test20380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20380");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (byte) 1, 35.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray25 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) 100.0f);
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        double double37 = pointCostPair36.getCost();
        double[] doubleArray38 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 0);
        double[] doubleArray41 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray25, doubleArray41, (int) ' ', (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20381");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 0L, 35.0d, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        double double22 = pointCostPair20.getCost();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double[] doubleArray24 = pointCostPair20.getPoint();
        double double25 = pointCostPair20.getCost();
        double[] doubleArray26 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray26, (double) 0.0f);
        double[] doubleArray35 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray26, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20382");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(1.0d, (double) 'a', 0.0d, (-1.0d));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { (short) -1, 1L, (short) 100, 10L, 1.0d };
        double[] doubleArray19 = new double[] { (short) -1, 1L, (short) 100, 10L, 1.0d };
        double[] doubleArray25 = new double[] { (short) -1, 1L, (short) 100, 10L, 1.0d };
        double[] doubleArray31 = new double[] { (short) -1, 1L, (short) 100, 10L, 1.0d };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray32, (int) (byte) 10, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 1.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20383");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 10, (double) (short) 1, (double) (short) 1);
    }

    @Test
    public void test20384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20384");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) 100L, (double) 1L, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double double21 = pointCostPair18.getCost();
        double double22 = pointCostPair18.getCost();
        double[] doubleArray23 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 100.0f);
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (short) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair45 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray23, doubleArray32, (int) (short) 100, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20385");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1.0f), (double) ' ', (double) 100.0f);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair14 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13);
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
    public void test20386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20386");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 0.0f, (double) 100L, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (byte) 100);
        double[] doubleArray28 = pointCostPair27.getPoint();
        double[] doubleArray35 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (-1.0f));
        double double40 = pointCostPair39.getCost();
        double double41 = pointCostPair39.getCost();
        double[] doubleArray42 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, 1.0d);
        double double49 = pointCostPair48.getCost();
        double[] doubleArray50 = pointCostPair48.getPoint();
        double[] doubleArray51 = pointCostPair48.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray28, doubleArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20387");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) (byte) -1, (double) 100L, (double) (short) 10);
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
    public void test20388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20388");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) '#', (double) (byte) 10, (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 0.0f);
        double[] doubleArray24 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) '#');
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray28 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) 1);
        double[] doubleArray44 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 1L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) (short) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair50 = new org.apache.commons.math.optimization.PointCostPair(doubleArray44, (double) 1);
        double[] doubleArray51 = pointCostPair50.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair57 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair59 = new org.apache.commons.math.optimization.PointCostPair(doubleArray51, (double) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair62 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray28, doubleArray51, (int) (short) 100, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20389");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (-1.0f), 10.0d, (double) 1.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { 35.0d, (short) 1, (-1), 'a' };
        double[][] doubleArray13 = new double[][] { doubleArray12 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray13, (int) (byte) -1, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[35.0, 1.0, -1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
    }

    @Test
    public void test20390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20390");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) 100, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 10.0f, (-1) };
        double[] doubleArray13 = new double[] { 10.0f, (-1) };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair15 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
    }

    @Test
    public void test20391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20391");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, (double) (-1), (double) 100.0f, (double) '#');
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
    public void test20392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20392");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1), 1.0d, (double) 1, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 10);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double[] doubleArray21 = pointCostPair18.getPoint();
        double[] doubleArray22 = pointCostPair18.getPoint();
        double[] doubleArray23 = pointCostPair18.getPoint();
        double[] doubleArray24 = pointCostPair18.getPoint();
        double[] doubleArray29 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (short) 1);
        double[] doubleArray32 = pointCostPair31.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) 10L);
        double double37 = pointCostPair36.getCost();
        double[] doubleArray38 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 52.0d);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray24, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test20393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20393");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 100, (double) 10.0f, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 97.0d, 100, (short) 1, (-1), (-1L) };
        double[] doubleArray19 = new double[] { 97.0d, 100, (short) 1, (-1), (-1L) };
        double[] doubleArray25 = new double[] { 97.0d, 100, (short) 1, (-1), (-1L) };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[97.0, 100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[97.0, 100.0, 1.0, -1.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20394");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(35.0d, (double) 1.0f, (double) 10.0f, 32.0d);
    }

    @Test
    public void test20395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20395");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 0.0f, (double) 100L, 32.0d);
    }

    @Test
    public void test20396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20396");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (-1.0d), (double) 100L, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 10);
        double[] doubleArray26 = pointCostPair25.getPoint();
        double[] doubleArray27 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) 1);
        double[] doubleArray30 = pointCostPair29.getPoint();
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        double double40 = pointCostPair39.getCost();
        double[] doubleArray41 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) (byte) 0);
        double double46 = pointCostPair45.getCost();
        double[] doubleArray47 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair52 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray30, doubleArray47, 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20397");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 10.0f, (double) (short) 10, (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, doubleArray8, (int) (byte) 100, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20398");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 32.0d, (double) (-1L), (double) '4');
    }

    @Test
    public void test20399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20399");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (byte) 0, (double) 0, 100.0d);
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
    public void test20400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20400");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) '#', (double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 97.0d, 0, (byte) 10 };
        double[] doubleArray15 = new double[] { 97.0d, 0, (byte) 10 };
        double[] doubleArray19 = new double[] { 97.0d, 0, (byte) 10 };
        double[] doubleArray23 = new double[] { 97.0d, 0, (byte) 10 };
        double[] doubleArray27 = new double[] { 97.0d, 0, (byte) 10 };
        double[] doubleArray31 = new double[] { 97.0d, 0, (byte) 10 };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[97.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20401");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) 'a', (double) (short) 10, (double) (-1));
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
    public void test20402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20402");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 100.0f, (double) (-1.0f), (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) 10, (short) 0, 32.0d, 0L };
        double[] doubleArray17 = new double[] { (byte) 10, (short) 0, 32.0d, 0L };
        double[] doubleArray22 = new double[] { (byte) 10, (short) 0, 32.0d, 0L };
        double[][] doubleArray23 = new double[][] { doubleArray12, doubleArray17, doubleArray22 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair24 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 0.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 0.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test20403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20403");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (-1L), (double) (short) 10, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) -1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (-1));
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) '#');
        double[] doubleArray43 = pointCostPair42.getPoint();
        double double44 = pointCostPair42.getCost();
        double[] doubleArray45 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 1);
        double[] doubleArray48 = pointCostPair47.getPoint();
        double[] doubleArray49 = pointCostPair47.getPoint();
        double[] doubleArray50 = pointCostPair47.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray21, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 35.0d + "'", double44 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20404");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1.0f), (double) 10.0f, (double) (byte) 10, (double) (-1L));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray8, 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test20405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20405");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) (short) 100, (double) 0.0f, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { ' ', (byte) 1, (byte) 100 };
        double[] doubleArray15 = new double[] { ' ', (byte) 1, (byte) 100 };
        double[] doubleArray19 = new double[] { ' ', (byte) 1, (byte) 100 };
        double[] doubleArray23 = new double[] { ' ', (byte) 1, (byte) 100 };
        double[] doubleArray27 = new double[] { ' ', (byte) 1, (byte) 100 };
        double[] doubleArray31 = new double[] { ' ', (byte) 1, (byte) 100 };
        double[][] doubleArray32 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23, doubleArray27, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test20406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20406");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) '#', 0.0d, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 0, convergenceChecker7, doubleArray8, (int) (byte) 10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20407");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 0L, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test20408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20408");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 100, 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (-1L));
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 1.0f);
        double[] doubleArray35 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray35, 35.0d);
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair46 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair51 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray22, doubleArray42, (int) (byte) 10, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20409");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, (double) '4', (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test20410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20410");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) ' ', (double) 1, 35.0d, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (byte) 0);
        double[] doubleArray23 = pointCostPair22.getPoint();
        double[] doubleArray24 = pointCostPair22.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair40 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray24, doubleArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20411");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (-1.0f), (double) ' ', (double) 100.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 0L, '#' };
        double[] doubleArray13 = new double[] { 0L, '#' };
        double[] doubleArray16 = new double[] { 0L, '#' };
        double[] doubleArray19 = new double[] { 0L, '#' };
        double[] doubleArray22 = new double[] { 0L, '#' };
        double[] doubleArray25 = new double[] { 0L, '#' };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray26, 10, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, 35.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test20412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20412");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (short) 0, (double) (byte) 10, (double) (byte) -1);
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
    public void test20413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20413");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (double) 100L, (double) (-1.0f), (double) (byte) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) (byte) 0);
        double[] doubleArray22 = pointCostPair21.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) -1);
        double double29 = pointCostPair28.getCost();
        double[] doubleArray30 = pointCostPair28.getPoint();
        double[] doubleArray31 = pointCostPair28.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) 100.0f);
        double[] doubleArray40 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 1);
        double double45 = pointCostPair44.getCost();
        double[] doubleArray46 = pointCostPair44.getPoint();
        double[] doubleArray47 = pointCostPair44.getPoint();
        double double48 = pointCostPair44.getCost();
        double[] doubleArray49 = pointCostPair44.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair52 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray31, doubleArray49, (int) (byte) 10, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20414");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) 'a', (double) 1, 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray8, (double) (byte) 1);
        double[] doubleArray19 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 10);
        double double24 = pointCostPair23.getCost();
        double[] doubleArray25 = pointCostPair23.getPoint();
        double[] doubleArray26 = pointCostPair23.getPoint();
        double[] doubleArray27 = pointCostPair23.getPoint();
        double[] doubleArray28 = pointCostPair23.getPoint();
        double double29 = pointCostPair23.getCost();
        double[] doubleArray30 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 32.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair35 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20415");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 32.0d, (double) '#', 100.0d);
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
    public void test20416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20416");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (-1L), 0.0d, (double) 10);
    }

    @Test
    public void test20417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20417");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, 97.0d, (double) (short) 10, (double) 10L);
    }

    @Test
    public void test20418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20418");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 0, (double) (byte) 1, (double) 100, (double) '#');
    }

    @Test
    public void test20419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20419");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(10.0d, (double) 10L, (double) (byte) 10, 32.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double[] doubleArray21 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, 1.0d);
        double double28 = pointCostPair27.getCost();
        double[] doubleArray29 = pointCostPair27.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray29, (double) (byte) 0);
        double[] doubleArray38 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) 1);
        double double45 = pointCostPair44.getCost();
        double[] doubleArray46 = pointCostPair44.getPoint();
        double[] doubleArray47 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair55 = new org.apache.commons.math.optimization.PointCostPair(doubleArray47, 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair56 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray29, doubleArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test20420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20420");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (byte) -1, (double) 1.0f, (double) 100.0f);
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
    public void test20421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20421");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 10, (double) 'a', 0.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[] doubleArray9 = new double[] {};
        double[][] doubleArray10 = new double[][] { doubleArray8, doubleArray9 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair13 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray10, 0, (-1L));
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
    public void test20422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20422");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (byte) 0, (double) 10L, (double) 0L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, randomVectorGenerator8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20423");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) (byte) -1, 52.0d, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, randomVectorGenerator8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20424");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, 1.0d, (double) (byte) 100, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = new double[] {};
        double[][] doubleArray9 = new double[][] { doubleArray8 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray9, (int) (byte) 10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: row and column dimensions must be postive");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
    }

    @Test
    public void test20425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20425");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) 10, (double) (-1L), (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, (int) (short) 1, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20426");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, 35.0d, (double) 100, 32.0d);
    }

    @Test
    public void test20427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20427");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (-1.0d), (double) 100L, (double) 10.0f);
    }

    @Test
    public void test20428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20428");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, 0.0d, (double) 0L, (double) (short) 10);
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
    public void test20429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20429");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) ' ', (double) 0L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 10.0d, 10.0d, 100.0d, 1, 100.0f, 100.0d };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair16 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[10.0, 10.0, 100.0, 1.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test20430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20430");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(97.0d, (double) 0, (double) 100L, (double) '#');
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
    public void test20431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20431");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', 1.0d, (double) (short) 10, (double) '4');
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
    public void test20432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20432");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, 0.0d, (double) (short) -1, (-1.0d));
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
    public void test20433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20433");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, 0.0d, (double) 1.0f, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray23, (double) 1L);
        double double26 = pointCostPair25.getCost();
        double[] doubleArray27 = pointCostPair25.getPoint();
        double[] doubleArray28 = pointCostPair25.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        double double40 = pointCostPair39.getCost();
        double[] doubleArray41 = pointCostPair39.getPoint();
        double[] doubleArray42 = pointCostPair39.getPoint();
        double[] doubleArray43 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) 10L);
        double[] doubleArray46 = pointCostPair45.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair48 = new org.apache.commons.math.optimization.PointCostPair(doubleArray46, (double) (-1.0f));
        double double49 = pointCostPair48.getCost();
        double[] doubleArray50 = pointCostPair48.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair52 = new org.apache.commons.math.optimization.PointCostPair(doubleArray50, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair55 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray28, doubleArray50, (-1), 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }
}

