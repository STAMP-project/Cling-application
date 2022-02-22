import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((-1.0d), (-1.0d), (double) '#', 97.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, randomVectorGenerator8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (short) 0, (double) (byte) 1, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 52.0d, 1L, (-1), 'a', ' ' };
        double[] doubleArray19 = new double[] { 52.0d, 1L, (-1), 'a', ' ' };
        double[] doubleArray25 = new double[] { 52.0d, 1L, (-1), 'a', ' ' };
        double[][] doubleArray26 = new double[][] { doubleArray13, doubleArray19, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray26, (-1), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 1.0, -1.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 1.0, -1.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 1.0, -1.0, 97.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray17 = convergenceException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { "hi!", throwableArray17 };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) costException23);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray38 = convergenceException37.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray38);
        java.lang.Object[] objArray43 = new java.lang.Object[] { "hi!", throwableArray38 };
        org.apache.commons.math.optimization.CostException costException44 = new org.apache.commons.math.optimization.CostException("", objArray43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException44);
        java.lang.Throwable[] throwableArray46 = costException44.getSuppressed();
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("not positive definite matrix", (java.lang.Throwable) costException47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Throwable) mathException49);
        java.lang.Throwable[] throwableArray51 = convergenceException50.getSuppressed();
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException56);
        mathException52.addSuppressed((java.lang.Throwable) mathException56);
        java.lang.String str60 = mathException52.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException" + "'", str60, "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException");
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (byte) 100, (double) (short) -1, (double) 10L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { (short) 1, (-1) };
        double[] doubleArray13 = new double[] { (short) 1, (-1) };
        double[] doubleArray16 = new double[] { (short) 1, (-1) };
        double[] doubleArray19 = new double[] { (short) 1, (-1) };
        double[] doubleArray22 = new double[] { (short) 1, (-1) };
        double[] doubleArray25 = new double[] { (short) 1, (-1) };
        double[][] doubleArray26 = new double[][] { doubleArray10, doubleArray13, doubleArray16, doubleArray19, doubleArray22, doubleArray25 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray26);
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
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9);
        java.lang.Object[] objArray11 = convergenceException10.getArguments();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray11, (java.lang.Throwable) mathException24);
        java.lang.Object[] objArray27 = mathException26.getArguments();
        java.lang.Object[] objArray28 = mathException26.getArguments();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray36 = convergenceException35.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray46 = convergenceException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", throwableArray46 };
        org.apache.commons.math.optimization.CostException costException52 = new org.apache.commons.math.optimization.CostException("", objArray51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("hi!", objArray51);
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException53);
        convergenceException37.addSuppressed((java.lang.Throwable) convergenceException53);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", objArray28, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException61);
        java.lang.String str63 = convergenceException62.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException62);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray28, (java.lang.Throwable) convergenceException62);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray28);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str63, "org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { "hi!", throwableArray11 };
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        java.lang.String str27 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray16, (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", objArray32, (java.lang.Throwable) mathException41);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", objArray16, (java.lang.Throwable) convergenceException42);
        java.lang.Object[] objArray44 = convergenceException42.getArguments();
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException42);
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException((java.lang.Throwable) costException45);
        java.lang.Throwable[] throwableArray48 = costException45.getSuppressed();
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray48);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray60 = convergenceException59.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray60, (java.lang.Throwable) convergenceException62);
        org.apache.commons.math.optimization.CostException costException64 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.optimization.CostException costException65 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.optimization.CostException costException66 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.optimization.CostException costException68 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.optimization.CostException costException69 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.optimization.CostException costException70 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray48, (java.lang.Throwable) costException70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) mathException71);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray60);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 1, (double) (byte) -1, (double) (short) 1);
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
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray8);
        java.lang.Object[] objArray10 = convergenceException9.getArguments();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray14, (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", objArray10, (java.lang.Throwable) mathException23);
        java.lang.Throwable[] throwableArray26 = mathException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException30);
        java.lang.Class<?> wildcardClass33 = mathException30.getClass();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException4);
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException4);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException7);
        java.lang.Object[] objArray9 = mathException8.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray23 = convergenceException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "hi!", throwableArray23 };
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray28);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", objArray28);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray28);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray43 = convergenceException42.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray43, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray43);
        java.lang.Object[] objArray48 = new java.lang.Object[] { "hi!", throwableArray43 };
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException("", objArray48);
        mathException36.addSuppressed((java.lang.Throwable) costException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException36);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray28, (java.lang.Throwable) mathException36);
        java.lang.Throwable[] throwableArray53 = mathException36.getSuppressed();
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.optimization.CostException costException55 = new org.apache.commons.math.optimization.CostException(throwable54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException55);
        mathException36.addSuppressed((java.lang.Throwable) convergenceException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException36);
        java.lang.Throwable[] throwableArray59 = mathException58.getSuppressed();
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: not positive definite matrix", (java.lang.Throwable) mathException58);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray9, (java.lang.Throwable) mathException60);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray68 = convergenceException67.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray68, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.optimization.CostException costException72 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray68);
        java.lang.Object[] objArray73 = new java.lang.Object[] { "hi!", throwableArray68 };
        org.apache.commons.math.optimization.CostException costException74 = new org.apache.commons.math.optimization.CostException("", objArray73);
        java.lang.Object[] objArray78 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray83 = convergenceException82.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray83, (java.lang.Throwable) convergenceException85);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException86);
        org.apache.commons.math.ConvergenceException convergenceException88 = new org.apache.commons.math.ConvergenceException("", objArray78, (java.lang.Throwable) mathException87);
        costException74.addSuppressed((java.lang.Throwable) mathException87);
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException74);
        org.apache.commons.math.ConvergenceException convergenceException91 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException", objArray9, (java.lang.Throwable) costException74);
        java.lang.String str92 = convergenceException91.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray78), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray78), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException" + "'", str92, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException");
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) mathException24);
        java.lang.Throwable throwable27 = null;
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException(throwable27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray40 = convergenceException39.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.optimization.CostException costException44 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { "hi!", throwableArray40 };
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException("", objArray45);
        mathException33.addSuppressed((java.lang.Throwable) costException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) mathException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray58 = convergenceException57.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray58, (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.optimization.CostException costException62 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray58);
        org.apache.commons.math.optimization.CostException costException63 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray58);
        org.apache.commons.math.optimization.CostException costException64 = new org.apache.commons.math.optimization.CostException("hi!", (java.lang.Object[]) throwableArray58);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) costException64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: not positive definite matrix", (java.lang.Object[]) throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray17);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: not positive definite matrix", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", objArray17);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray17);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException18);
        java.lang.Throwable[] throwableArray20 = costException18.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("not positive definite matrix", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray20);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray20, throwable24);
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray20);
        java.lang.Throwable[] throwableArray27 = costException26.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray34 = convergenceException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray34);
        java.lang.Object[] objArray36 = convergenceException35.getArguments();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray45 = convergenceException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException48);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("", objArray40, (java.lang.Throwable) mathException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", objArray36, (java.lang.Throwable) mathException49);
        java.lang.Object[] objArray52 = mathException51.getArguments();
        java.lang.Object[] objArray53 = mathException51.getArguments();
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray53);
        org.apache.commons.math.optimization.CostException costException55 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: ", objArray53);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException((java.lang.Throwable) costException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) costException55);
        org.apache.commons.math.optimization.CostException costException58 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException57);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException58);
        java.lang.String str60 = costException58.getPattern();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException9);
        java.lang.String str11 = mathException10.getPattern();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException10);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException12);
        java.lang.Throwable[] throwableArray14 = mathException13.getSuppressed();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray27 = convergenceException26.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("", objArray22, (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException33);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException33);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) mathException33);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray27);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", objArray17);
        java.lang.String str20 = mathException19.getPattern();
        java.lang.Object[] objArray21 = mathException19.getArguments();
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: hi!", objArray21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", objArray21);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray28 = convergenceException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray38 = convergenceException37.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray38);
        java.lang.Object[] objArray43 = new java.lang.Object[] { "hi!", throwableArray38 };
        org.apache.commons.math.optimization.CostException costException44 = new org.apache.commons.math.optimization.CostException("", objArray43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!", objArray43);
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException45);
        convergenceException29.addSuppressed((java.lang.Throwable) convergenceException45);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", objArray21, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray21);
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray21);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str20, "org.apache.commons.math.ConvergenceException: ");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[hi!, []]");
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray9);
        java.lang.Throwable[] throwableArray14 = costException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray16 = convergenceException15.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException15);
        java.lang.Throwable[] throwableArray18 = convergenceException15.getSuppressed();
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray18);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray32 = convergenceException31.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray27, (java.lang.Throwable) mathException36);
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException36);
        java.lang.Throwable[] throwableArray39 = costException38.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray39);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray53 = convergenceException52.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray53, (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.optimization.CostException costException57 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray53);
        java.lang.Object[] objArray58 = new java.lang.Object[] { "hi!", throwableArray53 };
        org.apache.commons.math.optimization.CostException costException59 = new org.apache.commons.math.optimization.CostException("", objArray58);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray64 = convergenceException63.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray64, (java.lang.Throwable) convergenceException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException67);
        java.lang.String str69 = mathException68.getPattern();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("", objArray58, (java.lang.Throwable) mathException68);
        org.apache.commons.math.optimization.CostException costException71 = new org.apache.commons.math.optimization.CostException("hi!", objArray58);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray58);
        convergenceException42.addSuppressed((java.lang.Throwable) mathException72);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException42);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray39, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException76);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException76);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) convergenceException78);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray5);
        java.lang.Object[] objArray11 = costException10.getArguments();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, (double) 1L, (double) (byte) 1, (double) (short) 1);
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
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException8);
        java.lang.Throwable[] throwableArray10 = costException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray21 = convergenceException20.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray21);
        java.lang.Throwable[] throwableArray26 = costException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray31 = convergenceException30.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) convergenceException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray31);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException35);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray44 = convergenceException43.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.optimization.CostException costException48 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { "hi!", throwableArray44 };
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!", objArray49);
        org.apache.commons.math.optimization.CostException costException52 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray62 = convergenceException61.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray62, (java.lang.Throwable) convergenceException64);
        org.apache.commons.math.optimization.CostException costException66 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray62);
        java.lang.Object[] objArray67 = new java.lang.Object[] { "hi!", throwableArray62 };
        org.apache.commons.math.optimization.CostException costException68 = new org.apache.commons.math.optimization.CostException("", objArray67);
        java.lang.Object[] objArray72 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray77 = convergenceException76.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray77, (java.lang.Throwable) convergenceException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException80);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("", objArray72, (java.lang.Throwable) mathException81);
        costException68.addSuppressed((java.lang.Throwable) mathException81);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException68);
        java.lang.Object[] objArray85 = costException68.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) costException68);
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException91 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException90);
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) mathException91);
        org.apache.commons.math.ConvergenceException convergenceException93 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) mathException91);
        org.apache.commons.math.optimization.CostException costException94 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException91);
        org.apache.commons.math.ConvergenceException convergenceException95 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) costException94);
        org.apache.commons.math.ConvergenceException convergenceException96 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) convergenceException95);
        java.lang.String str97 = convergenceException95.toString();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str97, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray13 = convergenceException12.getArguments();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("", objArray17, (java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray13, (java.lang.Throwable) mathException26);
        java.lang.Throwable[] throwableArray29 = mathException26.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray34 = convergenceException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray34);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) costException38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray29);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray29);
        java.lang.Throwable[] throwableArray43 = costException42.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray43);
        java.lang.Object[] objArray46 = convergenceException45.getArguments();
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: ", objArray46);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray5);
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray14, (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        costException9.addSuppressed((java.lang.Throwable) mathException25);
        java.lang.Object[] objArray27 = mathException25.getArguments();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray27);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (short) 100, (double) 100.0f, 32.0d);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 'a', (double) (short) -1, (double) 'a', 35.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[][] doubleArray8 = new double[][] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair11 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, (int) ' ', (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 1, (-1.0d), 1.0d);
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
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (short) 100, (double) 0, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 1);
        double[] doubleArray16 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair29 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray8, doubleArray16, 100, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException11);
        java.lang.String str13 = mathException12.getPattern();
        java.lang.Throwable[] throwableArray14 = mathException12.getSuppressed();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray25 = convergenceException24.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("", objArray20, (java.lang.Throwable) mathException29);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) mathException31);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: not positive definite matrix", (java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException36);
        java.lang.Object[] objArray44 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray49 = convergenceException48.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray49, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException52);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("", objArray44, (java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException54);
        java.lang.Object[] objArray56 = convergenceException54.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray60 = convergenceException59.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray56, (java.lang.Throwable) convergenceException61);
        java.lang.Object[] objArray63 = mathException62.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException62);
        mathException37.addSuppressed((java.lang.Throwable) convergenceException64);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[10, 10]");
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (byte) -1, (double) (byte) 1, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double double23 = pointCostPair20.getCost();
        double[] doubleArray24 = pointCostPair20.getPoint();
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (byte) 1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (byte) -1);
        double[] doubleArray43 = pointCostPair42.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair46 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray24, doubleArray43, (-1), 0L);
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 97.0d + "'", double23 == 97.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        java.lang.Throwable[] throwableArray12 = costException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray14 = convergenceException13.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray31 = convergenceException30.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) convergenceException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) mathException35);
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.optimization.CostException costException39 = new org.apache.commons.math.optimization.CostException(throwable38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", objArray14, (java.lang.Throwable) costException42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException43);
        java.lang.String str45 = mathException44.getPattern();
        java.lang.Class<?> wildcardClass46 = mathException44.getClass();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.math.MathException: " + "'", str45, "org.apache.commons.math.MathException: ");
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { "hi!", throwableArray11 };
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        java.lang.String str27 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray16, (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", objArray32, (java.lang.Throwable) mathException41);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!", objArray16, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("", objArray16, (java.lang.Throwable) convergenceException44);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray49 = convergenceException48.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray16, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException52);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException52);
        java.lang.String str55 = mathException52.getPattern();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (short) 1, (double) 10.0f, 10.0d);
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
        double[] doubleArray27 = pointCostPair26.getPoint();
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        double[] doubleArray37 = pointCostPair36.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (short) 1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        double[] doubleArray45 = pointCostPair44.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray27, doubleArray45, 0, 10L);
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
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', 52.0d, (double) '#', 0.0d);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException18);
        java.lang.Throwable[] throwableArray20 = costException18.getSuppressed();
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("not positive definite matrix", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException25);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) mathException26);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) -1, 35.0d, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        double double19 = pointCostPair18.getCost();
        double[] doubleArray20 = pointCostPair18.getPoint();
        double double21 = pointCostPair18.getCost();
        double[] doubleArray22 = pointCostPair18.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) 1);
        double[] doubleArray33 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (short) 1);
        double[] doubleArray36 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, 32.0d);
        double[] doubleArray39 = pointCostPair38.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair40 = nelderMead4.minimize(costFunction5, 1, convergenceChecker7, doubleArray22, doubleArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        java.lang.Throwable throwable1 = null;
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", throwable1);
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException2);
        java.lang.String str4 = convergenceException3.getPattern();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!" + "'", str4, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray17 = convergenceException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { "hi!", throwableArray17 };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!", objArray22);
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException24);
        convergenceException8.addSuppressed((java.lang.Throwable) convergenceException24);
        java.lang.Object[] objArray27 = convergenceException24.getArguments();
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray27);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException29);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException29);
        java.lang.Object[] objArray32 = mathException29.getArguments();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!, []]");
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (byte) -1);
        double[] doubleArray13 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 0);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 32.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 97.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray18 = convergenceException17.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) convergenceException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException22);
        java.lang.Throwable throwable25 = null;
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException(throwable25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException26);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException27);
        java.lang.Throwable[] throwableArray29 = convergenceException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray37);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray46 = convergenceException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException50);
        java.lang.Throwable throwable53 = null;
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException(throwable53);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.optimization.CostException costException57 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray37);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException57);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException57);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException57);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) costException57);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray29);
        java.lang.Throwable throwable63 = null;
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray29, throwable63);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray46);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { "hi!", throwableArray19 };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) costException25);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray32 = convergenceException31.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException36);
        costException25.addSuppressed((java.lang.Throwable) convergenceException37);
        java.lang.Object[] objArray39 = convergenceException37.getArguments();
        java.lang.Throwable throwable40 = null;
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("", objArray39, throwable40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", objArray39);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray39);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("Convergence failed", (java.lang.Throwable) mathException43);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException44);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '4', (double) (byte) 1, (double) 0L, (double) 0);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 1);
        double[] doubleArray32 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray32, (double) (byte) -1);
        double[] doubleArray39 = pointCostPair38.getPoint();
        double double40 = pointCostPair38.getCost();
        double[] doubleArray41 = pointCostPair38.getPoint();
        double[] doubleArray42 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray21, doubleArray42, (int) ' ', (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException5);
        java.lang.Throwable[] throwableArray7 = convergenceException5.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray7);
        java.lang.Throwable throwable11 = null;
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException(throwable11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException12);
        java.lang.Object[] objArray14 = costException12.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException18);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException6);
        java.lang.Object[] objArray8 = convergenceException6.getArguments();
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException6);
        java.lang.Throwable[] throwableArray10 = costException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray15 = convergenceException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) convergenceException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) mathException19);
        java.lang.Throwable throwable21 = null;
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray10, throwable21);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray10);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray34 = convergenceException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray34);
        java.lang.Object[] objArray39 = new java.lang.Object[] { "hi!", throwableArray34 };
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException("", objArray39);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray45 = convergenceException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException48);
        java.lang.String str50 = mathException49.getPattern();
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("", objArray39, (java.lang.Throwable) mathException49);
        org.apache.commons.math.optimization.CostException costException52 = new org.apache.commons.math.optimization.CostException("hi!", objArray39);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray39);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray60 = convergenceException59.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray60, (java.lang.Throwable) convergenceException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray60);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray69 = convergenceException68.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray69, (java.lang.Throwable) convergenceException71);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException73);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray60, (java.lang.Throwable) mathException73);
        java.lang.Throwable throwable76 = null;
        org.apache.commons.math.optimization.CostException costException77 = new org.apache.commons.math.optimization.CostException(throwable76);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray60, (java.lang.Throwable) convergenceException78);
        convergenceException53.addSuppressed((java.lang.Throwable) convergenceException79);
        java.lang.Object[] objArray81 = convergenceException79.getArguments();
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray81);
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException82);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: not positive definite matrix", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) costException83);
        java.lang.Throwable[] throwableArray85 = costException83.getSuppressed();
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray8);
        java.lang.Object[] objArray13 = new java.lang.Object[] { "hi!", throwableArray8 };
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray26 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray26);
        java.lang.Object[] objArray28 = convergenceException27.getArguments();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("", objArray32, (java.lang.Throwable) mathException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", objArray28, (java.lang.Throwable) mathException41);
        java.lang.Throwable[] throwableArray44 = mathException41.getSuppressed();
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) mathException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray44);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray44);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray44);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException53);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) mathException53);
        convergenceException16.addSuppressed((java.lang.Throwable) mathException53);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray44);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, (double) (short) 1, (double) 10L, (double) (byte) 100);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray7);
        java.lang.Object[] objArray9 = convergenceException8.getArguments();
        java.lang.Object[] objArray13 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray18 = convergenceException17.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) convergenceException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("", objArray13, (java.lang.Throwable) mathException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", objArray9, (java.lang.Throwable) mathException22);
        java.lang.Throwable[] throwableArray25 = mathException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray30 = convergenceException29.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) convergenceException32);
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray30);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) costException34);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray44 = convergenceException43.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.optimization.CostException costException48 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { "hi!", throwableArray44 };
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("", objArray49);
        mathException37.addSuppressed((java.lang.Throwable) costException50);
        java.lang.Object[] objArray52 = mathException37.getArguments();
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        mathException37.addSuppressed((java.lang.Throwable) mathException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) mathException37);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray6);
        java.lang.Object[] objArray11 = new java.lang.Object[] { "hi!", throwableArray6 };
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", objArray11);
        java.lang.Throwable[] throwableArray13 = costException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException((java.lang.Throwable) costException12);
        java.lang.String str15 = mathException14.getPattern();
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException14);
        java.lang.Class<?> wildcardClass17 = mathException14.getClass();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { "hi!", throwableArray10 };
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray15);
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException19 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray20 = notPositiveDefiniteMatrixException19.getArguments();
        java.lang.Throwable[] throwableArray21 = notPositiveDefiniteMatrixException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray15, (java.lang.Throwable) mathException25);
        java.lang.Throwable[] throwableArray27 = mathException25.getSuppressed();
        java.lang.Object[] objArray28 = mathException25.getArguments();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray28);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.Object[] objArray8 = convergenceException7.getArguments();
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray8);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray8);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", objArray8);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException11);
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException11);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray27 = convergenceException26.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { "hi!", throwableArray27 };
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException("", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray32);
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException38);
        java.lang.Object[] objArray40 = convergenceException38.getArguments();
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException38);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray32, (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException38);
        java.lang.Object[] objArray44 = costException43.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray50 = convergenceException49.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray50);
        java.lang.Object[] objArray52 = convergenceException51.getArguments();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray61 = convergenceException60.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray61, (java.lang.Throwable) convergenceException63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException64);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("", objArray56, (java.lang.Throwable) mathException65);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", objArray52, (java.lang.Throwable) mathException65);
        java.lang.Throwable[] throwableArray68 = mathException65.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException65);
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray44, (java.lang.Throwable) mathException65);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", objArray44);
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException71);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException71);
        java.lang.String str74 = mathException71.getPattern();
        org.apache.commons.math.optimization.CostException costException75 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException71);
        java.lang.Object[] objArray76 = costException75.getArguments();
        org.apache.commons.math.optimization.CostException costException77 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray76);
        convergenceException11.addSuppressed((java.lang.Throwable) costException77);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray56), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray56), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "org.apache.commons.math.MathException" + "'", str74, "org.apache.commons.math.MathException");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) 10, (double) 0L, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        double[] doubleArray18 = pointCostPair17.getPoint();
        double[] doubleArray19 = pointCostPair17.getPoint();
        double[] doubleArray20 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, (double) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 35.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray20, 32.0d);
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        double double36 = pointCostPair35.getCost();
        double[] doubleArray37 = pointCostPair35.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) (byte) 0);
        double[] doubleArray42 = pointCostPair41.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray42, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair47 = nelderMead4.minimize(costFunction5, (int) (byte) 10, convergenceChecker7, doubleArray20, doubleArray42, (int) '4', (long) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray26 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { "hi!", throwableArray26 };
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException("", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) costException32);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray45 = convergenceException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray45);
        java.lang.Object[] objArray50 = new java.lang.Object[] { "hi!", throwableArray45 };
        org.apache.commons.math.optimization.CostException costException51 = new org.apache.commons.math.optimization.CostException("", objArray50);
        mathException38.addSuppressed((java.lang.Throwable) costException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException54);
        java.lang.Throwable[] throwableArray56 = mathException54.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray56);
        java.lang.Object[] objArray58 = convergenceException57.getArguments();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException3);
        java.lang.Object[] objArray5 = convergenceException4.getArguments();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", objArray5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException6);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException1);
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException1);
        java.lang.Throwable[] throwableArray4 = costException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1.0f, 0.0d, (double) 1.0f, (double) (short) 0);
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
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 1, 10.0d, 100.0d, (double) (-1L));
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
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray13 = convergenceException12.getArguments();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("", objArray17, (java.lang.Throwable) mathException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", objArray13, (java.lang.Throwable) mathException26);
        java.lang.Object[] objArray29 = mathException28.getArguments();
        java.lang.Object[] objArray30 = mathException28.getArguments();
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!", objArray30);
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray41 = convergenceException40.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray41);
        java.lang.Object[] objArray43 = convergenceException42.getArguments();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray52 = convergenceException51.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray52, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("", objArray47, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", objArray43, (java.lang.Throwable) mathException56);
        org.apache.commons.math.optimization.CostException costException59 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: ", objArray43);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray43);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("", objArray30, (java.lang.Throwable) mathException60);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!", objArray30);
        java.lang.String str64 = convergenceException63.getPattern();
        org.apache.commons.math.optimization.CostException costException65 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException63);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!" + "'", str64, "org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), (double) (byte) 1, (double) (short) 0, (double) 100L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        double[] doubleArray15 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100);
        double[] doubleArray30 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, 0.0d);
        double double35 = pointCostPair34.getCost();
        double[] doubleArray36 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray36, (double) 100.0f);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 'a');
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) (byte) -1, convergenceChecker7, doubleArray15, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray13 = convergenceException12.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { "hi!", throwableArray13 };
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException27);
        java.lang.String str29 = mathException28.getPattern();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", objArray18, (java.lang.Throwable) mathException28);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("hi!", objArray18);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray18);
        convergenceException2.addSuppressed((java.lang.Throwable) mathException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Throwable) mathException35);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException40);
        java.lang.Object[] objArray42 = convergenceException40.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray45 = convergenceException44.getSuppressed();
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException44);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray42, (java.lang.Throwable) convergenceException44);
        convergenceException36.addSuppressed((java.lang.Throwable) convergenceException47);
        java.lang.Throwable[] throwableArray49 = convergenceException47.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9);
        java.lang.Object[] objArray11 = convergenceException10.getArguments();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) mathException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", objArray11, (java.lang.Throwable) mathException24);
        java.lang.Object[] objArray27 = mathException26.getArguments();
        java.lang.Object[] objArray28 = mathException26.getArguments();
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray41 = convergenceException40.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray41, (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray41);
        java.lang.Object[] objArray46 = new java.lang.Object[] { "hi!", throwableArray41 };
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException("", objArray46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!", objArray46);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray46);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", objArray46);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray46);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("not positive definite matrix", objArray28, (java.lang.Throwable) mathException51);
        java.lang.Throwable[] throwableArray53 = mathException52.getSuppressed();
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray53);
        java.lang.String str55 = costException54.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) costException54);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.math.MathException: " + "'", str55, "org.apache.commons.math.MathException: ");
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        java.lang.Object[] objArray12 = new java.lang.Object[] { "hi!", throwableArray7 };
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", objArray12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) costException13);
        java.lang.String str16 = costException13.toString();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org.apache.commons.math.optimization.CostException: " + "'", str16, "org.apache.commons.math.optimization.CostException: ");
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { "hi!", throwableArray10 };
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray21 = convergenceException20.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        java.lang.String str26 = mathException25.getPattern();
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException25);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray38 = convergenceException37.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException41);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", objArray33, (java.lang.Throwable) mathException42);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray50 = convergenceException49.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray50, (java.lang.Throwable) convergenceException52);
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray50);
        java.lang.Object[] objArray55 = new java.lang.Object[] { "hi!", throwableArray50 };
        org.apache.commons.math.optimization.CostException costException56 = new org.apache.commons.math.optimization.CostException("", objArray55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException56);
        java.lang.Throwable[] throwableArray58 = costException56.getSuppressed();
        convergenceException43.addSuppressed((java.lang.Throwable) costException56);
        java.lang.String str60 = convergenceException43.getPattern();
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException43);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException61);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) mathException61);
        org.apache.commons.math.optimization.CostException costException64 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException63);
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) costException64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException65);
        java.lang.Object[] objArray72 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray77 = convergenceException76.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray77, (java.lang.Throwable) convergenceException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException80);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("", objArray72, (java.lang.Throwable) mathException81);
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException81);
        java.lang.Object[] objArray84 = mathException81.getArguments();
        org.apache.commons.math.optimization.CostException costException85 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray84);
        org.apache.commons.math.optimization.CostException costException86 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", objArray84);
        mathException66.addSuppressed((java.lang.Throwable) costException86);
        org.apache.commons.math.optimization.CostException costException88 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException66);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray6, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException16);
        java.lang.Object[] objArray18 = convergenceException16.getArguments();
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException16);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("not positive definite matrix", (java.lang.Throwable) costException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException20);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray36 = convergenceException35.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray36, (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray36);
        java.lang.Object[] objArray41 = new java.lang.Object[] { "hi!", throwableArray36 };
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("", objArray41);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray47 = convergenceException46.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray47, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException50);
        java.lang.String str52 = mathException51.getPattern();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("", objArray41, (java.lang.Throwable) mathException51);
        java.lang.Object[] objArray57 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray62 = convergenceException61.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray62, (java.lang.Throwable) convergenceException64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException65);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("", objArray57, (java.lang.Throwable) mathException66);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!", objArray41, (java.lang.Throwable) convergenceException67);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("", objArray41, (java.lang.Throwable) convergenceException69);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", objArray41);
        org.apache.commons.math.optimization.CostException costException72 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", objArray41);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", objArray41);
        java.lang.Throwable[] throwableArray74 = convergenceException73.getSuppressed();
        org.apache.commons.math.optimization.CostException costException75 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray74);
        java.lang.Object[] objArray76 = costException75.getArguments();
        org.apache.commons.math.optimization.CostException costException77 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray76);
        mathException21.addSuppressed((java.lang.Throwable) costException77);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException21);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException80);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException80);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 10L, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (short) 1);
        double double13 = pointCostPair12.getCost();
        double double14 = pointCostPair12.getCost();
        double double15 = pointCostPair12.getCost();
        double double16 = pointCostPair12.getCost();
        double[] doubleArray17 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str4 = mathException3.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException11);
        mathException3.addSuppressed((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) mathException11);
        java.lang.Throwable[] throwableArray15 = mathException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray15);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        double double9 = pointCostPair8.getCost();
        double[] doubleArray10 = pointCostPair8.getPoint();
        double[] doubleArray11 = pointCostPair8.getPoint();
        double[] doubleArray12 = pointCostPair8.getPoint();
        double[] doubleArray13 = pointCostPair8.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 1.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 0);
        double double19 = pointCostPair18.getCost();
        double double20 = pointCostPair18.getCost();
        double double21 = pointCostPair18.getCost();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (-1.0d), (double) 100L, 1.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 10.0d, 'a', 97.0d };
        double[] doubleArray15 = new double[] { 10.0d, 'a', 97.0d };
        double[] doubleArray19 = new double[] { 10.0d, 'a', 97.0d };
        double[] doubleArray23 = new double[] { 10.0d, 'a', 97.0d };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair27 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray24, (int) (short) -1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 97.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { "hi!", throwableArray11 };
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException18);
        java.lang.Object[] objArray20 = convergenceException19.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray20);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", objArray20, (java.lang.Throwable) mathException23);
        java.lang.Object[] objArray31 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray36 = convergenceException35.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray36, (java.lang.Throwable) convergenceException38);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("", objArray31, (java.lang.Throwable) mathException40);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException40);
        java.lang.Object[] objArray43 = mathException40.getArguments();
        java.lang.Object[] objArray44 = mathException40.getArguments();
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: not positive definite matrix", objArray44);
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: hi!", objArray44);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray54 = convergenceException53.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray54, (java.lang.Throwable) convergenceException56);
        org.apache.commons.math.optimization.CostException costException58 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray54);
        java.lang.Throwable[] throwableArray59 = costException58.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray64 = convergenceException63.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray64, (java.lang.Throwable) convergenceException66);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray64);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray59, (java.lang.Throwable) mathException68);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException68);
        java.lang.Object[] objArray71 = convergenceException70.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray71);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("not positive definite matrix");
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException74);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray71, (java.lang.Throwable) mathException74);
        java.lang.String str77 = convergenceException76.getPattern();
        costException46.addSuppressed((java.lang.Throwable) convergenceException76);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray20, (java.lang.Throwable) costException46);
        org.apache.commons.math.optimization.CostException costException80 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException79);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: " + "'", str77, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ");
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100L, (double) '#', 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        double[] doubleArray21 = pointCostPair20.getPoint();
        double[] doubleArray22 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) 10);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) '#');
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray22, (double) (byte) 10);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 10);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (-1));
        double[] doubleArray48 = pointCostPair47.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair49 = nelderMead4.minimize(costFunction5, (int) (short) 100, convergenceChecker7, doubleArray22, doubleArray48);
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
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { "hi!", throwableArray10 };
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray21 = convergenceException20.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        java.lang.String str26 = mathException25.getPattern();
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException25);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException27);
        java.lang.Throwable[] throwableArray29 = mathException27.getSuppressed();
        java.lang.Object[] objArray30 = mathException27.getArguments();
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray37);
        java.lang.Object[] objArray39 = convergenceException38.getArguments();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray48 = convergenceException47.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray48, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", objArray43, (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray39, (java.lang.Throwable) mathException52);
        java.lang.Throwable[] throwableArray55 = mathException52.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException", objArray30, (java.lang.Throwable) convergenceException57);
        java.lang.String str59 = convergenceException57.getPattern();
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException57);
        java.lang.Object[] objArray61 = mathException60.getArguments();
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray61);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str59, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray17 = convergenceException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { "hi!", throwableArray17 };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) costException23);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException28);
        java.lang.Throwable[] throwableArray31 = convergenceException30.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray37);
        java.lang.Object[] objArray39 = convergenceException38.getArguments();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray48 = convergenceException47.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray48, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", objArray43, (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray39, (java.lang.Throwable) mathException52);
        java.lang.Object[] objArray55 = mathException54.getArguments();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException58 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray59 = notPositiveDefiniteMatrixException58.getArguments();
        java.lang.String str60 = notPositiveDefiniteMatrixException58.getPattern();
        org.apache.commons.math.optimization.CostException costException61 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) notPositiveDefiniteMatrixException58);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) notPositiveDefiniteMatrixException58);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray69 = convergenceException68.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray69, (java.lang.Throwable) convergenceException71);
        org.apache.commons.math.optimization.CostException costException73 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray69);
        java.lang.Object[] objArray74 = new java.lang.Object[] { "hi!", throwableArray69 };
        org.apache.commons.math.optimization.CostException costException75 = new org.apache.commons.math.optimization.CostException("", objArray74);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException75);
        java.lang.String str77 = costException75.getPattern();
        notPositiveDefiniteMatrixException58.addSuppressed((java.lang.Throwable) costException75);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Throwable) notPositiveDefiniteMatrixException58);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray55, (java.lang.Throwable) convergenceException79);
        java.lang.String str81 = mathException80.getPattern();
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) mathException80);
        java.lang.String str83 = mathException82.getPattern();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "not positive definite matrix" + "'", str60, "not positive definite matrix");
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str81, "org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!" + "'", str83, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        double[] doubleArray9 = pointCostPair8.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray9, 0.0d);
        double double12 = pointCostPair11.getCost();
        double[] doubleArray13 = pointCostPair11.getPoint();
        double double14 = pointCostPair11.getCost();
        double[] doubleArray15 = pointCostPair11.getPoint();
        double[] doubleArray16 = pointCostPair11.getPoint();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException3 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        java.lang.Object[] objArray4 = notPositiveDefiniteMatrixException3.getArguments();
        java.lang.Throwable[] throwableArray5 = notPositiveDefiniteMatrixException3.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException9);
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException13);
        java.lang.String str15 = costException13.toString();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException" + "'", str15, "org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray18 = convergenceException17.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) convergenceException20);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray28 = convergenceException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray28);
        java.lang.Object[] objArray33 = new java.lang.Object[] { "hi!", throwableArray28 };
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException("", objArray33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) costException34);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray18, (java.lang.Throwable) convergenceException37);
        java.lang.Object[] objArray39 = convergenceException37.getArguments();
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", objArray39);
        java.lang.Object[] objArray41 = mathException40.getArguments();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) mathException40);
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str47 = mathException46.getPattern();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException48 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException48);
        java.lang.Object[] objArray53 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray58 = convergenceException57.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray58, (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException61);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("", objArray53, (java.lang.Throwable) mathException62);
        org.apache.commons.math.optimization.CostException costException64 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException62);
        convergenceException49.addSuppressed((java.lang.Throwable) mathException62);
        mathException46.addSuppressed((java.lang.Throwable) mathException62);
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) mathException62);
        java.lang.String str68 = convergenceException67.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) convergenceException67);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException67);
        org.apache.commons.math.optimization.CostException costException71 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.optimization.CostException costException72 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray78 = convergenceException77.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray78);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException79);
        java.lang.Object[] objArray81 = convergenceException79.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException79);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException79);
        java.lang.Object[] objArray84 = convergenceException79.getArguments();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str68, "org.apache.commons.math.optimization.CostException: hi!");
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray81), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray81), "[]");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) 1);
        double[] doubleArray11 = pointCostPair10.getPoint();
        double[] doubleArray12 = pointCostPair10.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 0);
        double[] doubleArray17 = pointCostPair16.getPoint();
        double double18 = pointCostPair16.getCost();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { "hi!", throwableArray10 };
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray15);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray27 = convergenceException26.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray27, (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray27);
        java.lang.Object[] objArray32 = new java.lang.Object[] { "hi!", throwableArray27 };
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException("", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray32);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException", objArray15, (java.lang.Throwable) convergenceException34);
        java.lang.String str36 = mathException35.getPattern();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException35);
        java.lang.Object[] objArray38 = mathException37.getArguments();
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException37);
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException37);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.apache.commons.math.optimization.CostException" + "'", str36, "org.apache.commons.math.optimization.CostException");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[]");
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100, (double) (short) 100, 10.0d, (double) ' ');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100.0f, (short) 100, (byte) 10 };
        double[] doubleArray15 = new double[] { 100.0f, (short) 100, (byte) 10 };
        double[] doubleArray19 = new double[] { 100.0f, (short) 100, (byte) 10 };
        double[][] doubleArray20 = new double[][] { doubleArray11, doubleArray15, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray20, 0, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 100.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) '4', (double) 10.0f, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        org.apache.commons.math.random.RandomVectorGenerator randomVectorGenerator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair10 = nelderMead4.minimize(costFunction5, (int) (short) -1, convergenceChecker7, randomVectorGenerator8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        java.lang.Throwable throwable2 = null;
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException(throwable2);
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", objArray7, (java.lang.Throwable) mathException16);
        costException3.addSuppressed((java.lang.Throwable) convergenceException17);
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException3);
        java.lang.Object[] objArray20 = costException19.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException19);
        java.lang.Object[] objArray22 = costException19.getArguments();
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", objArray22);
        java.lang.Class<?> wildcardClass25 = objArray22.getClass();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        double double9 = pointCostPair8.getCost();
        double[] doubleArray10 = pointCostPair8.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray10, (double) 10L);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (byte) 100);
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray9);
        java.lang.Throwable[] throwableArray14 = costException13.getSuppressed();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray19 = mathException18.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException27);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException28);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { "hi!", throwableArray37 };
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException("", objArray42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", objArray42);
        java.lang.String str45 = mathException44.getPattern();
        mathException28.addSuppressed((java.lang.Throwable) mathException44);
        java.lang.Throwable[] throwableArray47 = mathException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray19, (java.lang.Throwable) mathException44);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "org.apache.commons.math.ConvergenceException: " + "'", str45, "org.apache.commons.math.ConvergenceException: ");
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        double double11 = pointCostPair10.getCost();
        double[] doubleArray12 = pointCostPair10.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) 100.0f);
        double double15 = pointCostPair14.getCost();
        double[] doubleArray16 = pointCostPair14.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, 10.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 100L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, 10.0d);
        double[] doubleArray25 = pointCostPair24.getPoint();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (short) 1);
        double[] doubleArray13 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) 10.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, 1.0d);
        double[] doubleArray22 = pointCostPair21.getPoint();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { "hi!", throwableArray11 };
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", objArray16);
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException22);
        java.lang.Object[] objArray24 = convergenceException22.getArguments();
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException22);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray16, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException22);
        java.lang.Object[] objArray28 = costException27.getArguments();
        java.lang.Throwable[] throwableArray29 = costException27.getSuppressed();
        mathException1.addSuppressed((java.lang.Throwable) costException27);
        java.lang.String str31 = mathException1.getPattern();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!" + "'", str31, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray5 = mathException2.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException14);
        java.lang.Throwable[] throwableArray16 = convergenceException14.getSuppressed();
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray28 = convergenceException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray28);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException41);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) mathException41);
        java.lang.Throwable throwable44 = null;
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException(throwable44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) convergenceException46);
        java.lang.Throwable[] throwableArray48 = convergenceException46.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.optimization.CostException costException51 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: not positive definite matrix", objArray5, (java.lang.Throwable) convergenceException52);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray48);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.optimization.CostException costException9 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray5);
        java.lang.Object[] objArray14 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("", objArray14, (java.lang.Throwable) mathException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        costException9.addSuppressed((java.lang.Throwable) mathException25);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException9);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Throwable) costException9);
        java.lang.Throwable throwable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            costException9.addSuppressed(throwable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) '#', (double) (-1.0f), 100.0d, (double) 1L);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray11 = new double[] { 100L, 32.0d, 0 };
        double[] doubleArray15 = new double[] { 100L, 32.0d, 0 };
        double[] doubleArray19 = new double[] { 100L, 32.0d, 0 };
        double[] doubleArray23 = new double[] { 100L, 32.0d, 0 };
        double[][] doubleArray24 = new double[][] { doubleArray11, doubleArray15, doubleArray19, doubleArray23 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair25 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[100.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 32.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray9, (java.lang.Throwable) mathException18);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray26 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { "hi!", throwableArray26 };
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException("", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException32);
        java.lang.Throwable[] throwableArray34 = costException32.getSuppressed();
        convergenceException19.addSuppressed((java.lang.Throwable) costException32);
        java.lang.String str36 = convergenceException19.getPattern();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException37);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException39);
        java.lang.Object[] objArray42 = convergenceException39.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", objArray42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray42);
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException44);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { "hi!", throwableArray10 };
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray21 = convergenceException20.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray21, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException24);
        java.lang.String str26 = mathException25.getPattern();
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", objArray15, (java.lang.Throwable) mathException25);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException("hi!", objArray15);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray34 = convergenceException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray34);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray43 = convergenceException42.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray43, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) mathException47);
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException47);
        costException28.addSuppressed((java.lang.Throwable) convergenceException50);
        java.lang.Object[] objArray52 = costException28.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray59 = convergenceException58.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray59, (java.lang.Throwable) convergenceException61);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray59);
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray70 = convergenceException69.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray70, (java.lang.Throwable) convergenceException72);
        org.apache.commons.math.optimization.CostException costException74 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray70);
        java.lang.Object[] objArray75 = new java.lang.Object[] { "hi!", throwableArray70 };
        org.apache.commons.math.optimization.CostException costException76 = new org.apache.commons.math.optimization.CostException("", objArray75);
        mathException63.addSuppressed((java.lang.Throwable) costException76);
        java.lang.String str78 = mathException63.getPattern();
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException63);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException63);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Throwable) mathException80);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: Convergence failed", objArray52, (java.lang.Throwable) convergenceException81);
        java.lang.Throwable[] throwableArray83 = convergenceException82.getSuppressed();
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(throwableArray83);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (byte) 1);
        double[] doubleArray13 = pointCostPair12.getPoint();
        double double14 = pointCostPair12.getCost();
        double[] doubleArray15 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
        org.apache.commons.math.ConvergenceException convergenceException1 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        double[] doubleArray4 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair6 = new org.apache.commons.math.optimization.PointCostPair(doubleArray4, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray4, (-1.0d));
        double[] doubleArray9 = pointCostPair8.getPoint();
        double[] doubleArray10 = pointCostPair8.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray10, (double) (short) 100);
        double[] doubleArray13 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) -1);
        double double16 = pointCostPair15.getCost();
        java.lang.Class<?> wildcardClass17 = pointCostPair15.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        java.lang.Object[] objArray7 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException15);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("", objArray7, (java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException17);
        java.lang.Object[] objArray19 = convergenceException17.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", objArray19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray30 = convergenceException29.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) convergenceException32);
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray30);
        java.lang.Throwable[] throwableArray35 = costException34.getSuppressed();
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray35);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray46 = convergenceException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", throwableArray46 };
        org.apache.commons.math.optimization.CostException costException52 = new org.apache.commons.math.optimization.CostException("", objArray51);
        mathException39.addSuppressed((java.lang.Throwable) costException52);
        java.lang.Object[] objArray54 = mathException39.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("", objArray54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray35, (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException56);
        java.lang.Object[] objArray58 = convergenceException57.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException", objArray58);
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray67 = convergenceException66.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray67, (java.lang.Throwable) convergenceException69);
        org.apache.commons.math.optimization.CostException costException71 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray67);
        java.lang.Throwable[] throwableArray72 = costException71.getSuppressed();
        org.apache.commons.math.optimization.CostException costException73 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray72);
        org.apache.commons.math.MathException mathException76 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray83 = convergenceException82.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray83, (java.lang.Throwable) convergenceException85);
        org.apache.commons.math.optimization.CostException costException87 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray83);
        java.lang.Object[] objArray88 = new java.lang.Object[] { "hi!", throwableArray83 };
        org.apache.commons.math.optimization.CostException costException89 = new org.apache.commons.math.optimization.CostException("", objArray88);
        mathException76.addSuppressed((java.lang.Throwable) costException89);
        java.lang.Object[] objArray91 = mathException76.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException92 = new org.apache.commons.math.ConvergenceException("", objArray91);
        org.apache.commons.math.ConvergenceException convergenceException93 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray72, (java.lang.Throwable) convergenceException92);
        org.apache.commons.math.ConvergenceException convergenceException94 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray72);
        org.apache.commons.math.MathException mathException95 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException", objArray58, (java.lang.Throwable) convergenceException94);
        org.apache.commons.math.ConvergenceException convergenceException96 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", objArray19, (java.lang.Throwable) mathException95);
        org.apache.commons.math.optimization.CostException costException97 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException95);
        java.lang.String str98 = mathException95.getPattern();
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException" + "'", str98, "org.apache.commons.math.MathException: org.apache.commons.math.MathException");
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.String str7 = convergenceException6.getPattern();
        java.lang.Throwable[] throwableArray8 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Object[]) throwableArray8);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        java.lang.Object[] objArray9 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray9, (java.lang.Throwable) mathException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException20);
        java.lang.Object[] objArray22 = mathException21.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray34 = convergenceException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) convergenceException36);
        java.lang.Throwable[] throwableArray38 = convergenceException36.getSuppressed();
        org.apache.commons.math.optimization.CostException costException39 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray38);
        java.lang.Object[] objArray41 = mathException40.getArguments();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray41);
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray41);
        org.apache.commons.math.optimization.CostException costException44 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray41);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray22, (java.lang.Throwable) costException44);
        java.lang.String str46 = mathException45.toString();
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!" + "'", str46, "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (byte) 10);
        double[] doubleArray11 = pointCostPair10.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray11, 35.0d);
        double[] doubleArray14 = pointCostPair13.getPoint();
        double double15 = pointCostPair13.getCost();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException20);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException20);
        java.lang.Throwable throwable23 = null;
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException(throwable23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException25);
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray28);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException31);
        java.lang.String str33 = mathException32.getPattern();
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: " + "'", str33, "org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: ");
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException5);
        java.lang.Throwable[] throwableArray7 = convergenceException5.getSuppressed();
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray7);
        java.lang.Object[] objArray11 = mathException10.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException22);
        java.lang.String str24 = mathException23.getPattern();
        java.lang.Throwable[] throwableArray25 = mathException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray25);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray25);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException28);
        java.lang.Throwable[] throwableArray30 = mathException28.getSuppressed();
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException28);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray11, (java.lang.Throwable) mathException28);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray15 = convergenceException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) convergenceException17);
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray15);
        java.lang.Object[] objArray20 = new java.lang.Object[] { "hi!", throwableArray15 };
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("", objArray20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) costException21);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray28 = convergenceException27.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray28, (java.lang.Throwable) convergenceException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException32);
        costException21.addSuppressed((java.lang.Throwable) convergenceException33);
        java.lang.Object[] objArray35 = convergenceException33.getArguments();
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: not positive definite matrix", objArray35);
        org.apache.commons.math.optimization.CostException costException37 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException36);
        java.lang.Class<?> wildcardClass38 = mathException36.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[]");
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray16);
        java.lang.Object[] objArray21 = new java.lang.Object[] { "hi!", throwableArray16 };
        org.apache.commons.math.optimization.CostException costException22 = new org.apache.commons.math.optimization.CostException("", objArray21);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!", objArray21);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException23);
        convergenceException7.addSuppressed((java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException26);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException27);
        java.lang.Throwable[] throwableArray29 = convergenceException27.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray29);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.Object[] objArray8 = convergenceException7.getArguments();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray17 = convergenceException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray12, (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException21);
        java.lang.Throwable[] throwableArray24 = mathException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException21);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) mathException21);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException21);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException21);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (short) 100, (double) (byte) -1, (double) 0.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (short) -1);
        double[] doubleArray24 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray24, (double) (short) 1);
        double[] doubleArray27 = pointCostPair26.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair29 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair31 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray27, (double) (byte) 1);
        double[] doubleArray36 = pointCostPair35.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair39 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray17, doubleArray36, 1, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        java.lang.Object[] objArray3 = mathException2.getArguments();
        java.lang.Throwable[] throwableArray4 = mathException2.getSuppressed();
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray6 = costException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { "hi!", throwableArray24 };
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", objArray29);
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) costException30);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException32);
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException32);
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException32);
        java.lang.Object[] objArray36 = costException35.getArguments();
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", objArray36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray36);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException38);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) 100L, (double) '#', 10.0d);
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
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray20, (int) (short) -1, (long) (short) 100);
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
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        double double9 = pointCostPair8.getCost();
        double[] doubleArray10 = pointCostPair8.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray10, (double) 10L);
        double double13 = pointCostPair12.getCost();
        double[] doubleArray14 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (-1.0d));
        double double17 = pointCostPair16.getCost();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) ' ');
        java.lang.Class<?> wildcardClass21 = doubleArray18.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray23 = convergenceException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException26);
        java.lang.String str28 = mathException27.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray17, (java.lang.Throwable) mathException27);
        java.lang.Object[] objArray33 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray38 = convergenceException37.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException41);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("", objArray33, (java.lang.Throwable) mathException42);
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!", objArray17, (java.lang.Throwable) convergenceException43);
        java.lang.Object[] objArray45 = convergenceException43.getArguments();
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException43);
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException((java.lang.Throwable) costException46);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException46);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException49);
        java.lang.Object[] objArray51 = convergenceException49.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray55 = convergenceException54.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray55, (java.lang.Throwable) convergenceException57);
        org.apache.commons.math.optimization.CostException costException59 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException58);
        java.lang.Throwable[] throwableArray60 = costException59.getSuppressed();
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray51, (java.lang.Throwable) costException59);
        org.apache.commons.math.optimization.CostException costException62 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray51);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray72 = convergenceException71.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray72, (java.lang.Throwable) convergenceException74);
        org.apache.commons.math.optimization.CostException costException76 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray72);
        java.lang.Object[] objArray77 = new java.lang.Object[] { "hi!", throwableArray72 };
        org.apache.commons.math.optimization.CostException costException78 = new org.apache.commons.math.optimization.CostException("", objArray77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!", objArray77);
        org.apache.commons.math.optimization.CostException costException80 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException79);
        java.lang.Throwable[] throwableArray81 = costException80.getSuppressed();
        java.lang.Object[] objArray82 = costException80.getArguments();
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray82);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray82);
        org.apache.commons.math.optimization.CostException costException85 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException84);
        java.lang.Object[] objArray86 = mathException84.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException84);
        org.apache.commons.math.ConvergenceException convergenceException88 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray51, (java.lang.Throwable) mathException84);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[10, 10]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[]");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray86), "[]");
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 100.0d, (double) (byte) -1, (double) (-1));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 32.0d, 10L, (short) 100, (short) 10, (short) -1 };
        double[] doubleArray19 = new double[] { 32.0d, 10L, (short) 100, (short) 10, (short) -1 };
        double[][] doubleArray20 = new double[][] { doubleArray13, doubleArray19 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair23 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray20, 100, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 10.0, 100.0, 10.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.optimization.CostException costException10 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException9);
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Throwable) mathException9);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException11);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException11);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) 1L, (double) (-1), (double) 10.0f);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1.0d, 97.0d };
        double[][] doubleArray11 = new double[][] { doubleArray10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair12 = nelderMead4.minimize(costFunction5, (int) '4', convergenceChecker7, doubleArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException();
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException3);
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        java.lang.Throwable[] throwableArray15 = convergenceException13.getSuppressed();
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { "hi!", throwableArray24 };
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", objArray29);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray35 = convergenceException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray35, (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException38);
        java.lang.String str40 = mathException39.getPattern();
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("", objArray29, (java.lang.Throwable) mathException39);
        java.lang.Object[] objArray46 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray51 = convergenceException50.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray51, (java.lang.Throwable) convergenceException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("", objArray46, (java.lang.Throwable) mathException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException56);
        mathException39.addSuppressed((java.lang.Throwable) convergenceException56);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) convergenceException56);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException56);
        java.lang.Throwable[] throwableArray61 = convergenceException60.getSuppressed();
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException62);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray61);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        java.lang.Object[] objArray5 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("", objArray5, (java.lang.Throwable) mathException14);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException17);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray5, (java.lang.Throwable) convergenceException17);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException", objArray5);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray10);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        java.lang.Object[] objArray8 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray13 = convergenceException12.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("", objArray8, (java.lang.Throwable) mathException17);
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray20 = costException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException21);
        java.lang.Throwable throwable24 = null;
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", throwable24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException25);
        convergenceException21.addSuppressed((java.lang.Throwable) mathException27);
        java.lang.Object[] objArray29 = convergenceException21.getArguments();
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray29);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray40 = convergenceException39.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.optimization.CostException costException44 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray40);
        java.lang.Object[] objArray45 = new java.lang.Object[] { "hi!", throwableArray40 };
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException("", objArray45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!", objArray45);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException49);
        java.lang.Throwable[] throwableArray51 = mathException50.getSuppressed();
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!");
        java.lang.Object[] objArray58 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray63 = convergenceException62.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray63, (java.lang.Throwable) convergenceException65);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException66);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("", objArray58, (java.lang.Throwable) mathException67);
        mathException54.addSuppressed((java.lang.Throwable) convergenceException68);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray51, (java.lang.Throwable) convergenceException70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray29, (java.lang.Throwable) mathException71);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray81 = convergenceException80.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray81, (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.optimization.CostException costException85 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray81);
        java.lang.Object[] objArray86 = new java.lang.Object[] { "hi!", throwableArray81 };
        org.apache.commons.math.optimization.CostException costException87 = new org.apache.commons.math.optimization.CostException("", objArray86);
        mathException74.addSuppressed((java.lang.Throwable) costException87);
        java.lang.Object[] objArray89 = mathException74.getArguments();
        org.apache.commons.math.optimization.CostException costException90 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException74);
        java.lang.Object[] objArray91 = mathException74.getArguments();
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: hi!", objArray29, (java.lang.Throwable) mathException74);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray91), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray91), "[]");
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 0, (double) 1L, (double) (byte) 100, 100.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { 'a', 100.0d, 1, (short) 100, (short) 1, 100 };
        double[] doubleArray21 = new double[] { 'a', 100.0d, 1, (short) 100, (short) 1, 100 };
        double[] doubleArray28 = new double[] { 'a', 100.0d, 1, (short) 100, (short) 1, 100 };
        double[][] doubleArray29 = new double[][] { doubleArray14, doubleArray21, doubleArray28 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, (int) '#', convergenceChecker7, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[97.0, 100.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[97.0, 100.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[97.0, 100.0, 1.0, 100.0, 1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray6, (java.lang.Throwable) mathException15);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException17);
        java.lang.Throwable[] throwableArray19 = mathException18.getSuppressed();
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray19);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray9);
        java.lang.Throwable[] throwableArray14 = costException13.getSuppressed();
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray14);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray25 = convergenceException24.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { "hi!", throwableArray25 };
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("", objArray30);
        mathException18.addSuppressed((java.lang.Throwable) costException31);
        java.lang.Object[] objArray33 = mathException18.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException35);
        java.lang.Object[] objArray37 = convergenceException36.getArguments();
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray37);
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray37);
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", objArray37);
        java.lang.String str41 = mathException40.getPattern();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: " + "'", str41, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ");
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, 0.0d, (double) (-1L), (double) 100L);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray10);
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { "hi!", throwableArray20 };
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException("", objArray25);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!", objArray25);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException27);
        convergenceException11.addSuppressed((java.lang.Throwable) convergenceException27);
        java.lang.Object[] objArray30 = convergenceException27.getArguments();
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray30);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray30);
        java.lang.Object[] objArray38 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray43 = convergenceException42.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException46 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray43, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException46);
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("", objArray38, (java.lang.Throwable) mathException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException48);
        java.lang.Object[] objArray50 = convergenceException48.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("", objArray50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", objArray30, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray30, (java.lang.Throwable) mathException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) convergenceException57);
        java.lang.Object[] objArray59 = mathException58.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray59);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[10, 10]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.optimization.CostException costException4 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) costException4);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray6, (java.lang.Throwable) mathException15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException15);
        java.lang.Throwable[] throwableArray18 = costException17.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException19);
        java.lang.Throwable throwable22 = null;
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", throwable22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException23);
        convergenceException19.addSuppressed((java.lang.Throwable) mathException25);
        java.lang.Object[] objArray27 = convergenceException19.getArguments();
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", objArray27);
        java.lang.String str29 = costException28.toString();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org.apache.commons.math.optimization.CostException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix" + "'", str29, "org.apache.commons.math.optimization.CostException: org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix");
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 1L, (double) 0L, (double) (byte) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 32.0d, 100, 100L, 10L, 100.0d };
        double[] doubleArray19 = new double[] { 32.0d, 100, 100L, 10L, 100.0d };
        double[] doubleArray25 = new double[] { 32.0d, 100, 100L, 10L, 100.0d };
        double[] doubleArray31 = new double[] { 32.0d, 100, 100L, 10L, 100.0d };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) (byte) 1, convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[32.0, 100.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[32.0, 100.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[32.0, 100.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[32.0, 100.0, 100.0, 10.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) 1L, (double) (byte) 10, (double) 10.0f);
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
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(100.0d, 0.0d, 32.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass5 = nelderMead4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", throwableArray14 };
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", objArray19);
        org.apache.commons.math.optimization.CostException costException22 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException25);
        java.lang.Object[] objArray27 = convergenceException25.getArguments();
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException25);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray19, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException25);
        java.lang.Object[] objArray31 = costException30.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray37);
        java.lang.Object[] objArray39 = convergenceException38.getArguments();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray48 = convergenceException47.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray48, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException("", objArray43, (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("hi!", objArray39, (java.lang.Throwable) mathException52);
        java.lang.Throwable[] throwableArray55 = mathException52.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray31, (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException", objArray31);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray31);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray55);
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (byte) 1);
        double[] doubleArray13 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 0);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 97.0d);
        double double22 = pointCostPair21.getCost();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 97.0d + "'", double22 == 97.0d);
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray19);
        java.lang.Object[] objArray24 = new java.lang.Object[] { "hi!", throwableArray19 };
        org.apache.commons.math.optimization.CostException costException25 = new org.apache.commons.math.optimization.CostException("", objArray24);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) costException25);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray37);
        java.lang.Object[] objArray42 = new java.lang.Object[] { "hi!", throwableArray37 };
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException("", objArray42);
        mathException30.addSuppressed((java.lang.Throwable) costException43);
        org.apache.commons.math.MathException mathException45 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException30);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
        java.lang.String str52 = mathException51.getPattern();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) mathException51);
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) costException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) costException54);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) costException54);
        java.lang.Class<?> wildcardClass58 = mathException57.getClass();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException" + "'", str52, "org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(52.0d, (double) 10.0f, (double) 100.0f, 32.0d);
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray17);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException23);
        java.lang.Object[] objArray25 = convergenceException23.getArguments();
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException23);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray17, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException28);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray40 = convergenceException39.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("", objArray35, (java.lang.Throwable) mathException44);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray52 = convergenceException51.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray52, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.optimization.CostException costException56 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray52);
        java.lang.Object[] objArray57 = new java.lang.Object[] { "hi!", throwableArray52 };
        org.apache.commons.math.optimization.CostException costException58 = new org.apache.commons.math.optimization.CostException("", objArray57);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException58);
        java.lang.Throwable[] throwableArray60 = costException58.getSuppressed();
        convergenceException45.addSuppressed((java.lang.Throwable) costException58);
        java.lang.String str62 = convergenceException45.getPattern();
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException63);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException63);
        convergenceException29.addSuppressed((java.lang.Throwable) mathException63);
        org.apache.commons.math.MathException mathException67 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) convergenceException29);
        org.apache.commons.math.MathException mathException69 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException29);
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException69);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        java.lang.Object[] objArray10 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray15 = convergenceException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) convergenceException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("", objArray10, (java.lang.Throwable) mathException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException20);
        java.lang.Object[] objArray22 = convergenceException20.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray26 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray22, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: not positive definite matrix", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray38 = convergenceException37.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray47 = convergenceException46.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray47, (java.lang.Throwable) convergenceException49);
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException50);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) mathException51);
        java.lang.Throwable throwable54 = null;
        org.apache.commons.math.optimization.CostException costException55 = new org.apache.commons.math.optimization.CostException(throwable54);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray38, (java.lang.Throwable) convergenceException56);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray38);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray22, (java.lang.Throwable) mathException59);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException65);
        org.apache.commons.math.optimization.CostException costException67 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException65);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray22, (java.lang.Throwable) convergenceException65);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray16 = new java.lang.Object[] { "hi!", throwableArray11 };
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException25);
        java.lang.String str27 = mathException26.getPattern();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray16, (java.lang.Throwable) mathException26);
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException28);
        java.lang.Object[] objArray30 = costException29.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray36 = convergenceException35.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException39 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray36, (java.lang.Throwable) convergenceException38);
        java.lang.Throwable[] throwableArray40 = convergenceException38.getSuppressed();
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray49 = convergenceException48.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray49, (java.lang.Throwable) convergenceException51);
        org.apache.commons.math.optimization.CostException costException53 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray49);
        java.lang.Object[] objArray54 = new java.lang.Object[] { "hi!", throwableArray49 };
        org.apache.commons.math.optimization.CostException costException55 = new org.apache.commons.math.optimization.CostException("", objArray54);
        mathException42.addSuppressed((java.lang.Throwable) costException55);
        java.lang.Object[] objArray57 = mathException42.getArguments();
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) mathException42);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("");
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray71 = convergenceException70.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray71, (java.lang.Throwable) convergenceException73);
        org.apache.commons.math.optimization.CostException costException75 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray71);
        java.lang.Object[] objArray76 = new java.lang.Object[] { "hi!", throwableArray71 };
        org.apache.commons.math.optimization.CostException costException77 = new org.apache.commons.math.optimization.CostException("", objArray76);
        mathException64.addSuppressed((java.lang.Throwable) costException77);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException64);
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException79);
        convergenceException61.addSuppressed((java.lang.Throwable) mathException79);
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray30, (java.lang.Throwable) mathException79);
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray30);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", objArray30);
        java.lang.Throwable throwable87 = null;
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", throwable87);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", throwable87);
        org.apache.commons.math.ConvergenceException convergenceException90 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: ", objArray30, throwable87);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[hi!, []]");
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray5 = convergenceException4.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException8 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException7);
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray5);
        java.lang.Throwable throwable10 = null;
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException(throwable10);
        java.lang.Object[] objArray15 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("", objArray15, (java.lang.Throwable) mathException24);
        costException11.addSuppressed((java.lang.Throwable) convergenceException25);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException11);
        java.lang.Object[] objArray28 = costException27.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException27);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray39 = convergenceException38.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray39, (java.lang.Throwable) convergenceException41);
        org.apache.commons.math.optimization.CostException costException43 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray39);
        java.lang.Object[] objArray44 = new java.lang.Object[] { "hi!", throwableArray39 };
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException("", objArray44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException45);
        java.lang.Throwable[] throwableArray47 = costException45.getSuppressed();
        org.apache.commons.math.optimization.CostException costException48 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) costException48);
        java.lang.Object[] objArray50 = costException48.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray50);
        costException27.addSuppressed((java.lang.Throwable) convergenceException51);
        org.apache.commons.math.ConvergenceException convergenceException53 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException51);
        java.lang.Throwable[] throwableArray54 = convergenceException51.getSuppressed();
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) convergenceException51);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(throwableArray54);
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        java.lang.Throwable[] throwableArray11 = convergenceException9.getSuppressed();
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.optimization.CostException costException24 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray20);
        java.lang.Object[] objArray25 = new java.lang.Object[] { "hi!", throwableArray20 };
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException("", objArray25);
        mathException13.addSuppressed((java.lang.Throwable) costException26);
        java.lang.Object[] objArray28 = mathException13.getArguments();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) mathException13);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray35 = convergenceException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray35);
        java.lang.Object[] objArray37 = convergenceException36.getArguments();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray46 = convergenceException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.MathException mathException50 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("", objArray41, (java.lang.Throwable) mathException50);
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("hi!", objArray37, (java.lang.Throwable) mathException50);
        java.lang.Object[] objArray53 = mathException52.getArguments();
        java.lang.Object[] objArray54 = mathException52.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) mathException52);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray11);
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        java.lang.String str60 = convergenceException59.getPattern();
        java.lang.Object[] objArray64 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray69 = convergenceException68.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException72 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray69, (java.lang.Throwable) convergenceException71);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException72);
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("", objArray64, (java.lang.Throwable) mathException73);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray81 = convergenceException80.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException83 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray81, (java.lang.Throwable) convergenceException83);
        org.apache.commons.math.optimization.CostException costException85 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray81);
        java.lang.Object[] objArray86 = new java.lang.Object[] { "hi!", throwableArray81 };
        org.apache.commons.math.optimization.CostException costException87 = new org.apache.commons.math.optimization.CostException("", objArray86);
        org.apache.commons.math.ConvergenceException convergenceException88 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException87);
        java.lang.Throwable[] throwableArray89 = costException87.getSuppressed();
        convergenceException74.addSuppressed((java.lang.Throwable) costException87);
        java.lang.String str91 = costException87.getPattern();
        java.lang.Throwable[] throwableArray92 = costException87.getSuppressed();
        convergenceException59.addSuppressed((java.lang.Throwable) costException87);
        org.apache.commons.math.optimization.CostException costException94 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException59);
        org.apache.commons.math.ConvergenceException convergenceException95 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException59);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!" + "'", str60, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray86), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNotNull(throwableArray92);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.optimization.CostException costException3 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException2);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException2);
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray26 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { "hi!", throwableArray26 };
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException("", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) costException32);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException34);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray45 = convergenceException44.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray45, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.optimization.CostException costException49 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray45);
        java.lang.Object[] objArray50 = new java.lang.Object[] { "hi!", throwableArray45 };
        org.apache.commons.math.optimization.CostException costException51 = new org.apache.commons.math.optimization.CostException("", objArray50);
        mathException38.addSuppressed((java.lang.Throwable) costException51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException53);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) mathException54);
        java.lang.Throwable[] throwableArray56 = mathException54.getSuppressed();
        java.lang.Object[] objArray57 = mathException54.getArguments();
        org.apache.commons.math.optimization.CostException costException58 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException54);
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: not positive definite matrix", (java.lang.Throwable) costException58);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, 32.0d, (double) '#', 100.0d);
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) -1, (double) 100, (double) 10L);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray13 = convergenceException12.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { "hi!", throwableArray13 };
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException27);
        java.lang.String str29 = mathException28.getPattern();
        org.apache.commons.math.MathException mathException30 = new org.apache.commons.math.MathException("", objArray18, (java.lang.Throwable) mathException28);
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("hi!", objArray18);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray18);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray44 = convergenceException43.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.optimization.CostException costException48 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray44);
        java.lang.Object[] objArray49 = new java.lang.Object[] { "hi!", throwableArray44 };
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException("", objArray49);
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException50);
        java.lang.Throwable[] throwableArray52 = costException50.getSuppressed();
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("not positive definite matrix", (java.lang.Object[]) throwableArray52);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray52);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray52);
        org.apache.commons.math.ConvergenceException convergenceException56 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray18, (java.lang.Throwable) convergenceException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Throwable) mathException57);
        org.apache.commons.math.optimization.CostException costException59 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException58);
        java.lang.String str60 = mathException58.getPattern();
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "org.apache.commons.math.optimization.CostException: not positive definite matrix" + "'", str60, "org.apache.commons.math.optimization.CostException: not positive definite matrix");
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray8);
        java.lang.Throwable[] throwableArray13 = costException12.getSuppressed();
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray24 = convergenceException23.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray24, (java.lang.Throwable) convergenceException26);
        org.apache.commons.math.optimization.CostException costException28 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray24);
        java.lang.Object[] objArray29 = new java.lang.Object[] { "hi!", throwableArray24 };
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", objArray29);
        mathException17.addSuppressed((java.lang.Throwable) costException30);
        java.lang.Object[] objArray32 = mathException17.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("", objArray32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) convergenceException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException34);
        java.lang.Object[] objArray36 = convergenceException35.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException", objArray36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray36);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) 100, (double) (byte) 100, (double) 1, (double) 0.0f);
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
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray10 = convergenceException9.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException13 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray10, (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException13);
        java.lang.String str15 = mathException14.getPattern();
        java.lang.Throwable[] throwableArray16 = mathException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray16);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray23 = convergenceException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException25);
        java.lang.Throwable[] throwableArray27 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray27);
        convergenceException17.addSuppressed((java.lang.Throwable) mathException29);
        java.lang.Object[] objArray31 = mathException29.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", objArray31);
        java.lang.Throwable throwable33 = null;
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray31, throwable33);
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray41 = convergenceException40.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray41);
        java.lang.Object[] objArray43 = convergenceException42.getArguments();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException51 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray52 = convergenceException51.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray52, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("", objArray47, (java.lang.Throwable) mathException56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException("hi!", objArray43, (java.lang.Throwable) mathException56);
        java.lang.Object[] objArray59 = mathException58.getArguments();
        java.lang.Object[] objArray60 = mathException58.getArguments();
        org.apache.commons.math.optimization.CostException costException61 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray60);
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException((java.lang.Throwable) costException61);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", objArray31, (java.lang.Throwable) costException61);
        java.lang.Throwable throwable67 = null;
        org.apache.commons.math.optimization.CostException costException68 = new org.apache.commons.math.optimization.CostException(throwable67);
        java.lang.Object[] objArray72 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray77 = convergenceException76.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException80 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray77, (java.lang.Throwable) convergenceException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException80);
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("", objArray72, (java.lang.Throwable) mathException81);
        costException68.addSuppressed((java.lang.Throwable) convergenceException82);
        org.apache.commons.math.optimization.CostException costException84 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) costException68);
        java.lang.Object[] objArray85 = costException84.getArguments();
        org.apache.commons.math.optimization.CostException costException86 = new org.apache.commons.math.optimization.CostException("", objArray85);
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray85);
        java.lang.Throwable[] throwableArray88 = convergenceException87.getSuppressed();
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray88);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray31, (java.lang.Throwable) mathException89);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
        org.junit.Assert.assertNotNull(throwableArray88);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1L, (double) 1.0f, (double) 'a', (double) 1L);
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 1, (double) 1L, (double) (-1), 35.0d);
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (short) -1, (double) (short) 100, 97.0d, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { 10 };
        double[] doubleArray11 = new double[] { 10 };
        double[] doubleArray13 = new double[] { 10 };
        double[][] doubleArray14 = new double[][] { doubleArray9, doubleArray11, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray14, (int) (short) 0, (long) (short) 0);
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
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("", objArray17);
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException23 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) convergenceException23);
        java.lang.Object[] objArray25 = convergenceException23.getArguments();
        org.apache.commons.math.optimization.CostException costException26 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException23);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", objArray17, (java.lang.Throwable) convergenceException23);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray17);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException30);
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException30);
        java.lang.Throwable[] throwableArray33 = convergenceException30.getSuppressed();
        java.lang.Throwable[] throwableArray34 = convergenceException30.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair8 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair10 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair12 = new org.apache.commons.math.optimization.PointCostPair(doubleArray6, (double) (byte) 1);
        double double13 = pointCostPair12.getCost();
        double[] doubleArray14 = pointCostPair12.getPoint();
        double[] doubleArray15 = pointCostPair12.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair17 = new org.apache.commons.math.optimization.PointCostPair(doubleArray15, (-1.0d));
        double double18 = pointCostPair17.getCost();
        double[] doubleArray19 = pointCostPair17.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 100.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair25 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray19, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray6, (java.lang.Throwable) mathException15);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray23 = convergenceException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray23);
        java.lang.Object[] objArray28 = new java.lang.Object[] { "hi!", throwableArray23 };
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("", objArray28);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException29);
        java.lang.Throwable[] throwableArray31 = costException29.getSuppressed();
        convergenceException16.addSuppressed((java.lang.Throwable) costException29);
        java.lang.String str33 = convergenceException16.getPattern();
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException34);
        java.lang.Throwable[] throwableArray37 = mathException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray48 = convergenceException47.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException51 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray48, (java.lang.Throwable) convergenceException50);
        org.apache.commons.math.optimization.CostException costException52 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray48);
        java.lang.Object[] objArray53 = new java.lang.Object[] { "hi!", throwableArray48 };
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException("", objArray53);
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray59 = convergenceException58.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray59, (java.lang.Throwable) convergenceException61);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException62);
        java.lang.String str64 = mathException63.getPattern();
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("", objArray53, (java.lang.Throwable) mathException63);
        java.lang.Object[] objArray69 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray74 = convergenceException73.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException77 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray74, (java.lang.Throwable) convergenceException76);
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException77);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("", objArray69, (java.lang.Throwable) mathException78);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("hi!", objArray53, (java.lang.Throwable) convergenceException79);
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException82 = new org.apache.commons.math.ConvergenceException("", objArray53, (java.lang.Throwable) convergenceException81);
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray53);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException((java.lang.Throwable) costException83);
        org.apache.commons.math.ConvergenceException convergenceException85 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) costException83);
        org.apache.commons.math.MathException mathException86 = new org.apache.commons.math.MathException((java.lang.Throwable) costException83);
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException86);
        java.lang.Object[] objArray88 = mathException86.getArguments();
        java.lang.String str89 = mathException86.getPattern();
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[]");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "org.apache.commons.math.optimization.CostException: " + "'", str89, "org.apache.commons.math.optimization.CostException: ");
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10, (double) 1L, 0.0d, (double) 'a');
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.optimization.CostException costException4 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException2);
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray11);
        java.lang.Object[] objArray13 = convergenceException12.getArguments();
        org.apache.commons.math.optimization.CostException costException14 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", objArray13);
        convergenceException2.addSuppressed((java.lang.Throwable) mathException16);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException16);
        java.lang.Object[] objArray24 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray29 = convergenceException28.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) convergenceException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException32);
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("", objArray24, (java.lang.Throwable) mathException33);
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException33);
        java.lang.Object[] objArray36 = mathException33.getArguments();
        org.apache.commons.math.optimization.CostException costException37 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray36);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray36);
        mathException18.addSuppressed((java.lang.Throwable) convergenceException38);
        java.lang.Throwable[] throwableArray40 = mathException18.getSuppressed();
        java.lang.Throwable[] throwableArray41 = mathException18.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0.0f, 52.0d, (double) 1, 0.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { ' ', (short) -1, (byte) 1, 0.0d, (short) -1, 10.0d };
        double[][] doubleArray15 = new double[][] { doubleArray14 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair18 = nelderMead4.minimize(costFunction5, (int) (short) 0, convergenceChecker7, doubleArray15, 1, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[32.0, -1.0, 1.0, 0.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray19 = convergenceException18.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException21);
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray29 = convergenceException28.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray29, (java.lang.Throwable) convergenceException31);
        org.apache.commons.math.optimization.CostException costException33 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray29);
        java.lang.Object[] objArray34 = new java.lang.Object[] { "hi!", throwableArray29 };
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException("", objArray34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) costException35);
        org.apache.commons.math.ConvergenceException convergenceException38 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray19, (java.lang.Throwable) convergenceException38);
        java.lang.Object[] objArray40 = convergenceException38.getArguments();
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("hi!", objArray40);
        java.lang.Object[] objArray42 = mathException41.getArguments();
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) mathException41);
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str48 = mathException47.getPattern();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException49 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.ConvergenceException convergenceException50 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException49);
        java.lang.Object[] objArray54 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray59 = convergenceException58.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray59, (java.lang.Throwable) convergenceException61);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException62);
        org.apache.commons.math.ConvergenceException convergenceException64 = new org.apache.commons.math.ConvergenceException("", objArray54, (java.lang.Throwable) mathException63);
        org.apache.commons.math.optimization.CostException costException65 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException63);
        convergenceException50.addSuppressed((java.lang.Throwable) mathException63);
        mathException47.addSuppressed((java.lang.Throwable) mathException63);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) mathException63);
        java.lang.String str69 = convergenceException68.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException70 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) convergenceException68);
        org.apache.commons.math.ConvergenceException convergenceException71 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException68);
        org.apache.commons.math.optimization.CostException costException72 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.ConvergenceException convergenceException73 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.MathException mathException74 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9);
        org.apache.commons.math.MathException mathException75 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str69, "org.apache.commons.math.optimization.CostException: hi!");
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (short) 0, (double) (byte) 0, (double) '#');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double[] doubleArray17 = pointCostPair16.getPoint();
        double[] doubleArray18 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray18, (double) (short) 100);
        double[] doubleArray21 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair23 = new org.apache.commons.math.optimization.PointCostPair(doubleArray21, (double) 'a');
        double[] doubleArray24 = pointCostPair23.getPoint();
        double[] doubleArray25 = pointCostPair23.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, 10.0d);
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) (byte) 1);
        double[] doubleArray41 = pointCostPair40.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray41, (double) 1L);
        double double44 = pointCostPair43.getCost();
        double[] doubleArray45 = pointCostPair43.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) ' ');
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair52 = nelderMead4.minimize(costFunction5, (int) (byte) 100, convergenceChecker7, doubleArray25, doubleArray45, (int) (byte) 0, (long) 1);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 1.0d + "'", double44 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray8 = convergenceException7.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException11 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray8, (java.lang.Throwable) convergenceException10);
        org.apache.commons.math.optimization.CostException costException12 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray8);
        java.lang.Throwable[] throwableArray13 = costException12.getSuppressed();
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException14);
        java.lang.Object[] objArray16 = mathException15.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", objArray16);
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", objArray16);
        java.lang.String str19 = convergenceException18.getPattern();
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: " + "'", str19, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ");
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
        org.apache.commons.math.MathException mathException1 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
        java.lang.String str2 = mathException1.getPattern();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException" + "'", str2, "org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException");
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException3);
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException3);
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray14 = convergenceException13.getArguments();
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: ", objArray14);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray14);
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", objArray14);
        convergenceException3.addSuppressed((java.lang.Throwable) mathException17);
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException17);
        java.lang.Object[] objArray25 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray30 = convergenceException29.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) convergenceException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException33);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException("", objArray25, (java.lang.Throwable) mathException34);
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException34);
        java.lang.Object[] objArray37 = mathException34.getArguments();
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: ", objArray37);
        mathException19.addSuppressed((java.lang.Throwable) convergenceException39);
        java.lang.Throwable[] throwableArray41 = mathException19.getSuppressed();
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(throwableArray41);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", throwableArray14 };
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray25 = convergenceException24.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException28);
        java.lang.String str30 = mathException29.getPattern();
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("", objArray19, (java.lang.Throwable) mathException29);
        java.lang.Object[] objArray35 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray40 = convergenceException39.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray40, (java.lang.Throwable) convergenceException42);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException43);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("", objArray35, (java.lang.Throwable) mathException44);
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!", objArray19, (java.lang.Throwable) convergenceException45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("", objArray19, (java.lang.Throwable) convergenceException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: ", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray56 = convergenceException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray56);
        java.lang.Object[] objArray58 = convergenceException57.getArguments();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException66 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray67 = convergenceException66.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException69 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray67, (java.lang.Throwable) convergenceException69);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException70);
        org.apache.commons.math.ConvergenceException convergenceException72 = new org.apache.commons.math.ConvergenceException("", objArray62, (java.lang.Throwable) mathException71);
        org.apache.commons.math.MathException mathException73 = new org.apache.commons.math.MathException("hi!", objArray58, (java.lang.Throwable) mathException71);
        java.lang.Throwable[] throwableArray74 = mathException71.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException75 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException71);
        org.apache.commons.math.ConvergenceException convergenceException76 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException71);
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray19, (java.lang.Throwable) mathException71);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException79 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray19);
        java.lang.Throwable throwable83 = null;
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", throwable83);
        java.lang.Object[] objArray85 = convergenceException84.getArguments();
        java.lang.Throwable throwable86 = null;
        org.apache.commons.math.ConvergenceException convergenceException87 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: hi!", objArray85, throwable86);
        org.apache.commons.math.ConvergenceException convergenceException88 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException", objArray85);
        org.apache.commons.math.ConvergenceException convergenceException89 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray19, (java.lang.Throwable) convergenceException88);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, (double) (byte) 100, (double) (short) -1, (double) 10L);
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
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10.0f, 0.0d, (double) 10, (double) 100);
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
        double[] doubleArray33 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) (byte) -1);
        double[] doubleArray40 = pointCostPair39.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray40, (double) 0);
        double[] doubleArray43 = pointCostPair42.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (short) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (byte) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, (double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair54 = nelderMead4.minimize(costFunction5, (int) (short) 10, convergenceChecker7, doubleArray22, doubleArray43);
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
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0L, 0.0d, (double) 0L, (double) (short) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray13, (double) (short) 1);
        double[] doubleArray16 = pointCostPair15.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair26 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair28 = new org.apache.commons.math.optimization.PointCostPair(doubleArray16, (double) (-1));
        double[] doubleArray29 = pointCostPair28.getPoint();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair30 = nelderMead4.minimize(costFunction5, 10, convergenceChecker7, doubleArray8, doubleArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException1 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.ConvergenceException convergenceException2 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException1);
        java.lang.Object[] objArray6 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException10 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray11 = convergenceException10.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException14 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray11, (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException14);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("", objArray6, (java.lang.Throwable) mathException15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException15);
        convergenceException2.addSuppressed((java.lang.Throwable) mathException15);
        java.lang.Object[] objArray19 = convergenceException2.getArguments();
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray19);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100.0f, (double) (short) 10, (double) 100, (double) 10);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray10 = new double[] { 1, 100.0d };
        double[] doubleArray13 = new double[] { 1, 100.0d };
        double[][] doubleArray14 = new double[][] { doubleArray10, doubleArray13 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair17 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray14, (int) 'a', (long) (short) 10);
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
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        java.lang.Throwable[] throwableArray12 = costException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray14 = convergenceException13.getArguments();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException15);
        java.lang.Object[] objArray27 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException31 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray32 = convergenceException31.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray32, (java.lang.Throwable) convergenceException34);
        org.apache.commons.math.MathException mathException36 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray27, (java.lang.Throwable) mathException36);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) convergenceException37);
        java.lang.Object[] objArray39 = convergenceException37.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("", objArray39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", objArray39);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: not positive definite matrix", (java.lang.Throwable) mathException41);
        java.lang.Throwable[] throwableArray43 = mathException41.getSuppressed();
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray43);
        org.apache.commons.math.optimization.CostException costException45 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray43);
        java.lang.Object[] objArray46 = costException45.getArguments();
        org.apache.commons.math.optimization.CostException costException47 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", objArray46);
        mathException15.addSuppressed((java.lang.Throwable) costException47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: not positive definite matrix", (java.lang.Throwable) mathException15);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[]");
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        double[] doubleArray4 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair6 = new org.apache.commons.math.optimization.PointCostPair(doubleArray4, (double) (short) 1);
        double[] doubleArray7 = pointCostPair6.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair9 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, (double) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, (double) ' ');
        double[] doubleArray14 = pointCostPair13.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 100L);
        double double17 = pointCostPair16.getCost();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
        org.apache.commons.math.ConvergenceException convergenceException3 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException3);
        java.lang.Throwable[] throwableArray5 = mathException4.getSuppressed();
        org.apache.commons.math.MathException mathException6 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray5);
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException6);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("not positive definite matrix");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException2);
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) mathException3);
        java.lang.Class<?> wildcardClass6 = mathException5.getClass();
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) 1, 0.0d, (double) 'a');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray12 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair14 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (double) (short) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray12, (-1.0d));
        double[] doubleArray17 = pointCostPair16.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair19 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, (double) (-1));
        org.apache.commons.math.optimization.PointCostPair pointCostPair21 = new org.apache.commons.math.optimization.PointCostPair(doubleArray17, 52.0d);
        double[] doubleArray28 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair30 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair34 = new org.apache.commons.math.optimization.PointCostPair(doubleArray28, (double) (byte) 1);
        double double35 = pointCostPair34.getCost();
        double[] doubleArray36 = pointCostPair34.getPoint();
        double[] doubleArray37 = pointCostPair34.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair39 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, (double) 0L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair41 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair43 = new org.apache.commons.math.optimization.PointCostPair(doubleArray37, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair44 = nelderMead4.minimize(costFunction5, (-1), convergenceChecker7, doubleArray17, doubleArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) 100, (double) '4', 0.0d, (double) '4');
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 'a');
        org.apache.commons.math.optimization.PointCostPair pointCostPair22 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) 0.0f);
        org.apache.commons.math.optimization.PointCostPair pointCostPair24 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1L));
        double[] doubleArray31 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair33 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray31, (double) (byte) 1);
        double[] doubleArray38 = pointCostPair37.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair40 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 1L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair42 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) (short) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair44 = new org.apache.commons.math.optimization.PointCostPair(doubleArray38, (double) 1);
        double[] doubleArray45 = pointCostPair44.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair47 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (byte) 1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair49 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (short) 100);
        org.apache.commons.math.optimization.PointCostPair pointCostPair51 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) (short) -1);
        org.apache.commons.math.optimization.PointCostPair pointCostPair53 = new org.apache.commons.math.optimization.PointCostPair(doubleArray45, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair54 = nelderMead4.minimize(costFunction5, (int) (short) 1, convergenceChecker7, doubleArray14, doubleArray45);
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
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException9 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException8);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray16 = convergenceException15.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException18 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException18);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray26 = convergenceException25.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException28 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray26, (java.lang.Throwable) convergenceException28);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray26);
        java.lang.Object[] objArray31 = new java.lang.Object[] { "hi!", throwableArray26 };
        org.apache.commons.math.optimization.CostException costException32 = new org.apache.commons.math.optimization.CostException("", objArray31);
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException32);
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) costException32);
        org.apache.commons.math.ConvergenceException convergenceException35 = new org.apache.commons.math.ConvergenceException();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray16, (java.lang.Throwable) convergenceException35);
        java.lang.Object[] objArray37 = convergenceException35.getArguments();
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", objArray37);
        java.lang.Object[] objArray39 = mathException38.getArguments();
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException38);
        org.apache.commons.math.MathException mathException44 = new org.apache.commons.math.MathException("hi!");
        java.lang.String str45 = mathException44.getPattern();
        org.apache.commons.math.random.NotPositiveDefiniteMatrixException notPositiveDefiniteMatrixException46 = new org.apache.commons.math.random.NotPositiveDefiniteMatrixException();
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) notPositiveDefiniteMatrixException46);
        java.lang.Object[] objArray51 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray56 = convergenceException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray56, (java.lang.Throwable) convergenceException58);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException59);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("", objArray51, (java.lang.Throwable) mathException60);
        org.apache.commons.math.optimization.CostException costException62 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException60);
        convergenceException47.addSuppressed((java.lang.Throwable) mathException60);
        mathException44.addSuppressed((java.lang.Throwable) mathException60);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Throwable) mathException60);
        java.lang.String str66 = convergenceException65.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException67 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) convergenceException65);
        org.apache.commons.math.ConvergenceException convergenceException68 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: ", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException65);
        org.apache.commons.math.ConvergenceException convergenceException78 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray79 = convergenceException78.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException81 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray79, (java.lang.Throwable) convergenceException81);
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.optimization.CostException costException84 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.optimization.CostException costException85 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: hi!", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.ConvergenceException convergenceException86 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.optimization.CostException costException87 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.optimization.CostException costException88 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.MathException mathException89 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray79);
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException89);
        org.apache.commons.math.ConvergenceException convergenceException91 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) mathException90);
        java.lang.String str92 = mathException90.toString();
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[]");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "org.apache.commons.math.optimization.CostException: hi!" + "'", str66, "org.apache.commons.math.optimization.CostException: hi!");
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!" + "'", str92, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
        double[] doubleArray4 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair6 = new org.apache.commons.math.optimization.PointCostPair(doubleArray4, (double) (short) 1);
        double[] doubleArray7 = pointCostPair6.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair9 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, 1.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair11 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, (double) 10L);
        org.apache.commons.math.optimization.PointCostPair pointCostPair13 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, (double) (byte) 0);
        org.apache.commons.math.optimization.PointCostPair pointCostPair15 = new org.apache.commons.math.optimization.PointCostPair(doubleArray7, 32.0d);
        double[] doubleArray16 = pointCostPair15.getPoint();
        double[] doubleArray17 = pointCostPair15.getPoint();
        double[] doubleArray18 = pointCostPair15.getPoint();
        double[] doubleArray19 = pointCostPair15.getPoint();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        java.lang.Throwable[] throwableArray12 = costException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray14 = convergenceException13.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray22 = convergenceException21.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException24);
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.ConvergenceException convergenceException30 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray31 = convergenceException30.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException34 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray31, (java.lang.Throwable) convergenceException33);
        org.apache.commons.math.MathException mathException35 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException34);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException35);
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) mathException35);
        java.lang.Throwable throwable38 = null;
        org.apache.commons.math.optimization.CostException costException39 = new org.apache.commons.math.optimization.CostException(throwable38);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException39);
        org.apache.commons.math.ConvergenceException convergenceException41 = new org.apache.commons.math.ConvergenceException("hi!", (java.lang.Object[]) throwableArray22, (java.lang.Throwable) convergenceException40);
        org.apache.commons.math.optimization.CostException costException42 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray22);
        org.apache.commons.math.MathException mathException43 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", objArray14, (java.lang.Throwable) costException42);
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray53 = convergenceException52.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray53, (java.lang.Throwable) convergenceException55);
        org.apache.commons.math.optimization.CostException costException57 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray53);
        java.lang.Object[] objArray58 = new java.lang.Object[] { "hi!", throwableArray53 };
        org.apache.commons.math.optimization.CostException costException59 = new org.apache.commons.math.optimization.CostException("", objArray58);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("hi!", objArray58);
        org.apache.commons.math.ConvergenceException convergenceException61 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Throwable) convergenceException60);
        org.apache.commons.math.ConvergenceException convergenceException62 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException61);
        costException42.addSuppressed((java.lang.Throwable) convergenceException61);
        java.lang.Object[] objArray64 = convergenceException61.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: ", objArray64);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException65);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 100L, (double) 100, (double) (byte) -1, (double) 100);
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
        double[] doubleArray30 = new double[] { (byte) -1, 100.0f, 100.0f, (-1.0d) };
        org.apache.commons.math.optimization.PointCostPair pointCostPair32 = new org.apache.commons.math.optimization.PointCostPair(doubleArray30, (double) (short) 1);
        double[] doubleArray33 = pointCostPair32.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair35 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, (double) '4');
        org.apache.commons.math.optimization.PointCostPair pointCostPair37 = new org.apache.commons.math.optimization.PointCostPair(doubleArray33, 35.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair38 = nelderMead4.minimize(costFunction5, (int) (byte) 0, convergenceChecker7, doubleArray23, doubleArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, 100.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 100.0, -1.0]");
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", throwableArray14 };
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("", objArray19);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("not positive definite matrix", objArray19);
        java.lang.Throwable[] throwableArray23 = mathException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray23);
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray23);
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException34 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray35 = convergenceException34.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray35, (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.optimization.CostException costException39 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray35);
        java.lang.Object[] objArray40 = new java.lang.Object[] { "hi!", throwableArray35 };
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("", objArray40);
        mathException28.addSuppressed((java.lang.Throwable) costException41);
        java.lang.String str43 = mathException28.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException44 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException28);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray50 = convergenceException49.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException52 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray50, (java.lang.Throwable) convergenceException52);
        org.apache.commons.math.optimization.CostException costException54 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray50);
        org.apache.commons.math.optimization.CostException costException55 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray50);
        mathException28.addSuppressed((java.lang.Throwable) costException55);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) costException55);
        java.lang.Throwable[] throwableArray58 = costException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException59 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray58);
        org.apache.commons.math.ConvergenceException convergenceException60 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray58);
        java.lang.String str61 = convergenceException60.getPattern();
        java.lang.String str62 = convergenceException60.getPattern();
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) convergenceException60);
        java.lang.Object[] objArray64 = convergenceException63.getArguments();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!" + "'", str61, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!" + "'", str62, "org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (-1L), 97.0d, 1.0d, 10.0d);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray9 = new double[] { (byte) 1 };
        double[] doubleArray11 = new double[] { (byte) 1 };
        double[] doubleArray13 = new double[] { (byte) 1 };
        double[] doubleArray15 = new double[] { (byte) 1 };
        double[] doubleArray17 = new double[] { (byte) 1 };
        double[][] doubleArray18 = new double[][] { doubleArray9, doubleArray11, doubleArray13, doubleArray15, doubleArray17 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair19 = nelderMead4.minimize(costFunction5, 100, convergenceChecker7, doubleArray18);
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
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.Object[] objArray8 = convergenceException7.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray15 = convergenceException14.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) convergenceException17);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray25 = convergenceException24.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray25, (java.lang.Throwable) convergenceException27);
        org.apache.commons.math.optimization.CostException costException29 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray25);
        java.lang.Object[] objArray30 = new java.lang.Object[] { "hi!", throwableArray25 };
        org.apache.commons.math.optimization.CostException costException31 = new org.apache.commons.math.optimization.CostException("", objArray30);
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException31);
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray15, (java.lang.Throwable) costException31);
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: ", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.optimization.CostException costException35 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Object[]) throwableArray15);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: ", objArray8, (java.lang.Throwable) costException35);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.MathException mathException41 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray8, (java.lang.Throwable) mathException40);
        org.apache.commons.math.ConvergenceException convergenceException42 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException", (java.lang.Throwable) mathException40);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[hi!, []]");
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 1, (double) 0, 0.0d, (double) (short) 1);
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
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ");
        java.lang.Object[] objArray4 = mathException3.getArguments();
        org.apache.commons.math.optimization.CostException costException5 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray4);
        org.apache.commons.math.optimization.CostException costException6 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray4);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException4);
        java.lang.Throwable[] throwableArray6 = convergenceException4.getSuppressed();
        org.apache.commons.math.MathException mathException7 = new org.apache.commons.math.MathException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.optimization.CostException costException8 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.optimization.CostException: ", (java.lang.Object[]) throwableArray6);
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException12);
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException", (java.lang.Throwable) convergenceException12);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.random.NotPositiveDefiniteMatrixException: not positive definite matrix", (java.lang.Object[]) throwableArray6, (java.lang.Throwable) convergenceException15);
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 10L, (double) 100.0f, (double) 0, (double) (-1.0f));
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray13 = new double[] { 52.0d, '#', 100L, 10L, 'a' };
        double[] doubleArray19 = new double[] { 52.0d, '#', 100L, 10L, 'a' };
        double[] doubleArray25 = new double[] { 52.0d, '#', 100L, 10L, 'a' };
        double[] doubleArray31 = new double[] { 52.0d, '#', 100L, 10L, 'a' };
        double[][] doubleArray32 = new double[][] { doubleArray13, doubleArray19, doubleArray25, doubleArray31 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair33 = nelderMead4.minimize(costFunction5, (int) ' ', convergenceChecker7, doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[52.0, 35.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 35.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 35.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 35.0, 100.0, 10.0, 97.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
        org.apache.commons.math.ConvergenceException convergenceException5 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray6 = convergenceException5.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException7 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", (java.lang.Object[]) throwableArray6);
        java.lang.Object[] objArray8 = convergenceException7.getArguments();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray17 = convergenceException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.MathException mathException21 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException20);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("", objArray12, (java.lang.Throwable) mathException21);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", objArray8, (java.lang.Throwable) mathException21);
        java.lang.Object[] objArray24 = mathException23.getArguments();
        java.lang.Object[] objArray25 = mathException23.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("", (java.lang.Throwable) mathException23);
        org.apache.commons.math.ConvergenceException convergenceException27 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException23);
        java.lang.String str28 = convergenceException27.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) convergenceException27);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.optimization.CostException costException11 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray7);
        java.lang.Throwable[] throwableArray12 = costException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray14 = convergenceException13.getArguments();
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ConvergenceException convergenceException17 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.MathException mathException18 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: hi!", (java.lang.Throwable) convergenceException13);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException18);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
        org.apache.commons.math.MathException mathException2 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!");
        org.apache.commons.math.MathException mathException3 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", (java.lang.Throwable) mathException2);
        org.apache.commons.math.ConvergenceException convergenceException4 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) mathException2);
        java.lang.Throwable[] throwableArray5 = mathException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray12 = convergenceException11.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException14 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException15 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray12, (java.lang.Throwable) convergenceException14);
        org.apache.commons.math.optimization.CostException costException16 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray12);
        java.lang.Object[] objArray17 = new java.lang.Object[] { "hi!", throwableArray12 };
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", objArray17);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray23 = convergenceException22.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException25 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray23, (java.lang.Throwable) convergenceException25);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException26);
        java.lang.String str28 = mathException27.getPattern();
        org.apache.commons.math.MathException mathException29 = new org.apache.commons.math.MathException("", objArray17, (java.lang.Throwable) mathException27);
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("hi!", objArray17);
        org.apache.commons.math.MathException mathException31 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray17);
        org.apache.commons.math.MathException mathException32 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray17);
        java.lang.Object[] objArray39 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray44 = convergenceException43.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException46 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException47 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray44, (java.lang.Throwable) convergenceException46);
        org.apache.commons.math.MathException mathException48 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException47);
        org.apache.commons.math.ConvergenceException convergenceException49 = new org.apache.commons.math.ConvergenceException("", objArray39, (java.lang.Throwable) mathException48);
        org.apache.commons.math.optimization.CostException costException50 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException48);
        java.lang.Object[] objArray51 = mathException48.getArguments();
        org.apache.commons.math.optimization.CostException costException52 = new org.apache.commons.math.optimization.CostException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray51);
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: ", objArray51);
        org.apache.commons.math.ConvergenceException convergenceException54 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", objArray51);
        org.apache.commons.math.MathException mathException55 = new org.apache.commons.math.MathException((java.lang.Throwable) convergenceException54);
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray17, (java.lang.Throwable) convergenceException54);
        org.apache.commons.math.ConvergenceException convergenceException57 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray17);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(32.0d, (double) (byte) 100, (double) (short) 10, (double) 1.0f);
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
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) 0, (double) (byte) -1, (double) (short) 1, (double) 'a');
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
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
        org.apache.commons.math.ConvergenceException convergenceException6 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray7 = convergenceException6.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException9 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) convergenceException9);
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray17 = convergenceException16.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray17, (java.lang.Throwable) convergenceException19);
        org.apache.commons.math.optimization.CostException costException21 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray17);
        java.lang.Object[] objArray22 = new java.lang.Object[] { "hi!", throwableArray17 };
        org.apache.commons.math.optimization.CostException costException23 = new org.apache.commons.math.optimization.CostException("", objArray22);
        org.apache.commons.math.ConvergenceException convergenceException24 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray7, (java.lang.Throwable) costException23);
        org.apache.commons.math.ConvergenceException convergenceException26 = new org.apache.commons.math.ConvergenceException("not positive definite matrix", (java.lang.Object[]) throwableArray7);
        java.lang.Object[] objArray27 = convergenceException26.getArguments();
        org.apache.commons.math.MathException mathException28 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: hi!", objArray27);
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray37);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray46 = convergenceException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray56 = convergenceException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray56, (java.lang.Throwable) convergenceException58);
        org.apache.commons.math.optimization.CostException costException60 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray56);
        java.lang.Object[] objArray61 = new java.lang.Object[] { "hi!", throwableArray56 };
        org.apache.commons.math.optimization.CostException costException62 = new org.apache.commons.math.optimization.CostException("", objArray61);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) costException62);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException64);
        org.apache.commons.math.MathException mathException68 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray75 = convergenceException74.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray75, (java.lang.Throwable) convergenceException77);
        org.apache.commons.math.optimization.CostException costException79 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray75);
        java.lang.Object[] objArray80 = new java.lang.Object[] { "hi!", throwableArray75 };
        org.apache.commons.math.optimization.CostException costException81 = new org.apache.commons.math.optimization.CostException("", objArray80);
        mathException68.addSuppressed((java.lang.Throwable) costException81);
        org.apache.commons.math.MathException mathException83 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException68);
        org.apache.commons.math.MathException mathException84 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException83);
        org.apache.commons.math.MathException mathException85 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException84);
        java.lang.Throwable[] throwableArray86 = mathException84.getSuppressed();
        org.apache.commons.math.MathException mathException87 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: not positive definite matrix", (java.lang.Object[]) throwableArray86);
        org.apache.commons.math.MathException mathException88 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException87);
        java.lang.Object[] objArray89 = mathException87.getArguments();
        org.apache.commons.math.MathException mathException90 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.ConvergenceException: not positive definite matrix", objArray89);
        mathException28.addSuppressed((java.lang.Throwable) mathException90);
        org.apache.commons.math.MathException mathException92 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException90);
        org.apache.commons.math.MathException mathException93 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException90);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
        org.apache.commons.math.ConvergenceException convergenceException8 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray9 = convergenceException8.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException11 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException12 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray9, (java.lang.Throwable) convergenceException11);
        org.apache.commons.math.optimization.CostException costException13 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray9);
        java.lang.Object[] objArray14 = new java.lang.Object[] { "hi!", throwableArray9 };
        org.apache.commons.math.optimization.CostException costException15 = new org.apache.commons.math.optimization.CostException("", objArray14);
        org.apache.commons.math.ConvergenceException convergenceException19 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray20 = convergenceException19.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray20, (java.lang.Throwable) convergenceException22);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException23);
        java.lang.String str25 = mathException24.getPattern();
        org.apache.commons.math.MathException mathException26 = new org.apache.commons.math.MathException("", objArray14, (java.lang.Throwable) mathException24);
        org.apache.commons.math.optimization.CostException costException27 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) mathException26);
        java.lang.Throwable[] throwableArray28 = mathException26.getSuppressed();
        java.lang.Object[] objArray29 = mathException26.getArguments();
        org.apache.commons.math.optimization.CostException costException30 = new org.apache.commons.math.optimization.CostException("hi!", objArray29);
        java.lang.Object[] objArray31 = costException30.getArguments();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray37 = convergenceException36.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException40 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) convergenceException39);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray37);
        org.apache.commons.math.ConvergenceException convergenceException45 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray46 = convergenceException45.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException48 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) convergenceException48);
        org.apache.commons.math.ConvergenceException convergenceException55 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray56 = convergenceException55.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException58 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException59 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray56, (java.lang.Throwable) convergenceException58);
        org.apache.commons.math.optimization.CostException costException60 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray56);
        java.lang.Object[] objArray61 = new java.lang.Object[] { "hi!", throwableArray56 };
        org.apache.commons.math.optimization.CostException costException62 = new org.apache.commons.math.optimization.CostException("", objArray61);
        org.apache.commons.math.ConvergenceException convergenceException63 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException62);
        org.apache.commons.math.MathException mathException64 = new org.apache.commons.math.MathException("", (java.lang.Object[]) throwableArray46, (java.lang.Throwable) costException62);
        org.apache.commons.math.ConvergenceException convergenceException65 = new org.apache.commons.math.ConvergenceException("", (java.lang.Object[]) throwableArray37, (java.lang.Throwable) mathException64);
        java.lang.Object[] objArray70 = new java.lang.Object[] { 10, (byte) 10 };
        org.apache.commons.math.ConvergenceException convergenceException74 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray75 = convergenceException74.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException77 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException78 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray75, (java.lang.Throwable) convergenceException77);
        org.apache.commons.math.MathException mathException79 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException78);
        org.apache.commons.math.ConvergenceException convergenceException80 = new org.apache.commons.math.ConvergenceException("", objArray70, (java.lang.Throwable) mathException79);
        org.apache.commons.math.MathException mathException81 = new org.apache.commons.math.MathException("", (java.lang.Throwable) mathException79);
        convergenceException65.addSuppressed((java.lang.Throwable) mathException79);
        org.apache.commons.math.optimization.CostException costException83 = new org.apache.commons.math.optimization.CostException((java.lang.Throwable) convergenceException65);
        org.apache.commons.math.ConvergenceException convergenceException84 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.optimization.CostException: hi!", objArray31, (java.lang.Throwable) convergenceException65);
        java.lang.Class<?> wildcardClass85 = convergenceException84.getClass();
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[hi!, []]");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10, 10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10, 10]");
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead((double) (byte) -1, 0.0d, 1.0d, (double) 1);
        org.apache.commons.math.optimization.CostFunction costFunction5 = null;
        org.apache.commons.math.optimization.ConvergenceChecker convergenceChecker7 = null;
        double[] doubleArray14 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair16 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair18 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (-1.0f));
        org.apache.commons.math.optimization.PointCostPair pointCostPair20 = new org.apache.commons.math.optimization.PointCostPair(doubleArray14, (double) (short) 1);
        double double21 = pointCostPair20.getCost();
        double[] doubleArray22 = pointCostPair20.getPoint();
        double[] doubleArray23 = pointCostPair20.getPoint();
        double double24 = pointCostPair20.getCost();
        double[] doubleArray25 = pointCostPair20.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair27 = new org.apache.commons.math.optimization.PointCostPair(doubleArray25, (double) (byte) 100);
        double[] doubleArray34 = new double[] { (byte) -1, (byte) -1, (-1), (short) 1, 1.0d, (short) 10 };
        org.apache.commons.math.optimization.PointCostPair pointCostPair36 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, 0.0d);
        org.apache.commons.math.optimization.PointCostPair pointCostPair38 = new org.apache.commons.math.optimization.PointCostPair(doubleArray34, (double) 1);
        double double39 = pointCostPair38.getCost();
        double[] doubleArray40 = pointCostPair38.getPoint();
        double double41 = pointCostPair38.getCost();
        double[] doubleArray42 = pointCostPair38.getPoint();
        double[] doubleArray43 = pointCostPair38.getPoint();
        org.apache.commons.math.optimization.PointCostPair pointCostPair45 = new org.apache.commons.math.optimization.PointCostPair(doubleArray43, 97.0d);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.PointCostPair pointCostPair48 = nelderMead4.minimize(costFunction5, (int) 'a', convergenceChecker7, doubleArray25, doubleArray43, (int) '#', (long) 10);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 1.0d + "'", double41 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, -1.0, -1.0, 1.0, 1.0, 10.0]");
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
        org.apache.commons.math.optimization.NelderMead nelderMead4 = new org.apache.commons.math.optimization.NelderMead(0.0d, (double) (byte) 1, (double) (byte) 1, (-1.0d));
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
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
        org.apache.commons.math.ConvergenceException convergenceException13 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray14 = convergenceException13.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException16 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException17 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray14, (java.lang.Throwable) convergenceException16);
        org.apache.commons.math.optimization.CostException costException18 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray14);
        java.lang.Object[] objArray19 = new java.lang.Object[] { "hi!", throwableArray14 };
        org.apache.commons.math.optimization.CostException costException20 = new org.apache.commons.math.optimization.CostException("", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("hi!", objArray19);
        org.apache.commons.math.ConvergenceException convergenceException22 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray19);
        org.apache.commons.math.MathException mathException23 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: ", objArray19);
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: org.apache.commons.math.ConvergenceException: hi!", objArray19);
        org.apache.commons.math.MathException mathException27 = new org.apache.commons.math.MathException("hi!");
        org.apache.commons.math.ConvergenceException convergenceException33 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray34 = convergenceException33.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException36 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException37 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray34, (java.lang.Throwable) convergenceException36);
        org.apache.commons.math.optimization.CostException costException38 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray34);
        java.lang.Object[] objArray39 = new java.lang.Object[] { "hi!", throwableArray34 };
        org.apache.commons.math.optimization.CostException costException40 = new org.apache.commons.math.optimization.CostException("", objArray39);
        mathException27.addSuppressed((java.lang.Throwable) costException40);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException("hi!", (java.lang.Throwable) mathException27);
        org.apache.commons.math.ConvergenceException convergenceException43 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: hi!", objArray19, (java.lang.Throwable) mathException27);
        java.lang.Throwable[] throwableArray44 = mathException27.getSuppressed();
        java.lang.Throwable throwable45 = null;
        org.apache.commons.math.optimization.CostException costException46 = new org.apache.commons.math.optimization.CostException(throwable45);
        org.apache.commons.math.ConvergenceException convergenceException47 = new org.apache.commons.math.ConvergenceException((java.lang.Throwable) costException46);
        mathException27.addSuppressed((java.lang.Throwable) convergenceException47);
        org.apache.commons.math.MathException mathException49 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", (java.lang.Throwable) mathException27);
        java.lang.Throwable[] throwableArray50 = mathException49.getSuppressed();
        org.apache.commons.math.MathException mathException52 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException");
        org.apache.commons.math.MathException mathException53 = new org.apache.commons.math.MathException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray50, (java.lang.Throwable) mathException52);
        org.apache.commons.math.MathException mathException54 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: hi!", (java.lang.Throwable) mathException52);
        java.lang.String str55 = mathException52.toString();
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException" + "'", str55, "org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException");
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
        org.apache.commons.math.ConvergenceException convergenceException12 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray13 = convergenceException12.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException15 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException16 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray13, (java.lang.Throwable) convergenceException15);
        org.apache.commons.math.optimization.CostException costException17 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray13);
        java.lang.Object[] objArray18 = new java.lang.Object[] { "hi!", throwableArray13 };
        org.apache.commons.math.optimization.CostException costException19 = new org.apache.commons.math.optimization.CostException("", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException20 = new org.apache.commons.math.ConvergenceException("hi!", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException21 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: ", objArray18);
        org.apache.commons.math.MathException mathException22 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException: ", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException29 = new org.apache.commons.math.ConvergenceException("hi!");
        java.lang.Throwable[] throwableArray30 = convergenceException29.getSuppressed();
        org.apache.commons.math.ConvergenceException convergenceException32 = new org.apache.commons.math.ConvergenceException("hi!");
        org.apache.commons.math.MathException mathException33 = new org.apache.commons.math.MathException("hi!", (java.lang.Object[]) throwableArray30, (java.lang.Throwable) convergenceException32);
        org.apache.commons.math.optimization.CostException costException34 = new org.apache.commons.math.optimization.CostException("", (java.lang.Object[]) throwableArray30);
        java.lang.Object[] objArray35 = new java.lang.Object[] { "hi!", throwableArray30 };
        org.apache.commons.math.optimization.CostException costException36 = new org.apache.commons.math.optimization.CostException("", objArray35);
        org.apache.commons.math.ConvergenceException convergenceException37 = new org.apache.commons.math.ConvergenceException("", objArray35);
        org.apache.commons.math.MathException mathException38 = new org.apache.commons.math.MathException("org.apache.commons.math.optimization.CostException", objArray18, (java.lang.Throwable) convergenceException37);
        org.apache.commons.math.ConvergenceException convergenceException39 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: hi!", objArray18);
        org.apache.commons.math.ConvergenceException convergenceException40 = new org.apache.commons.math.ConvergenceException("org.apache.commons.math.ConvergenceException: org.apache.commons.math.MathException: org.apache.commons.math.MathException: hi!", objArray18);
        org.apache.commons.math.optimization.CostException costException41 = new org.apache.commons.math.optimization.CostException("not positive definite matrix", objArray18);
        org.apache.commons.math.MathException mathException42 = new org.apache.commons.math.MathException((java.lang.Throwable) costException41);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, []]");
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[hi!, []]");
    }
}

